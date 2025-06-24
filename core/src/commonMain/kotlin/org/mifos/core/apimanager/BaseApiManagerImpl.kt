package org.mifos.core.apimanager

import org.mifos.fineract.client.infrastructure.FineractClient


/**
 * Created by Aditya Gupta on 19-09-2024
 *
 * A class to provide the ktorfit service to the SDK
 */
class BaseApiManagerImpl : BaseApiManager {

    private lateinit var client: FineractClient

    override fun createService(
        baseUrl: String,
        tenant: String,
        username: String,
        password: String

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