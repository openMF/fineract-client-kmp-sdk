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
 * GetLoanProductsResponse
 *
 * @param accountingRule
 * @param amortizationType
 * @param annualInterestRate
 * @param currency
 * @param daysInMonthType
 * @param daysInYearType
 * @param endDate
 * @param fixedPrincipalPercentagePerInstallment
 * @param id
 * @param includeInBorrowerCycle
 * @param interestCalculationPeriodType
 * @param interestRateFrequencyType
 * @param interestRatePerPeriod
 * @param interestRateVariationsForBorrowerCycle
 * @param interestRecalculationData
 * @param interestType
 * @param isInterestRecalculationEnabled
 * @param maxNumberOfRepayments
 * @param maxPrincipal
 * @param minNumberOfRepayments
 * @param minPrincipal
 * @param name
 * @param numberOfRepaymentVariationsForBorrowerCycle
 * @param numberOfRepayments
 * @param principal
 * @param principalThresholdForLastInstalment
 * @param principalVariationsForBorrowerCycle
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentStartDateType
 * @param shortName
 * @param startDate
 * @param status
 * @param transactionProcessingStrategy
 * @param transactionProcessingStrategyName
 * @param useBorrowerCycle
 */

@Serializable
data class GetLoanProductsResponse(

    val accountingRule: GetLoanProductsAccountingRule? = null,

    val amortizationType: GetLoanProductsAmortizationType? = null,

    val annualInterestRate: kotlin.Double? = null,

    val currency: GetLoanProductsCurrency? = null,

    val daysInMonthType: GetLoansProductsDaysInMonthType? = null,

    val daysInYearType: GetLoansProductsDaysInYearType? = null,

    @Contextual
    val endDate: LocalDate? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val id: kotlin.Long? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val interestCalculationPeriodType: GetLoansProductsInterestCalculationPeriodType? = null,

    val interestRateFrequencyType: GetLoanProductsInterestRateFrequencyType? = null,

    val interestRatePerPeriod: kotlin.Double? = null,

    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val interestRecalculationData: GetLoanProductsInterestRecalculationData? = null,

    val interestType: GetLoanProductsInterestType? = null,

    val isInterestRecalculationEnabled: kotlin.Boolean? = null,

    val maxNumberOfRepayments: kotlin.Int? = null,

    val maxPrincipal: kotlin.Double? = null,

    val minNumberOfRepayments: kotlin.Int? = null,

    val minPrincipal: kotlin.Double? = null,

    val name: kotlin.String? = null,

    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Double? = null,

    val principalThresholdForLastInstalment: kotlin.Int? = null,

    val principalVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: GetLoanProductsRepaymentFrequencyType? = null,

    val repaymentStartDateType: GetLoanProductsRepaymentStartDateType? = null,

    val shortName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val status: kotlin.String? = null,

    val transactionProcessingStrategy: kotlin.String? = null,

    val transactionProcessingStrategyName: kotlin.String? = null,

    val useBorrowerCycle: kotlin.Boolean? = null,

)
