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
import org.mifos.fineract.client.models.GetUserDetailsResponse

interface FetchAuthenticatedUserDetailsApi {
    /**
     * Fetch authenticated user details
     * checks the Authentication and returns the set roles and permissions allowed.
     * Responses:
     *  - 200: OK
     *
     * @return [GetUserDetailsResponse]
     */
    @GET("v1/userdetails")
    suspend fun fetchAuthenticatedUserData(): GetUserDetailsResponse
}
