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
 * @param amortizationBoolean
 * @param amortizationType
 * @param arrearsToleranceBoolean
 * @param graceOnArrearsAgeing
 * @param graceOnArrearsAgingBoolean
 * @param graceOnPrincipalAndInterestPayment
 * @param graceOnPrincipalAndInterestPaymentBoolean
 * @param id
 * @param inArrearsTolerance
 * @param interestCalcPeriodBoolean
 * @param interestCalculationPeriodType
 * @param interestMethodBoolean
 * @param interestType
 * @param loanProduct
 * @param new
 * @param repaymentEvery
 * @param repaymentEveryBoolean
 * @param transactionProcessingStrategyBoolean
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class LoanProductConfigurableAttributes(

    val amortizationBoolean: kotlin.Boolean? = null,

    val amortizationType: kotlin.Boolean? = null,

    val arrearsToleranceBoolean: kotlin.Boolean? = null,

    val graceOnArrearsAgeing: kotlin.Boolean? = null,

    val graceOnArrearsAgingBoolean: kotlin.Boolean? = null,

    val graceOnPrincipalAndInterestPayment: kotlin.Boolean? = null,

    val graceOnPrincipalAndInterestPaymentBoolean: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val inArrearsTolerance: kotlin.Boolean? = null,

    val interestCalcPeriodBoolean: kotlin.Boolean? = null,

    val interestCalculationPeriodType: kotlin.Boolean? = null,

    val interestMethodBoolean: kotlin.Boolean? = null,

    val interestType: kotlin.Boolean? = null,

    val loanProduct: LoanProduct? = null,

    val new: kotlin.Boolean? = null,

    val repaymentEvery: kotlin.Boolean? = null,

    val repaymentEveryBoolean: kotlin.Boolean? = null,

    val transactionProcessingStrategyBoolean: kotlin.Boolean? = null,

    val transactionProcessingStrategyCode: kotlin.Boolean? = null,

)
