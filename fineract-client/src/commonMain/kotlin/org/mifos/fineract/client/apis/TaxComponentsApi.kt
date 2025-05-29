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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetTaxesComponentsResponse
import org.mifos.fineract.client.models.PostTaxesComponentsRequest
import org.mifos.fineract.client.models.PostTaxesComponentsResponse
import org.mifos.fineract.client.models.PutTaxesComponentsTaxComponentIdRequest
import org.mifos.fineract.client.models.PutTaxesComponentsTaxComponentIdResponse

interface TaxComponentsApi {
    /**
     * Create a new Tax Component
     * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
     * Responses:
     *  - 200: OK
     *
     * @param postTaxesComponentsRequest
     * @return [PostTaxesComponentsResponse]
     */
    @POST("v1/taxes/component")
    suspend fun createTaxCompoent(@Body postTaxesComponentsRequest: PostTaxesComponentsRequest): PostTaxesComponentsResponse

    /**
     * List Tax Components
     * List Tax Components
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetTaxesComponentsResponse]
     */
    @GET("v1/taxes/component")
    suspend fun retrieveAllTaxComponents(): List<GetTaxesComponentsResponse>

    /**
     * Retrieve Tax Component
     * Retrieve Tax Component
     * Responses:
     *  - 200: OK
     *
     * @param taxComponentId taxComponentId
     * @return [GetTaxesComponentsResponse]
     */
    @GET("v1/taxes/component/{taxComponentId}")
    suspend fun retrieveTaxComponent(@Path("taxComponentId") taxComponentId: Long): GetTaxesComponentsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/taxes/component/template")
    suspend fun retrieveTemplate21(): String

    /**
     * Update Tax Component
     * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
     * Responses:
     *  - 200: OK
     *
     * @param taxComponentId taxComponentId
     * @param putTaxesComponentsTaxComponentIdRequest
     * @return [PutTaxesComponentsTaxComponentIdResponse]
     */
    @PUT("v1/taxes/component/{taxComponentId}")
    suspend fun updateTaxCompoent(
        @Path("taxComponentId") taxComponentId: Long,
        @Body putTaxesComponentsTaxComponentIdRequest: PutTaxesComponentsTaxComponentIdRequest,
    ): PutTaxesComponentsTaxComponentIdResponse
}
