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

interface FineractEntityApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param relId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/entitytoentitymapping/{relId}")
    suspend fun createMap(
        @Path("relId") relId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param mapId
     * @return [kotlin.String]
     */
    @DELETE("v1/entitytoentitymapping/{mapId}")
    suspend fun delete4(@Path("mapId") mapId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param mapId
     * @param fromId
     * @param toId
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping/{mapId}/{fromId}/{toId}")
    suspend fun getEntityToEntityMappings(
        @Path("mapId") mapId: Long,
        @Path("fromId") fromId: Long,
        @Path("toId") toId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping")
    suspend fun retrieveAll7(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param mapId
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping/{mapId}")
    suspend fun retrieveOne4(@Path("mapId") mapId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param mapId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/entitytoentitymapping/{mapId}")
    suspend fun updateMap(
        @Path("mapId") mapId: Long,
        @Body body: String? = null,
    ): String
}
