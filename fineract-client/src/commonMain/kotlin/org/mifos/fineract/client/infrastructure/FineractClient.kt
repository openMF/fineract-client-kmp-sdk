/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
package org.mifos.fineract.client.infrastructure

import de.jensklingenberg.ktorfit.Ktorfit
import io.ktor.client.HttpClient
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import io.ktor.utils.io.core.toByteArray
import kotlinx.serialization.json.Json
import org.mifos.fineract.client.apis.createAccountNumberFormatApi
import org.mifos.fineract.client.apis.createAccountTransfersApi
import org.mifos.fineract.client.apis.createAccountingClosureApi
import org.mifos.fineract.client.apis.createAccountingRulesApi
import org.mifos.fineract.client.apis.createAdhocQueryApiApi
import org.mifos.fineract.client.apis.createAuditsApi
import org.mifos.fineract.client.apis.createAuthenticationHTTPBasicApi
import org.mifos.fineract.client.apis.createBatchAPIApi
import org.mifos.fineract.client.apis.createBulkImportApi
import org.mifos.fineract.client.apis.createBulkLoansApi
import org.mifos.fineract.client.apis.createBusinessDateManagementApi
import org.mifos.fineract.client.apis.createBusinessStepConfigurationApi
import org.mifos.fineract.client.apis.createCacheApi
import org.mifos.fineract.client.apis.createCalendarApi
import org.mifos.fineract.client.apis.createCashierJournalsApi
import org.mifos.fineract.client.apis.createCashiersApi
import org.mifos.fineract.client.apis.createCentersApi
import org.mifos.fineract.client.apis.createChargesApi
import org.mifos.fineract.client.apis.createClientApi
import org.mifos.fineract.client.apis.createClientChargesApi
import org.mifos.fineract.client.apis.createClientCollateralManagementApi
import org.mifos.fineract.client.apis.createClientFamilyMemberApi
import org.mifos.fineract.client.apis.createClientIdentifierApi
import org.mifos.fineract.client.apis.createClientSearchV2Api
import org.mifos.fineract.client.apis.createClientTransactionApi
import org.mifos.fineract.client.apis.createClientsAddressApi
import org.mifos.fineract.client.apis.createCodeValuesApi
import org.mifos.fineract.client.apis.createCodesApi
import org.mifos.fineract.client.apis.createCollateralManagementApi
import org.mifos.fineract.client.apis.createCollectionSheetApi
import org.mifos.fineract.client.apis.createCreditBureauConfigurationApi
import org.mifos.fineract.client.apis.createCurrencyApi
import org.mifos.fineract.client.apis.createDataTablesApi
import org.mifos.fineract.client.apis.createDefaultApi
import org.mifos.fineract.client.apis.createDelinquencyRangeAndBucketsManagementApi
import org.mifos.fineract.client.apis.createDepositAccountOnHoldFundTransactionsApi
import org.mifos.fineract.client.apis.createDeviceRegistrationApi
import org.mifos.fineract.client.apis.createDocumentsApi
import org.mifos.fineract.client.apis.createEntityDataTableApi
import org.mifos.fineract.client.apis.createEntityFieldConfigurationApi
import org.mifos.fineract.client.apis.createExternalAssetOwnersApi
import org.mifos.fineract.client.apis.createExternalEventConfigurationApi
import org.mifos.fineract.client.apis.createExternalServicesApi
import org.mifos.fineract.client.apis.createFetchAuthenticatedUserDetailsApi
import org.mifos.fineract.client.apis.createFineractEntityApi
import org.mifos.fineract.client.apis.createFixedDepositAccountApi
import org.mifos.fineract.client.apis.createFixedDepositAccountTransactionsApi
import org.mifos.fineract.client.apis.createFixedDepositProductApi
import org.mifos.fineract.client.apis.createFloatingRatesApi
import org.mifos.fineract.client.apis.createFundsApi
import org.mifos.fineract.client.apis.createGeneralLedgerAccountApi
import org.mifos.fineract.client.apis.createGlobalConfigurationApi
import org.mifos.fineract.client.apis.createGroupsApi
import org.mifos.fineract.client.apis.createGroupsLevelApi
import org.mifos.fineract.client.apis.createGuarantorsApi
import org.mifos.fineract.client.apis.createHolidaysApi
import org.mifos.fineract.client.apis.createHooksApi
import org.mifos.fineract.client.apis.createInlineJobApi
import org.mifos.fineract.client.apis.createInstanceModeApi
import org.mifos.fineract.client.apis.createInterOperationApi
import org.mifos.fineract.client.apis.createInterestRateChartApi
import org.mifos.fineract.client.apis.createInterestRateSlabAKAInterestBandsApi
import org.mifos.fineract.client.apis.createJournalEntriesApi
import org.mifos.fineract.client.apis.createLikelihoodApi
import org.mifos.fineract.client.apis.createListReportMailingJobHistoryApi
import org.mifos.fineract.client.apis.createLoanAccountLockApi
import org.mifos.fineract.client.apis.createLoanCOBCatchUpApi
import org.mifos.fineract.client.apis.createLoanChargesApi
import org.mifos.fineract.client.apis.createLoanCollateralApi
import org.mifos.fineract.client.apis.createLoanCollateralManagementApi
import org.mifos.fineract.client.apis.createLoanDisbursementDetailsApi
import org.mifos.fineract.client.apis.createLoanProductsApi
import org.mifos.fineract.client.apis.createLoanReschedulingApi
import org.mifos.fineract.client.apis.createLoanTransactionsApi
import org.mifos.fineract.client.apis.createLoansApi
import org.mifos.fineract.client.apis.createMakerCheckerOr4EyeFunctionalityApi
import org.mifos.fineract.client.apis.createMappingFinancialActivitiesToAccountsApi
import org.mifos.fineract.client.apis.createMeetingsApi
import org.mifos.fineract.client.apis.createMixMappingApi
import org.mifos.fineract.client.apis.createMixReportApi
import org.mifos.fineract.client.apis.createMixTaxonomyApi
import org.mifos.fineract.client.apis.createNotesApi
import org.mifos.fineract.client.apis.createNotificationApi
import org.mifos.fineract.client.apis.createOfficesApi
import org.mifos.fineract.client.apis.createPasswordPreferencesApi
import org.mifos.fineract.client.apis.createPaymentTypeApi
import org.mifos.fineract.client.apis.createPeriodicAccrualAccountingApi
import org.mifos.fineract.client.apis.createPermissionsApi
import org.mifos.fineract.client.apis.createPocketApi
import org.mifos.fineract.client.apis.createPovertyLineApi
import org.mifos.fineract.client.apis.createProductMixApi
import org.mifos.fineract.client.apis.createProductsApi
import org.mifos.fineract.client.apis.createProvisioningCategoryApi
import org.mifos.fineract.client.apis.createProvisioningCriteriaApi
import org.mifos.fineract.client.apis.createProvisioningEntriesApi
import org.mifos.fineract.client.apis.createRateApi
import org.mifos.fineract.client.apis.createRecurringDepositAccountApi
import org.mifos.fineract.client.apis.createRecurringDepositAccountTransactionsApi
import org.mifos.fineract.client.apis.createRecurringDepositProductApi
import org.mifos.fineract.client.apis.createRepaymentWithPostDatedChecksApi
import org.mifos.fineract.client.apis.createReportMailingJobsApi
import org.mifos.fineract.client.apis.createReportsApi
import org.mifos.fineract.client.apis.createRescheduleLoansApi
import org.mifos.fineract.client.apis.createRolesApi
import org.mifos.fineract.client.apis.createRunReportsApi
import org.mifos.fineract.client.apis.createSCHEDULERJOBApi
import org.mifos.fineract.client.apis.createSMSApi
import org.mifos.fineract.client.apis.createSPMAPILookUpTableApi
import org.mifos.fineract.client.apis.createSavingsAccountApi
import org.mifos.fineract.client.apis.createSavingsAccountTransactionsApi
import org.mifos.fineract.client.apis.createSavingsChargesApi
import org.mifos.fineract.client.apis.createSavingsProductApi
import org.mifos.fineract.client.apis.createSchedulerApi
import org.mifos.fineract.client.apis.createScoreCardApi
import org.mifos.fineract.client.apis.createSearchAPIApi
import org.mifos.fineract.client.apis.createSelfAccountTransferApi
import org.mifos.fineract.client.apis.createSelfAuthenticationApi
import org.mifos.fineract.client.apis.createSelfClientApi
import org.mifos.fineract.client.apis.createSelfDividendApi
import org.mifos.fineract.client.apis.createSelfLoanProductsApi
import org.mifos.fineract.client.apis.createSelfLoansApi
import org.mifos.fineract.client.apis.createSelfRunReportApi
import org.mifos.fineract.client.apis.createSelfSavingsAccountApi
import org.mifos.fineract.client.apis.createSelfSavingsProductsApi
import org.mifos.fineract.client.apis.createSelfScoreCardApi
import org.mifos.fineract.client.apis.createSelfServiceRegistrationApi
import org.mifos.fineract.client.apis.createSelfShareAccountsApi
import org.mifos.fineract.client.apis.createSelfSpmApi
import org.mifos.fineract.client.apis.createSelfThirdPartyTransferApi
import org.mifos.fineract.client.apis.createSelfUserApi
import org.mifos.fineract.client.apis.createSelfUserDetailsApi
import org.mifos.fineract.client.apis.createShareAccountApi
import org.mifos.fineract.client.apis.createSpmSurveysApi
import org.mifos.fineract.client.apis.createStaffApi
import org.mifos.fineract.client.apis.createStandingInstructionsApi
import org.mifos.fineract.client.apis.createStandingInstructionsHistoryApi
import org.mifos.fineract.client.apis.createSurveyApi
import org.mifos.fineract.client.apis.createTaxComponentsApi
import org.mifos.fineract.client.apis.createTaxGroupApi
import org.mifos.fineract.client.apis.createTellerCashManagementApi
import org.mifos.fineract.client.apis.createTwoFactorApi
import org.mifos.fineract.client.apis.createUserGeneratedDocumentsApi
import org.mifos.fineract.client.apis.createUsersApi
import org.mifos.fineract.client.apis.createWorkingDaysApi
import kotlin.io.encoding.Base64
//import org.mifos.fineract.client.ktorHttpClient
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * Fineract Client Kotlin KMP SDK API entry point.
 *
 */
class FineractClient private constructor(
    private val httpClient: HttpClient,
    private val ktorfit: Ktorfit,
) {
    val accountingClosures = ktorfit.createAccountingClosureApi()
    val accountingRules = ktorfit.createAccountingRulesApi()
    val accountNumberFormats = ktorfit.createAccountNumberFormatApi()
    val accountTransfers = ktorfit.createAccountTransfersApi()
    val adhocQuery = ktorfit.createAdhocQueryApiApi()
    val audits = ktorfit.createAuditsApi()
    val authentication = ktorfit.createAuthenticationHTTPBasicApi()
    val batches = ktorfit.createBatchAPIApi()
    val bulkImport = ktorfit.createBulkImportApi()
    val bulkLoans = ktorfit.createBulkLoansApi()
    val businessDateManagement = ktorfit.createBusinessDateManagementApi()
    val businessStepConfiguration = ktorfit.createBusinessStepConfigurationApi()
    val caches = ktorfit.createCacheApi()
    val calender = ktorfit.createCalendarApi()
    val cashiersJournal = ktorfit.createCashierJournalsApi()
    val cashiers = ktorfit.createCashiersApi()
    val centers = ktorfit.createCentersApi()
    val charges = ktorfit.createChargesApi()
    val clients = ktorfit.createClientApi()
    val clientCharges = ktorfit.createClientChargesApi()
    val clientCollateralManagement = ktorfit.createClientCollateralManagementApi()
    val clientFamilyMember = ktorfit.createClientFamilyMemberApi()
    val clientIdentifiers = ktorfit.createClientIdentifierApi()
    val clientAddresses = ktorfit.createClientsAddressApi()
    val clientSearch = ktorfit.createClientSearchV2Api()
    val clientTransactions = ktorfit.createClientTransactionApi()
    val codes = ktorfit.createCodesApi()
    val codeValues = ktorfit.createCodeValuesApi()
    val collateralManagement = ktorfit.createCollateralManagementApi()
    val collectionSheet = ktorfit.createCollectionSheetApi()
    val creditBureauConfiguration = ktorfit.createCreditBureauConfigurationApi()
    val currencies = ktorfit.createCurrencyApi()
    val dataTables = ktorfit.createDataTablesApi()
    val legacy = ktorfit.createDefaultApi() // TODO FINERACT-1222
    val delinquencyRangeAndBucketsManagement =
        ktorfit.createDelinquencyRangeAndBucketsManagementApi()
    val depositAccountOnHoldFundTransactions =
        ktorfit.createDepositAccountOnHoldFundTransactionsApi()
    val deviceRegistrationApi = ktorfit.createDeviceRegistrationApi()
    val documents = ktorfit.createDocumentsApi()
    val entityDatatableChecks = ktorfit.createEntityDataTableApi()
    val entityFieldConfigurations = ktorfit.createEntityFieldConfigurationApi()
    val externalAssetOwners = ktorfit.createExternalAssetOwnersApi()
    val externalEventConfiguration = ktorfit.createExternalEventConfigurationApi()
    val externalServices = ktorfit.createExternalServicesApi()
    val userDetails = ktorfit.createFetchAuthenticatedUserDetailsApi()
    val fineractEntity = ktorfit.createFineractEntityApi()
    val fixedDepositAccounts = ktorfit.createFixedDepositAccountApi()
    val fixedDepositAccountTransactions = ktorfit.createFixedDepositAccountTransactionsApi()
    val fixedDepositProducts = ktorfit.createFixedDepositProductApi()
    val floatingRates = ktorfit.createFloatingRatesApi()
    val funds = ktorfit.createFundsApi()
    val glAccounts = ktorfit.createGeneralLedgerAccountApi()
    val globalConfigurations = ktorfit.createGlobalConfigurationApi()
    val groups = ktorfit.createGroupsApi()
    val groupsLoans = ktorfit.createGroupsLevelApi()
    val guarantors = ktorfit.createGuarantorsApi()
    val holidays = ktorfit.createHolidaysApi()
    val hooks = ktorfit.createHooksApi()
    val inlineJob = ktorfit.createInlineJobApi()
    val instanceMode = ktorfit.createInstanceModeApi()
    val interestRateCharts = ktorfit.createInterestRateChartApi()
    val interestRateChartLabs = ktorfit.createInterestRateSlabAKAInterestBandsApi()
    val interOperation = ktorfit.createInterOperationApi()
    val journalEntries = ktorfit.createJournalEntriesApi()
    val likelihood = ktorfit.createLikelihoodApi()
    val reportMailings = ktorfit.createListReportMailingJobHistoryApi()
    val loanAccountLock = ktorfit.createLoanAccountLockApi()
    val loanCharges = ktorfit.createLoanChargesApi()
    val loanCOBCatchUp = ktorfit.createLoanCOBCatchUpApi()
    val loanCollaterals = ktorfit.createLoanCollateralApi()
    val loanCollateralManagement = ktorfit.createLoanCollateralManagementApi()
    val loanDisbursementDetails = ktorfit.createLoanDisbursementDetailsApi()
    val loanProducts = ktorfit.createLoanProductsApi()
    val loanSchedules = ktorfit.createLoanReschedulingApi()
    val loans = ktorfit.createLoansApi()
    val loanTransactions = ktorfit.createLoanTransactionsApi()
    val makerCheckers = ktorfit.createMakerCheckerOr4EyeFunctionalityApi()
    val financialActivityAccountMappings = ktorfit.createMappingFinancialActivitiesToAccountsApi()
    val meetings = ktorfit.createMeetingsApi()
    val mixMappings = ktorfit.createMixMappingApi()
    val mixReports = ktorfit.createMixReportApi()
    val mixTaxonomies = ktorfit.createMixTaxonomyApi()
    val notes = ktorfit.createNotesApi()
    val notifications = ktorfit.createNotificationApi()
    val offices = ktorfit.createOfficesApi()
    val passwordPreferences = ktorfit.createPasswordPreferencesApi()
    val paymentTypes = ktorfit.createPaymentTypeApi()
    val periodicAccrualAccounting = ktorfit.createPeriodicAccrualAccountingApi()
    val permissions = ktorfit.createPermissionsApi()
    val selfPockets = ktorfit.createPocketApi()
    val povertyLine = ktorfit.createPovertyLineApi()
    val productMix = ktorfit.createProductMixApi()
    val provisioningCategories = ktorfit.createProvisioningCategoryApi()
    val products = ktorfit.createProductsApi()
    val provisioningCriterias = ktorfit.createProvisioningCriteriaApi()
    val provisioningEntries = ktorfit.createProvisioningEntriesApi()
    val rate = ktorfit.createRateApi()
    val recurringDepositAccounts = ktorfit.createRecurringDepositAccountApi()
    val recurringDepositAccountTransactions = ktorfit.createRecurringDepositAccountTransactionsApi()
    val recurringDepositProducts = ktorfit.createRecurringDepositProductApi()
    val repaymentWithPostDatedChecks = ktorfit.createRepaymentWithPostDatedChecksApi()
    val reportMailingJobs = ktorfit.createReportMailingJobsApi()
    val reports = ktorfit.createReportsApi()
    val rescheduling = ktorfit.createRescheduleLoansApi()
    val roles = ktorfit.createRolesApi()
    val reportsRun = ktorfit.createRunReportsApi()
    val savingsAccounts = ktorfit.createSavingsAccountApi()
    val savingsTransactions = ktorfit.createSavingsAccountTransactionsApi()
    val savingsAccountCharges = ktorfit.createSavingsChargesApi()
    val savingsProducts = ktorfit.createSavingsProductApi()
    val jobsScheduler = ktorfit.createSchedulerApi()
    val jobs = ktorfit.createSCHEDULERJOBApi()
    val surveyScorecards = ktorfit.createScoreCardApi()
    val search = ktorfit.createSearchAPIApi()
    val selfAccountTransfers = ktorfit.createSelfAccountTransferApi()
    val selfAuthentication = ktorfit.createSelfAuthenticationApi()
    val selfClients = ktorfit.createSelfClientApi()
    val selfDividend = ktorfit.createSelfDividendApi()
    val selfLoanProducts = ktorfit.createSelfLoanProductsApi()
    val selfLoans = ktorfit.createSelfLoansApi()
    val selfReportsRun = ktorfit.createSelfRunReportApi()
    val selfSavingsAccounts = ktorfit.createSelfSavingsAccountApi()
    val selfSavingsProducts = ktorfit.createSelfSavingsProductsApi()
    val selfSurveyScorecards = ktorfit.createSelfScoreCardApi()
    val selfRegistration = ktorfit.createSelfServiceRegistrationApi()
    val selfShareAccounts = ktorfit.createSelfShareAccountsApi()
    val selfSurveys = ktorfit.createSelfSpmApi()
    val selfThirdPartyBeneficiaries = ktorfit.createSelfThirdPartyTransferApi()
    val selfUser = ktorfit.createSelfUserApi()
    val selfUserDetails = ktorfit.createSelfUserDetailsApi()
    val shareAccounts = ktorfit.createShareAccountApi()
    val sms = ktorfit.createSMSApi()
    val surveyLookupTables = ktorfit.createSPMAPILookUpTableApi()
    val spmSurveys = ktorfit.createSpmSurveysApi()
    val staff = ktorfit.createStaffApi()
    val standingInstructions = ktorfit.createStandingInstructionsApi()
    val standingInstructionsHistory = ktorfit.createStandingInstructionsHistoryApi()
    val surveys = ktorfit.createSurveyApi()
    val taxComponents = ktorfit.createTaxComponentsApi()
    val taxGroups = ktorfit.createTaxGroupApi()
    val tellers = ktorfit.createTellerCashManagementApi()
    val twoFactor = ktorfit.createTwoFactorApi()
    val templates = ktorfit.createUserGeneratedDocumentsApi()
    val users = ktorfit.createUsersApi()
    val workingDays = ktorfit.createWorkingDaysApi()

    fun httpClient(): HttpClient {
        return this.httpClient
    }

    fun baseURL(): String {
        return ktorfit.baseUrl
    }

    /**
     * Create an implementation of the API endpoints defined by the `service` interface, using
     * [Ktorfit.create]. This method is typically not required to be invoked for standard API usage, but
     * can be a handy back door for non-trivial advanced customizations of the API client if you have extended Fineract
     * with your own REST APIs.
     */

    class Builder internal constructor() {
        /**
         * Obtain the internal OkHttp Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [FineractClient] which [.build] will use.
         */

        /**
         * Obtain the internal Retrofit Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [FineractClient] which [.build] will use.
         */

        private lateinit var baseURL: String
        private var tenant: String? = null
        private var loginUsername: String? = null
        private var loginPassword: String? = null
        private var insecure: Boolean = false

        fun baseURL(baseURL: String): Builder {
            this.baseURL = baseURL
            return this
        }

        fun tenant(tenant: String?): Builder {
            this.tenant = tenant
            return this
        }

        fun basicAuth(username: String?, password: String?): Builder {
            this.loginUsername = username
            this.loginPassword = password
            return this
        }

        fun inSecure(insecure: Boolean): Builder {
            this.insecure = insecure
            return this
        }


        @OptIn(ExperimentalEncodingApi::class)
        fun build(): FineractClient {
            val ktorClient = HttpClient{
                install(ContentNegotiation) {
                    json(
                        Json {
                            isLenient = true
                            ignoreUnknownKeys = true
                        },
                    )
                }

                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.INFO
                }

                if (listOf(loginUsername, loginPassword).all { it != null }) {
                    install(Auth) {
                        basic {
                            credentials {
                                BasicAuthCredentials(
                                    username = loginUsername.toString(),
                                    password = loginPassword.toString(),
                                )
                            }
                        }
                    }
                }
                val credentials = "$loginUsername:$loginPassword"
                val encoded = Base64.encode(credentials.toByteArray())
                defaultRequest {
                    header("Authorization", "Basic $encoded")
                    contentType(ContentType.Application.Json)
                    headers {
                        append("Accept", "application/json")
                        tenant?.let {
                            append("fineract-platform-tenantid", it)
                        }
                    }
                }
            }
            val ktorfitBuilder = Ktorfit.Builder()
                .httpClient(ktorClient)
                .baseUrl(baseURL)
                .build()

            return FineractClient(ktorClient, ktorfitBuilder)
        }
    }

    companion object {
        /**
         * Constant to be used in requests where Fineract's API requires a dateFormat to be given. This matches the format
         * in which LocalDate instances are serialized. (BTW: In a Java client API, it seems weird to have strong LocalDate
         * (not String) instances, and then have to specify its format, see
         * https://issues.apache.org/jira/browse/FINERACT-1233.)
         */
        // Matching org.apache.fineract.client.util.JSON.LocalDateTypeAdapter.formatter
        const val DATE_FORMAT: String = "yyyy-MM-dd"

        fun builder(): Builder {
            return Builder()
        }
    }
}
