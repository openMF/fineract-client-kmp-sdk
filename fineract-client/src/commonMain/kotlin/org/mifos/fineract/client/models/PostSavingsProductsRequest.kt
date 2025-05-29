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
 * PostSavingsProductsRequest
 *
 * @param accountMappingForPayment
 * @param accountingRule
 * @param charges
 * @param currencyCode
 * @param description
 * @param digitsAfterDecimal
 * @param inMultiplesOf
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param locale
 * @param name
 * @param nominalAnnualInterestRate
 * @param shortName
 */

@Serializable
data class PostSavingsProductsRequest(

    val accountMappingForPayment: kotlin.String? = null,

    val accountingRule: kotlin.Int? = null,

    val charges: kotlin.collections.Set<PostSavingsCharges>? = null,

    val currencyCode: kotlin.String? = null,

    val description: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val interestCalculationDaysInYearType: kotlin.Int? = null,

    val interestCalculationType: kotlin.Int? = null,

    val interestCompoundingPeriodType: kotlin.Int? = null,

    val interestPostingPeriodType: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val nominalAnnualInterestRate: kotlin.Double? = null,

    val shortName: kotlin.String? = null,

)
