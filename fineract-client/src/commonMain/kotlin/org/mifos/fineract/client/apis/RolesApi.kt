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
import org.mifos.fineract.client.models.DeleteRolesRoleIdResponse
import org.mifos.fineract.client.models.GetRolesResponse
import org.mifos.fineract.client.models.GetRolesRoleIdPermissionsResponse
import org.mifos.fineract.client.models.GetRolesRoleIdResponse
import org.mifos.fineract.client.models.PostRolesRequest
import org.mifos.fineract.client.models.PostRolesResponse
import org.mifos.fineract.client.models.PostRolesRoleIdResponse
import org.mifos.fineract.client.models.PutRolesRoleIdPermissionsRequest
import org.mifos.fineract.client.models.PutRolesRoleIdPermissionsResponse
import org.mifos.fineract.client.models.PutRolesRoleIdRequest
import org.mifos.fineract.client.models.PutRolesRoleIdResponse

interface RolesApi {
    /**
     * Enable Role | Disable Role
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param command command (optional)
     * @return [PostRolesRoleIdResponse]
     */
    @POST("v1/roles/{roleId}")
    suspend fun actionsOnRoles(
        @Path("roleId") roleId: Long,
        @Query("command") command: String? = null,
    ): PostRolesRoleIdResponse

    /**
     * Create a New Role
     * Mandatory Fields name, description
     * Responses:
     *  - 200: OK
     *
     * @param postRolesRequest
     * @return [PostRolesResponse]
     */
    @POST("v1/roles")
    suspend fun createRole(@Body postRolesRequest: PostRolesRequest): PostRolesResponse

    /**
     * Delete a Role
     * Description : Delete the role in case role is not associated with any users.
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [DeleteRolesRoleIdResponse]
     */
    @DELETE("v1/roles/{roleId}")
    suspend fun deleteRole(@Path("roleId") roleId: Long): DeleteRolesRoleIdResponse

    /**
     * List Roles
     * Example Requests:  roles   roles?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetRolesResponse]
     */
    @GET("v1/roles")
    suspend fun retrieveAllRoles(): List<GetRolesResponse>

    /**
     * Retrieve a Role
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdResponse]
     */
    @GET("v1/roles/{roleId}")
    suspend fun retrieveRole(@Path("roleId") roleId: Long): GetRolesRoleIdResponse

    /**
     * Retrieve a Role&#39;s Permissions
     * Example Requests:  roles/1/permissions
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdPermissionsResponse]
     */
    @GET("v1/roles/{roleId}/permissions")
    suspend fun retrieveRolePermissions(@Path("roleId") roleId: Long): GetRolesRoleIdPermissionsResponse

    /**
     * Update a Role
     *
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdRequest
     * @return [PutRolesRoleIdResponse]
     */
    @PUT("v1/roles/{roleId}")
    suspend fun updateRole(
        @Path("roleId") roleId: Long,
        @Body putRolesRoleIdRequest: PutRolesRoleIdRequest,
    ): PutRolesRoleIdResponse

    /**
     * Update a Role&#39;s Permissions
     *
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdPermissionsRequest
     * @return [PutRolesRoleIdPermissionsResponse]
     */
    @PUT("v1/roles/{roleId}/permissions")
    suspend fun updateRolePermissions(
        @Path("roleId") roleId: Long,
        @Body putRolesRoleIdPermissionsRequest: PutRolesRoleIdPermissionsRequest,
    ): PutRolesRoleIdPermissionsResponse
}
