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
 * Transaction type
 *
 * @param accrual
 * @param approveTransfer
 * @param chargeAdjustment
 * @param chargePayment
 * @param chargeoff
 * @param code
 * @param contra
 * @param creditBalanceRefund
 * @param disbursement
 * @param goodwillCredit
 * @param id
 * @param initiateTransfer
 * @param merchantIssuedRefund
 * @param payoutRefund
 * @param recoveryRepayment
 * @param refund
 * @param refundForActiveLoans
 * @param rejectTransfer
 * @param repayment
 * @param repaymentAtDisbursement
 * @param `value`
 * @param waiveCharges
 * @param waiveInterest
 * @param withdrawTransfer
 * @param writeOff
 */

@Serializable
data class GetLoansLoanIdLoanTransactionEnumData(

    val accrual: kotlin.Boolean? = null,

    val approveTransfer: kotlin.Boolean? = null,

    val chargeAdjustment: kotlin.Boolean? = null,

    val chargePayment: kotlin.Boolean? = null,

    val chargeoff: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val contra: kotlin.Boolean? = null,

    val creditBalanceRefund: kotlin.Boolean? = null,

    val disbursement: kotlin.Boolean? = null,

    val goodwillCredit: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val initiateTransfer: kotlin.Boolean? = null,

    val merchantIssuedRefund: kotlin.Boolean? = null,

    val payoutRefund: kotlin.Boolean? = null,

    val recoveryRepayment: kotlin.Boolean? = null,

    val refund: kotlin.Boolean? = null,

    val refundForActiveLoans: kotlin.Boolean? = null,

    val rejectTransfer: kotlin.Boolean? = null,

    val repayment: kotlin.Boolean? = null,

    val repaymentAtDisbursement: kotlin.Boolean? = null,

    val `value`: kotlin.String? = null,

    val waiveCharges: kotlin.Boolean? = null,

    val waiveInterest: kotlin.Boolean? = null,

    val withdrawTransfer: kotlin.Boolean? = null,

    val writeOff: kotlin.Boolean? = null,

)
