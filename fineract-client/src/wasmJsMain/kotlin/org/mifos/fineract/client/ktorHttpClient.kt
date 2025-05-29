package org.mifos.fineract.client
//
//import io.ktor.client.HttpClient
//import io.ktor.client.engine.js.Js
//import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
//import io.ktor.client.plugins.defaultRequest
//import io.ktor.client.plugins.logging.DEFAULT
//import io.ktor.client.plugins.logging.LogLevel
//import io.ktor.client.plugins.logging.Logger
//import io.ktor.client.plugins.logging.Logging
//import io.ktor.client.request.header
//import io.ktor.client.request.headers
//import io.ktor.http.ContentType
//import io.ktor.http.contentType
//import io.ktor.serialization.kotlinx.json.json
//import io.ktor.utils.io.core.toByteArray
//import kotlinx.serialization.json.Json
//import kotlin.io.encoding.Base64
//import kotlin.io.encoding.ExperimentalEncodingApi
//
//
////actual fun ktorHttpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(Js) {
////    config(this)
////}
//
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
