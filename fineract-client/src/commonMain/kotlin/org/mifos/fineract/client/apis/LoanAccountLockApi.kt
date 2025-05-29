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

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetLoanAccountLockResponse

interface LoanAccountLockApi {
    /**
     * List locked loan accounts
     * Returns the locked loan IDs
     * Responses:
     *  - 200: OK
     *
     * @param page  (optional)
     * @param limit  (optional)
     * @return [GetLoanAccountLockResponse]
     */
    @GET("v1/loans/locked")
    suspend fun retrieveLockedAccounts(
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetLoanAccountLockResponse
}
