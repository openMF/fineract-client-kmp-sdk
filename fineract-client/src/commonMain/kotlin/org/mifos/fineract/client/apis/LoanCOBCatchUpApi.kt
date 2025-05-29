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
import de.jensklingenberg.ktorfit.http.POST
import org.mifos.fineract.client.models.GetOldestCOBProcessedLoanResponse
import org.mifos.fineract.client.models.IsCatchUpRunningResponse

interface LoanCOBCatchUpApi {
    /**
     * Executes Loan COB Catch Up
     * Executes the Loan COB job on every day from the oldest Loan to the current COB business date
     * Responses:
     *  - 200: All loans are up to date
     *  - 202: Catch Up has been started
     *  - 400: Catch Up is already running
     *
     * @return [Unit]
     */
    @POST("v1/loans/catch-up")
    suspend fun executeLoanCOBCatchUp(): Unit

    /**
     * Retrieves the oldest COB processed loan
     * Retrieves the COB business date and the oldest COB processed loan
     * Responses:
     *  - 200: OK
     *
     * @return [GetOldestCOBProcessedLoanResponse]
     */
    @GET("v1/loans/oldest-cob-closed")
    suspend fun getOldestCOBProcessedLoan(): GetOldestCOBProcessedLoanResponse

    /**
     * Retrieves whether Loan COB catch up is running
     * Retrieves whether Loan COB catch up is running, and the current execution date if it is running.
     * Responses:
     *  - 200: OK
     *
     * @return [IsCatchUpRunningResponse]
     */
    @GET("v1/loans/is-catch-up-running")
    suspend fun isCatchUpRunning(): IsCatchUpRunningResponse
}
