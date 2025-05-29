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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetClientClientIdAddressesResponse
import org.mifos.fineract.client.models.PostClientClientIdAddressesRequest
import org.mifos.fineract.client.models.PostClientClientIdAddressesResponse
import org.mifos.fineract.client.models.PutClientClientIdAddressesRequest
import org.mifos.fineract.client.models.PutClientClientIdAddressesResponse

interface ClientsAddressApi {
    /**
     * Create an address for a Client
     * Mandatory Fields :  type and clientId
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param postClientClientIdAddressesRequest
     * @param type type (optional)
     * @return [PostClientClientIdAddressesResponse]
     */
    @POST("v1/client/{clientid}/addresses")
    suspend fun addClientAddress(
        @Path("clientid") clientid: Long,
        @Body postClientClientIdAddressesRequest: PostClientClientIdAddressesRequest,
        @Query("type") type: Long? = null,
    ): PostClientClientIdAddressesResponse

    /**
     * List all addresses for a Client
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param status status (optional)
     * @param type type (optional)
     * @return [kotlin.collections.List<GetClientClientIdAddressesResponse>]
     */
    @GET("v1/client/{clientid}/addresses")
    suspend fun getAddresses1(
        @Path("clientid") clientid: Long,
        @Query("status") status: String? = null,
        @Query("type") type: Long? = null,
    ): List<GetClientClientIdAddressesResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/client/addresses/template")
    suspend fun getAddressesTemplate(): String

    /**
     * Update an address for a Client
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param putClientClientIdAddressesRequest
     * @return [PutClientClientIdAddressesResponse]
     */
    @PUT("v1/client/{clientid}/addresses")
    suspend fun updateClientAddress(
        @Path("clientid") clientid: Long,
        @Body putClientClientIdAddressesRequest: PutClientClientIdAddressesRequest,
    ): PutClientClientIdAddressesResponse
}
