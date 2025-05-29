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
 * PostDataTablesRequest
 *
 * @param apptableName
 * @param columns
 * @param datatableName
 * @param entitySubType
 * @param multiRow Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.
 */

@Serializable
data class PostDataTablesRequest(

    val apptableName: kotlin.String,

    val columns: kotlin.collections.List<PostColumnHeaderData>,

    val datatableName: kotlin.String,

    val entitySubType: kotlin.String? = null,

    val multiRow: kotlin.Boolean? = null,

)
