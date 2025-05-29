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
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountMovesOutOfNPAOnlyOnArrearsCompletion
 * @param accountingMappingOptions
 * @param accountingMappings
 * @param accountingRule
 * @param accountingRuleOptions
 * @param advancedPaymentAllocationFutureInstallmentAllocationRules
 * @param advancedPaymentAllocationTransactionTypes
 * @param advancedPaymentAllocationTypes
 * @param allowApprovedDisbursedAmountsOverApplied
 * @param allowAttributeOverrides
 * @param allowPartialPeriodInterestCalculation
 * @param allowVariableInstallments
 * @param amortizationType
 * @param amortizationTypeOptions
 * @param annualInterestRate
 * @param canDefineInstallmentAmount
 * @param canUseForTopup
 * @param chargeOptions
 * @param charges
 * @param closeDate
 * @param compoundingToBePostedAsTransaction
 * @param currency
 * @param currencyOptions
 * @param daysInMonthType
 * @param daysInMonthTypeOptions
 * @param daysInYearType
 * @param daysInYearTypeOptions
 * @param defaultDifferentialLendingRate
 * @param delinquencyBucket
 * @param delinquencyBucketOptions
 * @param description
 * @param disableScheduleExtensionForDownPayment
 * @param disallowExpectedDisbursements
 * @param disbursedAmountPercentageForDownPayment
 * @param dueDaysForRepaymentEvent
 * @param enableAutoRepaymentForDownPayment
 * @param enableDownPayment
 * @param enableInstallmentLevelDelinquency
 * @param equalAmortization
 * @param externalId
 * @param feeToIncomeAccountMappings
 * @param fixedPrincipalPercentagePerInstallment
 * @param floatingInterestRateCalculationAllowed
 * @param floatingRateId
 * @param floatingRateName
 * @param floatingRateOptions
 * @param fundId
 * @param fundName
 * @param fundOptions
 * @param graceOnArrearsAgeing
 * @param graceOnInterestCharged
 * @param graceOnInterestPayment
 * @param graceOnPrincipalPayment
 * @param holdGuaranteeFunds
 * @param id
 * @param inArrearsTolerance
 * @param includeInBorrowerCycle
 * @param installmentAmountInMultiplesOf
 * @param interestCalculationPeriodType
 * @param interestCalculationPeriodTypeOptions
 * @param interestRateDifferential
 * @param interestRateFrequencyType
 * @param interestRateFrequencyTypeOptions
 * @param interestRatePerPeriod
 * @param interestRateVariationsForBorrowerCycle
 * @param interestRecalculationCompoundingTypeOptions
 * @param interestRecalculationData
 * @param interestRecalculationDayOfWeekTypeOptions
 * @param interestRecalculationEnabled
 * @param interestRecalculationFrequencyTypeOptions
 * @param interestRecalculationNthDayTypeOptions
 * @param interestType
 * @param interestTypeOptions
 * @param isAllowPartialPeriodInterestCalculation
 * @param isEqualAmortization
 * @param isFloatingInterestRateCalculationAllowed
 * @param isInterestRecalculationEnabled
 * @param isLinkedToFloatingInterestRates
 * @param isRatesEnabled
 * @param linkedToFloatingInterestRates
 * @param loanProductConfigurableAttributes
 * @param loanScheduleProcessingType
 * @param loanScheduleProcessingTypeOptions
 * @param loanScheduleType
 * @param loanScheduleTypeOptions
 * @param maxDifferentialLendingRate
 * @param maxInterestRatePerPeriod
 * @param maxNumberOfRepayments
 * @param maxPrincipal
 * @param maxTrancheCount
 * @param maximumGap
 * @param minDifferentialLendingRate
 * @param minInterestRatePerPeriod
 * @param minNumberOfRepayments
 * @param minPrincipal
 * @param minimumDaysBetweenDisbursalAndFirstRepayment
 * @param minimumGap
 * @param multiDisburseLoan
 * @param name
 * @param numberOfRepaymentVariationsForBorrowerCycle
 * @param numberOfRepayments
 * @param outstandingLoanBalance
 * @param overAppliedCalculationType
 * @param overAppliedNumber
 * @param overDueDaysForRepaymentEvent
 * @param overdueDaysForNPA
 * @param paymentAllocation
 * @param paymentChannelToFundSourceMappings
 * @param paymentTypeOptions
 * @param penaltyOptions
 * @param penaltyToIncomeAccountMappings
 * @param preClosureInterestCalculationStrategyOptions
 * @param principal
 * @param principalThresholdForLastInstallment
 * @param principalVariationsForBorrowerCycle
 * @param productGuaranteeData
 * @param rateOptions
 * @param rates
 * @param ratesEnabled
 * @param recurringMoratoriumOnPrincipalPeriods
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentFrequencyTypeOptions
 * @param repaymentStartDateType
 * @param repaymentStartDateTypeOptions
 * @param rescheduleStrategyTypeOptions
 * @param shortName
 * @param startDate
 * @param status
 * @param syncExpectedWithDisbursementDate
 * @param transactionProcessingStrategyCode
 * @param transactionProcessingStrategyName
 * @param transactionProcessingStrategyOptions
 * @param useBorrowerCycle
 * @param valueConditionTypeOptions
 */

@Serializable
data class LoanProductData(

    val accountMovesOutOfNPAOnlyOnArrearsCompletion: kotlin.Boolean? = null,

    val accountingMappingOptions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<GLAccountData>>? = null,

    val accountingMappings: kotlin.collections.Map<kotlin.String, @Contextual kotlin.Any>? = null,

    val accountingRule: EnumOptionData? = null,

    val accountingRuleOptions: kotlin.collections.List<EnumOptionData>? = null,

    val advancedPaymentAllocationFutureInstallmentAllocationRules: kotlin.collections.List<EnumOptionData>? = null,

    val advancedPaymentAllocationTransactionTypes: kotlin.collections.List<EnumOptionData>? = null,

    val advancedPaymentAllocationTypes: kotlin.collections.List<EnumOptionData>? = null,

    val allowApprovedDisbursedAmountsOverApplied: kotlin.Boolean? = null,

    val allowAttributeOverrides: LoanProductConfigurableAttributes? = null,

    val allowPartialPeriodInterestCalculation: kotlin.Boolean? = null,

    val allowVariableInstallments: kotlin.Boolean? = null,

    val amortizationType: EnumOptionData? = null,

    val amortizationTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val annualInterestRate: Double? = null,

    val canDefineInstallmentAmount: kotlin.Boolean? = null,

    val canUseForTopup: kotlin.Boolean? = null,

    val chargeOptions: kotlin.collections.List<ChargeData>? = null,

    val charges: kotlin.collections.List<ChargeData>? = null,

    @Contextual
    val closeDate: LocalDate? = null,

    val compoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    val currency: CurrencyData? = null,

    val currencyOptions: kotlin.collections.List<CurrencyData>? = null,

    val daysInMonthType: EnumOptionData? = null,

    val daysInMonthTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val daysInYearType: EnumOptionData? = null,

    val daysInYearTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val defaultDifferentialLendingRate: Double? = null,

    val delinquencyBucket: DelinquencyBucketData? = null,

    val delinquencyBucketOptions: kotlin.collections.List<DelinquencyBucketData>? = null,

    val description: kotlin.String? = null,

    val disableScheduleExtensionForDownPayment: kotlin.Boolean? = null,

    val disallowExpectedDisbursements: kotlin.Boolean? = null,

    @Contextual
    val disbursedAmountPercentageForDownPayment: Double? = null,

    val dueDaysForRepaymentEvent: kotlin.Int? = null,

    val enableAutoRepaymentForDownPayment: kotlin.Boolean? = null,

    val enableDownPayment: kotlin.Boolean? = null,

    val enableInstallmentLevelDelinquency: kotlin.Boolean? = null,

    val equalAmortization: kotlin.Boolean? = null,

    val externalId: kotlin.String? = null,

    val feeToIncomeAccountMappings: kotlin.collections.List<ChargeToGLAccountMapper>? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val floatingInterestRateCalculationAllowed: kotlin.Boolean? = null,

    val floatingRateId: kotlin.Int? = null,

    val floatingRateName: kotlin.String? = null,

    val floatingRateOptions: kotlin.collections.List<FloatingRateData>? = null,

    val fundId: kotlin.Long? = null,

    val fundName: kotlin.String? = null,

    val fundOptions: kotlin.collections.List<FundData>? = null,

    val graceOnArrearsAgeing: kotlin.Int? = null,

    val graceOnInterestCharged: kotlin.Int? = null,

    val graceOnInterestPayment: kotlin.Int? = null,

    val graceOnPrincipalPayment: kotlin.Int? = null,

    val holdGuaranteeFunds: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val inArrearsTolerance: Double? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val installmentAmountInMultiplesOf: kotlin.Int? = null,

    val interestCalculationPeriodType: EnumOptionData? = null,

    val interestCalculationPeriodTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val interestRateDifferential: Double? = null,

    val interestRateFrequencyType: EnumOptionData? = null,

    val interestRateFrequencyTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val interestRatePerPeriod: Double? = null,

    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<LoanProductBorrowerCycleVariationData>? = null,

    val interestRecalculationCompoundingTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestRecalculationData: LoanProductInterestRecalculationData? = null,

    val interestRecalculationDayOfWeekTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestRecalculationEnabled: kotlin.Boolean? = null,

    val interestRecalculationFrequencyTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestRecalculationNthDayTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestType: EnumOptionData? = null,

    val interestTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val isAllowPartialPeriodInterestCalculation: kotlin.Boolean? = null,

    val isEqualAmortization: kotlin.Boolean? = null,

    val isFloatingInterestRateCalculationAllowed: kotlin.Boolean? = null,

    val isInterestRecalculationEnabled: kotlin.Boolean? = null,

    val isLinkedToFloatingInterestRates: kotlin.Boolean? = null,

    val isRatesEnabled: kotlin.Boolean? = null,

    val linkedToFloatingInterestRates: kotlin.Boolean? = null,

    val loanProductConfigurableAttributes: LoanProductConfigurableAttributes? = null,

    val loanScheduleProcessingType: EnumOptionData? = null,

    val loanScheduleProcessingTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val loanScheduleType: EnumOptionData? = null,

    val loanScheduleTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val maxDifferentialLendingRate: Double? = null,

    @Contextual
    val maxInterestRatePerPeriod: Double? = null,

    val maxNumberOfRepayments: kotlin.Int? = null,

    @Contextual
    val maxPrincipal: Double? = null,

    val maxTrancheCount: kotlin.Int? = null,

    val maximumGap: kotlin.Int? = null,

    @Contextual
    val minDifferentialLendingRate: Double? = null,

    @Contextual
    val minInterestRatePerPeriod: Double? = null,

    val minNumberOfRepayments: kotlin.Int? = null,

    @Contextual
    val minPrincipal: Double? = null,

    val minimumDaysBetweenDisbursalAndFirstRepayment: kotlin.Int? = null,

    val minimumGap: kotlin.Int? = null,

    val multiDisburseLoan: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<LoanProductBorrowerCycleVariationData>? = null,

    val numberOfRepayments: kotlin.Int? = null,

    @Contextual
    val outstandingLoanBalance: Double? = null,

    val overAppliedCalculationType: kotlin.String? = null,

    val overAppliedNumber: kotlin.Int? = null,

    val overDueDaysForRepaymentEvent: kotlin.Int? = null,

    val overdueDaysForNPA: kotlin.Int? = null,

    val paymentAllocation: kotlin.collections.List<AdvancedPaymentData>? = null,

    val paymentChannelToFundSourceMappings: kotlin.collections.List<PaymentTypeToGLAccountMapper>? = null,

    val paymentTypeOptions: kotlin.collections.List<PaymentTypeData>? = null,

    val penaltyOptions: kotlin.collections.List<ChargeData>? = null,

    val penaltyToIncomeAccountMappings: kotlin.collections.List<ChargeToGLAccountMapper>? = null,

    val preClosureInterestCalculationStrategyOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val principal: Double? = null,

    @Contextual
    val principalThresholdForLastInstallment: Double? = null,

    val principalVariationsForBorrowerCycle: kotlin.collections.List<LoanProductBorrowerCycleVariationData>? = null,

    val productGuaranteeData: LoanProductGuaranteeData? = null,

    val rateOptions: kotlin.collections.List<RateData>? = null,

    val rates: kotlin.collections.List<RateData>? = null,

    val ratesEnabled: kotlin.Boolean? = null,

    val recurringMoratoriumOnPrincipalPeriods: kotlin.Int? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: EnumOptionData? = null,

    val repaymentFrequencyTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val repaymentStartDateType: EnumOptionData? = null,

    val repaymentStartDateTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val rescheduleStrategyTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val shortName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val status: kotlin.String? = null,

    val syncExpectedWithDisbursementDate: kotlin.Boolean? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

    val transactionProcessingStrategyName: kotlin.String? = null,

    val transactionProcessingStrategyOptions: kotlin.collections.List<TransactionProcessingStrategyData>? = null,

    val useBorrowerCycle: kotlin.Boolean? = null,

    val valueConditionTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

)
