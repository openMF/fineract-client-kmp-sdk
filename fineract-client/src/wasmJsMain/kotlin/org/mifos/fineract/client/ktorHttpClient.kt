package org.mifos.fineract.client

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.js.Js


actual fun ktorHttpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(Js) {
    config(this)
}

//@OptIn(ExperimentalEncodingApi::class)
//actual fun ktorHttpClient(
//    loginUsername: String?, loginPassword: String?, tenant: String?, insecure: Boolean
//): HttpClient {
//    val ktorClient = HttpClient(Js) {
//
//        install(ContentNegotiation) {
//            json(
//                Json {
//                    isLenient = true
//                    ignoreUnknownKeys = true
//                },
//            )
//        }
//
//        install(Logging) {
//            logger = Logger.DEFAULT
//            level = LogLevel.INFO
//        }
//
//        val credentials = "$loginUsername:$loginPassword"
//        val encoded = Base64.encode(credentials.toByteArray())
//        defaultRequest {
//            header("Authorization", "Basic $encoded")
//            contentType(ContentType.Application.Json)
//            headers {
//                append("Accept", "application/json")
//                tenant?.let {
//                    append("fineract-platform-tenantid", it)
//                }
//            }
//        }
//
//    }
//
//    return ktorClient
//}
