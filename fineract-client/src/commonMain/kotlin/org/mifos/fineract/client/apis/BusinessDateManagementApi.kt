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
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.BusinessDateRequest
import org.mifos.fineract.client.models.BusinessDateResponse

interface BusinessDateManagementApi {
    /**
     * Retrieve a specific Business date
     *
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @return [BusinessDateResponse]
     */
    @GET("v1/businessdate/{type}")
    suspend fun getBusinessDate(@Path("type") type: String): BusinessDateResponse

    /**
     * List all business dates
     *
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<BusinessDateResponse>]
     */
    @GET("v1/businessdate")
    suspend fun getBusinessDates(): List<BusinessDateResponse>

    /**
     * Update Business Date
     *
     * Responses:
     *  - 200: OK
     *
     * @param businessDateRequest
     * @return [BusinessDateResponse]
     */
    @POST("v1/businessdate")
    suspend fun updateBusinessDate(@Body businessDateRequest: BusinessDateRequest): BusinessDateResponse
}
