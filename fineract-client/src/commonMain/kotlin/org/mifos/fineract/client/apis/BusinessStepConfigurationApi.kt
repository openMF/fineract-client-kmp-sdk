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
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetBusinessJobConfigResponse
import org.mifos.fineract.client.models.GetBusinessStepConfigResponse
import org.mifos.fineract.client.models.UpdateBusinessStepConfigRequest

interface BusinessStepConfigurationApi {
    /**
     * List Business Step Configurations for a Job
     * Returns the available Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/available-steps")
    suspend fun retrieveAllAvailableBusinessStep(@Path("jobName") jobName: String): GetBusinessStepConfigResponse

    /**
     * List Business Jobs
     * Returns the configured Business Jobs
     * Responses:
     *  - 200: OK
     *
     * @return [GetBusinessJobConfigResponse]
     */
    @GET("v1/jobs/names")
    suspend fun retrieveAllConfiguredBusinessJobs(): GetBusinessJobConfigResponse

    /**
     * List Business Step Configurations for a Job
     * Returns the configured Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/steps")
    suspend fun retrieveAllConfiguredBusinessStep(@Path("jobName") jobName: String): GetBusinessStepConfigResponse

    /**
     * List Business Step Configurations for a Job
     * Updates the Business steps execution order for a job
     * Responses:
     *  - 204: NO_CONTENT
     *
     * @param jobName jobName
     * @param updateBusinessStepConfigRequest  (optional)
     * @return [Unit]
     */
    @PUT("v1/jobs/{jobName}/steps")
    suspend fun updateJobBusinessStepConfig(
        @Path("jobName") jobName: String,
        @Body updateBusinessStepConfigRequest: UpdateBusinessStepConfigRequest? = null,
    )
}
