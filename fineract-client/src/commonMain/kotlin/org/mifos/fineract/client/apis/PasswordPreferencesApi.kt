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
import org.mifos.fineract.client.models.GetPasswordPreferencesTemplateResponse
import org.mifos.fineract.client.models.PutPasswordPreferencesTemplateRequest

interface PasswordPreferencesApi {
    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @return [GetPasswordPreferencesTemplateResponse]
     */
    @GET("v1/passwordpreferences")
    suspend fun retrieve1(): GetPasswordPreferencesTemplateResponse

    /**
     * List Application Password validation policies
     * ARGUMENTS Example Requests:  passwordpreferences
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetPasswordPreferencesTemplateResponse]
     */
    @GET("v1/passwordpreferences/template")
    suspend fun template21(): List<GetPasswordPreferencesTemplateResponse>

    /**
     * Update password preferences
     *
     * Responses:
     *  - 200: OK
     *
     * @param putPasswordPreferencesTemplateRequest
     * @return [Unit]
     */
    @PUT("v1/passwordpreferences")
    suspend fun update25(@Body putPasswordPreferencesTemplateRequest: PutPasswordPreferencesTemplateRequest): Unit
}
