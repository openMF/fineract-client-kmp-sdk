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
 * @param createdBy
 * @param createdDate
 * @param createdDateTime
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param lastModifiedDateTime
 * @param active
 * @param baseLendingRate
 * @param floatingRatePeriods
 * @param id
 * @param name
 * @param new
 */

@Serializable
data class FloatingRate(

    val createdBy: kotlin.Long,

    @Contextual
    val createdDate: LocalDateTime,

    @Contextual
    val createdDateTime: LocalDateTime,

    val lastModifiedBy: kotlin.Long,

    @Contextual
    val lastModifiedDate: LocalDateTime,

    @Contextual
    val lastModifiedDateTime: LocalDateTime,

    val active: kotlin.Boolean? = null,

    val baseLendingRate: kotlin.Boolean? = null,

    val floatingRatePeriods: kotlin.collections.List<FloatingRatePeriod>? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

)
