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

import de.jensklingenberg.ktorfit.http.GET
import org.mifos.fineract.client.models.SurveyData

interface SelfSpmApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.collections.List<SurveyData>]
     */
    @GET("v1/self/surveys")
    suspend fun fetchAllSurveys(): List<SurveyData>
}
