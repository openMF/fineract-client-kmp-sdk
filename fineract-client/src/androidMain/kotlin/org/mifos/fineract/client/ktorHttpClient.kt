package org.mifos.fineract.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

actual fun ktorHttpClient(
    loginUsername: String?,
    loginPassword: String?,
    tenant: String?,
    insecure: Boolean
): HttpClient {
    val ktorClient = HttpClient(OkHttp) {
        install(ContentNegotiation) {
            json(
                Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                },
            )
        }

        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.INFO
        }

        install(Auth) {
            basic {
                credentials {
                    BasicAuthCredentials(
                        username = loginUsername.toString(),
                        password = loginPassword.toString(),
                    )
                }
            }
        }

        defaultRequest {
            contentType(ContentType.Application.Json)
            headers {
                append("Accept", "application/json")
                tenant?.let {
                    append("fineract-platform-tenantid", it)
                }
            }
        }

//        if (insecure) {
//            engine {
//                https {
//                    val insecureTrustManager = object : X509TrustManager {
//                        @SuppressLint("TrustAllX509TrustManager")
//                        override fun checkClientTrusted(
//                            chain: Array<X509Certificate>,
//                            authType: String
//                        ) {
//                        }
//
//                        @SuppressLint("TrustAllX509TrustManager")
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
    }

    return ktorClient
}
