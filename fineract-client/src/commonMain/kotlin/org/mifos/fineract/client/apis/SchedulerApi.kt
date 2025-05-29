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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetSchedulerResponse

interface SchedulerApi {
    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * Activates the scheduler job service. | Suspends the scheduler job service.
     * Responses:
     *  - 200: POST :  scheduler?command=start   POST : scheduler?command=stop
     *
     * @param command command (optional)
     * @return [Unit]
     */
    @POST("v1/scheduler")
    suspend fun changeSchedulerStatus(@Query("command") command: String? = null): Unit

    /**
     * Retrieve Scheduler Status
     * Returns the scheduler status.  Example Requests:  scheduler
     * Responses:
     *  - 200: OK
     *
     * @return [GetSchedulerResponse]
     */
    @GET("v1/scheduler")
    suspend fun retrieveStatus(): GetSchedulerResponse
}
