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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.DeleteFinancialActivityAccountsResponse
import org.mifos.fineract.client.models.GetFinancialActivityAccountsResponse
import org.mifos.fineract.client.models.PostFinancialActivityAccountsRequest
import org.mifos.fineract.client.models.PostFinancialActivityAccountsResponse
import org.mifos.fineract.client.models.PutFinancialActivityAccountsResponse

interface MappingFinancialActivitiesToAccountsApi {
    /**
     * Create a new Financial Activity to Accounts Mapping
     * Mandatory Fields financialActivityId, glAccountId
     * Responses:
     *  - 200: OK
     *
     * @param postFinancialActivityAccountsRequest  (optional)
     * @return [PostFinancialActivityAccountsResponse]
     */
    @POST("v1/financialactivityaccounts")
    suspend fun createGLAccount(@Body postFinancialActivityAccountsRequest: PostFinancialActivityAccountsRequest? = null): PostFinancialActivityAccountsResponse

    /**
     * Delete a Financial Activity to Account Mapping
     *
     * Responses:
     *  - 200: OK
     *
     * @param mappingId mappingId
     * @return [DeleteFinancialActivityAccountsResponse]
     */
    @DELETE("v1/financialactivityaccounts/{mappingId}")
    suspend fun deleteGLAccount(@Path("mappingId") mappingId: Long): DeleteFinancialActivityAccountsResponse

    /**
     * Retrieve a Financial Activity to Account Mapping
     * Example Requests:  financialactivityaccounts/1
     * Responses:
     *  - 200: OK
     *
     * @param mappingId mappingId
     * @return [GetFinancialActivityAccountsResponse]
     */
    @GET("v1/financialactivityaccounts/{mappingId}")
    suspend fun retreive(@Path("mappingId") mappingId: Long): GetFinancialActivityAccountsResponse

    /**
     * List Financial Activities to Accounts Mappings
     * Example Requests:  financialactivityaccounts
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFinancialActivityAccountsResponse]
     */
    @GET("v1/financialactivityaccounts")
    suspend fun retrieveAll(): List<GetFinancialActivityAccountsResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/financialactivityaccounts/template")
    suspend fun retrieveTemplate(): String

    /**
     * Update a Financial Activity to Account Mapping
     * the API updates the Ledger account linked to a Financial Activity
     * Responses:
     *  - 200: OK
     *
     * @param mappingId mappingId
     * @param postFinancialActivityAccountsRequest  (optional)
     * @return [PutFinancialActivityAccountsResponse]
     */
    @PUT("v1/financialactivityaccounts/{mappingId}")
    suspend fun updateGLAccount(
        @Path("mappingId") mappingId: Long,
        @Body postFinancialActivityAccountsRequest: PostFinancialActivityAccountsRequest? = null,
    ): PutFinancialActivityAccountsResponse
}
