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
 * PostProductsTypeRequest
 *
 * @param accountingRule
 * @param allowDividendCalculationForInactiveClients
 * @param chargesSelected
 * @param currencyCode
 * @param description
 * @param digitsAfterDecimal
 * @param inMultiplesOf
 * @param locale
 * @param lockinPeriodFrequency
 * @param lockinPeriodFrequencyType
 * @param marketPricePeriods
 * @param maximumShares
 * @param minimumActivePeriodForDividends
 * @param minimumShares
 * @param minimumactiveperiodFrequencyType
 * @param name
 * @param nominalShares
 * @param sharesIssued
 * @param shortName
 * @param totalShares
 * @param unitPrice
 */

@Serializable
data class PostProductsTypeRequest(

    val accountingRule: kotlin.Int? = null,

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val chargesSelected: kotlin.collections.Set<PostProductsChargesSelected>? = null,

    val currencyCode: kotlin.String? = null,

    val description: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val lockinPeriodFrequency: kotlin.Int? = null,

    val lockinPeriodFrequencyType: kotlin.Int? = null,

    val marketPricePeriods: kotlin.collections.Set<PostProductsMarketPricePeriods>? = null,

    val maximumShares: kotlin.Int? = null,

    val minimumActivePeriodForDividends: kotlin.Int? = null,

    val minimumShares: kotlin.Int? = null,

    val minimumactiveperiodFrequencyType: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val nominalShares: kotlin.Int? = null,

    val sharesIssued: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

    val totalShares: kotlin.Int? = null,

    val unitPrice: kotlin.Int? = null,

)
