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

interface ProvisioningCategoryApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/provisioningcategory")
    suspend fun createProvisioningCategory(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param categoryId
     * @return [kotlin.String]
     */
    @DELETE("v1/provisioningcategory/{categoryId}")
    suspend fun deleteProvisioningCategory(@Path("categoryId") categoryId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/provisioningcategory")
    suspend fun retrieveAll15(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param categoryId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/provisioningcategory/{categoryId}")
    suspend fun updateProvisioningCategory(
        @Path("categoryId") categoryId: Long,
        @Body body: String? = null,
    ): String
}
