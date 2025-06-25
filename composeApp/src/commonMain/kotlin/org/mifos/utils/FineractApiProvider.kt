/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.utils

import org.mifos.core.apimanager.BaseApiManager
import org.mifos.core.apimanager.BaseUrl.Companion.API_ENDPOINT
import org.mifos.core.apimanager.BaseUrl.Companion.API_PATH
import org.mifos.core.apimanager.BaseUrl.Companion.PROTOCOL_HTTPS

interface FineractApiProvider {
    val baseApiManager: BaseApiManager
}

class FineractApiProviderImpl : FineractApiProvider {

    companion object {
        private const val BASE_URL = PROTOCOL_HTTPS + API_ENDPOINT + API_PATH
        const val USERNAME = "mifos"
        const val PASSWORD = "password"
        private const val TENANT_ID = "default"
    }

    override val baseApiManager: BaseApiManager by lazy {
        BaseApiManager.getInstance().apply {
            createService(BASE_URL, TENANT_ID, USERNAME, PASSWORD)
        }
    }
}
