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

interface PovertyLineApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param ppiName
     * @return [kotlin.String]
     */
    @GET("v1/povertyLine/{ppiName}")
    suspend fun retrieveAll12(@Path("ppiName") ppiName: String): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param ppiName
     * @param likelihoodId
     * @return [kotlin.String]
     */
    @GET("v1/povertyLine/{ppiName}/{likelihoodId}")
    suspend fun retrieveAll13(
        @Path("ppiName") ppiName: String,
        @Path("likelihoodId") likelihoodId: Long,
    ): String
}
