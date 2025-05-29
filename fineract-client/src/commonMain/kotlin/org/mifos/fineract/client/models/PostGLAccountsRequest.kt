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
 * PostGLAccountsRequest
 *
 * @param description
 * @param glCode
 * @param manualEntriesAllowed
 * @param name
 * @param parentId
 * @param tagId
 * @param type
 * @param usage
 */

@Serializable
data class PostGLAccountsRequest(

    val description: kotlin.String? = null,

    val glCode: kotlin.String? = null,

    val manualEntriesAllowed: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val parentId: kotlin.Long? = null,

    val tagId: kotlin.Long? = null,

    val type: kotlin.Int? = null,

    val usage: kotlin.Int? = null,

)
