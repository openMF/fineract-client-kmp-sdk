package org.mifos.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.mifos.repository.ApiCallRepo
import org.mifos.utils.ApiParameters
import org.mifos.utils.apiParametersValues

class ApiCallViewModel(private val apiCallRepo: ApiCallRepo) : ViewModel() {


    private val authResponse: StateFlow<String> = apiCallRepo.authResponseStateFlow
    fun getAuthResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getAuthApi()
        }
        return authResponse
    }

    private val clientResponse: StateFlow<String> = apiCallRepo.clientResponseStateFlow
    fun getClientResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getClientApi()
        }
        return clientResponse
    }

    private val savingResponse: StateFlow<String> = apiCallRepo.savingResponseStateFlow
    fun getSavingResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getSavingApi()
        }
        return savingResponse
    }

    private val centerResponse: StateFlow<String> = apiCallRepo.centerResponseStateFlow
    fun getCenterResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getCenterApi()
        }
        return centerResponse
    }

    private val loanResponse: StateFlow<String> = apiCallRepo.loanResponseStateFlow
    fun getLoanResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getLoanApi()
        }
        return loanResponse
    }

    private val surveyResponse: StateFlow<String> = apiCallRepo.surveyResponseStateFlow
    fun getSurveyResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getSurveyApi()
        }
        return surveyResponse
    }

    private val noteResponse: StateFlow<String> = apiCallRepo.noteResponseStateFlow
    fun getNoteResponse(): StateFlow<String> {
        CoroutineScope(Dispatchers.Default).launch {
            apiCallRepo.getNoteApi()
        }
        return noteResponse
    }


    private val _apiParameters = MutableStateFlow(apiParametersValues())
    val apiParameters: StateFlow<List<ApiParameters>> = _apiParameters


}