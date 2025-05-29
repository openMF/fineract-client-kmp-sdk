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
import org.mifos.fineract.client.models.PostAuthenticationRequest
import org.mifos.fineract.client.models.PostSelfAuthenticationResponse

interface SelfAuthenticationApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://fineract.apache.org/legacy-docs/apiLive.htm#selfbasicauth
     * Responses:
     *  - 200: OK
     *
     * @param postAuthenticationRequest
     * @return [PostSelfAuthenticationResponse]
     */
    @POST("v1/self/authentication")
    suspend fun authenticate1(@Body postAuthenticationRequest: PostAuthenticationRequest): PostSelfAuthenticationResponse
}
