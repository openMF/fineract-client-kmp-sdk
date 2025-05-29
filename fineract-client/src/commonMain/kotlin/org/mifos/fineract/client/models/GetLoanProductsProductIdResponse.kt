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
 * GetLoanProductsProductIdResponse
 *
 * @param accountingMappings
 * @param accountingRule
 * @param amortizationType
 * @param annualInterestRate
 * @param charges
 * @param currency
 * @param delinquencyBucket
 * @param disableScheduleExtensionForDownPayment
 * @param disallowExpectedDisbursements
 * @param disbursedAmountPercentageForDownPayment
 * @param dueDaysForRepaymentEvent
 * @param enableAutoRepaymentForDownPayment
 * @param enableDownPayment
 * @param enableInstallmentLevelDelinquency
 * @param feeToIncomeAccountMappings
 * @param fixedPrincipalPercentagePerInstallment
 * @param id
 * @param inArrearsTolerance
 * @param includeInBorrowerCycle
 * @param interestCalculationPeriodType
 * @param interestRateFrequencyType
 * @param interestRatePerPeriod
 * @param interestRateVariationsForBorrowerCycle
 * @param interestType
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param maxPrincipal
 * @param maxTrancheCount
 * @param minPrincipal
 * @param multiDisburseLoan
 * @param name
 * @param numberOfRepaymentVariationsForBorrowerCycle
 * @param numberOfRepayments
 * @param outstandingLoanBalance
 * @param overDueDaysForRepaymentEvent
 * @param overdueDaysForNPA
 * @param paymentAllocation
 * @param paymentChannelToFundSourceMappings
 * @param principal
 * @param principalThresholdForLastInstalment
 * @param productsPrincipalVariationsForBorrowerCycle
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentStartDateType
 * @param shortName
 * @param status
 * @param transactionProcessingStrategyCode
 * @param transactionProcessingStrategyName
 * @param useBorrowerCycle
 */

@Serializable
data class GetLoanProductsProductIdResponse(

    val accountingMappings: GetLoanAccountingMappings? = null,

    val accountingRule: GetLoanProductsAccountingRule? = null,

    val amortizationType: GetLoanProductsAmortizationType? = null,

    val annualInterestRate: kotlin.Double? = null,

    val charges: kotlin.collections.List<kotlin.Int>? = null,

    val currency: GetLoanProductsCurrency? = null,

    val delinquencyBucket: GetDelinquencyBucketsResponse? = null,

    val disableScheduleExtensionForDownPayment: kotlin.Boolean? = null,

    val disallowExpectedDisbursements: kotlin.Boolean? = null,

    @Contextual
    val disbursedAmountPercentageForDownPayment: Double? = null,

    val dueDaysForRepaymentEvent: kotlin.Int? = null,

    val enableAutoRepaymentForDownPayment: kotlin.Boolean? = null,

    val enableDownPayment: kotlin.Boolean? = null,

    val enableInstallmentLevelDelinquency: kotlin.Boolean? = null,

    val feeToIncomeAccountMappings: kotlin.collections.Set<GetLoanFeeToIncomeAccountMappings>? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val id: kotlin.Long? = null,

    val inArrearsTolerance: kotlin.Int? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val interestCalculationPeriodType: GetLoansProductsInterestCalculationPeriodType? = null,

    val interestRateFrequencyType: GetLoanProductsInterestRateFrequencyType? = null,

    val interestRatePerPeriod: kotlin.Double? = null,

    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val interestType: GetLoanProductsInterestTemplateType? = null,

    val loanScheduleProcessingType: EnumOptionData? = null,

    val loanScheduleType: EnumOptionData? = null,

    val maxPrincipal: kotlin.Double? = null,

    val maxTrancheCount: kotlin.Int? = null,

    val minPrincipal: kotlin.Double? = null,

    val multiDisburseLoan: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val outstandingLoanBalance: kotlin.Double? = null,

    val overDueDaysForRepaymentEvent: kotlin.Int? = null,

    val overdueDaysForNPA: kotlin.Int? = null,

    val paymentAllocation: kotlin.collections.List<AdvancedPaymentData>? = null,

    val paymentChannelToFundSourceMappings: kotlin.collections.Set<GetLoanPaymentChannelToFundSourceMappings>? = null,

    val principal: kotlin.Double? = null,

    val principalThresholdForLastInstalment: kotlin.Int? = null,

    val productsPrincipalVariationsForBorrowerCycle: kotlin.collections.Set<GetLoanProductsPrincipalVariationsForBorrowerCycle>? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: GetLoanProductsRepaymentFrequencyType? = null,

    val repaymentStartDateType: GetLoanProductsRepaymentStartDateType? = null,

    val shortName: kotlin.String? = null,

    val status: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

    val transactionProcessingStrategyName: kotlin.String? = null,

    val useBorrowerCycle: kotlin.Boolean? = null,

)
