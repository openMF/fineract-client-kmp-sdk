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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.DeleteTemplatesTemplateIdResponse
import org.mifos.fineract.client.models.GetTemplatesResponse
import org.mifos.fineract.client.models.GetTemplatesTemplateIdResponse
import org.mifos.fineract.client.models.GetTemplatesTemplateResponse
import org.mifos.fineract.client.models.PostTemplatesRequest
import org.mifos.fineract.client.models.PostTemplatesResponse
import org.mifos.fineract.client.models.PutTemplatesTemplateIdRequest
import org.mifos.fineract.client.models.PutTemplatesTemplateIdResponse

interface UserGeneratedDocumentsApi {
    /**
     * Add a UGD
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param postTemplatesRequest
     * @return [PostTemplatesResponse]
     */
    @POST("v1/templates")
    suspend fun createTemplate(@Body postTemplatesRequest: PostTemplatesRequest): PostTemplatesResponse

    /**
     * Delete a UGD
     *
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [DeleteTemplatesTemplateIdResponse]
     */
    @DELETE("v1/templates/{templateId}")
    suspend fun deleteTemplate(@Path("templateId") templateId: Long): DeleteTemplatesTemplateIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param templateId
     * @return [kotlin.String]
     */
    @GET("v1/templates/{templateId}/template")
    suspend fun getTemplateByTemplate(@Path("templateId") templateId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param templateId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/templates/{templateId}")
    suspend fun mergeTemplate(
        @Path("templateId") templateId: Long,
        @Body body: String? = null,
    ): String

    /**
     * Retrieve all UGDs
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     * Responses:
     *  - 200: OK
     *
     * @param typeId typeId (optional, default to -1)
     * @param entityId entityId (optional, default to -1)
     * @return [GetTemplatesResponse]
     */
    @GET("v1/templates")
    suspend fun retrieveAll40(
        @Query("typeId") typeId: Int? = -1,
        @Query("entityId") entityId: Int? = -1,
    ): GetTemplatesResponse

    /**
     * Retrieve a UGD
     * Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [GetTemplatesTemplateIdResponse]
     */
    @GET("v1/templates/{templateId}")
    suspend fun retrieveOne30(@Path("templateId") templateId: Long): GetTemplatesTemplateIdResponse

    /**
     * Update a UGD
     *
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @param putTemplatesTemplateIdRequest
     * @return [PutTemplatesTemplateIdResponse]
     */
    @PUT("v1/templates/{templateId}")
    suspend fun saveTemplate(
        @Path("templateId") templateId: Long,
        @Body putTemplatesTemplateIdRequest: PutTemplatesTemplateIdRequest,
    ): PutTemplatesTemplateIdResponse

    /**
     * Retrieve UGD Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetTemplatesTemplateResponse]
     */
    @GET("v1/templates/template")
    suspend fun template20(): GetTemplatesTemplateResponse
}
