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
import org.mifos.fineract.client.models.DeleteChargesChargeIdResponse
import org.mifos.fineract.client.models.GetChargesResponse
import org.mifos.fineract.client.models.GetChargesTemplateResponse
import org.mifos.fineract.client.models.PostChargesRequest
import org.mifos.fineract.client.models.PostChargesResponse
import org.mifos.fineract.client.models.PutChargesChargeIdRequest
import org.mifos.fineract.client.models.PutChargesChargeIdResponse

interface ChargesApi {
    /**
     * Create/Define a Charge
     * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
     * Responses:
     *  - 200: OK
     *
     * @param postChargesRequest
     * @return [PostChargesResponse]
     */
    @POST("v1/charges")
    suspend fun createCharge(@Body postChargesRequest: PostChargesRequest): PostChargesResponse

    /**
     * Delete a Charge
     * Deletes a Charge.
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @return [DeleteChargesChargeIdResponse]
     */
    @DELETE("v1/charges/{chargeId}")
    suspend fun deleteCharge(@Path("chargeId") chargeId: Long): DeleteChargesChargeIdResponse

    /**
     * Retrieve Charges
     * Returns the list of defined charges.  Example Requests:  charges
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetChargesResponse>]
     */
    @GET("v1/charges")
    suspend fun retrieveAllCharges(): List<GetChargesResponse>

    /**
     * Retrieve a Charge
     * Returns the details of a defined Charge.  Example Requests:  charges/1
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @return [GetChargesResponse]
     */
    @GET("v1/charges/{chargeId}")
    suspend fun retrieveCharge(@Path("chargeId") chargeId: Long): GetChargesResponse

    /**
     * Retrieve Charge Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetChargesTemplateResponse]
     */
    @GET("v1/charges/template")
    suspend fun retrieveNewChargeDetails(): GetChargesTemplateResponse

    /**
     * Update a Charge
     * Updates the details of a Charge.
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @param putChargesChargeIdRequest
     * @return [PutChargesChargeIdResponse]
     */
    @PUT("v1/charges/{chargeId}")
    suspend fun updateCharge(
        @Path("chargeId") chargeId: Long,
        @Body putChargesChargeIdRequest: PutChargesChargeIdRequest,
    ): PutChargesChargeIdResponse
}
