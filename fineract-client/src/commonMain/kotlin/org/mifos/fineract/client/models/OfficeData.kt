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
 * @param dateFormat
 * @param externalId
 * @param hierarchy
 * @param id
 * @param locale
 * @param name
 * @param nameDecorated
 * @param openingDate
 * @param parentId
 * @param parentName
 * @param rowIndex
 */

@Serializable
data class OfficeData(

    val dateFormat: kotlin.String? = null,

    val externalId: ExternalId? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val nameDecorated: kotlin.String? = null,

    @Contextual
    val openingDate: LocalDate? = null,

    val parentId: kotlin.Long? = null,

    val parentName: kotlin.String? = null,

    val rowIndex: kotlin.Int? = null,

)
