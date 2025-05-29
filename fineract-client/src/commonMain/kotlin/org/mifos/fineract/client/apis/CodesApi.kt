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
import org.mifos.fineract.client.models.DeleteCodesResponse
import org.mifos.fineract.client.models.GetCodesResponse
import org.mifos.fineract.client.models.PostCodesRequest
import org.mifos.fineract.client.models.PostCodesResponse
import org.mifos.fineract.client.models.PutCodesRequest
import org.mifos.fineract.client.models.PutCodesResponse

interface CodesApi {
    /**
     * Create a Code
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     * Responses:
     *  - 200: OK
     *
     * @param postCodesRequest
     * @return [PostCodesResponse]
     */
    @POST("v1/codes")
    suspend fun createCode(@Body postCodesRequest: PostCodesRequest): PostCodesResponse

    /**
     * Delete a Code
     * Deletes a code if it is not system defined.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @return [DeleteCodesResponse]
     */
    @DELETE("v1/codes/{codeId}")
    suspend fun deleteCode(@Path("codeId") codeId: Long): DeleteCodesResponse

    /**
     * Retrieve a Code
     * Returns the details of a Code.  Example Requests:  codes/1
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @return [GetCodesResponse]
     */
    @GET("v1/codes/{codeId}")
    suspend fun retrieveCode(@Path("codeId") codeId: Long): GetCodesResponse

    /**
     * Retrieve Codes
     * Returns the list of codes.  Example Requests:  codes
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCodesResponse>]
     */
    @GET("v1/codes")
    suspend fun retrieveCodes(): List<GetCodesResponse>

    /**
     * Update a Code
     * Updates the details of a code if it is not system defined.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param putCodesRequest
     * @return [PutCodesResponse]
     */
    @PUT("v1/codes/{codeId}")
    suspend fun updateCode(
        @Path("codeId") codeId: Long,
        @Body putCodesRequest: PutCodesRequest,
    ): PutCodesResponse
}
