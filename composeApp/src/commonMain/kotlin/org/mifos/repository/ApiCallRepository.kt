package org.mifos.repository

import org.mifos.utils.ApiState

interface ApiCallRepository {

    suspend fun getAuthApi(): ApiState<String>

    suspend fun getClientApi(): ApiState<String>

    suspend fun getSavingApi(): ApiState<String>

    suspend fun getCenterApi(): ApiState<String>

    suspend fun getLoanApi(): ApiState<String>

    suspend fun getSurveyApi(): ApiState<String>

    suspend fun getNoteApi(): ApiState<String>

}