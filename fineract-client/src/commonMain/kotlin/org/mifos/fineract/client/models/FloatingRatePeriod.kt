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
 * @param differentialToBaseLendingRate
 * @param floatingRate
 * @param fromDate
 * @param id
 * @param interestRate
 * @param new
 */

@Serializable
data class FloatingRatePeriod(

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

    val differentialToBaseLendingRate: kotlin.Boolean? = null,

    val floatingRate: FloatingRate? = null,

    @Contextual
    val fromDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val interestRate: Double? = null,

    val new: kotlin.Boolean? = null,

)
