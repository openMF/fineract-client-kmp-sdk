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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountId
 * @param accountNo
 * @param accountNumber
 * @param amount
 * @param amountOnHold
 * @param amountRelease
 * @param annualFee
 * @param annualFeeAndNotReversed
 * @param balanceEndDate
 * @param balanceNumberOfDays
 * @param bankNumber
 * @param chargeTransaction
 * @param chargeTransactionAndNotReversed
 * @param chargesPaidByData
 * @param checkNumber
 * @param credit
 * @param cumulativeBalance
 * @param currency
 * @param date
 * @param dateFormat
 * @param debit
 * @param deposit
 * @param depositAndNotReversed
 * @param dividendPayoutAndNotReversed
 * @param endOfBalanceLocalDate
 * @param entryType
 * @param feeCharge
 * @param feeChargeAndNotReversed
 * @param id
 * @param interestPosting
 * @param interestPostingAndNotReversed
 * @param interestedPostedAsOn
 * @param isManualTransaction
 * @param isReversal
 * @param lienTransaction
 * @param locale
 * @param manualTransaction
 * @param modifiedId
 * @param notReversed
 * @param note
 * @param originalTransactionId
 * @param outstandingChargeAmount
 * @param overdraftAmount
 * @param overdraftInterestAndNotReversed
 * @param payCharge
 * @param paymentDetailData
 * @param paymentTypeId
 * @param paymentTypeOptions
 * @param penaltyCharge
 * @param penaltyChargeAndNotReversed
 * @param reasonForBlock
 * @param receiptNumber
 * @param refNo
 * @param releaseTransactionId
 * @param reversalTransaction
 * @param reversed
 * @param routingCode
 * @param rowIndex
 * @param runningBalance
 * @param savingsAccountChargesPaid
 * @param savingsAccountId
 * @param submittedByUsername
 * @param submittedOnDate
 * @param taxDetails
 * @param transactionAmount
 * @param transactionDate
 * @param transactionType
 * @param transfer
 * @param waiveCharge
 * @param waiveFeeCharge
 * @param waiveFeeChargeAndNotReversed
 * @param waivePenaltyCharge
 * @param waivePenaltyChargeAndNotReversed
 * @param withHoldTaxAndNotReversed
 * @param withdrawal
 * @param withdrawalFeeAndNotReversed
 */

@Serializable
data class SavingsAccountTransactionData(

    val accountId: kotlin.Long? = null,

    val accountNo: kotlin.String? = null,

    val accountNumber: kotlin.String? = null,

    @Contextual
    val amount: Double? = null,

    val amountOnHold: kotlin.Boolean? = null,

    val amountRelease: kotlin.Boolean? = null,

    val annualFee: kotlin.Boolean? = null,

    val annualFeeAndNotReversed: kotlin.Boolean? = null,

    @Contextual
    val balanceEndDate: LocalDate? = null,

    val balanceNumberOfDays: kotlin.Int? = null,

    val bankNumber: kotlin.String? = null,

    val chargeTransaction: kotlin.Boolean? = null,

    val chargeTransactionAndNotReversed: kotlin.Boolean? = null,

    val chargesPaidByData: kotlin.collections.Set<SavingsAccountChargesPaidByData>? = null,

    val checkNumber: kotlin.String? = null,

    val credit: kotlin.Boolean? = null,

    @Contextual
    val cumulativeBalance: Double? = null,

    val currency: CurrencyData? = null,

    @Contextual
    val date: LocalDate? = null,

    val dateFormat: kotlin.String? = null,

    val debit: kotlin.Boolean? = null,

    val deposit: kotlin.Boolean? = null,

    val depositAndNotReversed: kotlin.Boolean? = null,

    val dividendPayoutAndNotReversed: kotlin.Boolean? = null,

    @Contextual
    val endOfBalanceLocalDate: LocalDate? = null,

    val entryType: SavingsAccountTransactionData.EntryType? = null,

    val feeCharge: kotlin.Boolean? = null,

    val feeChargeAndNotReversed: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val interestPosting: kotlin.Boolean? = null,

    val interestPostingAndNotReversed: kotlin.Boolean? = null,

    val interestedPostedAsOn: kotlin.Boolean? = null,

    val isManualTransaction: kotlin.Boolean? = null,

    val isReversal: kotlin.Boolean? = null,

    val lienTransaction: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    val manualTransaction: kotlin.Boolean? = null,

    val modifiedId: kotlin.Long? = null,

    val notReversed: kotlin.Boolean? = null,

    val note: kotlin.String? = null,

    val originalTransactionId: kotlin.Long? = null,

    @Contextual
    val outstandingChargeAmount: Double? = null,

    @Contextual
    val overdraftAmount: Double? = null,

    val overdraftInterestAndNotReversed: kotlin.Boolean? = null,

    val payCharge: kotlin.Boolean? = null,

    val paymentDetailData: PaymentDetailData? = null,

    val paymentTypeId: kotlin.Long? = null,

    val paymentTypeOptions: kotlin.collections.List<PaymentTypeData>? = null,

    val penaltyCharge: kotlin.Boolean? = null,

    val penaltyChargeAndNotReversed: kotlin.Boolean? = null,

    val reasonForBlock: kotlin.String? = null,

    val receiptNumber: kotlin.String? = null,

    val refNo: kotlin.String? = null,

    val releaseTransactionId: kotlin.Long? = null,

    val reversalTransaction: kotlin.Boolean? = null,

    val reversed: kotlin.Boolean? = null,

    val routingCode: kotlin.String? = null,

    val rowIndex: kotlin.Int? = null,

    @Contextual
    val runningBalance: Double? = null,

    val savingsAccountChargesPaid: kotlin.collections.Set<SavingsAccountChargesPaidByData>? = null,

    val savingsAccountId: kotlin.Long? = null,

    val submittedByUsername: kotlin.String? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val taxDetails: kotlin.collections.List<TaxDetailsData>? = null,

    @Contextual
    val transactionAmount: Double? = null,

    @Contextual
    val transactionDate: LocalDate? = null,

    val transactionType: SavingsAccountTransactionEnumData? = null,

    val transfer: AccountTransferData? = null,

    val waiveCharge: kotlin.Boolean? = null,

    val waiveFeeCharge: kotlin.Boolean? = null,

    val waiveFeeChargeAndNotReversed: kotlin.Boolean? = null,

    val waivePenaltyCharge: kotlin.Boolean? = null,

    val waivePenaltyChargeAndNotReversed: kotlin.Boolean? = null,

    val withHoldTaxAndNotReversed: kotlin.Boolean? = null,

    val withdrawal: kotlin.Boolean? = null,

    val withdrawalFeeAndNotReversed: kotlin.Boolean? = null,

) {

    /**
     *
     *
     * Values: CREDIT,DEBIT
     */
    @Serializable
    enum class EntryType(val value: kotlin.String) {
        @SerialName("CREDIT")
        CREDIT("CREDIT"),

        @SerialName("DEBIT")
        DEBIT("DEBIT"),
    }
}
