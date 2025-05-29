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
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.GetFundsResponse
import org.mifos.fineract.client.models.PostFundsRequest
import org.mifos.fineract.client.models.PostFundsResponse
import org.mifos.fineract.client.models.PutFundsFundIdRequest
import org.mifos.fineract.client.models.PutFundsFundIdResponse

interface FundsApi {
    /**
     * Create a Fund
     * Creates a Fund
     * Responses:
     *  - 200: OK
     *
     * @param postFundsRequest
     * @return [PostFundsResponse]
     */
    @POST("v1/funds")
    suspend fun createFund(@Body postFundsRequest: PostFundsRequest): PostFundsResponse

    /**
     * Retrieve a Fund
     * Returns the details of a Fund.  Example Requests:  funds/1
     * Responses:
     *  - 200: OK
     *
     * @param fundId fundId
     * @return [GetFundsResponse]
     */
    @GET("v1/funds/{fundId}")
    suspend fun retrieveFund(@Path("fundId") fundId: Long): GetFundsResponse

    /**
     * Retrieve Funds
     * Returns the list of funds.  Example Requests:  funds
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFundsResponse]
     */
    @GET("v1/funds")
    suspend fun retrieveFunds(): List<GetFundsResponse>

    /**
     * Update a Fund
     * Updates the details of a fund.
     * Responses:
     *  - 200: OK
     *
     * @param fundId fundId
     * @param putFundsFundIdRequest
     * @return [PutFundsFundIdResponse]
     */
    @PUT("v1/funds/{fundId}")
    suspend fun updateFund(
        @Path("fundId") fundId: Long,
        @Body putFundsFundIdRequest: PutFundsFundIdRequest,
    ): PutFundsFundIdResponse
}
