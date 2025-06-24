package org.mifos.utils

sealed class ApiState<out T> {
    data class Success<T>(val success: T) : ApiState<T>()
    object Loading : ApiState<Nothing>()

    data class Error<T>(
        val exception: Throwable
    ) : ApiState<T>() {
        val error = exception.message.toString()
    }
}