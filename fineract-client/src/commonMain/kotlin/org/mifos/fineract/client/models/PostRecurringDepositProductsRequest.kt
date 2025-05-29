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
 * PostRecurringDepositProductsRequest
 *
 * @param accountingRule
 * @param charts
 * @param currencyCode
 * @param depositAmount
 * @param description
 * @param digitsAfterDecimal
 * @param inMultiplesOf
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param locale
 * @param maxDepositAmount
 * @param maxDepositTerm
 * @param maxDepositTermTypeId
 * @param minDepositAmount
 * @param minDepositTerm
 * @param minDepositTermTypeId
 * @param name
 * @param preClosurePenalApplicable
 * @param preClosurePenalInterest
 * @param preClosurePenalInterestOnTypeId
 * @param recurringDepositFrequency
 * @param recurringDepositFrequencyTypeId
 * @param shortName
 */

@Serializable
data class PostRecurringDepositProductsRequest(

    val accountingRule: kotlin.Int? = null,

    val charts: kotlin.collections.Set<PostRecurringDepositProductsCharts>? = null,

    val currencyCode: kotlin.String? = null,

    val depositAmount: kotlin.Long? = null,

    val description: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val interestCalculationDaysInYearType: kotlin.Int? = null,

    val interestCalculationType: kotlin.Int? = null,

    val interestCompoundingPeriodType: kotlin.Int? = null,

    val interestPostingPeriodType: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val maxDepositAmount: kotlin.Long? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermTypeId: kotlin.Int? = null,

    val minDepositAmount: kotlin.Long? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermTypeId: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val preClosurePenalInterest: kotlin.Double? = null,

    val preClosurePenalInterestOnTypeId: kotlin.Int? = null,

    val recurringDepositFrequency: kotlin.Int? = null,

    val recurringDepositFrequencyTypeId: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

)
