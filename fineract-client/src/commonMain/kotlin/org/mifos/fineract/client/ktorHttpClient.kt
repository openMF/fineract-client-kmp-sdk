package org.mifos.fineract.client

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.DigestAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.auth.providers.digest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

expect fun ktorHttpClient(
    loginUsername: String?,
    loginPassword: String?,
    tenant: String?,
    insecure: Boolean
) : HttpClient
//expect fun ktorHttpClient(config: HttpClientConfig<*>.() -> Unit): HttpClient
//
//
//fun setupDefaultHttpClient(
//    baseUrl: String,
//    authRequiredUrl: List<String> = emptyList(),
//    defaultHeaders: Map<String, String> = emptyMap(),
//    requestTimeout: Long = 60_000L,
//    socketTimeout: Long = 60_000L,
//    httpLogger: Logger = Logger.DEFAULT,
//    httpLogLevel: LogLevel = LogLevel.ALL,
//    loggableHosts: List<String> = emptyList(),
//    sensitiveHeaders: List<String> = listOf(HttpHeaders.Authorization),
//    jsonConfig: Json = Json {
//        prettyPrint = true
//        isLenient = true
//        ignoreUnknownKeys = true
//        explicitNulls = false
//    },
//    basicCredentialsProvider: (() -> BasicAuthCredentials)? = null,
//    digestCredentialsProvider: (() -> DigestAuthCredentials)? = null,
//    bearerTokensProvider: (() -> BearerTokens)? = null,
//    bearerRefreshProvider: (() -> BearerTokens)? = null,
//): HttpClientConfig<*>.() -> Unit = {
//    when {
//        bearerTokensProvider != null -> {
//            install(Auth) {
//                bearer {
//                    loadTokens { bearerTokensProvider() }
//                    if (bearerRefreshProvider != null) {
//                        refreshTokens {
//                            bearerRefreshProvider()
//                        }
//                    }
//                    sendWithoutRequest { request ->
//                        request.url.host in authRequiredUrl
//                    }
//                }
//            }
//        }
//
//        basicCredentialsProvider != null -> {
//            install(Auth) {
//                basic {
//                    credentials {
//                        basicCredentialsProvider()
//                    }
//                    sendWithoutRequest { request ->
//                        request.url.host in authRequiredUrl
//                    }
//                }
//            }
//        }
//
//        digestCredentialsProvider != null -> {
//            install(Auth) {
//                digest {
//                    credentials {
//                        digestCredentialsProvider()
//                    }
//                }
//            }
//        }
//    }
//
//    defaultRequest {
//        url(baseUrl)
//        defaultHeaders.forEach { (key, value) ->
//            headers.append(key, value)
//        }
//    }
//
//    install(HttpTimeout) {
//        requestTimeoutMillis = requestTimeout
//        socketTimeoutMillis = socketTimeout
//    }
//
//    install(Logging) {
//        logger = httpLogger
//        level = httpLogLevel
//        filter { request ->
//            loggableHosts.any { host ->
//                request.url.host.contains(host)
//            }
//        }
//        sanitizeHeader { header ->
//            header in sensitiveHeaders
//        }
//    }
//
//    install(ContentNegotiation) {
//        json(
//            jsonConfig,
//        )
//    }
//}