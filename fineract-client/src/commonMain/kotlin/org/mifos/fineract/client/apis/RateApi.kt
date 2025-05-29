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

interface RateApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/rates")
    suspend fun createRate(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/rates")
    suspend fun getAllRates(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param rateId
     * @return [kotlin.String]
     */
    @GET("v1/rates/{rateId}")
    suspend fun retrieveRate(@Path("rateId") rateId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param rateId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/rates/{rateId}")
    suspend fun updateRate(
        @Path("rateId") rateId: Long,
        @Body body: String? = null,
    ): String
}
