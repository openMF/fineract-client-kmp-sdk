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
 * @param endDate
 * @param id
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param new
 * @param taxComponent
 * @param taxGroup
 */

@Serializable
data class TaxGroupMappings(

    val createdBy: kotlin.Long? = null,

    @Contextual
    val createdDate: LocalDateTime? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val lastModifiedBy: kotlin.Long? = null,

    @Contextual
    val lastModifiedDate: LocalDateTime? = null,

    val new: kotlin.Boolean? = null,

    val taxComponent: TaxComponent? = null,

    val taxGroup: TaxGroup? = null,

)
