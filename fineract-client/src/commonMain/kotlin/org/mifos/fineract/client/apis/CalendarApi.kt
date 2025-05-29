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

interface CalendarApi {
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
    @POST("v1/{entityType}/{entityId}/calendars")
    suspend fun createCalendar(
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
     * @param calendarId
     * @return [kotlin.String]
     */
    @DELETE("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun deleteCalendar(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("calendarId") calendarId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param calendarId
     * @param entityType
     * @param entityId
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun retrieveCalendar(
        @Path("calendarId") calendarId: Long,
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
     * @param calendarType  (optional, default to "all")
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars")
    suspend fun retrieveCalendarsByEntity(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Query("calendarType") calendarType: String? = "all",
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars/template")
    suspend fun retrieveNewCalendarDetails(
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
     * @param calendarId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun updateCalendar(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("calendarId") calendarId: Long,
        @Body body: String? = null,
    ): String
}
