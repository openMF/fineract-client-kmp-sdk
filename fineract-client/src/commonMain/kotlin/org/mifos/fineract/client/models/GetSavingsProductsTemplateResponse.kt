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
 * GetSavingsProductsTemplateResponse
 *
 * @param accountMapping
 * @param accountingMappingOptions
 * @param accountingRule
 * @param accountingRuleOptions
 * @param chargeOptions
 * @param currency
 * @param currencyOptions
 * @param interestCalculationDaysInYearType
 * @param interestCalculationDaysInYearTypeOptions
 * @param interestCalculationType
 * @param interestCalculationTypeOptions
 * @param interestCompoundingPeriodType
 * @param interestCompoundingPeriodTypeOptions
 * @param interestPostingPeriodType
 * @param interestPostingPeriodTypeOptions
 * @param lockinPeriodFrequencyTypeOptions
 * @param paymentTypeOptions
 * @param withdrawalFeeTypeOptions
 */

@Serializable
data class GetSavingsProductsTemplateResponse(

    val accountMapping: GetSavingsCurrency? = null,

    val accountingMappingOptions: GetSavingsProductsAccountingMappingOptions? = null,

    val accountingRule: GetSavingsProductsTemplateAccountingRule? = null,

    val accountingRuleOptions: kotlin.collections.Set<GetSavingsProductsTemplateAccountingRule>? = null,

    val chargeOptions: kotlin.collections.Set<GetSavingsProductsChargeOptions>? = null,

    val currency: GetSavingsCurrency? = null,

    val currencyOptions: kotlin.collections.Set<GetSavingsCurrency>? = null,

    val interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationDaysInYearTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCalculationDaysInYearType>? = null,

    val interestCalculationType: GetSavingsProductsInterestCalculationType? = null,

    val interestCalculationTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCalculationType>? = null,

    val interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType? = null,

    val interestCompoundingPeriodTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCompoundingPeriodType>? = null,

    val interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType? = null,

    val interestPostingPeriodTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestPostingPeriodType>? = null,

    val lockinPeriodFrequencyTypeOptions: kotlin.collections.Set<GetSavingsProductsLockinPeriodFrequencyTypeOptions>? = null,

    val paymentTypeOptions: kotlin.collections.Set<GetSavingsProductsPaymentTypeOptions>? = null,

    val withdrawalFeeTypeOptions: kotlin.collections.Set<GetSavingsProductsWithdrawalFeeTypeOptions>? = null,

)
