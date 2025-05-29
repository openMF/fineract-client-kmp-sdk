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
import de.jensklingenberg.ktorfit.http.Query
import kotlinx.datetime.LocalDate

interface MixReportApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param currency  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/mixreport")
    suspend fun retrieveXBRLReport(
        @Query("startDate") startDate: LocalDate? = null,
        @Query("endDate") endDate: LocalDate? = null,
        @Query("currency") currency: String? = null,
    ): String
}
