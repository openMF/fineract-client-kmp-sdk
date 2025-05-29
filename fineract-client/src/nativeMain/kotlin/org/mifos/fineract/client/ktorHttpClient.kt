package org.mifos.fineract.client

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.darwin.Darwin


//actual fun ktorHttpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(Darwin) {
//    config(this)
//}

actual fun ktorHttpClient(
    loginUsername: String?,
    loginPassword: String?,
    tenant: String?,
    insecure: Boolean
): HttpClient {
    val ktorClient = HttpClient(Darwin) {
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
    }
    return ktorClient
}
