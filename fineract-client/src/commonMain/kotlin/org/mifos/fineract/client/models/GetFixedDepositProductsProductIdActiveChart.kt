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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param chartSlabs
 * @param fromDate
 * @param id
 * @param periodTypes
 * @param savingsProductId
 * @param savingsProductName
 */

@Serializable
data class GetFixedDepositProductsProductIdActiveChart(

    val chartSlabs: kotlin.collections.Set<GetFixedDepositProductsProductIdChartSlabs>? = null,

    @Contextual
    val fromDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val periodTypes: kotlin.collections.Set<GetFixedDepositProductsProductIdPeriodType>? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

)
