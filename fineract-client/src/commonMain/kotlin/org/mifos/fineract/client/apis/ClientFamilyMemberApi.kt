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
import de.jensklingenberg.ktorfit.http.HTTP
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path

interface ClientFamilyMemberApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/clients/{clientId}/familymembers")
    suspend fun addClientFamilyMembers(
        @Path("clientId") clientId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @HTTP(method = "DELETE", path = "v1/clients/{clientId}/familymembers/{familyMemberId}", hasBody = true)
    suspend fun deleteClientFamilyMembers(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun getFamilyMember(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers")
    suspend fun getFamilyMembers(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/template")
    suspend fun getTemplate2(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun updateClientFamilyMembers(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long,
        @Body body: String? = null,
    ): String
}
