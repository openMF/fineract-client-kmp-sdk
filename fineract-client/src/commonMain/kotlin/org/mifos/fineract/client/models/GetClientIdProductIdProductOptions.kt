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
 *
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
 * @param lockinPeriod
 * @param lockinPeriodEnum
 * @param lockinPeriodFrequencyTypeOptions
 * @param marketPrice
 * @param maximumShares
 * @param minimumActivePeriod
 * @param minimumActivePeriodForDividendsTypeEnum
 * @param minimumActivePeriodFrequencyTypeOptions
 * @param minimumShares
 * @param name
 * @param norminalShares
 * @param shareCapital
 * @param shortName
 * @param totalShares
 * @param totalSharesIssued
 * @param unitPrice
 */

@Serializable
data class GetClientIdProductIdProductOptions(

    @Contextual
    val accountingMappingOptions: kotlin.Any? = null,

    val accountingMappings: GetClientIdProductIdAccountingMappings? = null,

    val accountingRule: GetShareAccountsClientIdProductIdAccountingRule? = null,

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val chargeOptions: GetShareAccountsChargeOptions? = null,

    val charges: kotlin.String? = null,

    val currency: GetShareAccountsCurrency? = null,

    val currencyOptions: GetShareAccountsCurrency? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Int? = null,

    val lockinPeriod: kotlin.Int? = null,

    val lockinPeriodEnum: GetShareAccountsClientIdProductIdLockPeriodTypeEnum? = null,

    val lockinPeriodFrequencyTypeOptions: GetClientIdProductIdLockinPeriodFrequencyTypeOptions? = null,

    val marketPrice: kotlin.String? = null,

    val maximumShares: kotlin.Int? = null,

    val minimumActivePeriod: kotlin.Int? = null,

    val minimumActivePeriodForDividendsTypeEnum: GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum? = null,

    val minimumActivePeriodFrequencyTypeOptions: GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions? = null,

    val minimumShares: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val norminalShares: kotlin.Int? = null,

    val shareCapital: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

    val totalShares: kotlin.Int? = null,

    val totalSharesIssued: kotlin.Int? = null,

    val unitPrice: kotlin.Int? = null,

)
