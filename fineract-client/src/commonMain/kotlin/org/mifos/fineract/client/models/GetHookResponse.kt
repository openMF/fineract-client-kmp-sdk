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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetHookResponse
 *
 * @param config
 * @param createdAt
 * @param displayName
 * @param events
 * @param id
 * @param isActive
 * @param name
 * @param templateId
 * @param templateName
 * @param updatedAt
 */

@Serializable
data class GetHookResponse(

    val config: kotlin.collections.List<Field>? = null,

    @Contextual
    val createdAt: LocalDate? = null,

    val displayName: kotlin.String? = null,

    val events: kotlin.collections.List<Event>? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val templateId: kotlin.Long? = null,

    val templateName: kotlin.String? = null,

    @Contextual
    val updatedAt: LocalDate? = null,

)
