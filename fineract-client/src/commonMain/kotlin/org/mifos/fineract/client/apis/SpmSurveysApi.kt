/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
package org.mifos.fineract.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.SurveyData

interface SpmSurveysApi {
    /**
     * Deactivate Survey
     *
     * Responses:
     *  - 200: OK
     *
     * @param id
     * @param command  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{id}")
    suspend fun activateOrDeactivateSurvey(
        @Path("id") id: Long,
        @Query("command") command: String? = null,
    ): Unit

    /**
     * Create a Survey
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
     * Responses:
     *  - 200: OK
     *
     * @param surveyData Create survey (optional)
     * @return [Unit]
     */
    @POST("v1/surveys")
    suspend fun createSurvey(@Body surveyData: SurveyData? = null): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param id
     * @param surveyData  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/surveys/{id}")
    suspend fun editSurvey(
        @Path("id") id: Long,
        @Body surveyData: SurveyData? = null,
    ): String

    /**
     * List all Surveys
     *
     * Responses:
     *  - 200: OK
     *
     * @param isActive  (optional)
     * @return [kotlin.collections.List<SurveyData]
     */
    @GET("v1/surveys")
    suspend fun fetchAllSurveys1(@Query("isActive") isActive: Boolean? = null): List<SurveyData>

    /**
     * Retrieve a Survey
     *
     * Responses:
     *  - 200: OK
     *
     * @param id Enter id
     * @return [SurveyData]
     */
    @GET("v1/surveys/{id}")
    suspend fun findSurvey(@Path("id") id: Long): SurveyData
}
