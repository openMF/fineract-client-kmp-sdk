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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.DeleteHolidaysHolidayIdResponse
import org.mifos.fineract.client.models.GetHolidaysResponse
import org.mifos.fineract.client.models.PostHolidaysHolidayIdResponse
import org.mifos.fineract.client.models.PostHolidaysRequest
import org.mifos.fineract.client.models.PostHolidaysResponse
import org.mifos.fineract.client.models.PutHolidaysHolidayIdRequest
import org.mifos.fineract.client.models.PutHolidaysHolidayIdResponse

interface HolidaysApi {
    /**
     * Create a Holiday
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     * Responses:
     *  - 200: OK
     *
     * @param postHolidaysRequest
     * @return [PostHolidaysResponse]
     */
    @POST("v1/holidays")
    suspend fun createNewHoliday(@Body postHolidaysRequest: PostHolidaysRequest): PostHolidaysResponse

    /**
     * Delete a Holiday
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @return [DeleteHolidaysHolidayIdResponse]
     */
    @DELETE("v1/holidays/{holidayId}")
    suspend fun delete7(@Path("holidayId") holidayId: Long): DeleteHolidaysHolidayIdResponse

    /**
     * Activate a Holiday
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @param body
     * @param command command (optional)
     * @return [PostHolidaysHolidayIdResponse]
     */
    @POST("v1/holidays/{holidayId}")
    suspend fun handleCommands1(
        @Path("holidayId") holidayId: Long,
        @Body body: Any,
        @Query("command") command: String? = null,
    ): PostHolidaysHolidayIdResponse

    /**
     * List Holidays
     * Example Requests:  holidays?officeId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @return [kotlin.collections.List<GetHolidaysResponse]
     */
    @GET("v1/holidays")
    suspend fun retrieveAllHolidays(
        @Query("officeId") officeId: Long? = null,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): List<GetHolidaysResponse>

    /**
     * Retrieve a Holiday
     * Example Requests:  holidays/1
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @return [GetHolidaysResponse]
     */
    @GET("v1/holidays/{holidayId}")
    suspend fun retrieveOne7(@Path("holidayId") holidayId: Long): GetHolidaysResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/holidays/template")
    suspend fun retrieveRepaymentScheduleUpdationTyeOptions(): String

    /**
     * Update a Holiday
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @param putHolidaysHolidayIdRequest
     * @return [PutHolidaysHolidayIdResponse]
     */
    @PUT("v1/holidays/{holidayId}")
    suspend fun update6(
        @Path("holidayId") holidayId: Long,
        @Body putHolidaysHolidayIdRequest: PutHolidaysHolidayIdRequest,
    ): PutHolidaysHolidayIdResponse
}
