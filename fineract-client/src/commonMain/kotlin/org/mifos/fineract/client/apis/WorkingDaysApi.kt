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
import de.jensklingenberg.ktorfit.http.PUT
import org.mifos.fineract.client.models.GetWorkingDaysResponse
import org.mifos.fineract.client.models.GetWorkingDaysTemplateResponse
import org.mifos.fineract.client.models.PutWorkingDaysRequest
import org.mifos.fineract.client.models.PutWorkingDaysResponse

interface WorkingDaysApi {
    /**
     * List Working days
     * Example Requests:  workingdays
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetWorkingDaysResponse]
     */
    @GET("v1/workingdays")
    suspend fun retrieveAll17(): List<GetWorkingDaysResponse>

    /**
     * Working Days Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetWorkingDaysTemplateResponse]
     */
    @GET("v1/workingdays/template")
    suspend fun template4(): GetWorkingDaysTemplateResponse

    /**
     * Update a Working Day
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     * Responses:
     *  - 200: OK
     *
     * @param putWorkingDaysRequest
     * @return [PutWorkingDaysResponse]
     */
    @PUT("v1/workingdays")
    suspend fun update8(@Body putWorkingDaysRequest: PutWorkingDaysRequest): PutWorkingDaysResponse
}
