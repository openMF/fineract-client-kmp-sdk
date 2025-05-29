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
import org.mifos.fineract.client.models.DeleteResourceTypeResourceIdNotesNoteIdResponse
import org.mifos.fineract.client.models.GetResourceTypeResourceIdNotesNoteIdResponse
import org.mifos.fineract.client.models.GetResourceTypeResourceIdNotesResponse
import org.mifos.fineract.client.models.PostResourceTypeResourceIdNotesRequest
import org.mifos.fineract.client.models.PostResourceTypeResourceIdNotesResponse
import org.mifos.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdRequest
import org.mifos.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdResponse

interface NotesApi {
    /**
     * Add a Resource Note
     * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
     * Responses:
     *  - 200: OK
     *
     * @param resourceType resourceType
     * @param resourceId resourceId
     * @param postResourceTypeResourceIdNotesRequest
     * @return [PostResourceTypeResourceIdNotesResponse]
     */
    @POST("v1/{resourceType}/{resourceId}/notes")
    suspend fun addNewNote(
        @Path("resourceType") resourceType: String,
        @Path("resourceId") resourceId: Long,
        @Body postResourceTypeResourceIdNotesRequest: PostResourceTypeResourceIdNotesRequest,
    ): PostResourceTypeResourceIdNotesResponse

    /**
     * Delete a Resource Note
     * Deletes a Resource Note
     * Responses:
     *  - 200: OK
     *
     * @param resourceType resourceType
     * @param resourceId resourceId
     * @param noteId noteId
     * @return [DeleteResourceTypeResourceIdNotesNoteIdResponse]
     */
    @DELETE("v1/{resourceType}/{resourceId}/notes/{noteId}")
    suspend fun deleteNote(
        @Path("resourceType") resourceType: String,
        @Path("resourceId") resourceId: Long,
        @Path("noteId") noteId: Long,
    ): DeleteResourceTypeResourceIdNotesNoteIdResponse

    /**
     * Retrieve a Resource Note
     * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
     * Responses:
     *  - 200: OK
     *
     * @param resourceType resourceType
     * @param resourceId resourceId
     * @param noteId noteId
     * @return [GetResourceTypeResourceIdNotesNoteIdResponse]
     */
    @GET("v1/{resourceType}/{resourceId}/notes/{noteId}")
    suspend fun retrieveNote(
        @Path("resourceType") resourceType: String,
        @Path("resourceId") resourceId: Long,
        @Path("noteId") noteId: Long,
    ): GetResourceTypeResourceIdNotesNoteIdResponse

    /**
     * Retrieve a Resource&#39;s description
     * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
     * Responses:
     *  - 200: OK
     *
     * @param resourceType resourceType
     * @param resourceId resourceId
     * @return [kotlin.collections.List<GetResourceTypeResourceIdNotesResponse]
     */
    @GET("v1/{resourceType}/{resourceId}/notes")
    suspend fun retrieveNotesByResource(
        @Path("resourceType") resourceType: String,
        @Path("resourceId") resourceId: Long,
    ): List<GetResourceTypeResourceIdNotesResponse>

    /**
     * Update a Resource Note
     * Updates a Resource Note
     * Responses:
     *  - 200: OK
     *
     * @param resourceType resourceType
     * @param resourceId resourceId
     * @param noteId noteId
     * @param putResourceTypeResourceIdNotesNoteIdRequest
     * @return [PutResourceTypeResourceIdNotesNoteIdResponse]
     */
    @PUT("v1/{resourceType}/{resourceId}/notes/{noteId}")
    suspend fun updateNote(
        @Path("resourceType") resourceType: String,
        @Path("resourceId") resourceId: Long,
        @Path("noteId") noteId: Long,
        @Body putResourceTypeResourceIdNotesNoteIdRequest: PutResourceTypeResourceIdNotesNoteIdRequest,
    ): PutResourceTypeResourceIdNotesNoteIdResponse
}
