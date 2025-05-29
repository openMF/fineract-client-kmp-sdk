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
 * @param createdBy
 * @param createdOn
 * @param fromDate
 * @param id
 * @param interestRate
 * @param isActive
 * @param isDifferentialToBaseLendingRate
 * @param modifiedBy
 * @param modifiedOn
 */

@Serializable
data class GetFloatingRatesRatePeriods(

    val createdBy: kotlin.String? = null,

    val createdOn: kotlin.String? = null,

    val fromDate: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interestRate: kotlin.Double? = null,

    val isActive: kotlin.Boolean? = null,

    val isDifferentialToBaseLendingRate: kotlin.Boolean? = null,

    val modifiedBy: kotlin.String? = null,

    val modifiedOn: kotlin.String? = null,

)
