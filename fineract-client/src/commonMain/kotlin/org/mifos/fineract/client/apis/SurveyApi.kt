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
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetSurveyResponse
import org.mifos.fineract.client.models.PostSurveySurveyNameApptableIdRequest
import org.mifos.fineract.client.models.PostSurveySurveyNameApptableIdResponse

interface SurveyApi {
    /**
     * Create an entry in the survey table
     * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://fineract.apache.org/legacy-docs/apiLive.htm#survey_create ]
     * Responses:
     *  - 200: OK
     *
     * @param surveyName surveyName
     * @param apptableId apptableId
     * @param postSurveySurveyNameApptableIdRequest
     * @return [PostSurveySurveyNameApptableIdResponse]
     */
    @POST("v1/survey/{surveyName}/{apptableId}")
    suspend fun createDatatableEntry1(
        @Path("surveyName") surveyName: String,
        @Path("apptableId") apptableId: Long,
        @Body postSurveySurveyNameApptableIdRequest: PostSurveySurveyNameApptableIdRequest,
    ): PostSurveySurveyNameApptableIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyName
     * @param clientId
     * @param fulfilledId
     * @return [kotlin.String]
     */
    @DELETE("v1/survey/{surveyName}/{clientId}/{fulfilledId}")
    suspend fun deleteDatatableEntries1(
        @Path("surveyName") surveyName: String,
        @Path("clientId") clientId: Long,
        @Path("fulfilledId") fulfilledId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyName
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/survey/{surveyName}/{clientId}")
    suspend fun getClientSurveyOverview(
        @Path("surveyName") surveyName: String,
        @Path("clientId") clientId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyName
     * @param clientId
     * @param entryId
     * @return [kotlin.String]
     */
    @GET("v1/survey/{surveyName}/{clientId}/{entryId}")
    suspend fun getSurveyEntry(
        @Path("surveyName") surveyName: String,
        @Path("clientId") clientId: Long,
        @Path("entryId") entryId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyName
     * @param apptable
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/survey/register/{surveyName}/{apptable}")
    suspend fun register(
        @Path("surveyName") surveyName: String,
        @Path("apptable") apptable: String,
        @Body body: String? = null,
    ): String

    /**
     * Retrieve survey
     * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
     * Responses:
     *  - 200: OK
     *
     * @param surveyName surveyName
     * @return [GetSurveyResponse]
     */
    @GET("v1/survey/{surveyName}")
    suspend fun retrieveSurvey(@Path("surveyName") surveyName: String): GetSurveyResponse

    /**
     * Retrieve surveys
     * Retrieve surveys. This allows to retrieve the list of survey tables registered .
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetSurveyResponse]
     */
    @GET("v1/survey")
    suspend fun retrieveSurveys(): List<GetSurveyResponse>
}
