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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param complete
 * @param daysInPeriod
 * @param downPaymentPeriod
 * @param dueDate
 * @param feeChargesDue
 * @param feeChargesOutstanding
 * @param feeChargesPaid
 * @param feeChargesWaived
 * @param feeChargesWrittenOff
 * @param fromDate
 * @param interestDue
 * @param interestOriginalDue
 * @param interestOutstanding
 * @param interestPaid
 * @param interestWaived
 * @param interestWrittenOff
 * @param obligationsMetOnDate
 * @param penaltyChargesDue
 * @param penaltyChargesOutstanding
 * @param penaltyChargesPaid
 * @param penaltyChargesWaived
 * @param penaltyChargesWrittenOff
 * @param period
 * @param principalDue
 * @param principalLoanBalanceOutstanding
 * @param principalOriginalDue
 * @param principalOutstanding
 * @param principalPaid
 * @param principalWrittenOff
 * @param totalActualCostOfLoanForPeriod
 * @param totalCredits
 * @param totalDueForPeriod
 * @param totalInstallmentAmountForPeriod
 * @param totalOriginalDueForPeriod
 * @param totalOutstandingForPeriod
 * @param totalPaidForPeriod
 * @param totalPaidInAdvanceForPeriod
 * @param totalPaidLateForPeriod
 * @param totalWaivedForPeriod
 * @param totalWrittenOffForPeriod
 */

@Serializable
data class GetLoansLoanIdRepaymentPeriod(

    val complete: kotlin.Boolean? = null,

    val daysInPeriod: kotlin.Long? = null,

    val downPaymentPeriod: kotlin.Boolean? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val feeChargesDue: kotlin.Double? = null,

    val feeChargesOutstanding: kotlin.Double? = null,

    val feeChargesPaid: kotlin.Double? = null,

    val feeChargesWaived: kotlin.Double? = null,

    val feeChargesWrittenOff: kotlin.Double? = null,

    @Contextual
    val fromDate: LocalDate? = null,

    val interestDue: kotlin.Double? = null,

    val interestOriginalDue: kotlin.Double? = null,

    val interestOutstanding: kotlin.Double? = null,

    val interestPaid: kotlin.Double? = null,

    val interestWaived: kotlin.Double? = null,

    val interestWrittenOff: kotlin.Double? = null,

    @Contextual
    val obligationsMetOnDate: LocalDate? = null,

    val penaltyChargesDue: kotlin.Double? = null,

    val penaltyChargesOutstanding: kotlin.Double? = null,

    val penaltyChargesPaid: kotlin.Double? = null,

    val penaltyChargesWaived: kotlin.Double? = null,

    val penaltyChargesWrittenOff: kotlin.Double? = null,

    val period: kotlin.Int? = null,

    val principalDue: kotlin.Double? = null,

    val principalLoanBalanceOutstanding: kotlin.Double? = null,

    val principalOriginalDue: kotlin.Double? = null,

    val principalOutstanding: kotlin.Double? = null,

    val principalPaid: kotlin.Double? = null,

    val principalWrittenOff: kotlin.Double? = null,

    val totalActualCostOfLoanForPeriod: kotlin.Double? = null,

    val totalCredits: kotlin.Double? = null,

    val totalDueForPeriod: kotlin.Double? = null,

    val totalInstallmentAmountForPeriod: kotlin.Double? = null,

    val totalOriginalDueForPeriod: kotlin.Double? = null,

    val totalOutstandingForPeriod: kotlin.Double? = null,

    val totalPaidForPeriod: kotlin.Double? = null,

    val totalPaidInAdvanceForPeriod: kotlin.Double? = null,

    val totalPaidLateForPeriod: kotlin.Double? = null,

    val totalWaivedForPeriod: kotlin.Double? = null,

    val totalWrittenOffForPeriod: kotlin.Double? = null,

)
