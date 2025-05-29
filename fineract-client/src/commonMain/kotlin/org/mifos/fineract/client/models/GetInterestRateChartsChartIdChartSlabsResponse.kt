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
 * GetInterestRateChartsChartIdChartSlabsResponse
 *
 * @param annualInterestRate
 * @param currency
 * @param description
 * @param fromPeriod
 * @param id
 * @param incentives
 * @param periodTypes
 * @param toPeriod
 */

@Serializable
data class GetInterestRateChartsChartIdChartSlabsResponse(

    val annualInterestRate: kotlin.Double? = null,

    val currency: GetInterestRateChartsCurrency? = null,

    val description: kotlin.String? = null,

    val fromPeriod: kotlin.Int? = null,

    val id: kotlin.Long? = null,

    val incentives: kotlin.collections.Set<GetInterestRateChartsChartIdChartSlabsIncentives>? = null,

    val periodTypes: GetInterestRateChartsTemplatePeriodTypes? = null,

    val toPeriod: kotlin.Int? = null,

)
