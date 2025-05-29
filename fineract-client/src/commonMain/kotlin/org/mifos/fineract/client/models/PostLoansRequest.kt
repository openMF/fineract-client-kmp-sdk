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
 * PostLoansRequest
 *
 * @param amortizationType
 * @param clientId
 * @param dateFormat
 * @param daysInYearType
 * @param disbursementData List of PostLoansDisbursementData
 * @param expectedDisbursementDate
 * @param externalId
 * @param fixedPrincipalPercentagePerInstallment
 * @param graceOnArrearsAgeing
 * @param graceOnInterestCharged
 * @param graceOnInterestPayment
 * @param graceOnPrincipalPayment
 * @param interestCalculationPeriodType
 * @param interestRatePerPeriod
 * @param interestType
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param loanTermFrequency
 * @param loanTermFrequencyType
 * @param loanType
 * @param locale
 * @param maxOutstandingLoanBalance Maximum allowed outstanding balance
 * @param numberOfRepayments
 * @param principal
 * @param productId
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentsStartingFromDate
 * @param submittedOnDate
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class PostLoansRequest(

    val amortizationType: kotlin.Int? = null,

    val clientId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val daysInYearType: PostLoansRequest.DaysInYearType? = null,

    val disbursementData: kotlin.collections.List<PostLoansDisbursementData>? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val graceOnArrearsAgeing: kotlin.Int? = null,

    val graceOnInterestCharged: kotlin.Int? = null,

    val graceOnInterestPayment: kotlin.Int? = null,

    val graceOnPrincipalPayment: kotlin.Int? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestRatePerPeriod: Double? = null,

    val interestType: kotlin.Int? = null,

    val loanScheduleProcessingType: kotlin.String? = null,

    val loanScheduleType: kotlin.String? = null,

    val loanTermFrequency: kotlin.Int? = null,

    val loanTermFrequencyType: kotlin.Int? = null,

    val loanType: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingLoanBalance: Double? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: Double? = null,

    val productId: kotlin.Long? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Int? = null,

    @Contextual
    val repaymentsStartingFromDate: LocalDate? = null,

    val submittedOnDate: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

) {

    /**
     *
     *
     * Values: `null`
     */
    @Serializable
    enum class DaysInYearType(val value: Int?) {
        @SerialName("null")
        `null`(null),
    }
}
