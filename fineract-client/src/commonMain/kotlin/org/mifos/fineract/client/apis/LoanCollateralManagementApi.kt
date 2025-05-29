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
import de.jensklingenberg.ktorfit.http.HTTP
import de.jensklingenberg.ktorfit.http.Path

interface LoanCollateralManagementApi {
    /**
     * Delete Loan Collateral
     * Delete Loan Collateral
     * Responses:
     *  - 0: default response
     *
     * @param loanId loanId
     * @param id loan collateral id
     * @return [kotlin.String]
     */
    @HTTP(method = "DELETE", path = "v1/loan-collateral-management/{id}/{loanId}", hasBody = true)
    suspend fun deleteLoanCollateral(
        @Path("loanId") loanId: Long,
        @Path("id") id: Long,
    ): String

    /**
     * Get Loan Collateral Details
     * Get Loan Collateral Details
     * Responses:
     *  - 0: default response
     *
     * @param collateralId collateralId
     * @return [kotlin.String]
     */
    @GET("v1/loan-collateral-management/{collateralId}")
    suspend fun getLoanCollateral(@Path("collateralId") collateralId: Long): String
}
