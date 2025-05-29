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
 * @param amortizationType
 * @param graceOnArrearsAgeing
 * @param graceOnPrincipalAndInterestPayment
 * @param inArrearsTolerance
 * @param interestCalculationPeriodType
 * @param interestType
 * @param repaymentEvery
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class AllowAttributeOverrides(

    val amortizationType: Boolean? = null,

    val graceOnArrearsAgeing: Boolean? = null,

    val graceOnPrincipalAndInterestPayment: Boolean? = null,

    val inArrearsTolerance: Boolean? = null,

    val interestCalculationPeriodType: Boolean? = null,

    val interestType: Boolean? = null,

    val repaymentEvery: Boolean? = null,

    val transactionProcessingStrategyCode: Boolean? = null,

)
