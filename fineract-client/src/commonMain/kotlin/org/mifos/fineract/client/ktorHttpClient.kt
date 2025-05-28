package org.mifos.fineract.client

import io.ktor.client.HttpClient

expect fun ktorHttpClient(
    loginUsername: String?,
    loginPassword: String?,
    tenant: String?,
    insecure: Boolean
) : HttpClient