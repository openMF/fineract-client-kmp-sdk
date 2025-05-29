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

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface SelfSavingsProductsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts")
    suspend fun retrieveAll38(@Query("clientId") clientId: Long? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts/{productId}")
    suspend fun retrieveOne29(
        @Path("productId") productId: Long,
        @Query("clientId") clientId: Long? = null,
    ): String
}
