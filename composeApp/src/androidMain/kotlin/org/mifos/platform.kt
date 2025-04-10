package org.mifos

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.mifos.core.apimanager.BaseApiManager
import org.mifos.core.apimanager.BaseUrl.Companion.API_ENDPOINT
import org.mifos.core.apimanager.BaseUrl.Companion.API_PATH
import org.mifos.core.apimanager.BaseUrl.Companion.PROTOCOL_HTTPS
import org.openapitools.client.models.PostAuthenticationRequest

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
actual fun callApi(apiIdentifier: String): String {
    val baseUrl = PROTOCOL_HTTPS + API_ENDPOINT + API_PATH
    val tenant = "default"
    val username = "mifos"
    val password = "password"
    val baseApiManager = BaseApiManager.getInstance()
    baseApiManager.createService(username, password, baseUrl, tenant, false)

    val responseData = remember { mutableStateOf("Loading") }


    val req = PostAuthenticationRequest(username = username, password = password)
    val coroutineScope = rememberCoroutineScope()

    coroutineScope.launch(Dispatchers.IO) {
        responseData.value  = when (apiIdentifier) {
            "authApi" -> {
                try {
                    val response = baseApiManager.getAuthApi().authenticate(req, true)
                    Log.d("Auth Response", response.toString())
                    response.toString()
                } catch (e: Exception) {
                    "Error: ${e.message}"
                }
            }
            "savingApi" -> {
                try {
                    val response = baseApiManager.getSavingsApi().retrieveAll33()
                    Log.d("saving", response.toString())
                    response.toString()
                } catch (e: Exception) {
                    "Error: ${e.message}"
                }
            }
            "centerApi" -> {
                try {
                    val response = baseApiManager.getCenterApi().retrieveOne14(1, false)
                    Log.d("center", response.toString())
                    response.toString()
                } catch (e: Exception) {
                    "Error: ${e.message}"
                }
            }
            "loanApi" -> {
                try {
                    val response = baseApiManager.getLoanApi().retrieveAll27()
                    Log.d("loan", response.toString())
                    response.toString()
                } catch (e: Exception) {
                    "Error: ${e.message}"
                }
            }
            else -> "Invalid API Request"
        }
    }

    return responseData.value

}