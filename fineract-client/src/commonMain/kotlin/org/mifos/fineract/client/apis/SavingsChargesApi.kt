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
import org.mifos.fineract.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.mifos.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse
import org.mifos.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.mifos.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
import org.mifos.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest
import org.mifos.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse
import org.mifos.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.mifos.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.mifos.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.mifos.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

interface SavingsChargesApi {
    /**
     * Create a Savings account Charge
     * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param postSavingsAccountsSavingsAccountIdChargesRequest
     * @return [PostSavingsAccountsSavingsAccountIdChargesResponse]
     */
    @POST("v1/savingsaccounts/{savingsAccountId}/charges")
    suspend fun addSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Body postSavingsAccountsSavingsAccountIdChargesRequest: PostSavingsAccountsSavingsAccountIdChargesRequest,
    ): PostSavingsAccountsSavingsAccountIdChargesResponse

    /**
     * Delete a Savings account Charge
     * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @DELETE("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun deleteSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
    ): DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
     * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @param postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
     * @param command command (optional)
     * @return [PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @POST("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun payOrWaiveSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
        @Body postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest,
        @Query("command") command: String? = null,
    ): PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [kotlin.collections.List<GetSavingsAccountsSavingsAccountIdChargesResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges")
    suspend fun retrieveAllSavingsAccountCharges(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all",
    ): List<GetSavingsAccountsSavingsAccountIdChargesResponse>

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun retrieveSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
    ): GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * Retrieve Savings Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @return [GetSavingsAccountsSavingsAccountIdChargesTemplateResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges/template")
    suspend fun retrieveTemplate18(@Path("savingsAccountId") savingsAccountId: Long): GetSavingsAccountsSavingsAccountIdChargesTemplateResponse

    /**
     * Update a Savings account Charge
     * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @param putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
     * @return [PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @PUT("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun updateSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
        @Body putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest,
    ): PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
}
