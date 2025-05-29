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
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetRunReportResponse

interface SelfRunReportApi {
    /**
     * Running A Report
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param reportName reportName
     * @return [GetRunReportResponse]
     */
    @GET("v1/self/runreports/{reportName}")
    suspend fun runReport1(@Path("reportName") reportName: String): GetRunReportResponse
}
