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
 * GetSearchResponse
 *
 * @param entityAccountNo
 * @param entityExternalId
 * @param entityId
 * @param entityName
 * @param entityStatus
 * @param entityType
 * @param parentId
 * @param parentName
 */

@Serializable
data class GetSearchResponse(

    val entityAccountNo: kotlin.Long? = null,

    val entityExternalId: kotlin.String? = null,

    val entityId: kotlin.Long? = null,

    val entityName: kotlin.String? = null,

    val entityStatus: EnumOptionData? = null,

    val entityType: kotlin.String? = null,

    val parentId: kotlin.Long? = null,

    val parentName: kotlin.String? = null,

)
