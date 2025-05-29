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
 * GetSavingsProductsResponse
 *
 * @param accountingRule
 * @param currency
 * @param description
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param name
 * @param nominalAnnualInterestRate
 * @param shortName
 * @param withdrawalFeeForTransfers
 */

@Serializable
data class GetSavingsProductsResponse(

    val accountingRule: GetSavingsProductsAccountingRule? = null,

    val currency: GetSavingsCurrency? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Int? = null,

    val interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetSavingsProductsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType? = null,

    val name: kotlin.String? = null,

    @Contextual
    val nominalAnnualInterestRate: Double? = null,

    val shortName: kotlin.String? = null,

    val withdrawalFeeForTransfers: kotlin.Boolean? = null,

)
