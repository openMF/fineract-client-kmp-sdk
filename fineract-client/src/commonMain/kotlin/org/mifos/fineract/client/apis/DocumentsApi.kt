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

import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Header
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.DeleteEntityTypeEntityIdDocumentsResponse
import org.mifos.fineract.client.models.GetEntityTypeEntityIdDocumentsResponse
import org.mifos.fineract.client.models.PostEntityTypeEntityIdDocumentsResponse
import org.mifos.fineract.client.models.PutEntityTypeEntityIdDocumentsResponse

interface DocumentsApi {
    /**
     * Create a Document
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PostEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @POST("v1/{entityType}/{entityId}/documents")
    suspend fun createDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String,
        @Part("description") description: String,
        @Part("locale") locale: String,
        @Part("name") name: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): PostEntityTypeEntityIdDocumentsResponse

    /**
     * Remove a Document
     *
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [DeleteEntityTypeEntityIdDocumentsResponse]
     */
    @DELETE("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun deleteDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long,
    ): DeleteEntityTypeEntityIdDocumentsResponse

    /**
     * Retrieve Binary File associated with Document
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     * Responses:
     *  - 200: Not Shown: The corresponding Binary file
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [Unit]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}/attachment")
    suspend fun downloadFile(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long,
    ): Unit

    /**
     * Retrieve a Document
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [GetEntityTypeEntityIdDocumentsResponse]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun getDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long,
    ): GetEntityTypeEntityIdDocumentsResponse

    /**
     * List documents
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @return [kotlin.collections.List<GetEntityTypeEntityIdDocumentsResponse]
     */
    @GET("v1/{entityType}/{entityId}/documents")
    suspend fun retrieveAllDocuments(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
    ): List<GetEntityTypeEntityIdDocumentsResponse>

    /**
     * Update a Document
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PutEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @PUT("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun updateDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String,
        @Part("description") description: String,
        @Part("locale") locale: String,
        @Part("name") name: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): PutEntityTypeEntityIdDocumentsResponse
}
