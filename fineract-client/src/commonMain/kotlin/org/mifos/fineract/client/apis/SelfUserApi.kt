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
import de.jensklingenberg.ktorfit.http.PUT
import org.mifos.fineract.client.models.PutSelfUserRequest
import org.mifos.fineract.client.models.PutSelfUserResponse

interface SelfUserApi {
    /**
     * Update User
     * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
     * Responses:
     *  - 200: OK
     *
     * @param putSelfUserRequest
     * @return [PutSelfUserResponse]
     */
    @PUT("v1/self/user")
    suspend fun update24(@Body putSelfUserRequest: PutSelfUserRequest): PutSelfUserResponse
}
