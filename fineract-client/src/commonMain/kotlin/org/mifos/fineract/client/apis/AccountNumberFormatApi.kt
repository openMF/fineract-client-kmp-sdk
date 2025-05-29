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
import org.mifos.fineract.client.models.DeleteAccountNumberFormatsResponse
import org.mifos.fineract.client.models.GetAccountNumberFormatsIdResponse
import org.mifos.fineract.client.models.GetAccountNumberFormatsResponseTemplate
import org.mifos.fineract.client.models.PostAccountNumberFormatsRequest
import org.mifos.fineract.client.models.PostAccountNumberFormatsResponse
import org.mifos.fineract.client.models.PutAccountNumberFormatsRequest
import org.mifos.fineract.client.models.PutAccountNumberFormatsResponse

interface AccountNumberFormatApi {
    /**
     * Create an Account number format
     * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
     * Responses:
     *  - 200: OK
     *
     * @param postAccountNumberFormatsRequest  (optional)
     * @return [PostAccountNumberFormatsResponse]
     */
    @POST("v1/accountnumberformats")
    suspend fun create(@Body postAccountNumberFormatsRequest: PostAccountNumberFormatsRequest? = null): PostAccountNumberFormatsResponse

    /**
     * Delete an Account number format
     * Note: Account numbers created while this format was active would remain unchanged.
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @return [DeleteAccountNumberFormatsResponse]
     */
    @DELETE("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun delete(@Path("accountNumberFormatId") accountNumberFormatId: Long): DeleteAccountNumberFormatsResponse

    /**
     * List Account number formats
     * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetAccountNumberFormatsIdResponse>]
     */
    @GET("v1/accountnumberformats")
    suspend fun retrieveAll3(): List<GetAccountNumberFormatsIdResponse>

    /**
     * Retrieve an Account number format
     * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @return [GetAccountNumberFormatsIdResponse]
     */
    @GET("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun retrieveOne(@Path("accountNumberFormatId") accountNumberFormatId: Long): GetAccountNumberFormatsIdResponse

    /**
     * Retrieve Account number format Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetAccountNumberFormatsResponseTemplate]
     */
    @GET("v1/accountnumberformats/template")
    suspend fun retrieveTemplate2(): GetAccountNumberFormatsResponseTemplate

    /**
     * Update an Account number format
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @param putAccountNumberFormatsRequest
     * @return [PutAccountNumberFormatsResponse]
     */
    @PUT("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun update1(
        @Path("accountNumberFormatId") accountNumberFormatId: Long,
        @Body putAccountNumberFormatsRequest: PutAccountNumberFormatsRequest,
    ): PutAccountNumberFormatsResponse
}
