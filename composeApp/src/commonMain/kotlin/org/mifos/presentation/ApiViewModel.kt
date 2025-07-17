/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.mifos.core.common.JsonFormatter
import org.mifos.core.common.Result
import org.mifos.core.data.network.ApiService
import org.mifos.core.data.network.AuthRequest
import org.mifos.core.data.network.CenterRequest
import org.mifos.core.data.network.ClientRequest
import org.mifos.core.data.network.LoanRequest
import org.mifos.core.data.network.NoteRequest
import org.mifos.core.data.network.SavingsRequest
import org.mifos.core.data.network.SurveyRequest
import org.mifos.utils.projectDetailUtils

/**
 * Simplified ViewModel using ApiHandler framework
 * Returns JSON strings directly without complex data mapping
 */
internal class ApiViewModel(
    private val apiService: ApiService,
) : ViewModel() {

    private val _projectDataState = MutableStateFlow(projectDetailUtils())
    val projectDataState = _projectDataState.asStateFlow()

    private val _uiState = MutableStateFlow(ApiUiState())
    val uiState: StateFlow<ApiUiState> = _uiState.asStateFlow()

    fun onAction(action: ApiAction) {
        when (action) {
            is ApiAction.Authenticate -> authenticate(action.username, action.password)
            is ApiAction.GetClient -> getClient(action.clientId)
            is ApiAction.GetSavingsAccount -> getSavingsAccount(action.accountId)
            is ApiAction.GetLoans -> getLoans(action.loanId)
            is ApiAction.GetCenter -> getCenter(action.centerId)
            is ApiAction.GetSurvey -> getSurvey(action.surveyId)
            is ApiAction.GetNote -> getNote(action.resourceType, action.resourceId, action.noteId)
            is ApiAction.ClearError -> clearError()
            is ApiAction.ClearResponse -> clearResponse()
        }
    }

    /**
     * Authenticate user
     */
    fun authenticate(username: String, password: String) {
        executeApiCall("auth", AuthRequest(username, password), "Authentication")
    }

    /**
     * Get client information
     */
    fun getClient(clientId: Long) {
        executeApiCall("client", ClientRequest(clientId), "Get Client")
    }

    /**
     * Get savings account information
     */
    fun getSavingsAccount(accountId: Long) {
        executeApiCall("savings", SavingsRequest(accountId), "Get Savings Account")
    }

    /**
     * Get loan information
     */
    fun getLoans(loanId: Long) {
        executeApiCall("loans", LoanRequest(loanId), "Get Loans")
    }

    /**
     * Get center information
     */
    fun getCenter(centerId: Long) {
        executeApiCall("centers", CenterRequest(centerId), "Get Center")
    }

    /**
     * Get survey information
     */
    fun getSurvey(surveyId: Long) {
        executeApiCall("surveys", SurveyRequest(surveyId), "Get Survey")
    }

    /**
     * Get note information
     */
    fun getNote(resourceType: String, resourceId: Long, noteId: Long) {
        executeApiCall("notes", NoteRequest(resourceType, resourceId, noteId), "Get Note")
    }

    /**
     * Generic method to execute API calls using the handler framework
     */
    private fun <T> executeApiCall(handlerType: String, request: T, operationName: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null,
                lastOperation = operationName,
            )

            when (val result = apiService.execute(handlerType, request)) {
                is Result.Success -> {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        jsonResponse = JsonFormatter.format(result.data),
                        error = null,
                    )
                }

                is Result.Error -> {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = result.exception.message ?: "Unknown error occurred",
                    )
                }

                is Result.Loading -> {
                    // Keep loading state
                }
            }
        }
    }

    /**
     * Clear any error messages
     */
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    /**
     * Clear the response
     */
    fun clearResponse() {
        _uiState.value = _uiState.value.copy(
            jsonResponse = "",
            lastOperation = "",
        )
    }
}

/**
 * UI State for API operations - simple and focused
 */
internal data class ApiUiState(
    val isLoading: Boolean = false,
    val jsonResponse: String = "",
    val error: String? = null,
    val lastOperation: String = "",
)

internal sealed interface ApiAction {
    data class Authenticate(val username: String, val password: String) : ApiAction
    data class GetClient(val clientId: Long) : ApiAction
    data class GetSavingsAccount(val accountId: Long) : ApiAction
    data class GetLoans(val loanId: Long) : ApiAction
    data class GetCenter(val centerId: Long) : ApiAction
    data class GetSurvey(val surveyId: Long) : ApiAction
    data class GetNote(val resourceType: String, val resourceId: Long, val noteId: Long) : ApiAction
    data object ClearError : ApiAction
    data object ClearResponse : ApiAction
}
