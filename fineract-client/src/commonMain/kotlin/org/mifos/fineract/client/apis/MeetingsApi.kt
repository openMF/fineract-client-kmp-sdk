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

interface MeetingsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings")
    suspend fun createMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @return [kotlin.String]
     */
    @DELETE("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun deleteMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun performMeetingCommands(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param meetingId
     * @param entityType
     * @param entityId
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun retrieveMeeting(
        @Path("meetingId") meetingId: Long,
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param limit  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings")
    suspend fun retrieveMeetings(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Query("limit") limit: Int? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param calendarId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/template")
    suspend fun template11(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Query("calendarId") calendarId: Long? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun updateMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long,
        @Body body: String? = null,
    ): String
}
