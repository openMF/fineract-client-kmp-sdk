package org.mifos.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.mifos.repository.ApiCallRepository
import org.mifos.utils.ApiIdentifier
import org.mifos.utils.ApiParameters
import org.mifos.utils.ApiState
import org.mifos.utils.apiParametersValues

class ApiCallViewModel(private val apiCallRepository: ApiCallRepository) : ViewModel() {

    fun getAllApiResponse(apiIdentifier: ApiIdentifier): StateFlow<ApiState<String>> {
        return when (apiIdentifier) {
            ApiIdentifier.AuthApi -> {
                getAuthResponse()
                authResponse
            }

            ApiIdentifier.CenterApi -> {
                getCenterResponse()
                centerResponse
            }

            ApiIdentifier.ClientApi -> {
                getClientResponse()
                clientResponse
            }

            ApiIdentifier.SavingApi -> {
                getSavingResponse()
                savingResponse
            }

            ApiIdentifier.LoanApi -> {
                getLoanResponse()
                loanResponse
            }

            ApiIdentifier.SurveyApi -> {
                getSurveyResponse()
                surveyResponse
            }

            ApiIdentifier.NoteApi -> {
                getNoteResponse()
                noteResponse
            }
        }
    }

    private val _authResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val authResponse = _authResponse.asStateFlow()

    private fun getAuthResponse() {
        viewModelScope.launch {
            delay(1000)
            _authResponse.emit(apiCallRepository.getAuthApi())
        }
    }

    private val _centerResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val centerResponse = _centerResponse.asStateFlow()

    private fun getCenterResponse() {
        viewModelScope.launch {
            delay(1000)
            _centerResponse.emit(apiCallRepository.getCenterApi())
        }
    }

    private val _clientResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val clientResponse = _clientResponse.asStateFlow()

    private fun getClientResponse() {
        viewModelScope.launch {
            delay(1000)
            _clientResponse.emit(apiCallRepository.getClientApi())
        }
    }

    private val _savingResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val savingResponse = _savingResponse.asStateFlow()

    private fun getSavingResponse() {
        viewModelScope.launch {
            delay(1000)
            _savingResponse.emit(apiCallRepository.getSavingApi())
        }
    }


    private val _loanResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val loanResponse = _loanResponse.asStateFlow()

    private fun getLoanResponse() {
        viewModelScope.launch {
            delay(1000)
            _loanResponse.emit(apiCallRepository.getLoanApi())
        }
    }

    private val _surveyResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val surveyResponse = _surveyResponse.asStateFlow()

    private fun getSurveyResponse() {
        viewModelScope.launch {
            delay(1000)
            _surveyResponse.emit(apiCallRepository.getSurveyApi())
        }
    }

    private val _noteResponse = MutableStateFlow<ApiState<String>>(ApiState.Loading)
    private val noteResponse = _noteResponse.asStateFlow()

    private fun getNoteResponse() {
        viewModelScope.launch {
            delay(1000)
            _noteResponse.emit(apiCallRepository.getNoteApi())
        }
    }


    private val _apiParameters = MutableStateFlow(apiParametersValues())
    val apiParameters: StateFlow<List<ApiParameters>> = _apiParameters


}