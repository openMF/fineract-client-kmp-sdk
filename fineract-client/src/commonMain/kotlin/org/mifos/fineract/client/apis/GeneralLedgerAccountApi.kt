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
import org.mifos.fineract.client.models.DeleteGLAccountsRequest
import org.mifos.fineract.client.models.GetGLAccountsResponse
import org.mifos.fineract.client.models.GetGLAccountsTemplateResponse
import org.mifos.fineract.client.models.PostGLAccountsRequest
import org.mifos.fineract.client.models.PostGLAccountsResponse
import org.mifos.fineract.client.models.PutGLAccountsRequest
import org.mifos.fineract.client.models.PutGLAccountsResponse

interface GeneralLedgerAccountApi {
    /**
     * Create a General Ledger Account
     * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
     * Responses:
     *  - 200: OK
     *
     * @param postGLAccountsRequest  (optional)
     * @return [PostGLAccountsResponse]
     */
    @POST("v1/glaccounts")
    suspend fun createGLAccount1(@Body postGLAccountsRequest: PostGLAccountsRequest? = null): PostGLAccountsResponse

    /**
     * Delete a GL Account
     * Deletes a GL Account
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @return [DeleteGLAccountsRequest]
     */
    @DELETE("v1/glaccounts/{glAccountId}")
    suspend fun deleteGLAccount1(@Path("glAccountId") glAccountId: Long): DeleteGLAccountsRequest

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/glaccounts/downloadtemplate")
    suspend fun getGlAccountsTemplate(@Query("dateFormat") dateFormat: String? = null): Unit

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
    @POST("v1/glaccounts/uploadtemplate")
    suspend fun postGlAccountsTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * Retrieve a General Ledger Account
     * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @param fetchRunningBalance fetchRunningBalance (optional)
     * @return [GetGLAccountsResponse]
     */
    @GET("v1/glaccounts/{glAccountId}")
    suspend fun retreiveAccount(
        @Path("glAccountId") glAccountId: Long,
        @Query("fetchRunningBalance") fetchRunningBalance: Boolean? = null,
    ): GetGLAccountsResponse

    /**
     * List General Ledger Accounts
     * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param type type (optional)
     * @param searchParam searchParam (optional)
     * @param usage usage (optional)
     * @param manualEntriesAllowed manualEntriesAllowed (optional)
     * @param disabled disabled (optional)
     * @param fetchRunningBalance fetchRunningBalance (optional)
     * @return [kotlin.collections.List<GetGLAccountsResponse]
     */
    @GET("v1/glaccounts")
    suspend fun retrieveAllAccounts(
        @Query("type") type: Int? = null,
        @Query("searchParam") searchParam: String? = null,
        @Query("usage") usage: Int? = null,
        @Query("manualEntriesAllowed") manualEntriesAllowed: Boolean? = null,
        @Query("disabled") disabled: Boolean? = null,
        @Query("fetchRunningBalance") fetchRunningBalance: Boolean? = null,
    ): List<GetGLAccountsResponse>

    /**
     * Retrieve GL Accounts Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
     * Responses:
     *  - 200: OK
     *
     * @param type type (optional)
     * @return [GetGLAccountsTemplateResponse]
     */
    @GET("v1/glaccounts/template")
    suspend fun retrieveNewAccountDetails(@Query("type") type: Int? = null): GetGLAccountsTemplateResponse

    /**
     * Update a GL Account
     * Updates a GL Account
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @param putGLAccountsRequest  (optional)
     * @return [PutGLAccountsResponse]
     */
    @PUT("v1/glaccounts/{glAccountId}")
    suspend fun updateGLAccount1(
        @Path("glAccountId") glAccountId: Long,
        @Body putGLAccountsRequest: PutGLAccountsRequest? = null,
    ): PutGLAccountsResponse
}
