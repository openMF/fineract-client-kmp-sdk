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
import de.jensklingenberg.ktorfit.http.Query

interface TwoFactorApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/twofactor")
    suspend fun getOTPDeliveryMethods(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param deliveryMethod  (optional)
     * @param extendedToken  (optional, default to false)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor")
    suspend fun requestToken(
        @Query("deliveryMethod") deliveryMethod: String? = null,
        @Query("extendedToken") extendedToken: Boolean? = false,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/invalidate")
    suspend fun updateConfiguration2(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param token  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/validate")
    suspend fun validate(@Query("token") token: String? = null): String
}
