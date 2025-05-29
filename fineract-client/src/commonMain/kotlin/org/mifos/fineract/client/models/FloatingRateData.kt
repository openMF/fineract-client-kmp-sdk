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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param active
 * @param baseLendingRate
 * @param createdBy
 * @param createdOn
 * @param id
 * @param modifiedBy
 * @param modifiedOn
 * @param name
 * @param ratePeriods
 */

@Serializable
data class FloatingRateData(

    val active: kotlin.Boolean? = null,

    val baseLendingRate: kotlin.Boolean? = null,

    val createdBy: kotlin.String? = null,

    @Contextual
    val createdOn: LocalDateTime? = null,

    val id: kotlin.Long? = null,

    val modifiedBy: kotlin.String? = null,

    @Contextual
    val modifiedOn: LocalDateTime? = null,

    val name: kotlin.String? = null,

    val ratePeriods: kotlin.collections.List<FloatingRatePeriodData>? = null,

)
