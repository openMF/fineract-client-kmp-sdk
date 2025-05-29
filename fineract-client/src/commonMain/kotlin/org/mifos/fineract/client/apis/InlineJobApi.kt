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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.InlineJobRequest
import org.mifos.fineract.client.models.InlineJobResponse

interface InlineJobApi {
    /**
     * Starts an inline Job
     * Starts an inline Job
     * Responses:
     *  - 200: OK
     *  - 400: Request body item size validation error
     *
     * @param jobName jobName
     * @param inlineJobRequest  (optional)
     * @return [InlineJobResponse]
     */
    @POST("v1/jobs/{jobName}/inline")
    suspend fun executeInlineJob(
        @Path("jobName") jobName: String,
        @Body inlineJobRequest: InlineJobRequest? = null,
    ): InlineJobResponse
}
