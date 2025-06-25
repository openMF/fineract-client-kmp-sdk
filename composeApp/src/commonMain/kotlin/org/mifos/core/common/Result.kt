/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.common

/**
 * A generic wrapper for handling operation results that can either succeed or fail.
 * This follows functional programming principles and provides better error handling
 * than throwing exceptions.
 *
 * @param T The type of data when the operation succeeds
 */
sealed class Result<out T> {
    /**
     * Represents a successful operation with data
     */
    data class Success<out T>(val data: T) : Result<T>()

    /**
     * Represents a failed operation with error information
     */
    data class Error(val exception: Throwable) : Result<Nothing>()

    /**
     * Represents an operation in progress
     */
    data object Loading : Result<Nothing>()
}

/**
 * Extension functions for Result to make it easier to work with
 */

/**
 * Returns true if the result is successful
 */
inline val <T> Result<T>.isSuccess: Boolean
    get() = this is Result.Success

/**
 * Returns true if the result is an error
 */
inline val <T> Result<T>.isError: Boolean
    get() = this is Result.Error

/**
 * Returns true if the result is loading
 */
inline val <T> Result<T>.isLoading: Boolean
    get() = this is Result.Loading

/**
 * Returns the data if successful, null otherwise
 */
inline val <T> Result<T>.dataOrNull: T?
    get() = if (this is Result.Success) data else null

/**
 * Returns the exception if error, null otherwise
 */
inline val <T> Result<T>.exceptionOrNull: Throwable?
    get() = if (this is Result.Error) exception else null

/**
 * Transforms the data if successful, keeps error/loading state otherwise
 */
inline fun <T, R> Result<T>.map(transform: (T) -> R): Result<R> {
    return when (this) {
        is Result.Success -> Result.Success(transform(data))
        is Result.Error -> this
        is Result.Loading -> this
    }
}

/**
 * Executes the given function if the result is successful
 */
inline fun <T> Result<T>.onSuccess(action: (T) -> Unit): Result<T> {
    if (this is Result.Success) action(data)
    return this
}

/**
 * Executes the given function if the result is an error
 */
inline fun <T> Result<T>.onError(action: (Throwable) -> Unit): Result<T> {
    if (this is Result.Error) action(exception)
    return this
}

/**
 * Executes the given function if the result is loading
 */
inline fun <T> Result<T>.onLoading(action: () -> Unit): Result<T> {
    if (this is Result.Loading) action()
    return this
}

/**
 * Safe way to create a Result from a suspending function
 */
suspend inline fun <T> safeCall(crossinline action: suspend () -> T): Result<T> {
    return try {
        Result.Success(action())
    } catch (e: Exception) {
        Result.Error(e)
    }
}
