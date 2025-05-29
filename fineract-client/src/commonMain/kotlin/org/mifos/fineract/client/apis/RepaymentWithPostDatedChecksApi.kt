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
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.DeletePostDatedCheck
import org.mifos.fineract.client.models.GetPostDatedChecks
import org.mifos.fineract.client.models.UpdatePostDatedCheckRequest
import org.mifos.fineract.client.models.UpdatePostDatedCheckResponse

interface RepaymentWithPostDatedChecksApi {
    /**
     * Delete Post Dated Check
     * Delete Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @return [kotlin.collections.List<DeletePostDatedCheck]
     */
    @DELETE("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun deletePostDatedCheck(
        @Path("postDatedCheckId") postDatedCheckId: Long,
        @Path("loanId") loanId: Long,
    ): List<DeletePostDatedCheck>

    /**
     * Get Post Dated Check
     * Get Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param installmentId installmentId
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks]
     */
    @GET("v1/loans/{loanId}/postdatedchecks/{installmentId}")
    suspend fun getPostDatedCheck(
        @Path("installmentId") installmentId: Int,
        @Path("loanId") loanId: Long,
    ): List<GetPostDatedChecks>

    /**
     * Get All Post Dated Checks
     * Get All Post dated Checks
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks]
     */
    @GET("v1/loans/{loanId}/postdatedchecks")
    suspend fun getPostDatedChecks(@Path("loanId") loanId: Long): List<GetPostDatedChecks>

    /**
     * Update Post Dated Check, Bounced Check
     * Update Post Dated Check, Bounced Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @param updatePostDatedCheckRequest
     * @param editType editType (optional)
     * @return [kotlin.collections.List<UpdatePostDatedCheckResponse]
     */
    @PUT("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun updatePostDatedChecks(
        @Path("postDatedCheckId") postDatedCheckId: Long,
        @Path("loanId") loanId: Long,
        @Body updatePostDatedCheckRequest: UpdatePostDatedCheckRequest,
        @Query("editType") editType: String? = null,
    ): List<UpdatePostDatedCheckResponse>
}
