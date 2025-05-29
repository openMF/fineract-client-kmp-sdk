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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param createdBy
 * @param createdDate
 * @param createdDateTime
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param lastModifiedDateTime
 * @param allocationTypes
 * @param futureInstallmentAllocationRule
 * @param id
 * @param loanProduct
 * @param new
 * @param transactionType
 */

@Serializable
data class LoanProductPaymentAllocationRule(

    val createdBy: kotlin.Long,

    @Contextual
    val createdDate: LocalDateTime,

    @Contextual
    val createdDateTime: LocalDateTime,

    val lastModifiedBy: kotlin.Long,

    @Contextual
    val lastModifiedDate: LocalDateTime,

    @Contextual
    val lastModifiedDateTime: LocalDateTime,

    val allocationTypes: kotlin.collections.List<LoanProductPaymentAllocationRule.AllocationTypes>? = null,

    val futureInstallmentAllocationRule: LoanProductPaymentAllocationRule.FutureInstallmentAllocationRule? = null,

    val id: kotlin.Long? = null,

    val loanProduct: LoanProduct? = null,

    val new: kotlin.Boolean? = null,

    val transactionType: LoanProductPaymentAllocationRule.TransactionType? = null,

) {

    /**
     *
     *
     * Values: PAST_DUE_PENALTY,PAST_DUE_FEE,PAST_DUE_PRINCIPAL,PAST_DUE_INTEREST,DUE_PENALTY,DUE_FEE,DUE_PRINCIPAL,DUE_INTEREST,IN_ADVANCE_PENALTY,IN_ADVANCE_FEE,IN_ADVANCE_PRINCIPAL,IN_ADVANCE_INTEREST
     */
    @Serializable
    enum class AllocationTypes(val value: kotlin.String) {
        @SerialName("PAST_DUE_PENALTY")
        PAST_DUE_PENALTY("PAST_DUE_PENALTY"),

        @SerialName("PAST_DUE_FEE")
        PAST_DUE_FEE("PAST_DUE_FEE"),

        @SerialName("PAST_DUE_PRINCIPAL")
        PAST_DUE_PRINCIPAL("PAST_DUE_PRINCIPAL"),

        @SerialName("PAST_DUE_INTEREST")
        PAST_DUE_INTEREST("PAST_DUE_INTEREST"),

        @SerialName("DUE_PENALTY")
        DUE_PENALTY("DUE_PENALTY"),

        @SerialName("DUE_FEE")
        DUE_FEE("DUE_FEE"),

        @SerialName("DUE_PRINCIPAL")
        DUE_PRINCIPAL("DUE_PRINCIPAL"),

        @SerialName("DUE_INTEREST")
        DUE_INTEREST("DUE_INTEREST"),

        @SerialName("IN_ADVANCE_PENALTY")
        IN_ADVANCE_PENALTY("IN_ADVANCE_PENALTY"),

        @SerialName("IN_ADVANCE_FEE")
        IN_ADVANCE_FEE("IN_ADVANCE_FEE"),

        @SerialName("IN_ADVANCE_PRINCIPAL")
        IN_ADVANCE_PRINCIPAL("IN_ADVANCE_PRINCIPAL"),

        @SerialName("IN_ADVANCE_INTEREST")
        IN_ADVANCE_INTEREST("IN_ADVANCE_INTEREST"),
    }

    /**
     *
     *
     * Values: NEXT_INSTALLMENT,LAST_INSTALLMENT,REAMORTIZATION
     */
    @Serializable
    enum class FutureInstallmentAllocationRule(val value: kotlin.String) {
        @SerialName("NEXT_INSTALLMENT")
        NEXT_INSTALLMENT("NEXT_INSTALLMENT"),

        @SerialName("LAST_INSTALLMENT")
        LAST_INSTALLMENT("LAST_INSTALLMENT"),

        @SerialName("REAMORTIZATION")
        REAMORTIZATION("REAMORTIZATION"),
    }

    /**
     *
     *
     * Values: DEFAULT,REPAYMENT,DOWN_PAYMENT,MERCHANT_ISSUED_REFUND,PAYOUT_REFUND,GOODWILL_CREDIT,CHARGE_REFUND,CHARGE_ADJUSTMENT,WAIVE_INTEREST,CHARGE_PAYMENT,REFUND_FOR_ACTIVE_LOAN
     */
    @Serializable
    enum class TransactionType(val value: kotlin.String) {
        @SerialName("DEFAULT")
        DEFAULT("DEFAULT"),

        @SerialName("REPAYMENT")
        REPAYMENT("REPAYMENT"),

        @SerialName("DOWN_PAYMENT")
        DOWN_PAYMENT("DOWN_PAYMENT"),

        @SerialName("MERCHANT_ISSUED_REFUND")
        MERCHANT_ISSUED_REFUND("MERCHANT_ISSUED_REFUND"),

        @SerialName("PAYOUT_REFUND")
        PAYOUT_REFUND("PAYOUT_REFUND"),

        @SerialName("GOODWILL_CREDIT")
        GOODWILL_CREDIT("GOODWILL_CREDIT"),

        @SerialName("CHARGE_REFUND")
        CHARGE_REFUND("CHARGE_REFUND"),

        @SerialName("CHARGE_ADJUSTMENT")
        CHARGE_ADJUSTMENT("CHARGE_ADJUSTMENT"),

        @SerialName("WAIVE_INTEREST")
        WAIVE_INTEREST("WAIVE_INTEREST"),

        @SerialName("CHARGE_PAYMENT")
        CHARGE_PAYMENT("CHARGE_PAYMENT"),

        @SerialName("REFUND_FOR_ACTIVE_LOAN")
        REFUND_FOR_ACTIVE_LOAN("REFUND_FOR_ACTIVE_LOAN"),
    }
}
