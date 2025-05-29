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
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.CreateStaffResponse
import org.mifos.fineract.client.models.PostStaffRequest
import org.mifos.fineract.client.models.PutStaffRequest
import org.mifos.fineract.client.models.RetrieveOneResponse
import org.mifos.fineract.client.models.UpdateStaffResponse

interface StaffApi {
    /**
     * Create a staff member
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     * Responses:
     *  - 200: OK
     *
     * @param postStaffRequest
     * @return [CreateStaffResponse]
     */
    @POST("v1/staff")
    suspend fun create3(@Body postStaffRequest: PostStaffRequest): CreateStaffResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/staff/downloadtemplate")
    suspend fun getTemplate1(
        @Query("officeId") officeId: Long? = null,
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
    @POST("v1/staff/uploadtemplate")
    suspend fun postTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * Retrieve Staff
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
     * @param loanOfficersOnly loanOfficersOnly (optional, default to false)
     * @param status status (optional, default to "active")
     * @return [kotlin.collections.List<RetrieveOneResponse]
     */
    @GET("v1/staff")
    suspend fun retrieveAll16(
        @Query("officeId") officeId: Long? = null,
        @Query("staffInOfficeHierarchy") staffInOfficeHierarchy: Boolean? = false,
        @Query("loanOfficersOnly") loanOfficersOnly: Boolean? = false,
        @Query("status") status: String? = "active",
    ): List<RetrieveOneResponse>

    /**
     * Retrieve a Staff Member
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @return [RetrieveOneResponse]
     */
    @GET("v1/staff/{staffId}")
    suspend fun retrieveOne8(@Path("staffId") staffId: Long): RetrieveOneResponse

    /**
     * Update a Staff Member
     * Updates the details of a staff member.
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @param putStaffRequest
     * @return [UpdateStaffResponse]
     */
    @PUT("v1/staff/{staffId}")
    suspend fun update7(
        @Path("staffId") staffId: Long,
        @Body putStaffRequest: PutStaffRequest,
    ): UpdateStaffResponse
}
