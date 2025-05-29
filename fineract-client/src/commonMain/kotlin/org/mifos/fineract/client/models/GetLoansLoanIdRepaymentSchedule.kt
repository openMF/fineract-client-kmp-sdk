/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.serialization.Serializable

/**
 *
 *
 * @param currency
 * @param loanTermInDays
 * @param periods
 * @param totalFeeChargesCharged
 * @param totalInterestCharged
 * @param totalOutstanding
 * @param totalPaidInAdvance
 * @param totalPaidLate
 * @param totalPenaltyChargesCharged
 * @param totalPrincipalDisbursed
 * @param totalPrincipalExpected
 * @param totalPrincipalPaid
 * @param totalRepaymentExpected
 * @param totalWaived
 * @param totalWrittenOff
 */

@Serializable
data class GetLoansLoanIdRepaymentSchedule(

    val currency: GetLoansLoanIdCurrency? = null,

    val loanTermInDays: kotlin.Long? = null,

    val periods: kotlin.collections.List<GetLoansLoanIdRepaymentPeriod>? = null,

    val totalFeeChargesCharged: kotlin.Double? = null,

    val totalInterestCharged: kotlin.Double? = null,

    val totalOutstanding: kotlin.Double? = null,

    val totalPaidInAdvance: kotlin.Double? = null,

    val totalPaidLate: kotlin.Double? = null,

    val totalPenaltyChargesCharged: kotlin.Double? = null,

    val totalPrincipalDisbursed: kotlin.Double? = null,

    val totalPrincipalExpected: kotlin.Double? = null,

    val totalPrincipalPaid: kotlin.Double? = null,

    val totalRepaymentExpected: kotlin.Double? = null,

    val totalWaived: kotlin.Double? = null,

    val totalWrittenOff: kotlin.Double? = null,

)
