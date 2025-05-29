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
 * @param description
 * @param disabled
 * @param glCode
 * @param id
 * @param manualEntriesAllowed
 * @param name
 * @param nameDecorated
 * @param tagId
 * @param type
 * @param usage
 */

@Serializable
data class GetProductsAssetAccountOptions(

    val description: kotlin.String? = null,

    val disabled: kotlin.Boolean? = null,

    val glCode: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val manualEntriesAllowed: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val nameDecorated: kotlin.String? = null,

    val tagId: GetProductsTagId? = null,

    val type: GetAssetType? = null,

    val usage: GetProductsLiabilityUsage? = null,

)
