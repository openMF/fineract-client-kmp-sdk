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
import org.mifos.fineract.client.models.ExternalServicesPropertiesData
import org.mifos.fineract.client.models.PutExternalServiceRequest

interface ExternalServicesApi {
    /**
     * Retrieve External Services Configuration
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @return [ExternalServicesPropertiesData]
     */
    @GET("v1/externalservice/{servicename}")
    suspend fun retrieveOne2(@Path("servicename") servicename: String): ExternalServicesPropertiesData

    /**
     * Update External Service
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @param putExternalServiceRequest
     * @return [Unit]
     */
    @PUT("v1/externalservice/{servicename}")
    suspend fun updateExternalServiceProperties(
        @Path("servicename") servicename: String,
        @Body putExternalServiceRequest: PutExternalServiceRequest,
    )
}
