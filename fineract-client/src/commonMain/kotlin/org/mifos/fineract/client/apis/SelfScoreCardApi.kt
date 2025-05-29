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
import org.mifos.fineract.client.models.ScorecardData

interface SelfScoreCardApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyId
     * @param scorecardData  (optional)
     * @return [Unit]
     */
    @POST("v1/self/surveys/scorecards/{surveyId}")
    suspend fun createScorecard(
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
    @GET("v1/self/surveys/scorecards/clients/{clientId}")
    suspend fun findByClient(@Path("clientId") clientId: Long): List<ScorecardData>
}
