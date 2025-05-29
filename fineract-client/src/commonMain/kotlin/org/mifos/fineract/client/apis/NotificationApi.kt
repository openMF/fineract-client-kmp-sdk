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
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetNotificationsResponse

interface NotificationApi {
    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param orderBy orderBy (optional)
     * @param limit limit (optional)
     * @param offset offset (optional)
     * @param sortOrder sortOrder (optional)
     * @param isRead isRead (optional)
     * @return [GetNotificationsResponse]
     */
    @GET("v1/notifications")
    suspend fun getAllNotifications(
        @Query("orderBy") orderBy: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("isRead") isRead: Boolean? = null,
    ): GetNotificationsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [Unit]
     */
    @PUT("v1/notifications")
    suspend fun update5(): Unit
}
