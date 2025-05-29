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
 * PutSelfLoansLoanIdRequest
 *
 * @param amortizationType
 * @param dateFormat
 * @param expectedDisbursementDate
 * @param interestCalculationPeriodType
 * @param interestRatePerPeriod
 * @param interestType
 * @param loanTermFrequency
 * @param loanTermFrequencyType
 * @param locale
 * @param numberOfRepayments
 * @param principal
 * @param productId
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class PutSelfLoansLoanIdRequest(

    val amortizationType: kotlin.Int? = null,

    val dateFormat: kotlin.String? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestRatePerPeriod: kotlin.Int? = null,

    val interestType: kotlin.Int? = null,

    val loanTermFrequency: kotlin.Int? = null,

    val loanTermFrequencyType: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Long? = null,

    val productId: kotlin.Int? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Int? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

)
