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
import org.mifos.fineract.client.models.PostCentersCenterIdRequest
import org.mifos.fineract.client.models.PostCentersRequest
import org.mifos.fineract.client.models.PostChargesRequest
import org.mifos.fineract.client.models.PutCentersCenterIdRequest
import org.mifos.fineract.client.models.PutChargesChargeIdRequest
import org.mifos.model.MifosFieldOfficerOperationName
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
data class CenterRetrieveGroupAccountRequest(val centerId: Long)
data class CenterRetrieveOne14Request(
    val one14CenterId: Long,
    val staffInSelectedOfficeOnly: Boolean,
)

data class CenterRetrieveAll23Request(
    val officeId: Long?,
    val staffId: Long?,
    val externalId: String?,
    val name: String?,
    val underHierarchy: String?,
    val paged: Boolean?,
    val offset: Int?,
    val limit: Int?,
    val orderBy: String?,
    val sortOrder: String?,
    val meetingDate: String?,
    val dateFormat: String?,
    val locale: String?,
)

data class CenterRetrieveTemplate6Request(
    val template6OfficeID: Long?,
    val staffInSelectedOfficeOnly: Boolean,
    val command: String,
)

data class CenterCreate7Request(
    val postCentersRequest: PostCentersRequest,
)

data class CenterActivate2Request(
    val centerId: Long,
    val command: String? = null,
    val postCentersCenterIdRequest: PostCentersCenterIdRequest,
)

data class CenterUpdate12Request(
    val centerId: Long,
    val name: String,
)

data class CenterDelete11Request(
    val centerId: Long,
)

data class ChargeRetrieveRequest(
    val chargeId: Long,
)

data class ChargeCreateRequest(
    val postChargesRequest: PostChargesRequest,
)

data class ChargeUpdateRequest(
    val chargeId: Long,
    val putChargesChargeIdRequest: PutChargesChargeIdRequest,
)

data class ChargeDeleteRequest(
    val chargeId: Long,
)

/**
 * Authentication API Handler
 */
class AuthApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AuthRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.AUTHENTICATION

    override suspend fun executeApi(request: AuthRequest): Any {
        val authRequest = PostAuthenticationRequest(request.username, request.password)
        return fineractApiProvider.baseApiManager.getClient()
            .authentication.authenticate(authRequest, true)
    }
}

/**
 * Center API Handler : GET Retrieve Group Account
 */
class CenterRetrieveGroupAccountApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRetrieveGroupAccountRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT

    override suspend fun executeApi(request: CenterRetrieveGroupAccountRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.retrieveGroupAccount(request.centerId)
    }
}

/**
 * Center API Handler : GET Retrieve One 14
 */
class CenterRetrieveOne14ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRetrieveOne14Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_RETRIEVE_ONE_14

    override suspend fun executeApi(request: CenterRetrieveOne14Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.retrieveOne14(
            request.one14CenterId,
            request.staffInSelectedOfficeOnly,
        )
    }
}

/**
 * Center API Handler : GET Retrieve All 23
 */
class CenterRetrieveAll23ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRetrieveAll23Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23

    override suspend fun executeApi(request: CenterRetrieveAll23Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.retrieveAll23(
            request.officeId,
            request.staffId,
            request.externalId,
            request.name,
            request.underHierarchy,
            request.paged,
            request.offset,
            request.limit,
            request.orderBy,
            request.sortOrder,
            request.meetingDate,
            request.dateFormat,
            request.locale,
        )
    }
}

/**
 * Center API Handler : GET Retrieve Template6
 */
class CenterRetrieveTemplate6ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRetrieveTemplate6Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_RETRIEVE_TEMPLATE_6

    override suspend fun executeApi(request: CenterRetrieveTemplate6Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.retrieveTemplate6(
            request.command,
            request.template6OfficeID,
            request.staffInSelectedOfficeOnly,
        )
    }
}

/**
 * Center API Handler : POST Create7
 */
class CenterCreate7ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterCreate7Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_CREATE_7

    override suspend fun executeApi(request: CenterCreate7Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.create7(
            request.postCentersRequest,
        )
    }
}

/**
 * Center API Handler : POST Activate2
 */
class CenterActivate2ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterActivate2Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_ACTIVATE_2

    override suspend fun executeApi(request: CenterActivate2Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.activate2(
            request.centerId,
            request.postCentersCenterIdRequest,
            request.command,
        )
    }
}

/**
 * Center API Handler : PUT Update 12
 */
class CenterUpdate12ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterUpdate12Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_UPDATE_12

    override suspend fun executeApi(request: CenterUpdate12Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.update12(
            request.centerId,
            PutCentersCenterIdRequest(request.name),
        )
    }
}

/**
 * Center API Handler : PUT Delete 11
 */
class CenterDelete11ApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterDelete11Request>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CENTER_DELETE_11

    override suspend fun executeApi(request: CenterDelete11Request): Any {
        return fineractApiProvider.baseApiManager.getClient().centers.delete11(
            request.centerId,
        )
    }
}

/**
 * Charge API Handler : GET Retrieve Charge
 */
class ChargeRetrieveChargesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ChargeRetrieveRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_RETRIEVE_CHARGES

    override suspend fun executeApi(request: ChargeRetrieveRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().charges.retrieveCharge(request.chargeId)
    }
}

/**
 * Charge API Handler : GET Retrieve All Charges
 */
class ChargeRetrieveAllApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_RETRIEVE_ALL

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .charges.retrieveAllCharges()
    }
}

/**
 * Charge API Handler : GET Retrieve New Charge Details (Template)
 */
class ChargeRetrieveTemplateApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_RETRIEVE_TEMPLATE

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .charges.retrieveNewChargeDetails()
    }
}

/**
 * Charge API Handler : POST Create Charge
 */
class ChargeCreateApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ChargeCreateRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_CREATE

    override suspend fun executeApi(request: ChargeCreateRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .charges.createCharge(request.postChargesRequest)
    }
}

/**
 * Charge API Handler : PUT Update Charge
 */
class ChargeUpdateApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ChargeUpdateRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_UPDATE

    override suspend fun executeApi(request: ChargeUpdateRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .charges.updateCharge(request.chargeId, request.putChargesChargeIdRequest)
    }
}

/**
 * Charge API Handler : DELETE Delete Charge
 */
class ChargeDeleteApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ChargeDeleteRequest>(fineractApiProvider) {

    override val handlerId: String = MifosFieldOfficerOperationName.CHARGE_DELETE

    override suspend fun executeApi(request: ChargeDeleteRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .charges.deleteCharge(request.chargeId)
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
            MifosFieldOfficerOperationName.AUTHENTICATION -> AuthApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT -> CenterRetrieveGroupAccountApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_RETRIEVE_ONE_14 -> CenterRetrieveOne14ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23 -> CenterRetrieveAll23ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_RETRIEVE_TEMPLATE_6 -> CenterRetrieveTemplate6ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_CREATE_7 -> CenterCreate7ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_ACTIVATE_2 -> CenterActivate2ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_UPDATE_12 -> CenterUpdate12ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CENTER_DELETE_11 -> CenterDelete11ApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_CHARGES -> ChargeRetrieveChargesApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_ALL -> ChargeRetrieveAllApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_TEMPLATE -> ChargeRetrieveTemplateApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_CREATE -> ChargeCreateApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_UPDATE -> ChargeUpdateApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            MifosFieldOfficerOperationName.CHARGE_DELETE -> ChargeDeleteApiHandler(
                fineractApiProvider,
            ) as? ApiHandler<RequestType>

            else -> null
        }
    }
}
