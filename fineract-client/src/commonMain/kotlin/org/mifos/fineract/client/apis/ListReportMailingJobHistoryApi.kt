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
import org.mifos.fineract.client.models.ReportMailingJobRunHistoryData

interface ListReportMailingJobHistoryApi {
    /**
     * List Report Mailing Job History
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * Responses:
     *  - 200: OK
     *
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [ReportMailingJobRunHistoryData]
     */
    @GET("v1/reportmailingjobrunhistory")
    suspend fun retrieveAllByReportMailingJobId(
        @Query("reportMailingJobId") reportMailingJobId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
    ): ReportMailingJobRunHistoryData
}
