/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.data.network

import org.mifos.core.common.Result

/**
 * Generic API handler interface following Open/Closed Principle
 * Returns JSON strings directly without complex data class mapping
 *
 * @param RequestType The type of request this handler processes
 */
interface ApiHandler<in RequestType> {
    /**
     * Handles the API request and returns a JSON string Result
     */
    suspend fun handle(request: RequestType): Result<String>

    /**
     * Returns the unique identifier for this handler
     */
    val handlerId: String
}

/**
 * Registry for API handlers that allows dynamic registration
 * This follows the Plugin pattern for extensibility
 */
interface ApiHandlerRegistry {
    /**
     * Registers an API handler
     */
    fun <RequestType> registerHandler(handler: ApiHandler<RequestType>)

    /**
     * Gets a handler by its ID
     */
    fun <RequestType> getHandler(handlerId: String): ApiHandler<RequestType>?

    /**
     * Checks if a handler is registered
     */
    fun hasHandler(handlerId: String): Boolean
}

/**
 * Default implementation of ApiHandlerRegistry
 */
class DefaultApiHandlerRegistry : ApiHandlerRegistry {
    private val handlers = mutableMapOf<String, ApiHandler<*>>()

    override fun <RequestType> registerHandler(handler: ApiHandler<RequestType>) {
        handlers[handler.handlerId] = handler
    }

    @Suppress("UNCHECKED_CAST")
    override fun <RequestType> getHandler(handlerId: String): ApiHandler<RequestType>? {
        return handlers[handlerId] as? ApiHandler<RequestType>
    }

    override fun hasHandler(handlerId: String): Boolean {
        return handlers.containsKey(handlerId)
    }
}

/**
 * Factory for creating API handlers
 */
interface ApiHandlerFactory {
    /**
     * Creates an API handler for the given type
     */
    fun <RequestType> createHandler(handlerType: String): ApiHandler<RequestType>?
}

/**
 * Service for managing API operations using the handler framework
 */
class ApiService(
    private val handlerRegistry: ApiHandlerRegistry,
    private val handlerFactory: ApiHandlerFactory,
) {

    /**
     * Executes an API request using the appropriate handler
     */
    suspend fun <RequestType> execute(
        handlerType: String,
        request: RequestType,
    ): Result<String> {
        val handler = handlerRegistry.getHandler<RequestType>(handlerType)
            ?: handlerFactory.createHandler<RequestType>(handlerType)
            ?: return Result.Error(IllegalArgumentException("No handler found for type: $handlerType"))

        // Register the handler for future use if it came from factory
        if (!handlerRegistry.hasHandler(handlerType)) {
            handlerRegistry.registerHandler(handler)
        }

        return handler.handle(request)
    }

    /**
     * Registers a new handler
     */
    fun <RequestType> registerHandler(handler: ApiHandler<RequestType>) {
        handlerRegistry.registerHandler(handler)
    }
}
