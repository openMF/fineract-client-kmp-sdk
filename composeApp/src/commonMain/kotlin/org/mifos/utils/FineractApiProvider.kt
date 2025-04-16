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