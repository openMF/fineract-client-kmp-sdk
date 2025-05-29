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
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.DeleteUsersUserIdResponse
import org.mifos.fineract.client.models.GetUsersResponse
import org.mifos.fineract.client.models.GetUsersTemplateResponse
import org.mifos.fineract.client.models.GetUsersUserIdResponse
import org.mifos.fineract.client.models.PostUsersRequest
import org.mifos.fineract.client.models.PostUsersResponse
import org.mifos.fineract.client.models.PutUsersUserIdRequest
import org.mifos.fineract.client.models.PutUsersUserIdResponse

interface UsersApi {
    /**
     * Create a User
     * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
     * Responses:
     *  - 200: OK
     *
     * @param postUsersRequest
     * @return [PostUsersResponse]
     */
    @POST("v1/users")
    suspend fun create15(@Body postUsersRequest: PostUsersRequest): PostUsersResponse

    /**
     * Delete a User
     * Removes the user and the associated roles and permissions.
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @return [DeleteUsersUserIdResponse]
     */
    @DELETE("v1/users/{userId}")
    suspend fun delete23(@Path("userId") userId: Long): DeleteUsersUserIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/users/downloadtemplate")
    suspend fun getUserTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/users/uploadtemplate")
    suspend fun postUsersTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * Retrieve list of users
     * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetUsersResponse]
     */
    @GET("v1/users")
    suspend fun retrieveAll41(): List<GetUsersResponse>

    /**
     * Retrieve a User
     * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @return [GetUsersUserIdResponse]
     */
    @GET("v1/users/{userId}")
    suspend fun retrieveOne31(@Path("userId") userId: Long): GetUsersUserIdResponse

    /**
     * Retrieve User Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetUsersTemplateResponse]
     */
    @GET("v1/users/template")
    suspend fun template22(): GetUsersTemplateResponse

    /**
     * Update a User
     * When updating a password you must provide the repeatPassword parameter also.
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @param putUsersUserIdRequest
     * @return [PutUsersUserIdResponse]
     */
    @PUT("v1/users/{userId}")
    suspend fun update26(
        @Path("userId") userId: Long,
        @Body putUsersUserIdRequest: PutUsersUserIdRequest,
    ): PutUsersUserIdResponse
}
