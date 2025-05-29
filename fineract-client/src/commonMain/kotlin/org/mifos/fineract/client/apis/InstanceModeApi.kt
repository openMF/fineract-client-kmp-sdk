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
import org.mifos.fineract.client.models.ChangeInstanceModeRequest

interface InstanceModeApi {
    /**
     * Changes the Fineract instance mode
     *
     * Responses:
     *  - 200: OK
     *
     * @param changeInstanceModeRequest
     * @return [Unit]
     */
    @PUT("v1/instance-mode")
    suspend fun changeMode(@Body changeInstanceModeRequest: ChangeInstanceModeRequest)
}
