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
import org.mifos.fineract.client.models.GetSelfUserDetailsResponse

interface SelfUserDetailsApi {
    /**
     * Fetch authenticated user details
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth
     * Responses:
     *  - 200: OK
     *
     * @return [GetSelfUserDetailsResponse]
     */
    @GET("v1/self/userdetails")
    suspend fun fetchAuthenticatedUserData1(): GetSelfUserDetailsResponse
}
