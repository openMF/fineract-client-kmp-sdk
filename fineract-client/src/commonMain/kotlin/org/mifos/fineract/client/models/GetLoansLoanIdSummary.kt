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
 * @param canDisburse
 * @param chargeOffReason
 * @param chargeOffReasonId
 * @param currency
 * @param disbursementDetails
 * @param emiAmountVariations
 * @param feeChargesCharged
 * @param feeChargesDueAtDisbursementCharged
 * @param feeChargesOutstanding
 * @param feeChargesOverdue
 * @param feeChargesPaid
 * @param feeChargesWaived
 * @param feeChargesWrittenOff
 * @param fixedEmiAmount
 * @param inArrears
 * @param interestCharged
 * @param interestOutstanding
 * @param interestOverdue
 * @param interestPaid
 * @param interestWaived
 * @param interestWrittenOff
 * @param isNPA
 * @param linkedAccount
 * @param maxOutstandingLoanBalance
 * @param overdueCharges
 * @param overdueSinceDate
 * @param penaltyChargesCharged
 * @param penaltyChargesOutstanding
 * @param penaltyChargesOverdue
 * @param penaltyChargesPaid
 * @param penaltyChargesWaived
 * @param penaltyChargesWrittenOff
 * @param principalAdjustments
 * @param principalDisbursed
 * @param principalOutstanding
 * @param principalOverdue
 * @param principalPaid
 * @param principalWrittenOff
 * @param totalChargeAdjustment
 * @param totalChargeAdjustmentReversed
 * @param totalChargeback
 * @param totalCostOfLoan
 * @param totalCreditBalanceRefund
 * @param totalCreditBalanceRefundReversed
 * @param totalExpectedCostOfLoan
 * @param totalExpectedRepayment
 * @param totalGoodwillCredit
 * @param totalGoodwillCreditReversed
 * @param totalMerchantRefund
 * @param totalMerchantRefundReversed
 * @param totalOutstanding
 * @param totalOverdue
 * @param totalPayoutRefund
 * @param totalPayoutRefundReversed
 * @param totalRecovered
 * @param totalRepayment
 * @param totalRepaymentTransaction
 * @param totalRepaymentTransactionReversed
 * @param totalWaived
 * @param totalWrittenOff
 * @param writeoffReason
 * @param writeoffReasonId
 */

@Serializable
data class GetLoansLoanIdSummary(

    val canDisburse: kotlin.Boolean? = null,

    val chargeOffReason: kotlin.String? = null,

    val chargeOffReasonId: kotlin.Long? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    val disbursementDetails: kotlin.collections.Set<GetLoansLoanIdDisbursementDetails>? = null,

    val emiAmountVariations: kotlin.collections.Set<@Contextual kotlin.Any>? = null,

    val feeChargesCharged: kotlin.Double? = null,

    val feeChargesDueAtDisbursementCharged: kotlin.Double? = null,

    val feeChargesOutstanding: kotlin.Double? = null,

    val feeChargesOverdue: kotlin.Double? = null,

    val feeChargesPaid: kotlin.Double? = null,

    val feeChargesWaived: kotlin.Double? = null,

    val feeChargesWrittenOff: kotlin.Double? = null,

    val fixedEmiAmount: kotlin.Double? = null,

    val inArrears: kotlin.Boolean? = null,

    val interestCharged: kotlin.Double? = null,

    val interestOutstanding: kotlin.Double? = null,

    val interestOverdue: kotlin.Double? = null,

    val interestPaid: kotlin.Double? = null,

    val interestWaived: kotlin.Double? = null,

    val interestWrittenOff: kotlin.Double? = null,

    val isNPA: kotlin.Boolean? = null,

    val linkedAccount: GetLoansLoanIdLinkedAccount? = null,

    val maxOutstandingLoanBalance: kotlin.Double? = null,

    val overdueCharges: kotlin.collections.Set<GetLoansLoanIdOverdueCharges>? = null,

    @Contextual
    val overdueSinceDate: LocalDate? = null,

    val penaltyChargesCharged: kotlin.Double? = null,

    val penaltyChargesOutstanding: kotlin.Double? = null,

    val penaltyChargesOverdue: kotlin.Double? = null,

    val penaltyChargesPaid: kotlin.Double? = null,

    val penaltyChargesWaived: kotlin.Double? = null,

    val penaltyChargesWrittenOff: kotlin.Double? = null,

    val principalAdjustments: kotlin.Double? = null,

    val principalDisbursed: kotlin.Double? = null,

    val principalOutstanding: kotlin.Double? = null,

    val principalOverdue: kotlin.Double? = null,

    val principalPaid: kotlin.Double? = null,

    val principalWrittenOff: kotlin.Double? = null,

    val totalChargeAdjustment: kotlin.Double? = null,

    val totalChargeAdjustmentReversed: kotlin.Double? = null,

    val totalChargeback: kotlin.Double? = null,

    val totalCostOfLoan: kotlin.Double? = null,

    val totalCreditBalanceRefund: kotlin.Double? = null,

    val totalCreditBalanceRefundReversed: kotlin.Double? = null,

    val totalExpectedCostOfLoan: kotlin.Double? = null,

    val totalExpectedRepayment: kotlin.Double? = null,

    val totalGoodwillCredit: kotlin.Double? = null,

    val totalGoodwillCreditReversed: kotlin.Double? = null,

    val totalMerchantRefund: kotlin.Double? = null,

    val totalMerchantRefundReversed: kotlin.Double? = null,

    val totalOutstanding: kotlin.Double? = null,

    val totalOverdue: kotlin.Double? = null,

    val totalPayoutRefund: kotlin.Double? = null,

    val totalPayoutRefundReversed: kotlin.Double? = null,

    val totalRecovered: kotlin.Double? = null,

    val totalRepayment: kotlin.Double? = null,

    val totalRepaymentTransaction: kotlin.Double? = null,

    val totalRepaymentTransactionReversed: kotlin.Double? = null,

    val totalWaived: kotlin.Double? = null,

    val totalWrittenOff: kotlin.Double? = null,

    val writeoffReason: kotlin.String? = null,

    val writeoffReasonId: kotlin.Long? = null,

)
