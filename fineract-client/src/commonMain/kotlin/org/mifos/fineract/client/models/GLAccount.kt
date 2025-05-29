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
 * @param children
 * @param description
 * @param detailAccount
 * @param disabled
 * @param glCode
 * @param headerAccount
 * @param hierarchy
 * @param id
 * @param manualEntriesAllowed
 * @param name
 * @param new
 * @param parent
 * @param tagId
 * @param type
 * @param usage
 */

@Serializable
data class GLAccount(

    val children: kotlin.collections.List<GLAccount>? = null,

    val description: kotlin.String? = null,

    val detailAccount: kotlin.Boolean? = null,

    val disabled: kotlin.Boolean? = null,

    val glCode: kotlin.String? = null,

    val headerAccount: kotlin.Boolean? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val manualEntriesAllowed: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val parent: GLAccount? = null,

    val tagId: CodeValue? = null,

    val type: kotlin.Int? = null,

    val usage: kotlin.Int? = null,

)
