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
 * @param children
 * @param externalId
 * @param hierarchy
 * @param id
 * @param name
 * @param new
 * @param openingDate
 * @param openingLocalDate
 * @param parent
 */

@Serializable
data class Office(

    val children: kotlin.collections.List<Office>? = null,

    val externalId: ExternalId? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    @Contextual
    val openingDate: LocalDate? = null,

    @Contextual
    val openingLocalDate: LocalDate? = null,

    val parent: Office? = null,

)
