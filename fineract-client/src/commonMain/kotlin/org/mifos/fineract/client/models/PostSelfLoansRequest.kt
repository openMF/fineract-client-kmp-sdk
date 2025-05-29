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
 * PostSelfLoansRequest
 *
 * @param amortizationType
 * @param clientId
 * @param datatables
 * @param dateFormat
 * @param disbursementData
 * @param expectedDisbursementDate
 * @param fixedEmiAmount
 * @param interestCalculationPeriodType
 * @param interestRatePerPeriod
 * @param interestType
 * @param linkAccountId
 * @param loanTermFrequency
 * @param loanTermFrequencyType
 * @param loanType
 * @param locale
 * @param maxOutstandingLoanBalance
 * @param numberOfRepayments
 * @param principal
 * @param productId
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param submittedOnDate
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class PostSelfLoansRequest(

    val amortizationType: kotlin.Int? = null,

    val clientId: kotlin.Int? = null,

    val datatables: kotlin.collections.Set<PostSelfLoansDatatables>? = null,

    val dateFormat: kotlin.String? = null,

    val disbursementData: kotlin.collections.Set<PostSelfLoansDisbursementData>? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    val fixedEmiAmount: kotlin.Int? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestRatePerPeriod: kotlin.Int? = null,

    val interestType: kotlin.Int? = null,

    val linkAccountId: kotlin.Int? = null,

    val loanTermFrequency: kotlin.Int? = null,

    val loanTermFrequencyType: kotlin.Int? = null,

    val loanType: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingLoanBalance: kotlin.Long? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Double? = null,

    val productId: kotlin.Int? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Int? = null,

    val submittedOnDate: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

)
