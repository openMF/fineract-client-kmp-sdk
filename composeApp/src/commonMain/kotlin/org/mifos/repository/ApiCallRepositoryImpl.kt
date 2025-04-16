package org.mifos.repository

import org.mifos.fineract.client.models.PostAuthenticationRequest
import org.mifos.utils.ApiState
import org.mifos.utils.FineractApiProvider

class ApiCallRepositoryImpl(private val fineractApiProvider: FineractApiProvider) : ApiCallRepository {


   override suspend fun getAuthApi(): ApiState<String> {
        val authRequest =
            PostAuthenticationRequest("mifos", "password")
        return handleError {
            fineractApiProvider.baseApiManager.getClient().authentication.authenticate(
                authRequest, true
            )
        }
    }

    override suspend fun getClientApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().clients.retrieveOne11(789, true)
        }
    }

    override suspend fun getSavingApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().savingsAccounts.retrieveOne25(0)
        }
    }

    override suspend fun getCenterApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().centers.retrieveOne14(1, false)
        }
    }

    override suspend fun getLoanApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().loans.retrieveAll27("mifos")
        }
    }

    override suspend fun getSurveyApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().spmSurveys.findSurvey(1)
        }
    }

    override suspend fun getNoteApi(): ApiState<String> {
        return handleError {
            fineractApiProvider.baseApiManager.getClient().notes.retrieveNote(
                "resourceType_example", 789, 789
            )
        }
    }


    private suspend fun <T> handleError(
        apiCall: suspend () -> T,
    ): ApiState<String> {
        return try {
            ApiState.Success(apiCall().toString())
        } catch (e: Throwable) {
            ApiState.Error(e)
        }
    }

}