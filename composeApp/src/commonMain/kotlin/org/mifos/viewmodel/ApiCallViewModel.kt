package org.mifos.viewmodel

import org.mifos.core.apimanager.BaseApiManager
import org.mifos.core.apimanager.BaseUrl.Companion.API_ENDPOINT
import org.mifos.core.apimanager.BaseUrl.Companion.API_PATH
import org.mifos.core.apimanager.BaseUrl.Companion.PROTOCOL_HTTPS
import org.mifos.fineract.client.models.PostAuthenticationRequest

class ApiCallViewModel {

    object FineractApiProvider {
        private const val BASE_URL = PROTOCOL_HTTPS + API_ENDPOINT + API_PATH
        private const val TENANT = "default"
        private const val USERNAME = "mifos"
        private const val PASSWORD = "password"
        val baseApiManager: BaseApiManager by lazy {
            BaseApiManager.getInstance().apply {
                createService(USERNAME, PASSWORD, BASE_URL, TENANT, true)
            }
        }
        val req = PostAuthenticationRequest(username = USERNAME, password = PASSWORD)
    }

    suspend fun getAuthApi(): String = handleError {
        FineractApiProvider.baseApiManager.getAuthApi()
            .authenticate(FineractApiProvider.req, true)
    }

    suspend fun getClient(): String = handleError {
        FineractApiProvider.baseApiManager.getClientsApi().retrieveOne11(1, false)
    }

    suspend fun getSavingApi(): String = handleError {
        FineractApiProvider.baseApiManager.getSavingsApi().retrieveOne25(0)
    }

    suspend fun getCenterApi(): String = handleError {
        FineractApiProvider.baseApiManager.getCenterApi().retrieveOne14(1, false)
    }

    suspend fun getLoanApi(): String = handleError {
        FineractApiProvider.baseApiManager.getLoanApi().retrieveAll27("mifos")
    }

    suspend fun getSurveyApi(): String = handleError {
        FineractApiProvider.baseApiManager.getSurveyApi().findSurvey(1)
    }

    suspend fun getNoteApi(): String = handleError {
        FineractApiProvider.baseApiManager.getNoteApi().retrieveNotesByResource("mifos", 1)
    }

    private suspend fun <T> handleError(
        apiCall: suspend () -> T,
    ): String {
        return try {
            val response = apiCall()
            response.toString()
        } catch (e: Throwable) {
            "Error: ${e.message}"
        }
    }

}