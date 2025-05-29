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
import org.mifos.fineract.client.models.DeleteInterestRateChartsChartIdChartSlabsResponse
import org.mifos.fineract.client.models.GetInterestRateChartsChartIdChartSlabsResponse
import org.mifos.fineract.client.models.PostInterestRateChartsChartIdChartSlabsRequest
import org.mifos.fineract.client.models.PostInterestRateChartsChartIdChartSlabsResponse
import org.mifos.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest
import org.mifos.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse

interface InterestRateSlabAKAInterestBandsApi {
    /**
     * Create a Slab
     * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param postInterestRateChartsChartIdChartSlabsRequest
     * @return [PostInterestRateChartsChartIdChartSlabsResponse]
     */
    @POST("v1/interestratecharts/{chartId}/chartslabs")
    suspend fun create9(
        @Path("chartId") chartId: Long,
        @Body postInterestRateChartsChartIdChartSlabsRequest: PostInterestRateChartsChartIdChartSlabsRequest,
    ): PostInterestRateChartsChartIdChartSlabsResponse

    /**
     * Delete a Slab
     * Delete a Slab from a chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @return [DeleteInterestRateChartsChartIdChartSlabsResponse]
     */
    @DELETE("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun delete13(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long,
    ): DeleteInterestRateChartsChartIdChartSlabsResponse

    /**
     * Retrieve all Slabs
     * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [kotlin.collections.List<GetInterestRateChartsChartIdChartSlabsResponse]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs")
    suspend fun retrieveAll25(@Path("chartId") chartId: Long): List<GetInterestRateChartsChartIdChartSlabsResponse>

    /**
     * Retrieve a Slab
     * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @return [GetInterestRateChartsChartIdChartSlabsResponse]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun retrieveOne16(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long,
    ): GetInterestRateChartsChartIdChartSlabsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param chartId chartId
     * @return [kotlin.String]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs/template")
    suspend fun template8(@Path("chartId") chartId: Long): String

    /**
     * Update a Slab
     * It updates the Slab from chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @param putInterestRateChartsChartIdChartSlabsChartSlabIdRequest
     * @return [PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse]
     */
    @PUT("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun update14(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long,
        @Body putInterestRateChartsChartIdChartSlabsChartSlabIdRequest: PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest,
    ): PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse
}
