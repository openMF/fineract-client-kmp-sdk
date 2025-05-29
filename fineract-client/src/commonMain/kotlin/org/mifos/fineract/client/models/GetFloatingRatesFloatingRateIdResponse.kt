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
 * GetFloatingRatesFloatingRateIdResponse
 *
 * @param createdBy
 * @param createdOn
 * @param id
 * @param isActive
 * @param isBaseLendingRate
 * @param modifiedBy
 * @param modifiedOn
 * @param name
 * @param ratePeriods
 */

@Serializable
data class GetFloatingRatesFloatingRateIdResponse(

    val createdBy: kotlin.String? = null,

    val createdOn: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val isBaseLendingRate: kotlin.Boolean? = null,

    val modifiedBy: kotlin.String? = null,

    val modifiedOn: kotlin.String? = null,

    val name: kotlin.String? = null,

    val ratePeriods: kotlin.collections.Set<GetFloatingRatesRatePeriods>? = null,

)
