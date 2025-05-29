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
import org.mifos.fineract.client.models.DeleteCollateralProductResponse
import org.mifos.fineract.client.models.GetCollateralManagementsResponse
import org.mifos.fineract.client.models.GetCollateralProductTemplate
import org.mifos.fineract.client.models.PostCollateralManagementProductRequest
import org.mifos.fineract.client.models.PostCollateralManagementProductResponse
import org.mifos.fineract.client.models.PutCollateralProductRequest
import org.mifos.fineract.client.models.PutCollateralProductResponse

interface CollateralManagementApi {
    /**
     * Create a new collateral
     * Collateral Creation
     * Responses:
     *  - 200: OK
     *
     * @param postCollateralManagementProductRequest
     * @return [PostCollateralManagementProductResponse]
     */
    @POST("v1/collateral-management")
    suspend fun createCollateral1(@Body postCollateralManagementProductRequest: PostCollateralManagementProductRequest): PostCollateralManagementProductResponse

    /**
     * Delete a Collateral
     * Delete Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [DeleteCollateralProductResponse]
     */
    @DELETE("v1/collateral-management/{collateralId}")
    suspend fun deleteCollateral2(@Path("collateralId") collateralId: Long): DeleteCollateralProductResponse

    /**
     * Get All Collaterals
     * Fetch all Collateral Products
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralManagementsResponse>]
     */
    @GET("v1/collateral-management")
    suspend fun getAllCollaterals(): List<GetCollateralManagementsResponse>

    /**
     * Get Collateral
     * Fetch Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [GetCollateralManagementsResponse]
     */
    @GET("v1/collateral-management/{collateralId}")
    suspend fun getCollateral(@Path("collateralId") collateralId: Long): GetCollateralManagementsResponse

    /**
     * Get Collateral Template
     * Get Collateral Template
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralProductTemplate>]
     */
    @GET("v1/collateral-management/template")
    suspend fun getCollateralTemplate(): List<GetCollateralProductTemplate>

    /**
     * Update Collateral
     * Update Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @param putCollateralProductRequest
     * @return [PutCollateralProductResponse]
     */
    @PUT("v1/collateral-management/{collateralId}")
    suspend fun updateCollateral2(
        @Path("collateralId") collateralId: Long,
        @Body putCollateralProductRequest: PutCollateralProductRequest,
    ): PutCollateralProductResponse
}
