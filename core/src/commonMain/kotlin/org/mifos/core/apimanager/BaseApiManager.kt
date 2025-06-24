package org.mifos.core.apimanager

import org.mifos.fineract.client.infrastructure.FineractClient


interface BaseApiManager {

    companion object {
        fun getInstance(): BaseApiManager {
            return BaseApiManagerImpl()
        }
    }

    fun createService(
        baseUrl: String,
        tenant: String,
        username: String,
        password: String
    )

    fun getClient(): FineractClient

}