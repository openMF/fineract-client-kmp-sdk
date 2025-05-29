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
 * GetProductsTypeProductIdResponse
 *
 * @param accountingMappingOptions
 * @param accountingMappings
 * @param accountingRule
 * @param allowDividendCalculationForInactiveClients
 * @param chargeOptions
 * @param charges
 * @param currency
 * @param currencyOptions
 * @param description
 * @param id
 * @param lockPeriodTypeEnum
 * @param lockinPeriod
 * @param lockinPeriodFrequencyTypeOptions
 * @param marketPrice
 * @param maximumShares
 * @param minimumActivePeriod
 * @param minimumActivePeriodForDividendsTypeEnum
 * @param minimumActivePeriodFrequencyTypeOptions
 * @param minimumShares
 * @param name
 * @param nominalShares
 * @param shareCapital
 * @param shortName
 * @param totalShares
 * @param totalSharesIssued
 * @param unitPrice
 */

@Serializable
data class GetProductsTypeProductIdResponse(

    val accountingMappingOptions: GetProductsAccountingMappingOptions? = null,

    val accountingMappings: GetProductsAccountingMappings? = null,

    val accountingRule: GetProductsAccountingRule? = null,

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val chargeOptions: kotlin.collections.Set<GetProductsCharges>? = null,

    val charges: kotlin.collections.Set<GetProductsCharges>? = null,

    val currency: GetProductsCurrency? = null,

    val currencyOptions: kotlin.collections.Set<GetChargesCurrency>? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val lockPeriodTypeEnum: GetLockPeriodTypeEnum? = null,

    val lockinPeriod: kotlin.Int? = null,

    val lockinPeriodFrequencyTypeOptions: kotlin.collections.Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>? = null,

    val marketPrice: kotlin.collections.Set<GetProductsMarketPrice>? = null,

    val maximumShares: kotlin.Int? = null,

    val minimumActivePeriod: kotlin.Int? = null,

    val minimumActivePeriodForDividendsTypeEnum: GetLockPeriodTypeEnum? = null,

    val minimumActivePeriodFrequencyTypeOptions: kotlin.collections.Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>? = null,

    val minimumShares: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val nominalShares: kotlin.Int? = null,

    val shareCapital: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

    val totalShares: kotlin.Int? = null,

    val totalSharesIssued: kotlin.Int? = null,

    val unitPrice: kotlin.Int? = null,

)
