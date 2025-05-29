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
 * PostLoanProductsRequest
 *
 * @param accountMovesOutOfNPAOnlyOnArrearsCompletion
 * @param accountingRule
 * @param allowApprovedDisbursedAmountsOverApplied
 * @param allowAttributeOverrides
 * @param allowPartialPeriodInterestCalcualtion
 * @param allowVariableInstallments
 * @param amortizationType
 * @param canDefineInstallmentAmount
 * @param canUseForTopup
 * @param chargeOffExpenseAccountId
 * @param chargeOffFraudExpenseAccountId
 * @param charges
 * @param closeDate
 * @param currencyCode
 * @param dateFormat
 * @param daysInMonthType
 * @param daysInYearType
 * @param delinquencyBucketId
 * @param description
 * @param digitsAfterDecimal
 * @param disableScheduleExtensionForDownPayment
 * @param disallowExpectedDisbursements
 * @param disbursedAmountPercentageForDownPayment
 * @param dueDaysForRepaymentEvent
 * @param enableAutoRepaymentForDownPayment
 * @param enableDownPayment
 * @param enableInstallmentLevelDelinquency
 * @param externalId
 * @param feeToIncomeAccountMappings
 * @param fixedPrincipalPercentagePerInstallment
 * @param fundId
 * @param fundSourceAccountId
 * @param goodwillCreditAccountId
 * @param graceOnArrearsAgeing
 * @param graceOnInterestPayment
 * @param graceOnPrincipalPayment
 * @param holdGuaranteeFunds
 * @param inArrearsTolerance
 * @param inMultiplesOf
 * @param includeInBorrowerCycle
 * @param incomeFromChargeOffFeesAccountId
 * @param incomeFromChargeOffInterestAccountId
 * @param incomeFromChargeOffPenaltyAccountId
 * @param incomeFromFeeAccountId
 * @param incomeFromGoodwillCreditFeesAccountId
 * @param incomeFromGoodwillCreditInterestAccountId
 * @param incomeFromGoodwillCreditPenaltyAccountId
 * @param incomeFromPenaltyAccountId
 * @param incomeFromRecoveryAccountId
 * @param installmentAmountInMultiplesOf
 * @param interestCalculationPeriodType
 * @param interestOnLoanAccountId
 * @param interestRateFrequencyType
 * @param interestRatePerPeriod
 * @param interestRateVariationsForBorrowerCycle
 * @param interestRecalculationCompoundingMethod
 * @param interestType
 * @param isEqualAmortization
 * @param isInterestRecalculationEnabled
 * @param isLinkedToFloatingInterestRates
 * @param loanPortfolioAccountId
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param locale
 * @param maxInterestRatePerPeriod
 * @param maxNumberOfRepayments
 * @param maxPrincipal
 * @param maxTrancheCount
 * @param minInterestRatePerPeriod
 * @param minNumberOfRepayments
 * @param minPrincipal
 * @param minimumDaysBetweenDisbursalAndFirstRepayment
 * @param multiDisburseLoan
 * @param name
 * @param numberOfRepaymentVariationsForBorrowerCycle
 * @param numberOfRepayments
 * @param outstandingLoanBalance
 * @param overAppliedCalculationType
 * @param overAppliedNumber
 * @param overDueDaysForRepaymentEvent
 * @param overdueDaysForNPA
 * @param overpaymentLiabilityAccountId
 * @param paymentAllocation
 * @param paymentChannelToFundSourceMappings
 * @param penaltyToIncomeAccountMappings
 * @param preClosureInterestCalculationStrategy
 * @param principal
 * @param principalThresholdForLastInstallment
 * @param principalVariationsForBorrowerCycle
 * @param rates
 * @param recalculationCompoundingFrequencyInterval
 * @param recalculationCompoundingFrequencyOnDayType
 * @param recalculationCompoundingFrequencyType
 * @param recalculationRestFrequencyInterval
 * @param recalculationRestFrequencyType
 * @param receivableFeeAccountId
 * @param receivableInterestAccountId
 * @param receivablePenaltyAccountId
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentStartDateType
 * @param rescheduleStrategyMethod
 * @param shortName
 * @param startDate
 * @param transactionProcessingStrategyCode
 * @param transfersInSuspenseAccountId
 * @param useBorrowerCycle
 * @param writeOffAccountId
 */

@Serializable
data class PostLoanProductsRequest(

    val accountMovesOutOfNPAOnlyOnArrearsCompletion: kotlin.Boolean? = null,

    val accountingRule: kotlin.Int? = null,

    val allowApprovedDisbursedAmountsOverApplied: kotlin.Boolean? = null,

    val allowAttributeOverrides: AllowAttributeOverrides? = null,

    val allowPartialPeriodInterestCalcualtion: kotlin.Boolean? = null,

    val allowVariableInstallments: kotlin.Boolean? = null,

    val amortizationType: kotlin.Int? = null,

    val canDefineInstallmentAmount: kotlin.Boolean? = null,

    val canUseForTopup: kotlin.Boolean? = null,

    val chargeOffExpenseAccountId: kotlin.Long? = null,

    val chargeOffFraudExpenseAccountId: kotlin.Long? = null,

    val charges: kotlin.collections.List<ChargeData>? = null,

    val closeDate: kotlin.String? = null,

    val currencyCode: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val daysInMonthType: kotlin.Int? = null,

    val daysInYearType: kotlin.Int? = null,

    val delinquencyBucketId: kotlin.Long? = null,

    val description: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val disableScheduleExtensionForDownPayment: kotlin.Boolean? = null,

    val disallowExpectedDisbursements: kotlin.Boolean? = null,

    @Contextual
    val disbursedAmountPercentageForDownPayment: Double? = null,

    val dueDaysForRepaymentEvent: kotlin.Int? = null,

    val enableAutoRepaymentForDownPayment: kotlin.Boolean? = null,

    val enableDownPayment: kotlin.Boolean? = null,

    val enableInstallmentLevelDelinquency: kotlin.Boolean? = null,

    val externalId: kotlin.String? = null,

    val feeToIncomeAccountMappings: kotlin.collections.List<GetLoanFeeToIncomeAccountMappings>? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val fundId: kotlin.Long? = null,

    val fundSourceAccountId: kotlin.Long? = null,

    val goodwillCreditAccountId: kotlin.Long? = null,

    val graceOnArrearsAgeing: kotlin.Int? = null,

    val graceOnInterestPayment: kotlin.Int? = null,

    val graceOnPrincipalPayment: kotlin.Int? = null,

    val holdGuaranteeFunds: kotlin.Boolean? = null,

    val inArrearsTolerance: kotlin.Int? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val incomeFromChargeOffFeesAccountId: kotlin.Long? = null,

    val incomeFromChargeOffInterestAccountId: kotlin.Long? = null,

    val incomeFromChargeOffPenaltyAccountId: kotlin.Long? = null,

    val incomeFromFeeAccountId: kotlin.Long? = null,

    val incomeFromGoodwillCreditFeesAccountId: kotlin.Long? = null,

    val incomeFromGoodwillCreditInterestAccountId: kotlin.Long? = null,

    val incomeFromGoodwillCreditPenaltyAccountId: kotlin.Long? = null,

    val incomeFromPenaltyAccountId: kotlin.Long? = null,

    val incomeFromRecoveryAccountId: kotlin.Long? = null,

    val installmentAmountInMultiplesOf: kotlin.Int? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestOnLoanAccountId: kotlin.Long? = null,

    val interestRateFrequencyType: kotlin.Int? = null,

    val interestRatePerPeriod: kotlin.Double? = null,

    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val interestRecalculationCompoundingMethod: kotlin.Int? = null,

    val interestType: kotlin.Int? = null,

    val isEqualAmortization: kotlin.Boolean? = null,

    val isInterestRecalculationEnabled: kotlin.Boolean? = null,

    val isLinkedToFloatingInterestRates: kotlin.Boolean? = null,

    val loanPortfolioAccountId: kotlin.Long? = null,

    val loanScheduleProcessingType: kotlin.String? = null,

    val loanScheduleType: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val maxInterestRatePerPeriod: kotlin.Double? = null,

    val maxNumberOfRepayments: kotlin.Int? = null,

    val maxPrincipal: kotlin.Double? = null,

    val maxTrancheCount: kotlin.Int? = null,

    val minInterestRatePerPeriod: kotlin.Double? = null,

    val minNumberOfRepayments: kotlin.Int? = null,

    val minPrincipal: kotlin.Double? = null,

    val minimumDaysBetweenDisbursalAndFirstRepayment: kotlin.Int? = null,

    val multiDisburseLoan: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val outstandingLoanBalance: kotlin.Double? = null,

    val overAppliedCalculationType: kotlin.String? = null,

    val overAppliedNumber: kotlin.Int? = null,

    val overDueDaysForRepaymentEvent: kotlin.Int? = null,

    val overdueDaysForNPA: kotlin.Int? = null,

    val overpaymentLiabilityAccountId: kotlin.Long? = null,

    val paymentAllocation: kotlin.collections.List<AdvancedPaymentData>? = null,

    val paymentChannelToFundSourceMappings: kotlin.collections.List<GetLoanPaymentChannelToFundSourceMappings>? = null,

    val penaltyToIncomeAccountMappings: kotlin.collections.List<ChargeToGLAccountMapper>? = null,

    val preClosureInterestCalculationStrategy: kotlin.Int? = null,

    val principal: kotlin.Double? = null,

    val principalThresholdForLastInstallment: kotlin.Int? = null,

    val principalVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val rates: kotlin.collections.List<RateData>? = null,

    val recalculationCompoundingFrequencyInterval: kotlin.Int? = null,

    val recalculationCompoundingFrequencyOnDayType: kotlin.Int? = null,

    val recalculationCompoundingFrequencyType: kotlin.Int? = null,

    val recalculationRestFrequencyInterval: kotlin.Int? = null,

    val recalculationRestFrequencyType: kotlin.Int? = null,

    val receivableFeeAccountId: kotlin.Long? = null,

    val receivableInterestAccountId: kotlin.Long? = null,

    val receivablePenaltyAccountId: kotlin.Long? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Long? = null,

    val repaymentStartDateType: kotlin.Int? = null,

    val rescheduleStrategyMethod: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

    val startDate: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

    val transfersInSuspenseAccountId: kotlin.Long? = null,

    val useBorrowerCycle: kotlin.Boolean? = null,

    val writeOffAccountId: kotlin.Long? = null,

)
