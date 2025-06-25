/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.data.network

import kotlinx.serialization.json.Json
import org.mifos.core.common.Result
import org.mifos.core.common.safeCall
import org.mifos.fineract.client.models.PostAuthenticationRequest
import org.mifos.utils.FineractApiProvider

/**
 * Base Fineract API handler that returns JSON strings directly
 */
abstract class BaseFineractApiHandler<RequestType>(
    protected val fineractApiProvider: FineractApiProvider,
) : ApiHandler<RequestType> {

    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        prettyPrint = true
    }

    /**
     * Template method that handles common logic and delegates to executeApi
     */
    final override suspend fun handle(request: RequestType): Result<String> = safeCall {
        val response = executeApi(request)
        // Convert response to JSON string representation
        when (response) {
            is String -> response
            else -> {
                try {
                    // Try to serialize as JSON if possible
                    json.encodeToString(response)
                } catch (e: Exception) {
                    // Fall back to string representation if serialization fails
                    response.toString()
                }
            }
        }
    }

    /**
     * Abstract method to be implemented by concrete handlers
     */
    protected abstract suspend fun executeApi(request: RequestType): Any
}

/**
 * Request DTOs for different API operations (simple data classes)
 */
data class AuthRequest(val username: String, val password: String)
data class ClientRequest(val clientId: Long)
data class SavingsRequest(val accountId: Long)
data class LoanRequest(val loanId: Long)
data class CenterRequest(val centerId: Long)
data class SurveyRequest(val surveyId: Long)
data class NoteRequest(val resourceType: String, val resourceId: Long, val noteId: Long)

/**
 * Authentication API Handler
 */
class AuthApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AuthRequest>(fineractApiProvider) {

    override val handlerId: String = "auth"

    override suspend fun executeApi(request: AuthRequest): Any {
        val authRequest = PostAuthenticationRequest(request.username, request.password)
        return fineractApiProvider.baseApiManager.getClient()
            .authentication.authenticate(authRequest, true)
    }
}

/**
 * Client API Handler
 */
class ClientApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientRequest>(fineractApiProvider) {

    override val handlerId: String = "client"

    override suspend fun executeApi(request: ClientRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .clients.retrieveOne11(request.clientId, true)
    }
}

/**
 * Savings API Handler
 */
class SavingsApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<SavingsRequest>(fineractApiProvider) {

    override val handlerId: String = "savings"

    override suspend fun executeApi(request: SavingsRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .savingsAccounts.retrieveOne25(request.accountId)
    }
}

/**
 * Loan API Handler
 */
class LoanApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<LoanRequest>(fineractApiProvider) {

    override val handlerId: String = "loans"

    override suspend fun executeApi(request: LoanRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .loans.retrieveAll27("mifos") // Using default parameter for demo
    }
}

/**
 * Center API Handler
 */
class CenterApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRequest>(fineractApiProvider) {

    override val handlerId: String = "centers"

    override suspend fun executeApi(request: CenterRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .centers.retrieveOne14(request.centerId, false)
    }
}

/**
 * Survey API Handler
 */
class SurveyApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<SurveyRequest>(fineractApiProvider) {

    override val handlerId: String = "surveys"

    override suspend fun executeApi(request: SurveyRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .spmSurveys.findSurvey(request.surveyId)
    }
}

/**
 * Note API Handler
 */
class NoteApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<NoteRequest>(fineractApiProvider) {

    override val handlerId: String = "notes"

    override suspend fun executeApi(request: NoteRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .notes.retrieveNote(request.resourceType, request.resourceId, request.noteId)
    }
}

/**
 * Factory for creating Fineract API handlers
 */
class FineractApiHandlerFactory(
    private val fineractApiProvider: FineractApiProvider,
) : ApiHandlerFactory {

    @Suppress("UNCHECKED_CAST")
    override fun <RequestType> createHandler(handlerType: String): ApiHandler<RequestType>? {
        return when (handlerType) {
            "auth" -> AuthApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "client" -> ClientApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "savings" -> SavingsApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "loans" -> LoanApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "centers" -> CenterApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "surveys" -> SurveyApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "notes" -> NoteApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            else -> null
        }
    }
}
