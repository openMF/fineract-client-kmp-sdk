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
import org.mifos.fineract.client.models.DeleteClientsClientIdIdentifiersIdentifierIdResponse
import org.mifos.fineract.client.models.GetClientsClientIdIdentifiersResponse
import org.mifos.fineract.client.models.GetClientsClientIdIdentifiersTemplateResponse
import org.mifos.fineract.client.models.PostClientsClientIdIdentifiersRequest
import org.mifos.fineract.client.models.PostClientsClientIdIdentifiersResponse
import org.mifos.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdRequest
import org.mifos.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdResponse

interface ClientIdentifierApi {
    /**
     * Create an Identifier for a Client
     * Mandatory Fields documentKey, documentTypeId
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param postClientsClientIdIdentifiersRequest
     * @return [PostClientsClientIdIdentifiersResponse]
     */
    @POST("v1/clients/{clientId}/identifiers")
    suspend fun createClientIdentifier(
        @Path("clientId") clientId: Long,
        @Body postClientsClientIdIdentifiersRequest: PostClientsClientIdIdentifiersRequest,
    ): PostClientsClientIdIdentifiersResponse

    /**
     * Delete a Client Identifier
     * Deletes a Client Identifier
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @return [DeleteClientsClientIdIdentifiersIdentifierIdResponse]
     */
    @DELETE("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun deleteClientIdentifier(
        @Path("clientId") clientId: Long,
        @Path("identifierId") identifierId: Long,
    ): DeleteClientsClientIdIdentifiersIdentifierIdResponse

    /**
     * Retrieve Client Identifier Details Template
     * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [GetClientsClientIdIdentifiersTemplateResponse]
     */
    @GET("v1/clients/{clientId}/identifiers/template")
    suspend fun newClientIdentifierDetails(@Path("clientId") clientId: Long): GetClientsClientIdIdentifiersTemplateResponse

    /**
     * List all Identifiers for a Client
     * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [kotlin.collections.List<GetClientsClientIdIdentifiersResponse>]
     */
    @GET("v1/clients/{clientId}/identifiers")
    suspend fun retrieveAllClientIdentifiers(@Path("clientId") clientId: Long): List<GetClientsClientIdIdentifiersResponse>

    /**
     * Retrieve a Client Identifier
     * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @return [GetClientsClientIdIdentifiersResponse]
     */
    @GET("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun retrieveClientIdentifiers(
        @Path("clientId") clientId: Long,
        @Path("identifierId") identifierId: Long,
    ): GetClientsClientIdIdentifiersResponse

    /**
     * Update a Client Identifier
     * Updates a Client Identifier
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @param putClientsClientIdIdentifiersIdentifierIdRequest
     * @return [PutClientsClientIdIdentifiersIdentifierIdResponse]
     */
    @PUT("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun updateClientIdentifer(
        @Path("clientId") clientId: Long,
        @Path("identifierId") identifierId: Long,
        @Body putClientsClientIdIdentifiersIdentifierIdRequest: PutClientsClientIdIdentifiersIdentifierIdRequest,
    ): PutClientsClientIdIdentifiersIdentifierIdResponse
}
