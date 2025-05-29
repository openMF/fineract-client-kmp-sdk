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
 * GetEntityDatatableChecksResponse
 *
 * @param datatableName
 * @param entity
 * @param id
 * @param order
 * @param productId
 * @param productName
 * @param status
 * @param systemDefined
 */

@Serializable
data class GetEntityDatatableChecksResponse(

    val datatableName: kotlin.String? = null,

    val entity: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val order: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

    val status: EnumOptionData? = null,

    val systemDefined: kotlin.Boolean? = null,

)
