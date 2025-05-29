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
import org.mifos.fineract.client.models.DeleteGlClosuresResponse
import org.mifos.fineract.client.models.GetGlClosureResponse
import org.mifos.fineract.client.models.PostGlClosuresRequest
import org.mifos.fineract.client.models.PostGlClosuresResponse
import org.mifos.fineract.client.models.PutGlClosuresRequest
import org.mifos.fineract.client.models.PutGlClosuresResponse

interface AccountingClosureApi {
    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param postGlClosuresRequest
     * @return [PostGlClosuresResponse]
     */
    @POST("v1/glclosures")
    suspend fun createGLClosure(@Body postGlClosuresRequest: PostGlClosuresRequest): PostGlClosuresResponse

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glclosureId
     * @return [DeleteGlClosuresResponse]
     */
    @DELETE("v1/glclosures/{glClosureId}")
    suspend fun deleteGLClosure(@Path("glClosureId") glClosureId: Long): DeleteGlClosuresResponse

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @return [GetGlClosureResponse]
     */
    @GET("v1/glclosures/{glClosureId}")
    suspend fun retreiveClosure(@Path("glClosureId") glClosureId: Long): GetGlClosureResponse

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     * Responses:
     *  - 200: OK
     *
     * @param officeId  (optional)
     * @return [kotlin.collections.List<GetGlClosureResponse>]
     */
    @GET("v1/glclosures")
    suspend fun retrieveAllClosures(@Query("officeId") officeId: Long? = null): List<GetGlClosureResponse>

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @param putGlClosuresRequest  (optional)
     * @return [PutGlClosuresResponse]
     */
    @PUT("v1/glclosures/{glClosureId}")
    suspend fun updateGLClosure(
        @Path("glClosureId") glClosureId: Long,
        @Body putGlClosuresRequest: PutGlClosuresRequest? = null,
    ): PutGlClosuresResponse
}
