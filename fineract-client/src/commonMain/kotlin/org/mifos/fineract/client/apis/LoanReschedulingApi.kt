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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.PostLoansLoanIdScheduleResponse

interface LoanReschedulingApi {
    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param body
     * @param command command (optional)
     * @return [PostLoansLoanIdScheduleResponse]
     */
    @POST("v1/loans/{loanId}/schedule")
    suspend fun calculateLoanScheduleOrSubmitVariableSchedule(
        @Path("loanId") loanId: Long,
        @Body body: Any,
        @Query("command") command: String? = null,
    ): PostLoansLoanIdScheduleResponse
}
