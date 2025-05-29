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
import org.mifos.fineract.client.models.CommandProcessingResult
import org.mifos.fineract.client.models.GetExternalEventConfigurationsResponse
import org.mifos.fineract.client.models.PutExternalEventConfigurationsRequest

interface ExternalEventConfigurationApi {
    /**
     * List all external event configurations
     *
     * Responses:
     *  - 200: List of all external event configurations
     *
     * @return [GetExternalEventConfigurationsResponse]
     */
    @GET("v1/externalevents/configuration")
    suspend fun retrieveExternalEventConfiguration(): GetExternalEventConfigurationsResponse

    /**
     * Enable/Disable external events posting
     *
     * Responses:
     *  - 200: OK
     *
     * @param putExternalEventConfigurationsRequest
     * @return [CommandProcessingResult]
     */
    @PUT("v1/externalevents/configuration")
    suspend fun updateExternalEventConfigurationsDetails(@Body putExternalEventConfigurationsRequest: PutExternalEventConfigurationsRequest): CommandProcessingResult
}
