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
 * GetFixedDepositProductsResponse
 *
 * @param accountingRule
 * @param currency
 * @param description
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
 * @param nominalAnnualInterestRate
 * @param preClosurePenalApplicable
 * @param shortName
 */

@Serializable
data class GetFixedDepositProductsResponse(

    val accountingRule: GetFixedDepositProductsAccountingRule? = null,

    val currency: GetFixedDepositProductsCurrency? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetFixedDepositProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetFixedDepositProductsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetFixedDepositProductsInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetFixedDepositProductsInterestPostingPeriodType? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetFixedDepositProductsMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetFixedDepositProductsMinDepositTermType? = null,

    val name: kotlin.String? = null,

    val nominalAnnualInterestRate: kotlin.Double? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val shortName: kotlin.String? = null,

)
