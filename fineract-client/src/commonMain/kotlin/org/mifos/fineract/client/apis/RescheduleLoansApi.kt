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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetLoanRescheduleRequestResponse
import org.mifos.fineract.client.models.GetRescheduleReasonsTemplateResponse
import org.mifos.fineract.client.models.PostCreateRescheduleLoansRequest
import org.mifos.fineract.client.models.PostCreateRescheduleLoansResponse
import org.mifos.fineract.client.models.PostUpdateRescheduleLoansRequest
import org.mifos.fineract.client.models.PostUpdateRescheduleLoansResponse

interface RescheduleLoansApi {
    /**
     * Create loan reschedule request
     * Create a loan reschedule request.
     * Responses:
     *  - 200: OK
     *
     * @param postCreateRescheduleLoansRequest
     * @return [PostCreateRescheduleLoansResponse]
     */
    @POST("v1/rescheduleloans")
    suspend fun createLoanRescheduleRequest(@Body postCreateRescheduleLoansRequest: PostCreateRescheduleLoansRequest): PostCreateRescheduleLoansResponse

    /**
     * Retrieve loan reschedule request by schedule id
     * Retrieve loan reschedule request by schedule id
     * Responses:
     *  - 200: OK
     *
     * @param scheduleId
     * @param command  (optional)
     * @return [GetLoanRescheduleRequestResponse]
     */
    @GET("v1/rescheduleloans/{scheduleId}")
    suspend fun readLoanRescheduleRequest(
        @Path("scheduleId") scheduleId: Long,
        @Query("command") command: String? = null,
    ): GetLoanRescheduleRequestResponse

    /**
     * Retrieve all reschedule requests
     * Retrieve all reschedule requests.
     * Responses:
     *  - 200: OK
     *
     * @param command  (optional)
     * @param loanId  (optional)
     * @return [kotlin.collections.List<GetLoanRescheduleRequestResponse]
     */
    @GET("v1/rescheduleloans")
    suspend fun retrieveAllRescheduleRequest(
        @Query("command") command: String? = null,
        @Query("loanId") loanId: Long? = null,
    ): List<GetLoanRescheduleRequestResponse>

    /**
     * Retrieve all reschedule loan reasons
     * Retrieve all reschedule loan reasons as a template
     * Responses:
     *  - 200: OK
     *
     * @return [GetRescheduleReasonsTemplateResponse]
     */
    @GET("v1/rescheduleloans/template")
    suspend fun retrieveTemplate10(): GetRescheduleReasonsTemplateResponse

    /**
     * Update loan reschedule request
     * Update a loan reschedule request by either approving/rejecting it.
     * Responses:
     *  - 200: OK
     *
     * @param scheduleId
     * @param postUpdateRescheduleLoansRequest
     * @param command  (optional)
     * @return [PostUpdateRescheduleLoansResponse]
     */
    @POST("v1/rescheduleloans/{scheduleId}")
    suspend fun updateLoanRescheduleRequest(
        @Path("scheduleId") scheduleId: Long,
        @Body postUpdateRescheduleLoansRequest: PostUpdateRescheduleLoansRequest,
        @Query("command") command: String? = null,
    ): PostUpdateRescheduleLoansResponse
}
