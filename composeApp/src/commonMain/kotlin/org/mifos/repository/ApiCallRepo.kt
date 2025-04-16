package org.mifos.repository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.mifos.fineract.client.models.PostAuthenticationRequest
import org.mifos.utils.FineractApiProvider

class ApiCallRepo(private val fineractApiProvider: FineractApiProvider) {

    private val authResponse = MutableStateFlow("Loading")
    val authResponseStateFlow: StateFlow<String> get() = authResponse
    suspend fun getAuthApi() {
        val authRequest = PostAuthenticationRequest(FineractApiProvider.USERNAME, FineractApiProvider.PASSWORD)
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().authentication.authenticate(authRequest, true)

        }
        authResponse.emit(data)
    }


    private val clientResponse = MutableStateFlow("Loading")
    val clientResponseStateFlow: StateFlow<String> get() = clientResponse
    suspend fun getClientApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().clients.retrieveOne11(789, true)
        }
        clientResponse.emit(data)
    }


    private val savingResponse = MutableStateFlow("Loading")
    val savingResponseStateFlow: StateFlow<String> get() = savingResponse
    suspend fun getSavingApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().savingsAccounts.retrieveOne25(0)
        }
        savingResponse.emit(data)
    }


    private val centerResponse = MutableStateFlow("Loading")
    val centerResponseStateFlow: StateFlow<String> get() = centerResponse
    suspend fun getCenterApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().centers.retrieveOne14(1, false)
        }
        centerResponse.emit(data)
    }


    private val loanResponse = MutableStateFlow("Loading")
    val loanResponseStateFlow: StateFlow<String> get() = loanResponse
    suspend fun getLoanApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().loans.retrieveAll27("mifos")
        }
        loanResponse.emit(data)
    }


    private val surveyResponse = MutableStateFlow("Loading")
    val surveyResponseStateFlow: StateFlow<String> get() = surveyResponse
    suspend fun getSurveyApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().spmSurveys.findSurvey(1)
        }
        surveyResponse.emit(data)
    }


    private val noteResponse = MutableStateFlow("Loading")
    val noteResponseStateFlow: StateFlow<String> get() = noteResponse
    suspend fun getNoteApi() {
        val data = handleError {
            fineractApiProvider.baseApiManager.getClient().notes.retrieveNote("resourceType_example", 789, 789)
         }
        noteResponse.emit(data)
    }



    private suspend fun <T> handleError(
        apiCall: suspend () -> T,
    ): String {
        return try {
            apiCall().toString()
        } catch (e: Throwable) {
            "Error: ${e.message}"
        }
    }

}