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
import org.mifos.fineract.client.models.PostCollectionSheetRequest
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
data class ClientRequest(val clientId: Long)
data class SavingsRequest(val accountId: Long)
data class LoanRequest(val loanId: Long)
data class CenterRequest(val centerId: Long)
data class SurveyRequest(val surveyId: Long)
data class NoteRequest(val resourceType: String, val resourceId: Long, val noteId: Long)
data class AccountNumberFormatRequest(val accountNumberFormatId: Long)
data class AccountTransfersRequest(val accountTransfersId: Long)
data class AccountingClosureRequest(val officeId: Long)
data class AccountingRulesRequest(val accountingRuleId: Long)
data class AdhocQueryRequest(val adHocId: Long)
data class AuditsRequest(val auditId: Long)
data class BulkImportRequest(val entityId: String)
data class BulkLoansRequest(val officeId: Long, val fromLoanOfficerId: Long)
data class BusinessStepConfigurationRequest(val jobName: String)
data class CalendarRequest(val calendarId: Long, val entityType: String, val entityId: Long)
data class ClientChargesRequest(val clientId: Long)
data class ClientCollateralManagementRequest(val clientId: Long)
data class ClientIdentifiersRequest(val clientId: Long)
data class ClientFamilyMemberRequest(val clientId: Long)
data class ClientTransactionsRequest(val clientId: Long)
data class ClientAddressesRequest(val clientId: Long)
data class CodeValuesRequest(val codeId: Long)
data class DataTablesRequest(val datatable: String)

/**
 * Authentication API Handler
 */
class AuthApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AuthRequest>(fineractApiProvider) {

    override val handlerId: String = "auth"

    override suspend fun executeApi(request: AuthRequest): Any {
        val authRequest = PostAuthenticationRequest(request.username, request.password)
        return fineractApiProvider.baseApiManager.getClient()
            .authentication.authenticate(authRequest, true)
    }
}

/**
 * Client API Handler
 */
class ClientApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientRequest>(fineractApiProvider) {

    override val handlerId: String = "client"

    override suspend fun executeApi(request: ClientRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .clients.retrieveOne11(request.clientId, true)
    }
}

/**
 * Savings API Handler
 */
class SavingsApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<SavingsRequest>(fineractApiProvider) {

    override val handlerId: String = "savings"

    override suspend fun executeApi(request: SavingsRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .savingsAccounts.retrieveOne25(request.accountId)
    }
}

/**
 * Loan API Handler
 */
class LoanApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<LoanRequest>(fineractApiProvider) {

    override val handlerId: String = "loans"

    override suspend fun executeApi(request: LoanRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .loans.retrieveAll27("mifos") // Using default parameter for demo
    }
}

/**
 * Center API Handler
 */
class CenterApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CenterRequest>(fineractApiProvider) {

    override val handlerId: String = "centers"

    override suspend fun executeApi(request: CenterRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .centers.retrieveOne14(request.centerId, false)
    }
}

/**
 * Survey API Handler
 */
class SurveyApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<SurveyRequest>(fineractApiProvider) {

    override val handlerId: String = "surveys"

    override suspend fun executeApi(request: SurveyRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .spmSurveys.findSurvey(request.surveyId)
    }
}

/**
 * Note API Handler
 */
class NoteApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<NoteRequest>(fineractApiProvider) {

    override val handlerId: String = "notes"

    override suspend fun executeApi(request: NoteRequest): Any {
        return fineractApiProvider.baseApiManager.getClient()
            .notes.retrieveNote(request.resourceType, request.resourceId, request.noteId)
    }
}

/**
 * AccountNumberFormat API Handler
 */
class AccountNumberFormatApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AccountNumberFormatRequest>(fineractApiProvider) {

    override val handlerId: String = "accountNumberFormat"

    override suspend fun executeApi(request: AccountNumberFormatRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().accountNumberFormats.retrieveOne(request.accountNumberFormatId)
    }
}

/**
 * AccountTransfers API Handler
 */
class AccountTransfersApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AccountTransfersRequest>(fineractApiProvider) {

    override val handlerId: String = "accountTransfers"

    override suspend fun executeApi(request: AccountTransfersRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().accountTransfers.retrieveOne9(request.accountTransfersId)
    }
}

/**
 * AccountingClosure API Handler
 */
class AccountingClosureApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AccountingClosureRequest>(fineractApiProvider) {

    override val handlerId: String = "accountingClosure"

    override suspend fun executeApi(request: AccountingClosureRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().accountingClosures.retrieveAllClosures(request.officeId)
    }
}

/**
 * AccountingRules API Handler
 */
class AccountingRulesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AccountingRulesRequest>(fineractApiProvider) {

    override val handlerId: String = "accountingRules"

    override suspend fun executeApi(request: AccountingRulesRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().accountingRules.retreiveAccountingRule(
            request.accountingRuleId,
        )
    }
}

/**
 * Audits API Handler
 */
class AuditsApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AuditsRequest>(fineractApiProvider) {

    override val handlerId: String = "audits"

    override suspend fun executeApi(request: AuditsRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().audits.retrieveAuditEntry(request.auditId)
    }
}

/**
 * AdhocQuery API Handler
 */
class AdhocQueryApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<AdhocQueryRequest>(fineractApiProvider) {

    override val handlerId: String = "adhocQuery"

    override suspend fun executeApi(request: AdhocQueryRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().adhocQuery.retrieveAdHocQuery(request.adHocId)
    }
}

/**
 * BulkImport API Handler
 */
class BulkImportApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<BulkImportRequest>(fineractApiProvider) {

    override val handlerId: String = "bulkImport"

    override suspend fun executeApi(request: BulkImportRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().bulkImport.retrieveImportDocuments(request.entityId)
    }
}

/**
 * BulkLoans API Handler
 */
class BulkLoansApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<BulkLoansRequest>(fineractApiProvider) {

    override val handlerId: String = "bulkLoans"

    override suspend fun executeApi(request: BulkLoansRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().bulkLoans.loanReassignmentTemplate(request.officeId, request.fromLoanOfficerId)
    }
}

/**
 * BusinessDateManagement API Handler
 */
class BusinessDateManagementApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "businessDateManagement"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().businessDateManagement.getBusinessDates()
    }
}

/**
 * Business Step Configuration API Handler
 */
class BusinessStepConfigurationApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<BusinessStepConfigurationRequest>(fineractApiProvider) {

    override val handlerId: String = "businessStepConfiguration"

    override suspend fun executeApi(request: BusinessStepConfigurationRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().businessStepConfiguration.retrieveAllAvailableBusinessStep(request.jobName)
    }
}

/**
 * Cache API Handler
 */
class CacheApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "cache"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().caches.retrieveAll4()
    }
}

/**
 * Calendar API Handler
 */
class CalendarApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CalendarRequest>(fineractApiProvider) {

    override val handlerId: String = "calendar"

    override suspend fun executeApi(request: CalendarRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().calender.retrieveCalendar(request.calendarId, request.entityType, request.entityId)
    }
}

/**
 * CashierJournals API Handler
 */
class CashierJournalsApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "cashierJournals"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().cashiersJournal.getJournalData1()
    }
}

/**
 * Cashiers API Handler
 */
class CashiersApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "cashiers"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().cashiers.getCashierData()
    }
}

/**
 * Charges API Handler
 */
class ChargesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "charges"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().charges.retrieveAllCharges()
    }
}

/**
 * Client Charges API Handler
 */
class ClientChargesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientChargesRequest>(fineractApiProvider) {

    override val handlerId: String = "charges"

    override suspend fun executeApi(request: ClientChargesRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientCharges.retrieveAllClientCharges(request.clientId)
    }
}

/**
 * Client Collateral Management API Handler
 */
class ClientCollateralManagementApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientCollateralManagementRequest>(fineractApiProvider) {

    override val handlerId: String = "clientCollateralManagement"

    override suspend fun executeApi(request: ClientCollateralManagementRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientCollateralManagement.getClientCollateral(request.clientId)
    }
}

/**
 * Client Family Member API Handler
 */
class ClientFamilyMemberApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientFamilyMemberRequest>(fineractApiProvider) {

    override val handlerId: String = "clientFamilyMember"

    override suspend fun executeApi(request: ClientFamilyMemberRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientFamilyMember.getFamilyMembers(request.clientId)
    }
}

/**
 * Client Identifiers API Handler
 */
class ClientIdentifiersApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientIdentifiersRequest>(fineractApiProvider) {

    override val handlerId: String = "clientIdentifiers"

    override suspend fun executeApi(request: ClientIdentifiersRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientIdentifiers.retrieveAllClientIdentifiers(request.clientId)
    }
}

/**
 * Client Search API Handler
 */
class ClientSearchApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "clientSearch"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().clientSearch.searchByText()
    }
}

/**
 * Client Transactions API Handler
 */
class ClientTransactionsApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientTransactionsRequest>(fineractApiProvider) {

    override val handlerId: String = "clientTransactions"

    override suspend fun executeApi(request: ClientTransactionsRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientTransactions.retrieveAllClientTransactions(request.clientId)
    }
}

/**
 * Client Addresses API Handler
 */
class ClientAddressesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<ClientAddressesRequest>(fineractApiProvider) {

    override val handlerId: String = "clientAddresses"

    override suspend fun executeApi(request: ClientAddressesRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().clientAddresses.getAddresses1(request.clientId)
    }
}

/**
 * Code Values API Handler
 */
class CodeValuesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<CodeValuesRequest>(fineractApiProvider) {

    override val handlerId: String = "codeValues"

    override suspend fun executeApi(request: CodeValuesRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().codeValues.retrieveAllCodeValues(request.codeId)
    }
}

/**
 * Codes API Handler
 */
class CodesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "codes"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().codes.retrieveCodes()
    }
}

/**
 * Collateral Management API Handler
 */
class CollateralManagementApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "collateralManagement"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().collateralManagement.getAllCollaterals()
    }
}

/**
 * CollectionSheet API Handler
 */
class CollectionSheetApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "collectionSheet"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().collectionSheet.generateCollectionSheet(PostCollectionSheetRequest())
    }
}

/**
 * Credit Bureau Configuration API Handler
 */
class CreditBureauConfigurationApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "creditBureauConfiguration"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().creditBureauConfiguration.getCreditBureau()
    }
}

/**
 * Currencies API Handler
 */
class CurrenciesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "currencies"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().currencies.retrieveCurrencies()
    }
}

/**
 * DataTables API Handler
 */
class DataTablesApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<DataTablesRequest>(fineractApiProvider) {

    override val handlerId: String = "dataTables"

    override suspend fun executeApi(request: DataTablesRequest): Any {
        return fineractApiProvider.baseApiManager.getClient().dataTables.getDatatable(request.datatable)
    }
}

/**
 * Delinquency Range And Buckets Management API Handler
 */
class DelinquencyRangeAndBucketsManagementApiHandler(
    fineractApiProvider: FineractApiProvider,
) : BaseFineractApiHandler<Unit>(fineractApiProvider) {

    override val handlerId: String = "delinquencyRangeAndBucketsManagement"

    override suspend fun executeApi(request: Unit): Any {
        return fineractApiProvider.baseApiManager.getClient().delinquencyRangeAndBucketsManagement.getDelinquencyBuckets()
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
            "auth" -> AuthApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "client" -> ClientApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "savings" -> SavingsApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "loans" -> LoanApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "centers" -> CenterApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "surveys" -> SurveyApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "notes" -> NoteApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "accountNumberFormat" -> AccountNumberFormatApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "accountTransfers" -> AccountTransfersApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "accountingClosure" -> AccountingClosureApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "accountingRules" -> AccountingRulesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "audits" -> AuditsApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "adhocQuery" -> AdhocQueryApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "bulkImport" -> BulkImportApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "bulkLoans" -> BulkLoansApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "businessDateManagement" -> BusinessDateManagementApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "businessStepConfiguration" -> BusinessStepConfigurationApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "cache" -> CacheApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "calendar" -> CalendarApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "cashierJournals" -> CashierJournalsApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "cashiers" -> CashiersApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "charges" -> ChargesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientCharges" -> ClientChargesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientCollateralManagement" -> ClientCollateralManagementApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientFamilyMember" -> ClientFamilyMemberApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientIdentifiers" -> ClientIdentifiersApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientSearch" -> ClientSearchApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientTransactions" -> ClientTransactionsApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "clientAddresses" -> ClientAddressesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "codeValues" -> CodeValuesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "codes" -> CodesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "collateralManagement" -> CollateralManagementApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "collectionSheet" -> CollectionSheetApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "creditBureauConfiguration" -> CreditBureauConfigurationApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "currencies" -> CurrenciesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "dataTables" -> DataTablesApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            "delinquencyRangeAndBucketsManagement" -> DelinquencyRangeAndBucketsManagementApiHandler(fineractApiProvider) as? ApiHandler<RequestType>
            else -> null
        }
    }
}
