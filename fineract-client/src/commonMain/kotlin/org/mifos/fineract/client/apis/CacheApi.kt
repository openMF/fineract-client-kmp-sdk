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
import de.jensklingenberg.ktorfit.http.PUT
import org.mifos.fineract.client.models.GetCachesResponse
import org.mifos.fineract.client.models.PutCachesRequest
import org.mifos.fineract.client.models.PutCachesResponse

interface CacheApi {
    /**
     * Retrieve Cache Types
     * Returns the list of caches.  Example Requests:  caches
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCachesResponse>]
     */
    @GET("v1/caches")
    suspend fun retrieveAll4(): List<GetCachesResponse>

    /**
     * Switch Cache
     * Switches the cache to chosen one.
     * Responses:
     *  - 200: OK
     *
     * @param putCachesRequest
     * @return [PutCachesResponse]
     */
    @PUT("v1/caches")
    suspend fun switchCache(@Body putCachesRequest: PutCachesRequest): PutCachesResponse
}
