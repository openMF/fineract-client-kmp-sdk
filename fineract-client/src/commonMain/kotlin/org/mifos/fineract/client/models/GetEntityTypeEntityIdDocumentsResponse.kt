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
 * GetEntityTypeEntityIdDocumentsResponse
 *
 * @param description
 * @param fileName
 * @param id
 * @param location
 * @param name
 * @param parentEntityId
 * @param parentEntityType
 * @param propertySize
 * @param storageType
 * @param type
 */

@Serializable
data class GetEntityTypeEntityIdDocumentsResponse(

    val description: kotlin.String? = null,

    val fileName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val location: kotlin.String? = null,

    val name: kotlin.String? = null,

    val parentEntityId: kotlin.Long? = null,

    val parentEntityType: kotlin.String? = null,

    val propertySize: kotlin.Long? = null,

    val storageType: kotlin.Int? = null,

    val type: kotlin.String? = null,

)
