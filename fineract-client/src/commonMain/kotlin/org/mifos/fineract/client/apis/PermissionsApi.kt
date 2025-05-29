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
import de.jensklingenberg.ktorfit.http.PUT
import org.mifos.fineract.client.models.CommandProcessingResult
import org.mifos.fineract.client.models.GetPermissionsResponse
import org.mifos.fineract.client.models.PutPermissionsRequest

interface PermissionsApi {
    /**
     * List Application Permissions
     * ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetPermissionsResponse]
     */
    @GET("v1/permissions")
    suspend fun retrieveAllPermissions(): List<GetPermissionsResponse>

    /**
     * Enable/Disable Permissions for Maker Checker
     *
     * Responses:
     *  - 200: OK
     *
     * @param putPermissionsRequest
     * @return [CommandProcessingResult]
     */
    @PUT("v1/permissions")
    suspend fun updatePermissionsDetails(@Body putPermissionsRequest: PutPermissionsRequest): CommandProcessingResult
}
