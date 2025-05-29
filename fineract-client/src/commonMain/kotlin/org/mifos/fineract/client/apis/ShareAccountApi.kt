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
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.GetAccountsTypeAccountIdResponse
import org.mifos.fineract.client.models.GetAccountsTypeResponse
import org.mifos.fineract.client.models.GetAccountsTypeTemplateResponse
import org.mifos.fineract.client.models.PostAccountsTypeAccountIdRequest
import org.mifos.fineract.client.models.PostAccountsTypeAccountIdResponse
import org.mifos.fineract.client.models.PostAccountsTypeRequest
import org.mifos.fineract.client.models.PostAccountsTypeResponse
import org.mifos.fineract.client.models.PutAccountsTypeAccountIdRequest
import org.mifos.fineract.client.models.PutAccountsTypeAccountIdResponse

interface ShareAccountApi {
    /**
     * Submit new share application
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param postAccountsTypeRequest
     * @return [PostAccountsTypeResponse]
     */
    @POST("v1/accounts/{type}")
    suspend fun createAccount(
        @Path("type") type: String,
        @Body postAccountsTypeRequest: PostAccountsTypeRequest,
    ): PostAccountsTypeResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/accounts/{type}/downloadtemplate")
    suspend fun getSharedAccountsTemplate(
        @Path("type") type: String,
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    )

    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#shareaccounts
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param accountId accountId
     * @param postAccountsTypeAccountIdRequest
     * @param command command (optional)
     * @return [PostAccountsTypeAccountIdResponse]
     */
    @POST("v1/accounts/{type}/{accountId}")
    suspend fun handleCommands2(
        @Path("type") type: String,
        @Path("accountId") accountId: Long,
        @Body postAccountsTypeAccountIdRequest: PostAccountsTypeAccountIdRequest,
        @Query("command") command: String? = null,
    ): PostAccountsTypeAccountIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/accounts/{type}/uploadtemplate")
    suspend fun postSharedAccountsTemplate(
        @Path("type") type: String,
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * Retrieve a share application/account
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param type type
     * @return [GetAccountsTypeAccountIdResponse]
     */
    @GET("v1/accounts/{type}/{accountId}")
    suspend fun retrieveAccount(
        @Path("accountId") accountId: Long,
        @Path("type") type: String,
    ): GetAccountsTypeAccountIdResponse

    /**
     * List share applications/accounts
     * Lists share applications/accounts  Example Requests:  shareaccount
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetAccountsTypeResponse]
     */
    @GET("v1/accounts/{type}")
    suspend fun retrieveAllAccounts1(
        @Path("type") type: String,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetAccountsTypeResponse

    /**
     * Retrieve Share Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param clientId clientId (optional)
     * @param productId productId (optional)
     * @return [GetAccountsTypeTemplateResponse]
     */
    @GET("v1/accounts/{type}/template")
    suspend fun template7(
        @Path("type") type: String,
        @Query("clientId") clientId: Long? = null,
        @Query("productId") productId: Long? = null,
    ): GetAccountsTypeTemplateResponse

    /**
     * Modify a share application
     * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param accountId accountId
     * @param putAccountsTypeAccountIdRequest
     * @return [PutAccountsTypeAccountIdResponse]
     */
    @PUT("v1/accounts/{type}/{accountId}")
    suspend fun updateAccount(
        @Path("type") type: String,
        @Path("accountId") accountId: Long,
        @Body putAccountsTypeAccountIdRequest: PutAccountsTypeAccountIdRequest,
    ): PutAccountsTypeAccountIdResponse
}
