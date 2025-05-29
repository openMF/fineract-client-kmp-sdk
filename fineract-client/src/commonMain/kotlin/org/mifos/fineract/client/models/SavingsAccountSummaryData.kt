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
 * @param accountBalance
 * @param availableBalance
 * @param currency
 * @param interestNotPosted
 * @param interestPostedTillDate
 * @param lastInterestCalculationDate
 * @param prevInterestPostedTillDate
 * @param runningBalanceOnInterestPostingTillDate
 * @param runningBalanceOnPivotDate
 * @param totalAnnualFees
 * @param totalDeposits
 * @param totalFeeCharge
 * @param totalInterestEarned
 * @param totalInterestPosted
 * @param totalOverdraftInterestDerived
 * @param totalPenaltyCharge
 * @param totalWithdrawalFees
 * @param totalWithdrawals
 * @param totalWithholdTax
 */

@Serializable
data class SavingsAccountSummaryData(

    val accountBalance: Double? = null,

    val availableBalance: Double? = null,

    val currency: CurrencyData? = null,

    val interestNotPosted: Double? = null,

    @Contextual
    val interestPostedTillDate: LocalDate? = null,

    @Contextual
    val lastInterestCalculationDate: LocalDate? = null,

    @Contextual
    val prevInterestPostedTillDate: LocalDate? = null,

    val runningBalanceOnInterestPostingTillDate: Double? = null,

    val runningBalanceOnPivotDate: Double? = null,

    val totalAnnualFees: Double? = null,

    val totalDeposits: Double? = null,

    val totalFeeCharge: Double? = null,

    val totalInterestEarned: Double? = null,

    val totalInterestPosted: Double? = null,

    val totalOverdraftInterestDerived: Double? = null,

    val totalPenaltyCharge: Double? = null,

    val totalWithdrawalFees: Double? = null,

    val totalWithdrawals: Double? = null,

    val totalWithholdTax: Double? = null,

)
