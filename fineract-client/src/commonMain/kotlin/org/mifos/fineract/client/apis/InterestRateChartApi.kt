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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.DeleteInterestRateChartsChartIdResponse
import org.mifos.fineract.client.models.GetInterestRateChartsResponse
import org.mifos.fineract.client.models.GetInterestRateChartsTemplateResponse
import org.mifos.fineract.client.models.PostInterestRateChartsRequest
import org.mifos.fineract.client.models.PostInterestRateChartsResponse
import org.mifos.fineract.client.models.PutInterestRateChartsChartIdRequest
import org.mifos.fineract.client.models.PutInterestRateChartsChartIdResponse

interface InterestRateChartApi {
    /**
     * Create a Chart
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     * Responses:
     *  - 200: OK
     *
     * @param postInterestRateChartsRequest
     * @return [PostInterestRateChartsResponse]
     */
    @POST("v1/interestratecharts")
    suspend fun create10(@Body postInterestRateChartsRequest: PostInterestRateChartsRequest): PostInterestRateChartsResponse

    /**
     * Delete a Chart
     * It deletes the chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [DeleteInterestRateChartsChartIdResponse]
     */
    @DELETE("v1/interestratecharts/{chartId}")
    suspend fun delete14(@Path("chartId") chartId: Long): DeleteInterestRateChartsChartIdResponse

    /**
     * Retrieve all Charts
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param productId productId (optional)
     * @return [kotlin.collections.List<GetInterestRateChartsResponse]
     */
    @GET("v1/interestratecharts")
    suspend fun retrieveAll26(@Query("productId") productId: Long? = null): List<GetInterestRateChartsResponse>

    /**
     * Retrieve a Chart
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [GetInterestRateChartsResponse]
     */
    @GET("v1/interestratecharts/{chartId}")
    suspend fun retrieveOne17(@Path("chartId") chartId: Long): GetInterestRateChartsResponse

    /**
     * Retrieve Chart Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetInterestRateChartsTemplateResponse]
     */
    @GET("v1/interestratecharts/template")
    suspend fun template9(): GetInterestRateChartsTemplateResponse

    /**
     * Update a Chart
     * It updates the chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param putInterestRateChartsChartIdRequest
     * @return [PutInterestRateChartsChartIdResponse]
     */
    @PUT("v1/interestratecharts/{chartId}")
    suspend fun update15(
        @Path("chartId") chartId: Long,
        @Body putInterestRateChartsChartIdRequest: PutInterestRateChartsChartIdRequest,
    ): PutInterestRateChartsChartIdResponse
}
