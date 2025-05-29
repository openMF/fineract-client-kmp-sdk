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
 * GetRecurringDepositProductsProductIdResponse
 *
 * @param accountingMappings
 * @param activeChart
 * @param currency
 * @param description
 * @param feeToIncomeAccountMappings
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param maxDepositTerm
 * @param maxDepositTermType
 * @param minDepositTerm
 * @param minDepositTermType
 * @param name
 * @param penaltyToIncomeAccountMappings
 * @param preClosurePenalApplicable
 * @param preClosurePenalInterest
 * @param preClosurePenalInterestOnType
 * @param recurringDepositFrequency
 * @param recurringDepositFrequencyType
 * @param shortName
 */

@Serializable
data class GetRecurringDepositProductsProductIdResponse(

    val accountingMappings: GetRecurringDepositProductsProductIdAccountingMappings? = null,

    val activeChart: GetRecurringDepositProductsProductIdActiveChart? = null,

    val currency: GetRecurringDepositProductsProductIdCurrency? = null,

    val description: kotlin.String? = null,

    val feeToIncomeAccountMappings: kotlin.collections.Set<GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings>? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetRecurringDepositProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetRecurringDepositProductsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetRecurringDepositProductsProductIdInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetRecurringDepositProductsInterestPostingPeriodType? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetRecurringDepositProductsProductIdMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetRecurringDepositProductsProductIdMinDepositTermType? = null,

    val name: kotlin.String? = null,

    val penaltyToIncomeAccountMappings: kotlin.collections.Set<GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings>? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val preClosurePenalInterest: kotlin.Double? = null,

    val preClosurePenalInterestOnType: GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType? = null,

    val recurringDepositFrequency: kotlin.Int? = null,

    val recurringDepositFrequencyType: GetRecurringDepositProductsRecurringDepositFrequencyType? = null,

    val shortName: kotlin.String? = null,

)
