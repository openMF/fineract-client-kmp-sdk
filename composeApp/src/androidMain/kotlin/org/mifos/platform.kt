package org.mifos

import android.util.Log
import org.mifos.core.apimanager.BaseApiManager
import org.mifos.core.apimanager.BaseUrl.Companion.API_ENDPOINT
import org.mifos.core.apimanager.BaseUrl.Companion.API_PATH
import org.mifos.core.apimanager.BaseUrl.Companion.PROTOCOL_HTTPS
import org.mifos.fineract.client.models.PostAuthenticationRequest


actual class CallApi actual constructor() {


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


    actual suspend fun getAuthApi(): String = handleApiCall("Auth Response") {
        FineractApiProvider.baseApiManager.getAuthApi()
            .authenticate(FineractApiProvider.req, true)
    }

    actual suspend fun getClient(): String = handleApiCall("Client Details Response") {
        FineractApiProvider.baseApiManager.getClientsApi().retrieveOne11(1, false)
    }

    actual suspend fun getSavingApi(): String = handleApiCall("SavingApi") {
        FineractApiProvider.baseApiManager.getSavingsApi().retrieveAll33()
    }

    actual suspend fun getCenterApi(): String = handleApiCall("CenterApi") {
        FineractApiProvider.baseApiManager.getCenterApi()
            .retrieveOne14(1, false)
    }

    actual suspend fun getLoanApi(): String = handleApiCall("LoanApi") {
        FineractApiProvider.baseApiManager.getLoanApi()
            .retrieveAll27()
    }

    private suspend fun <T> handleApiCall(
        tag: String,
        apiCall: suspend () -> T,
    ): String {
        return try {
            val response = apiCall()
            Log.d(tag, response.toString())
            response.toString()
        } catch (e: Exception) {
            Log.e("$tag Error", Log.getStackTraceString(e))
            "Error: ${e.message}"
        }
    }
}