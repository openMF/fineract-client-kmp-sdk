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
import org.mifos.fineract.client.models.GetTaxesGroupResponse
import org.mifos.fineract.client.models.PostTaxesGroupRequest
import org.mifos.fineract.client.models.PostTaxesGroupResponse
import org.mifos.fineract.client.models.PutTaxesGroupTaxGroupIdRequest
import org.mifos.fineract.client.models.PutTaxesGroupTaxGroupIdResponse

interface TaxGroupApi {
    /**
     * Create a new Tax Group
     * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
     * Responses:
     *  - 200: OK
     *
     * @param postTaxesGroupRequest
     * @return [PostTaxesGroupResponse]
     */
    @POST("v1/taxes/group")
    suspend fun createTaxGroup(@Body postTaxesGroupRequest: PostTaxesGroupRequest): PostTaxesGroupResponse

    /**
     * List Tax Group
     * List Tax Group
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetTaxesGroupResponse]
     */
    @GET("v1/taxes/group")
    suspend fun retrieveAllTaxGroups(): List<GetTaxesGroupResponse>

    /**
     * Retrieve Tax Group
     * Retrieve Tax Group
     * Responses:
     *  - 200: OK
     *
     * @param taxGroupId taxGroupId
     * @return [GetTaxesGroupResponse]
     */
    @GET("v1/taxes/group/{taxGroupId}")
    suspend fun retrieveTaxGroup(@Path("taxGroupId") taxGroupId: Long): GetTaxesGroupResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/taxes/group/template")
    suspend fun retrieveTemplate22(): String

    /**
     * Update Tax Group
     * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
     * Responses:
     *  - 200: OK
     *
     * @param taxGroupId taxGroupId
     * @param putTaxesGroupTaxGroupIdRequest
     * @return [PutTaxesGroupTaxGroupIdResponse]
     */
    @PUT("v1/taxes/group/{taxGroupId}")
    suspend fun updateTaxGroup(
        @Path("taxGroupId") taxGroupId: Long,
        @Body putTaxesGroupTaxGroupIdRequest: PutTaxesGroupTaxGroupIdRequest,
    ): PutTaxesGroupTaxGroupIdResponse
}
