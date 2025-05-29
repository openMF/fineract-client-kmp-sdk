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

interface SMSApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/sms")
    suspend fun create2(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @DELETE("v1/sms/{resourceId}")
    suspend fun delete6(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/sms")
    suspend fun retrieveAll10(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param campaignId
     * @param status  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param locale  (optional)
     * @param dateFormat  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/sms/{campaignId}/messageByStatus")
    suspend fun retrieveAllSmsByStatus(
        @Path("campaignId") campaignId: Long,
        @Query("status") status: Long? = null,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @GET("v1/sms/{resourceId}")
    suspend fun retrieveOne6(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/sms/{resourceId}")
    suspend fun update3(
        @Path("resourceId") resourceId: Long,
        @Body body: String? = null,
    ): String
}
