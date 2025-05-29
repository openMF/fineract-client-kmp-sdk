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
 *
 *
 * @param amount
 * @param attributeName
 * @param attributeValue
 * @param attributeValueDesc
 * @param conditionType
 * @param entityType
 * @param id
 * @param incentiveType
 */

@Serializable
data class GetInterestRateChartsChartIdChartSlabsIncentives(

    val amount: kotlin.Float? = null,

    val attributeName: GetInterestRateChartsChartIdChartSlabsAttributeName? = null,

    val attributeValue: kotlin.Int? = null,

    val attributeValueDesc: kotlin.String? = null,

    val conditionType: GetInterestRateChartsChartIdChartSlabsConditionType? = null,

    val entityType: GetInterestRateChartsChartIdChartSlabsEntityType? = null,

    val id: kotlin.Long? = null,

    val incentiveType: GetInterestRateChartsChartIdChartSlabsIncentiveType? = null,

)
