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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PutLoansLoanIdRequest
 *
 * @param amortizationType
 * @param charges
 * @param clientId
 * @param collateral
 * @param createStandingInstructionAtDisbursement
 * @param dateFormat
 * @param disbursementData
 * @param expectedDisbursementDate
 * @param fixedPrincipalPercentagePerInstallment
 * @param fraud
 * @param graceOnArrearsAgeing
 * @param interestCalculationPeriodType
 * @param interestChargedFromDate
 * @param interestRatePerPeriod
 * @param interestType
 * @param isEqualAmortization
 * @param isTopup
 * @param linkAccountId
 * @param loanIdToClose
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param loanTermFrequency
 * @param loanTermFrequencyType
 * @param loanType
 * @param locale
 * @param maxOutstandingLoanBalance
 * @param numberOfRepayments
 * @param principal
 * @param productId
 * @param repaymentEvery
 * @param repaymentFrequencyDayOfWeekType
 * @param repaymentFrequencyNthDayType
 * @param repaymentFrequencyType
 * @param repaymentsStartingFromDate
 * @param submittedOnDate
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class PutLoansLoanIdRequest(

    val amortizationType: kotlin.Int? = null,

    val charges: kotlin.collections.List<PutLoansLoanIdChanges>? = null,

    val clientId: kotlin.Long? = null,

    val collateral: kotlin.collections.List<PutLoansLoanIdCollateral>? = null,

    val createStandingInstructionAtDisbursement: kotlin.Boolean? = null,

    val dateFormat: kotlin.String? = null,

    val disbursementData: kotlin.collections.List<PutLoansLoanIdDisbursementData>? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val fraud: kotlin.Boolean? = null,

    val graceOnArrearsAgeing: kotlin.Int? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestChargedFromDate: kotlin.String? = null,

    @Contextual
    val interestRatePerPeriod: Double? = null,

    val interestType: kotlin.Int? = null,

    val isEqualAmortization: kotlin.Boolean? = null,

    val isTopup: kotlin.Boolean? = null,

    val linkAccountId: kotlin.Long? = null,

    val loanIdToClose: kotlin.Long? = null,

    val loanScheduleProcessingType: kotlin.String? = null,

    val loanScheduleType: kotlin.String? = null,

    val loanTermFrequency: kotlin.Int? = null,

    val loanTermFrequencyType: kotlin.Int? = null,

    val loanType: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingLoanBalance: kotlin.Long? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyDayOfWeekType: kotlin.Int? = null,

    val repaymentFrequencyNthDayType: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Int? = null,

    val repaymentsStartingFromDate: kotlin.String? = null,

    val submittedOnDate: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

)
