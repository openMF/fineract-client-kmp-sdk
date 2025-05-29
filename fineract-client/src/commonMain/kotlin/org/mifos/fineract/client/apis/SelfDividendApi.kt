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

interface SelfDividendApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/shareproduct/{productId}/dividend")
    suspend fun createDividendDetail(
        @Path("productId") productId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param dividendId
     * @return [kotlin.String]
     */
    @DELETE("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun deleteDividendDetail(
        @Path("productId") productId: Long,
        @Path("dividendId") dividendId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param status  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend")
    suspend fun retrieveAll39(
        @Path("productId") productId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("status") status: Int? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dividendId
     * @param productId
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param accountNo  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun retrieveDividendDetails(
        @Path("dividendId") dividendId: Long,
        @Path("productId") productId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("accountNo") accountNo: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param dividendId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun updateDividendDetail(
        @Path("productId") productId: Long,
        @Path("dividendId") dividendId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null,
    ): String
}
