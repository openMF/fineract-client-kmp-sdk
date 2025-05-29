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
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface DepositAccountOnHoldFundTransactionsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @param guarantorFundingId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/onholdtransactions")
    suspend fun retrieveAll28(
        @Path("savingsId") savingsId: Long,
        @Query("guarantorFundingId") guarantorFundingId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
    ): String
}
