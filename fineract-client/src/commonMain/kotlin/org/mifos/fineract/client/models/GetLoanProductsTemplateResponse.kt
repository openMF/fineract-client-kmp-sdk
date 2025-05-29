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
 * GetLoanProductsTemplateResponse
 *
 * @param accountingMappingOptions
 * @param accountingRule
 * @param accountingRuleOptions
 * @param advancedPaymentAllocationFutureInstallmentAllocationRules
 * @param advancedPaymentAllocationTransactionTypes
 * @param advancedPaymentAllocationTypes
 * @param amortizationType
 * @param amortizationTypeOptions
 * @param chargeOptions
 * @param currency
 * @param currencyOptions
 * @param daysInMonthType
 * @param daysInMonthTypeOptions
 * @param daysInYearType
 * @param daysInYearTypeOptions
 * @param includeInBorrowerCycle
 * @param interestCalculationPeriodType
 * @param interestCalculationPeriodTypeOptions
 * @param interestRateFrequencyType
 * @param interestRateFrequencyTypeOptions
 * @param interestRateVariationsForBorrowerCycle
 * @param interestRecalculationCompoundingTypeOptions
 * @param interestRecalculationData
 * @param interestRecalculationFrequencyTypeOptions
 * @param interestType
 * @param interestTypeOptions
 * @param isInterestRecalculationEnabled
 * @param loanScheduleProcessingTypeOptions
 * @param loanScheduleTypeOptions
 * @param numberOfRepaymentVariationsForBorrowerCycle
 * @param paymentTypeOptions
 * @param preClosureInterestCalculationStrategyOptions
 * @param principalVariationsForBorrowerCycle
 * @param repaymentFrequencyType
 * @param repaymentFrequencyTypeOptions
 * @param repaymentStartDateTypeOptions
 * @param rescheduleStrategyTypeOptions
 * @param transactionProcessingStrategyOptions
 * @param useBorrowerCycle
 * @param valueConditionTypeOptions
 */

@Serializable
data class GetLoanProductsTemplateResponse(

    val accountingMappingOptions: GetLoanProductsAccountingMappingOptions? = null,

    val accountingRule: GetLoanProductsAccountingRule? = null,

    val accountingRuleOptions: kotlin.collections.Set<GetLoanProductsAccountingRule>? = null,

    val advancedPaymentAllocationFutureInstallmentAllocationRules: kotlin.collections.List<EnumOptionData>? = null,

    val advancedPaymentAllocationTransactionTypes: kotlin.collections.List<EnumOptionData>? = null,

    val advancedPaymentAllocationTypes: kotlin.collections.List<EnumOptionData>? = null,

    val amortizationType: GetLoanProductsAmortizationType? = null,

    val amortizationTypeOptions: kotlin.collections.Set<GetLoanProductsAmortizationType>? = null,

    val chargeOptions: kotlin.collections.Set<GetLoanProductsChargeOptions>? = null,

    val currency: GetLoanProductsTemplateCurrency? = null,

    val currencyOptions: kotlin.collections.Set<GetLoanProductsCurrencyOptions>? = null,

    val daysInMonthType: GetLoansProductsDaysInMonthTemplateType? = null,

    val daysInMonthTypeOptions: kotlin.collections.Set<GetLoansProductsDaysInMonthTemplateType>? = null,

    val daysInYearType: GetLoanProductsDaysInYearTemplateType? = null,

    val daysInYearTypeOptions: kotlin.collections.Set<GetLoanProductsInterestTemplateType>? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val interestCalculationPeriodType: GetLoansProductsInterestCalculationPeriodType? = null,

    val interestCalculationPeriodTypeOptions: kotlin.collections.Set<GetLoansProductsInterestCalculationPeriodType>? = null,

    val interestRateFrequencyType: GetLoanProductsInterestRateTemplateFrequencyType? = null,

    val interestRateFrequencyTypeOptions: kotlin.collections.Set<GetLoanProductsInterestRateTemplateFrequencyType>? = null,

    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val interestRecalculationCompoundingTypeOptions: kotlin.collections.Set<GetLoanProductsInterestRecalculationCompoundingType>? = null,

    val interestRecalculationData: GetLoanProductsInterestRecalculationTemplateData? = null,

    val interestRecalculationFrequencyTypeOptions: kotlin.collections.Set<GetLoanProductsInterestRecalculationCompoundingFrequencyType>? = null,

    val interestType: GetLoanProductsInterestTemplateType? = null,

    val interestTypeOptions: kotlin.collections.Set<GetLoanProductsInterestTemplateType>? = null,

    val isInterestRecalculationEnabled: kotlin.Boolean? = null,

    val loanScheduleProcessingTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val loanScheduleTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val paymentTypeOptions: kotlin.collections.Set<GetLoanProductsPaymentTypeOptions>? = null,

    val preClosureInterestCalculationStrategyOptions: kotlin.collections.Set<GetLoanProductsPreClosureInterestCalculationStrategy>? = null,

    val principalVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val repaymentFrequencyType: GetLoanProductsRepaymentTemplateFrequencyType? = null,

    val repaymentFrequencyTypeOptions: kotlin.collections.Set<GetLoanProductsRepaymentTemplateFrequencyType>? = null,

    val repaymentStartDateTypeOptions: kotlin.collections.Set<GetLoanProductsRepaymentStartDateType>? = null,

    val rescheduleStrategyTypeOptions: kotlin.collections.Set<GetLoanProductsRescheduleStrategyType>? = null,

    val transactionProcessingStrategyOptions: kotlin.collections.Set<GetLoanProductsTransactionProcessingStrategyOptions>? = null,

    val useBorrowerCycle: kotlin.Boolean? = null,

    val valueConditionTypeOptions: kotlin.collections.Set<GetLoanProductsValueConditionTypeOptions>? = null,

)
