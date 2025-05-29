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
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.Scorecard
import org.mifos.fineract.client.models.ScorecardData

interface ScoreCardApi {
    /**
     * Create a Scorecard entry
     * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param scorecardData scorecardData (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/scorecards/{surveyId}")
    suspend fun createScorecard1(
        @Path("surveyId") surveyId: Long,
        @Body scorecardData: ScorecardData? = null,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.collections.List<ScorecardData]
     */
    @GET("v1/surveys/scorecards/clients/{clientId}")
    suspend fun findByClient1(@Path("clientId") clientId: Long): List<ScorecardData>

    /**
     * List all Scorecard entries
     * List all Scorecard entries for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @return [kotlin.collections.List<Scorecard]
     */
    @GET("v1/surveys/scorecards/{surveyId}")
    suspend fun findBySurvey(@Path("surveyId") surveyId: Long): List<Scorecard>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyId Enter surveyId
     * @param clientId Enter clientId
     * @return [kotlin.collections.List<ScorecardData]
     */
    @GET("v1/surveys/scorecards/{surveyId}/clients/{clientId}")
    suspend fun findBySurveyAndClient(
        @Path("surveyId") surveyId: Long,
        @Path("clientId") clientId: Long,
    ): List<ScorecardData>
}
