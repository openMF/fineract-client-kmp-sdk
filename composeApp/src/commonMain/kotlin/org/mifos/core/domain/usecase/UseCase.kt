/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.domain.usecase

import org.mifos.core.common.Result

/**
 * Base interface for use cases that follows Single Responsibility Principle.
 * Each use case should handle one specific business operation.
 *
 * @param Params The input parameters for the use case
 * @param ReturnType The return type of the use case
 */
interface UseCase<in Params, out ReturnType> {
    /**
     * Executes the use case with the given parameters
     */
    suspend operator fun invoke(params: Params): Result<ReturnType>
}

/**
 * Use case interface for operations that don't require parameters
 */
interface NoParamsUseCase<out ReturnType> {
    /**
     * Executes the use case without parameters
     */
    suspend operator fun invoke(): Result<ReturnType>
}

/**
 * Base class for use cases that can be extended for common functionality
 */
abstract class BaseUseCase<in Params, out ReturnType> : UseCase<Params, ReturnType> {

    /**
     * Template method that handles common logic and delegates to execute
     */
    final override suspend operator fun invoke(params: Params): Result<ReturnType> {
        return try {
            execute(params)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    /**
     * Abstract method to be implemented by concrete use cases
     */
    protected abstract suspend fun execute(params: Params): Result<ReturnType>
}

/**
 * Base class for use cases without parameters
 */
abstract class BaseNoParamsUseCase<out ReturnType> : NoParamsUseCase<ReturnType> {

    /**
     * Template method that handles common logic and delegates to execute
     */
    final override suspend operator fun invoke(): Result<ReturnType> {
        return try {
            execute()
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    /**
     * Abstract method to be implemented by concrete use cases
     */
    protected abstract suspend fun execute(): Result<ReturnType>
}
