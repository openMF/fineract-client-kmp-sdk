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
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetFieldConfigurationEntityResponse

interface EntityFieldConfigurationApi {
    /**
     * Retrieves the Entity Field Configuration
     * It retrieves all the Entity Field Configuration
     * Responses:
     *  - 200: OK
     *
     * @param entity entity
     * @return [kotlin.collections.List<GetFieldConfigurationEntityResponse>]
     */
    @GET("v1/fieldconfiguration/{entity}")
    suspend fun getAddresses(@Path("entity") entity: String): List<GetFieldConfigurationEntityResponse>
}
