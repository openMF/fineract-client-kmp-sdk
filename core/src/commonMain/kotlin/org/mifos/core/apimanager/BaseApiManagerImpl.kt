/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.apimanager

import org.mifos.fineract.client.infrastructure.FineractClient

class BaseApiManagerImpl : BaseApiManager {

    private lateinit var client: FineractClient

    override fun createService(
        baseUrl: String,
        tenant: String,
        username: String,
        password: String,
    ) {
        val builder = FineractClient.builder()
            .baseURL(baseUrl)
            .httpClient(httpClient(tenant, username, password))
        client = builder.build()
    }

    override fun getClient(): FineractClient {
        return client
    }
}
