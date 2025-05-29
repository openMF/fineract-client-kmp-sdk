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
 * @param disabled
 * @param enabled
 * @param id
 * @param name
 * @param new
 * @param permissions
 */

@Serializable
data class Role(

    val disabled: kotlin.Boolean? = null,

    val enabled: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val permissions: kotlin.collections.List<Permission>? = null,

)
