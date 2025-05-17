package org.mifos.core.apimanager

import org.mifos.fineract.client.apis.AuditsApi
import org.mifos.fineract.client.apis.AuthenticationHTTPBasicApi
import org.mifos.fineract.client.apis.CentersApi
import org.mifos.fineract.client.apis.ChargesApi
import org.mifos.fineract.client.apis.ClientApi
import org.mifos.fineract.client.apis.DataTablesApi
import org.mifos.fineract.client.apis.DocumentsApi
import org.mifos.fineract.client.apis.GroupsApi
import org.mifos.fineract.client.apis.LoanReschedulingApi
import org.mifos.fineract.client.apis.LoansApi
import org.mifos.fineract.client.apis.NotesApi
import org.mifos.fineract.client.apis.OfficesApi
import org.mifos.fineract.client.apis.RunReportsApi
import org.mifos.fineract.client.apis.SavingsAccountApi
import org.mifos.fineract.client.apis.SearchAPIApi
import org.mifos.fineract.client.apis.SpmSurveysApi
import org.mifos.fineract.client.apis.StaffApi
import org.mifos.fineract.client.infrastructure.FineractClient


/**
 * Created by Aditya Gupta on 19-09-2024
 *
 * A class to provide the ktorfit service to the SDK
 */
class BaseApiManagerImpl : BaseApiManager {

    private lateinit var client: FineractClient

    override fun createService(
        username: String,
        password: String,
        baseUrl: String,
        tenant: String,
        secured: Boolean
    ) {
        val builder = FineractClient.builder()
            .baseURL(baseUrl)
            .basicAuth(username, password)
            .tenant(tenant)
        client = builder.build()
    }

    override fun getClient(): FineractClient {
        return client
    }

    override fun getAuthApi(): AuthenticationHTTPBasicApi = client.authentication

    override fun getCenterApi(): CentersApi = client.centers

    override fun getClientsApi(): ClientApi = client.clients

    override fun getDataTableApi(): DataTablesApi = client.dataTables

    override fun getLoanApi(): LoansApi = client.loans

    override fun getSavingsApi(): SavingsAccountApi = client.savingsAccounts

    override fun getSearchApi(): SearchAPIApi = client.search

    override fun getGroupApi(): GroupsApi = client.groups

    override fun getDocumentApi(): DocumentsApi = client.documents

    override fun getOfficeApi(): OfficesApi = client.offices

    override fun getStaffApi(): StaffApi = client.staff

    override fun getSurveyApi(): SpmSurveysApi = client.spmSurveys

    override fun getChargeApi(): ChargesApi = client.charges

    override fun getRunReportsService(): RunReportsApi = client.reportsRun

    override fun getNoteApi(): NotesApi = client.notes

    override fun getCollectionSheetApi(): CentersApi = client.centers

    override fun getCheckerInboxApi(): AuditsApi = client.audits

    override fun getRescheduleLoansApi(): LoanReschedulingApi = client.loanSchedules
}