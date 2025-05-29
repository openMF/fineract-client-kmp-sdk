/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
package org.mifos.fineract.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.DeleteFixedDepositAccountsAccountIdResponse
import org.mifos.fineract.client.models.GetFixedDepositAccountsAccountIdResponse
import org.mifos.fineract.client.models.GetFixedDepositAccountsResponse
import org.mifos.fineract.client.models.GetFixedDepositAccountsTemplateResponse
import org.mifos.fineract.client.models.PostFixedDepositAccountsAccountIdResponse
import org.mifos.fineract.client.models.PostFixedDepositAccountsRequest
import org.mifos.fineract.client.models.PostFixedDepositAccountsResponse
import org.mifos.fineract.client.models.PutFixedDepositAccountsAccountIdRequest
import org.mifos.fineract.client.models.PutFixedDepositAccountsAccountIdResponse

interface FixedDepositAccountApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @param command command (optional)
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{accountId}/template")
    suspend fun accountClosureTemplate(
        @Path("accountId") accountId: Long,
        @Query("command") command: String? = null,
    ): String

    /**
     * Delete a fixed deposit application
     * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [DeleteFixedDepositAccountsAccountIdResponse]
     */
    @DELETE("v1/fixeddepositaccounts/{accountId}")
    suspend fun delete15(@Path("accountId") accountId: Long): DeleteFixedDepositAccountsAccountIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/fixeddepositaccounts/downloadtemplate")
    suspend fun getFixedDepositTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/fixeddepositaccounts/transaction/downloadtemplate")
    suspend fun getFixedDepositTransactionTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): Unit

    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param body
     * @param command command (optional)
     * @return [PostFixedDepositAccountsAccountIdResponse]
     */
    @POST("v1/fixeddepositaccounts/{accountId}")
    suspend fun handleCommands4(
        @Path("accountId") accountId: Long,
        @Body body: Any,
        @Query("command") command: String? = null,
    ): PostFixedDepositAccountsAccountIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/fixeddepositaccounts/uploadtemplate")
    suspend fun postFixedDepositTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/fixeddepositaccounts/transaction/uploadtemplate")
    suspend fun postFixedDepositTransactionTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * List Fixed deposit applications/accounts
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetFixedDepositAccountsResponse]
     */
    @GET("v1/fixeddepositaccounts")
    suspend fun retrieveAll29(
        @Query("paged") paged: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
    ): List<GetFixedDepositAccountsResponse>

    /**
     * Retrieve a fixed deposit application/account
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetFixedDepositAccountsAccountIdResponse]
     */
    @GET("v1/fixeddepositaccounts/{accountId}")
    suspend fun retrieveOne19(
        @Path("accountId") accountId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("chargeStatus") chargeStatus: String? = "all",
    ): GetFixedDepositAccountsAccountIdResponse

    /**
     * Submit new fixed deposit application
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     * Responses:
     *  - 200: OK
     *
     * @param postFixedDepositAccountsRequest
     * @return [PostFixedDepositAccountsResponse]
     */
    @POST("v1/fixeddepositaccounts")
    suspend fun submitApplication(@Body postFixedDepositAccountsRequest: PostFixedDepositAccountsRequest): PostFixedDepositAccountsResponse

    /**
     * Retrieve Fixed Deposit Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetFixedDepositAccountsTemplateResponse]
     */
    @GET("v1/fixeddepositaccounts/template")
    suspend fun template12(
        @Query("clientId") clientId: Long? = null,
        @Query("groupId") groupId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
    ): GetFixedDepositAccountsTemplateResponse

    /**
     * Modify a fixed deposit application
     * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param putFixedDepositAccountsAccountIdRequest
     * @return [PutFixedDepositAccountsAccountIdResponse]
     */
    @PUT("v1/fixeddepositaccounts/{accountId}")
    suspend fun update16(
        @Path("accountId") accountId: Long,
        @Body putFixedDepositAccountsAccountIdRequest: PutFixedDepositAccountsAccountIdRequest,
    ): PutFixedDepositAccountsAccountIdResponse
}
