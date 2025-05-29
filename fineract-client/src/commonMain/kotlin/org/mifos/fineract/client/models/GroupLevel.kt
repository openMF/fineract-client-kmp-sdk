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
 * @param center
 * @param group
 * @param id
 * @param levelName
 * @param new
 * @param parentId
 * @param recursable
 * @param superParent
 */

@Serializable
data class GroupLevel(

    val center: kotlin.Boolean? = null,

    val group: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val levelName: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val parentId: kotlin.Long? = null,

    val recursable: kotlin.Boolean? = null,

    val superParent: kotlin.Boolean? = null,

)
