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
 * @param approveUser
 * @param createdBy
 * @param createdDate
 * @param id
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param name
 * @param new
 * @param percentage
 * @param productApply
 */

@Serializable
data class Rate(

    val active: kotlin.Boolean? = null,

    val approveUser: AppUser? = null,

    val createdBy: kotlin.Long? = null,

    @Contextual
    val createdDate: LocalDateTime? = null,

    val id: kotlin.Long? = null,

    val lastModifiedBy: kotlin.Long? = null,

    @Contextual
    val lastModifiedDate: LocalDateTime? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    @Contextual
    val percentage: Double? = null,

    val productApply: kotlin.Int? = null,

)
