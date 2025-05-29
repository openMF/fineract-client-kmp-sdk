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
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent

interface GuarantorsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/accounts/template")
    suspend fun accountsTemplate(
        @Path("loanId") loanId: Long,
        @Query("clientId") clientId: Long? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loans/{loanId}/guarantors")
    suspend fun createGuarantor(
        @Path("loanId") loanId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param guarantorId
     * @param guarantorFundingId  (optional)
     * @return [kotlin.String]
     */
    @DELETE("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun deleteGuarantor(
        @Path("loanId") loanId: Long,
        @Path("guarantorId") guarantorId: Long,
        @Query("guarantorFundingId") guarantorFundingId: Long? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/{loanId}/guarantors/downloadtemplate")
    suspend fun getGuarantorTemplate(
        @Path("loanId") loanId: Long,
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/template")
    suspend fun newGuarantorTemplate(@Path("loanId") loanId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/{loanId}/guarantors/uploadtemplate")
    suspend fun postGuarantorTemplate(
        @Path("loanId") loanId: Long,
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors")
    suspend fun retrieveGuarantorDetails(@Path("loanId") loanId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param guarantorId
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun retrieveGuarantorDetails1(
        @Path("loanId") loanId: Long,
        @Path("guarantorId") guarantorId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param guarantorId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun updateGuarantor(
        @Path("loanId") loanId: Long,
        @Path("guarantorId") guarantorId: Long,
        @Body body: String? = null,
    ): String
}
