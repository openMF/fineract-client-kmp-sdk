package org.mifos.fineract.client

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.okhttp.OkHttp

actual fun ktorHttpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(OkHttp) {
    config(this)
}

//actual fun ktorHttpClient(
//    loginUsername: String?,
//    loginPassword: String?,
//    tenant: String?,
//    insecure: Boolean
//): HttpClient {
//    val ktorClient = HttpClient(OkHttp) {
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
//        install(Auth) {
//            basic {
//                credentials {
//                    BasicAuthCredentials(
//                        username = loginUsername.toString(),
//                        password = loginPassword.toString(),
//                    )
//                }
//            }
//        }
//
//        defaultRequest {
//            contentType(ContentType.Application.Json)
//            headers {
//                append("Accept", "application/json")
//                tenant?.let {
//                    append("fineract-platform-tenantid", it)
//                }
//            }
//        }
//
//        if (insecure) {
//            engine {
//                https {
//                    val insecureTrustManager = object : X509TrustManager {
//                        @Suppress("TrustAllX509TrustManager")
//                        override fun checkClientTrusted(
//                            chain: Array<X509Certificate>,
//                            authType: String
//                        ) {
//                        }
//
//                        @Suppress("TrustAllX509TrustManager")
//                        override fun checkServerTrusted(
//                            chain: Array<X509Certificate>,
//                            authType: String
//                        ) {
//                        }
//
//                        override fun getAcceptedIssuers(): Array<X509Certificate> =
//                            arrayOf()
//                    }
//
//                    try {
//                        SSLContext.getInstance("SSL").apply {
//                            init(
//                                null,
//                                arrayOf<TrustManager>(insecureTrustManager),
//                                SecureRandom()
//                            )
//                        }
//                        trustManager = insecureTrustManager
//                    } catch (e: NoSuchAlgorithmException) {
//                        throw IllegalStateException("SSL configuration failed", e)
//                    } catch (e: KeyManagementException) {
//                        throw IllegalStateException("SSL configuration failed", e)
//                    }
//                }
//            }
//        }
//    }

//    return ktorClient
//}
