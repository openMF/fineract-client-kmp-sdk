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


interface BaseApiManager {

    companion object {
        fun getInstance(): BaseApiManager {
            return BaseApiManagerImpl()
        }
    }

    fun createService(
        baseUrl: String,
        tenant: String,
        username: String,
        password: String
    )

    fun getClient(): FineractClient

    fun getAuthApi(): AuthenticationHTTPBasicApi

    fun getCenterApi(): CentersApi

    fun getClientsApi(): ClientApi

    fun getDataTableApi(): DataTablesApi

    fun getLoanApi(): LoansApi

    fun getSavingsApi(): SavingsAccountApi

    fun getSearchApi(): SearchAPIApi

    fun getGroupApi(): GroupsApi

    fun getDocumentApi(): DocumentsApi

    fun getOfficeApi(): OfficesApi

    fun getStaffApi(): StaffApi

    fun getSurveyApi(): SpmSurveysApi

    fun getChargeApi(): ChargesApi

    fun getRunReportsService(): RunReportsApi

    fun getNoteApi(): NotesApi

    fun getCollectionSheetApi(): CentersApi

    fun getCheckerInboxApi(): AuditsApi

    fun getRescheduleLoansApi(): LoanReschedulingApi
}