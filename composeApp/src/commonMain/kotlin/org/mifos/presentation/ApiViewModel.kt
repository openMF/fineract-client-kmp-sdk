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
import org.mifos.core.data.network.AccountNumberFormatRequest
import org.mifos.core.data.network.AccountTransfersRequest
import org.mifos.core.data.network.AccountingClosureRequest
import org.mifos.core.data.network.AccountingRulesRequest
import org.mifos.core.data.network.AdhocQueryRequest
import org.mifos.core.data.network.ApiService
import org.mifos.core.data.network.AuditsRequest
import org.mifos.core.data.network.AuthRequest
import org.mifos.core.data.network.BulkImportRequest
import org.mifos.core.data.network.BulkLoansRequest
import org.mifos.core.data.network.BusinessStepConfigurationRequest
import org.mifos.core.data.network.CalendarRequest
import org.mifos.core.data.network.CenterRequest
import org.mifos.core.data.network.ClientAddressesRequest
import org.mifos.core.data.network.ClientChargesRequest
import org.mifos.core.data.network.ClientCollateralManagementRequest
import org.mifos.core.data.network.ClientIdentifiersRequest
import org.mifos.core.data.network.ClientRequest
import org.mifos.core.data.network.ClientTransactionsRequest
import org.mifos.core.data.network.CodeValuesRequest
import org.mifos.core.data.network.DataTablesRequest
import org.mifos.core.data.network.LoanRequest
import org.mifos.core.data.network.NoteRequest
import org.mifos.core.data.network.SavingsRequest
import org.mifos.core.data.network.SurveyRequest

/**
 * Simplified ViewModel using ApiHandler framework
 * Returns JSON strings directly without complex data mapping
 */
internal class ApiViewModel(
    private val apiService: ApiService,
) : ViewModel() {

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
            is ApiAction.GetAccountNumberFormat -> getAccountNumberFormat(action.accountNumberFormatId)
            is ApiAction.GetAccountTransfers -> getAccountTransfers(action.accountTransfersId)
            is ApiAction.GetAccountingClosure -> getAccountingClosure(action.officeId)
            is ApiAction.GetAccountingRules -> getAccountingRules(action.accountingRuleId)
            is ApiAction.GetAdhocQuery -> getAdhocQuery(action.adHocId)
            is ApiAction.GetAudits -> getAudits(action.auditId)
            is ApiAction.ClientFamilyMember -> getClientFamilyMember(action.clientId)
            is ApiAction.GetBulkImport -> getBulkImport(action.entityId)
            is ApiAction.GetBulkLoans -> getBulkLoans(action.officeId, action.fromLoanOfficerId)
            is ApiAction.GetBusinessDateManagement -> getBusinessDateManagement()
            is ApiAction.GetBusinessStepConfiguration -> getBusinessStepConfiguration(action.jobName)
            is ApiAction.GetCache -> getCache()
            is ApiAction.GetCalendar -> getCalendar(action.calendarId, action.entityType, action.entityId)
            is ApiAction.GetCashierJournals -> getCashierJournals()
            is ApiAction.GetCashiers -> getCashiers()
            is ApiAction.GetCharges -> getCharges()
            is ApiAction.GetClientAddresses -> getClientAddresses(action.clientId)
            is ApiAction.GetClientCharges -> getClientCharges(action.clientId)
            is ApiAction.GetClientCollateralManagement -> getClientCollateralManagement(action.clientId)
            is ApiAction.GetClientIdentifiers -> getClientIdentifiers(action.clientId)
            is ApiAction.GetClientSearch -> getClientSearch()
            is ApiAction.GetClientTransactions -> getClientTransactions(action.clientId)
            is ApiAction.GetCodeValues -> getCodeValues(action.codeId)
            is ApiAction.GetCodes -> getCodes()
            is ApiAction.GetCollateralManagement -> getCollateralManagement()
            is ApiAction.GetCollectionSheet -> getCollectionSheet()
            is ApiAction.GetCreditBureauConfiguration -> getCreditBureauConfiguration()
            is ApiAction.GetCurrencies -> getCurrencies()
            is ApiAction.GetDataTables -> getDataTables(action.datatable)
            is ApiAction.GetDelinquencyRangeAndBucketsManagement -> getDelinquencyRangeAndBucketsManagement()
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
     * Get AccountNumberFormat information
     */
    fun getAccountNumberFormat(accountNumberFormatId: Long) {
        executeApiCall("accountNumberFormat", AccountNumberFormatRequest(accountNumberFormatId), "Get AccountNumberFormat")
    }

    /**
     * Get AccountTransfers information
     */
    fun getAccountTransfers(accountTransfersId: Long) {
        executeApiCall("accountTransfers", AccountTransfersRequest(accountTransfersId), "Get AccountTransfers")
    }

    /**
     * Get AccountingClosure information
     */
    fun getAccountingClosure(officeId: Long) {
        executeApiCall("accountingClosure", AccountingClosureRequest(officeId), "Get AccountingClosure")
    }

    /**
     * Get AccountingRules information
     */
    fun getAccountingRules(accountingRuleId: Long) {
        executeApiCall("accountingRules", AccountingRulesRequest(accountingRuleId), "Get AccountingRules")
    }

    /**
     * Get AdhocQuery information
     */
    fun getAdhocQuery(adHocId: Long) {
        executeApiCall("adhocQuery", AdhocQueryRequest(adHocId), "Get AdhocQuery")
    }

    /**
     * Get Audits information
     */
    fun getAudits(auditId: Long) {
        executeApiCall("audits", AuditsRequest(auditId), "Get Audits")
    }

    /**
     * Get bulk import data
     */
    fun getBulkImport(entityId: String) {
        executeApiCall("bulkImport", BulkImportRequest(entityId), "Get Bulk Import")
    }

    /**
     * Get bulk loans by office and loan officer
     */
    fun getBulkLoans(officeId: Long, fromLoanOfficerId: Long) {
        executeApiCall("bulkLoans", BulkLoansRequest(officeId, fromLoanOfficerId), "Get Bulk Loans")
    }

    /**
     * Get business date management information
     */
    fun getBusinessDateManagement() {
        executeApiCall("businessDateManagement", Unit, "Get Business Date Management")
    }

    /**
     * Get business step configuration for a specific job
     */
    fun getBusinessStepConfiguration(jobName: String) {
        executeApiCall("businessStepConfiguration", BusinessStepConfigurationRequest(jobName), "Get Business Step Configuration")
    }

    /**
     * Get cache contents
     */
    fun getCache() {
        executeApiCall("cache", Unit, "Get Cache")
    }

    /**
     * Get calendar details
     */
    fun getCalendar(calendarId: Long, entityType: String, entityId: Long) {
        executeApiCall("calendar", CalendarRequest(calendarId, entityType, entityId), "Get Calendar")
    }

    /**
     * Get cashier journal entries
     */
    fun getCashierJournals() {
        executeApiCall("cashierJournals", Unit, "Get Cashier Journals")
    }

    /**
     * Get all cashiers
     */
    fun getCashiers() {
        executeApiCall("cashiers", Unit, "Get Cashiers")
    }

    /**
     * Get all charges
     */
    fun getCharges() {
        executeApiCall("charges", Unit, "Get Charges")
    }

    /**
     * Get client charges by client ID
     */
    fun getClientCharges(clientId: Long) {
        executeApiCall("clientCharges", ClientChargesRequest(clientId), "Get Client Charges")
    }

    /**
     * Get client collateral management data
     */
    fun getClientCollateralManagement(clientId: Long) {
        executeApiCall(
            "clientCollateralManagement",
            ClientCollateralManagementRequest(clientId),
            "Get Client Collateral Management",
        )
    }

    /**
     * Get Client Family Member identifiers
     */
    fun getClientFamilyMember(clientId: Long) {
        executeApiCall("clientFamilyMember", ClientIdentifiersRequest(clientId), "Get Client FamilyMember")
    }

    /**
     * Get client identifiers
     */
    fun getClientIdentifiers(clientId: Long) {
        executeApiCall("clientIdentifiers", ClientIdentifiersRequest(clientId), "Get Client Identifiers")
    }

    /**
     * Search for clients
     */
    fun getClientSearch() {
        executeApiCall("clientSearch", Unit, "Get Client Search")
    }

    /**
     * Get client transactions
     */
    fun getClientTransactions(clientId: Long) {
        executeApiCall("clientTransactions", ClientTransactionsRequest(clientId), "Get Client Transactions")
    }

    /**
     * Get client addresses
     */
    fun getClientAddresses(clientId: Long) {
        executeApiCall("clientAddresses", ClientAddressesRequest(clientId), "Get Client Addresses")
    }

    /**
     * Get code values by code ID
     */
    fun getCodeValues(codeId: Long) {
        executeApiCall("codeValues", CodeValuesRequest(codeId), "Get Code Values")
    }

    /**
     * Get all codes
     */
    fun getCodes() {
        executeApiCall("codes", Unit, "Get Codes")
    }

    /**
     * Get collateral management data
     */
    fun getCollateralManagement() {
        executeApiCall("collateralManagement", Unit, "Get Collateral Management")
    }

    /**
     * Get collection sheet information
     */
    fun getCollectionSheet() {
        executeApiCall("collectionSheet", Unit, "Get Collection Sheet")
    }

    /**
     * Get credit bureau configuration
     */
    fun getCreditBureauConfiguration() {
        executeApiCall("creditBureauConfiguration", Unit, "Get Credit Bureau Configuration")
    }

    /**
     * Get available currencies
     */
    fun getCurrencies() {
        executeApiCall("currencies", Unit, "Get Currencies")
    }

    /**
     * Get data tables by name
     */
    fun getDataTables(datatable: String) {
        executeApiCall("dataTables", DataTablesRequest(datatable), "Get Data Tables")
    }

    /**
     * Get delinquency ranges and bucket management information
     */
    fun getDelinquencyRangeAndBucketsManagement() {
        executeApiCall(
            "delinquencyRangeAndBucketsManagement",
            Unit,
            "Get Delinquency Range & Buckets Management",
        )
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
    data class GetAccountNumberFormat(val accountNumberFormatId: Long) : ApiAction
    data class GetAccountTransfers(val accountTransfersId: Long) : ApiAction
    data class GetAccountingClosure(val officeId: Long) : ApiAction
    data class GetAccountingRules(val accountingRuleId: Long) : ApiAction
    data class GetAdhocQuery(val adHocId: Long) : ApiAction
    data class GetAudits(val auditId: Long) : ApiAction
    data class GetBulkImport(val entityId: String) : ApiAction
    data class GetBulkLoans(val officeId: Long, val fromLoanOfficerId: Long) : ApiAction
    data object GetBusinessDateManagement : ApiAction
    data class GetBusinessStepConfiguration(val jobName: String) : ApiAction
    data object GetCache : ApiAction
    data class GetCalendar(val calendarId: Long, val entityType: String, val entityId: Long) : ApiAction
    data object GetCashierJournals : ApiAction
    data object GetCashiers : ApiAction
    data object GetCharges : ApiAction
    data class GetClientCharges(val clientId: Long) : ApiAction
    data class GetClientCollateralManagement(val clientId: Long) : ApiAction
    data class ClientFamilyMember(val clientId: Long) : ApiAction
    data class GetClientIdentifiers(val clientId: Long) : ApiAction
    data object GetClientSearch : ApiAction
    data class GetClientTransactions(val clientId: Long) : ApiAction
    data class GetClientAddresses(val clientId: Long) : ApiAction
    data class GetCodeValues(val codeId: Long) : ApiAction
    data object GetCodes : ApiAction
    data object GetCollateralManagement : ApiAction
    data object GetCollectionSheet : ApiAction
    data object GetCreditBureauConfiguration : ApiAction
    data object GetCurrencies : ApiAction
    data class GetDataTables(val datatable: String) : ApiAction
    data object GetDelinquencyRangeAndBucketsManagement : ApiAction
    data object ClearError : ApiAction
    data object ClearResponse : ApiAction
}
