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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.PostAuthenticationRequest
import org.mifos.fineract.client.models.PostAuthenticationResponse

interface AuthenticationHTTPBasicApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     * Responses:
     *  - 200: OK
     *  - 400: Unauthenticated. Please login
     *
     * @param postAuthenticationRequest
     * @param returnClientList  (optional, default to false)
     * @return [PostAuthenticationResponse]
     */
    @POST("v1/authentication")
    suspend fun authenticate(
        @Body postAuthenticationRequest: PostAuthenticationRequest,
        @Query("returnClientList") returnClientList: Boolean? = false,
    ): PostAuthenticationResponse
}
