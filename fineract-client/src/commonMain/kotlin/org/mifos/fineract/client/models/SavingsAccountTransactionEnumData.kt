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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param amountHold
 * @param amountRelease
 * @param annualFee
 * @param approveTransfer
 * @param chargeTransaction
 * @param code
 * @param credit
 * @param debit
 * @param deposit
 * @param depositOrWithdrawal
 * @param dividendPayout
 * @param entryType
 * @param escheat
 * @param feeDeduction
 * @param id
 * @param incomeFromInterest
 * @param initiateTransfer
 * @param interestPosting
 * @param overDraftInterestPosting
 * @param overdraftFee
 * @param overdraftInterest
 * @param payCharge
 * @param rejectTransfer
 * @param transactionTypeEnum
 * @param `value`
 * @param withdrawTransfer
 * @param withdrawal
 * @param withdrawalFee
 * @param withholdTax
 * @param writtenoff
 */

@Serializable
data class SavingsAccountTransactionEnumData(

    val amountHold: kotlin.Boolean? = null,

    val amountRelease: kotlin.Boolean? = null,

    val annualFee: kotlin.Boolean? = null,

    val approveTransfer: kotlin.Boolean? = null,

    val chargeTransaction: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val credit: kotlin.Boolean? = null,

    val debit: kotlin.Boolean? = null,

    val deposit: kotlin.Boolean? = null,

    val depositOrWithdrawal: kotlin.Boolean? = null,

    val dividendPayout: kotlin.Boolean? = null,

    val entryType: SavingsAccountTransactionEnumData.EntryType? = null,

    val escheat: kotlin.Boolean? = null,

    val feeDeduction: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val incomeFromInterest: kotlin.Boolean? = null,

    val initiateTransfer: kotlin.Boolean? = null,

    val interestPosting: kotlin.Boolean? = null,

    val overDraftInterestPosting: kotlin.Boolean? = null,

    val overdraftFee: kotlin.Boolean? = null,

    val overdraftInterest: kotlin.Boolean? = null,

    val payCharge: kotlin.Boolean? = null,

    val rejectTransfer: kotlin.Boolean? = null,

    val transactionTypeEnum: SavingsAccountTransactionEnumData.TransactionTypeEnum? = null,

    val value: kotlin.String? = null,

    val withdrawTransfer: kotlin.Boolean? = null,

    val withdrawal: kotlin.Boolean? = null,

    val withdrawalFee: kotlin.Boolean? = null,

    val withholdTax: kotlin.Boolean? = null,

    val writtenoff: kotlin.Boolean? = null,

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

    /**
     *
     *
     * Values: INVALID,DEPOSIT,WITHDRAWAL,INTEREST_POSTING,WITHDRAWAL_FEE,ANNUAL_FEE,WAIVE_CHARGES,PAY_CHARGE,DIVIDEND_PAYOUT,INITIATE_TRANSFER,APPROVE_TRANSFER,WITHDRAW_TRANSFER,REJECT_TRANSFER,WRITTEN_OFF,OVERDRAFT_INTEREST,WITHHOLD_TAX,ESCHEAT,AMOUNT_HOLD,AMOUNT_RELEASE
     */
    @Serializable
    enum class TransactionTypeEnum(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("DEPOSIT")
        DEPOSIT("DEPOSIT"),

        @SerialName("WITHDRAWAL")
        WITHDRAWAL("WITHDRAWAL"),

        @SerialName("INTEREST_POSTING")
        INTEREST_POSTING("INTEREST_POSTING"),

        @SerialName("WITHDRAWAL_FEE")
        WITHDRAWAL_FEE("WITHDRAWAL_FEE"),

        @SerialName("ANNUAL_FEE")
        ANNUAL_FEE("ANNUAL_FEE"),

        @SerialName("WAIVE_CHARGES")
        WAIVE_CHARGES("WAIVE_CHARGES"),

        @SerialName("PAY_CHARGE")
        PAY_CHARGE("PAY_CHARGE"),

        @SerialName("DIVIDEND_PAYOUT")
        DIVIDEND_PAYOUT("DIVIDEND_PAYOUT"),

        @SerialName("INITIATE_TRANSFER")
        INITIATE_TRANSFER("INITIATE_TRANSFER"),

        @SerialName("APPROVE_TRANSFER")
        APPROVE_TRANSFER("APPROVE_TRANSFER"),

        @SerialName("WITHDRAW_TRANSFER")
        WITHDRAW_TRANSFER("WITHDRAW_TRANSFER"),

        @SerialName("REJECT_TRANSFER")
        REJECT_TRANSFER("REJECT_TRANSFER"),

        @SerialName("WRITTEN_OFF")
        WRITTEN_OFF("WRITTEN_OFF"),

        @SerialName("OVERDRAFT_INTEREST")
        OVERDRAFT_INTEREST("OVERDRAFT_INTEREST"),

        @SerialName("WITHHOLD_TAX")
        WITHHOLD_TAX("WITHHOLD_TAX"),

        @SerialName("ESCHEAT")
        ESCHEAT("ESCHEAT"),

        @SerialName("AMOUNT_HOLD")
        AMOUNT_HOLD("AMOUNT_HOLD"),

        @SerialName("AMOUNT_RELEASE")
        AMOUNT_RELEASE("AMOUNT_RELEASE"),
    }
}
