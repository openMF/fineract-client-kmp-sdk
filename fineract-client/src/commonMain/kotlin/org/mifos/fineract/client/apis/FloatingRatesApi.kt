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
import org.mifos.fineract.client.models.GetFloatingRatesFloatingRateIdResponse
import org.mifos.fineract.client.models.GetFloatingRatesResponse
import org.mifos.fineract.client.models.PostFloatingRatesRequest
import org.mifos.fineract.client.models.PostFloatingRatesResponse
import org.mifos.fineract.client.models.PutFloatingRatesFloatingRateIdRequest
import org.mifos.fineract.client.models.PutFloatingRatesFloatingRateIdResponse

interface FloatingRatesApi {
    /**
     * Create a new Floating Rate
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     * Responses:
     *  - 200: OK
     *
     * @param postFloatingRatesRequest
     * @return [PostFloatingRatesResponse]
     */
    @POST("v1/floatingrates")
    suspend fun createFloatingRate(@Body postFloatingRatesRequest: PostFloatingRatesRequest): PostFloatingRatesResponse

    /**
     * List Floating Rates
     * Lists Floating Rates
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFloatingRatesResponse]
     */
    @GET("v1/floatingrates")
    suspend fun retrieveAll22(): List<GetFloatingRatesResponse>

    /**
     * Retrieve Floating Rate
     * Retrieves Floating Rate
     * Responses:
     *  - 200: OK
     *
     * @param floatingRateId floatingRateId
     * @return [GetFloatingRatesFloatingRateIdResponse]
     */
    @GET("v1/floatingrates/{floatingRateId}")
    suspend fun retrieveOne13(@Path("floatingRateId") floatingRateId: Long): GetFloatingRatesFloatingRateIdResponse

    /**
     * Update Floating Rate
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     * Responses:
     *  - 200: OK
     *
     * @param floatingRateId floatingRateId
     * @param putFloatingRatesFloatingRateIdRequest
     * @return [PutFloatingRatesFloatingRateIdResponse]
     */
    @PUT("v1/floatingrates/{floatingRateId}")
    suspend fun updateFloatingRate(
        @Path("floatingRateId") floatingRateId: Long,
        @Body putFloatingRatesFloatingRateIdRequest: PutFloatingRatesFloatingRateIdRequest,
    ): PutFloatingRatesFloatingRateIdResponse
}
