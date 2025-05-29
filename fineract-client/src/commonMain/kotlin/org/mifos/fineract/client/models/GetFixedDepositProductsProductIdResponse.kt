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
 * GetFixedDepositProductsProductIdResponse
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
 * @param shortName
 */

@Serializable
data class GetFixedDepositProductsProductIdResponse(

    val accountingMappings: GetFixedDepositProductsProductIdAccountingMappings? = null,

    val activeChart: GetFixedDepositProductsProductIdActiveChart? = null,

    val currency: GetFixedDepositProductsProductIdCurrency? = null,

    val description: kotlin.String? = null,

    val feeToIncomeAccountMappings: kotlin.collections.Set<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings>? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetFixedDepositProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetFixedDepositProductsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetFixedDepositProductsProductIdInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetFixedDepositProductsInterestPostingPeriodType? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetFixedDepositProductsProductIdMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetFixedDepositProductsProductIdMinDepositTermType? = null,

    val name: kotlin.String? = null,

    val penaltyToIncomeAccountMappings: kotlin.collections.Set<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings>? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val preClosurePenalInterest: kotlin.Double? = null,

    val preClosurePenalInterestOnType: GetFixedDepositProductsProductIdPreClosurePenalInterestOnType? = null,

    val shortName: kotlin.String? = null,

)
