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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetGlobalConfigurationsResponse
import org.mifos.fineract.client.models.GlobalConfigurationPropertyData
import org.mifos.fineract.client.models.PutGlobalConfigurationsRequest
import org.mifos.fineract.client.models.PutGlobalConfigurationsResponse

interface GlobalConfigurationApi {
    /**
     * Retrieve Global Configuration | Retrieve Global Configuration for surveys
     * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
     * Responses:
     *  - 200: List of example \\n response \\nsurveys response   \\ngiven below
     *
     * @param survey survey (optional, default to false)
     * @return [GetGlobalConfigurationsResponse]
     */
    @GET("v1/configurations")
    suspend fun retrieveConfiguration(@Query("survey") survey: Boolean? = false): GetGlobalConfigurationsResponse

    /**
     * Retrieve Global Configuration
     * Returns a global enable/disable configurations.  Example Requests:  configurations/1
     * Responses:
     *  - 200: OK
     *
     * @param configId configId
     * @return [GetGlobalConfigurationsResponse]
     */
    @GET("v1/configurations/{configId}")
    suspend fun retrieveOne3(@Path("configId") configId: Long): GetGlobalConfigurationsResponse

    /**
     * Retrieve Global Configuration
     * Returns a global enable/disable configuration.  Example Requests:  configurations/name/Enable-Address
     * Responses:
     *  - 200: OK
     *
     * @param name name
     * @return [GlobalConfigurationPropertyData]
     */
    @GET("v1/configurations/name/{name}")
    suspend fun retrieveOneByName(@Path("name") name: String): GlobalConfigurationPropertyData

    /**
     * Update Global Configuration
     * Updates an enable/disable global configuration item.
     * Responses:
     *  - 200: OK
     *
     * @param configId configId
     * @param putGlobalConfigurationsRequest
     * @return [PutGlobalConfigurationsResponse]
     */
    @PUT("v1/configurations/{configId}")
    suspend fun updateConfiguration1(
        @Path("configId") configId: Long,
        @Body putGlobalConfigurationsRequest: PutGlobalConfigurationsRequest,
    ): PutGlobalConfigurationsResponse
}
