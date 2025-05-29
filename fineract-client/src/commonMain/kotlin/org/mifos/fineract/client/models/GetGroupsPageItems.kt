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
 * @param active
 * @param hierarchy
 * @param id
 * @param name
 * @param officeId
 * @param officeName
 * @param status
 */

@Serializable
data class GetGroupsPageItems(

    val active: kotlin.Boolean? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val status: GetGroupsStatus? = null,

)
