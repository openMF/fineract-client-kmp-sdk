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
 * GetTemplatesResponse
 *
 * @param entity
 * @param id
 * @param mappers
 * @param name
 * @param text
 * @param type
 */

@Serializable
data class GetTemplatesResponse(

    val entity: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val mappers: kotlin.collections.List<TemplateMapper>? = null,

    val name: kotlin.String? = null,

    val text: kotlin.String? = null,

    val type: kotlin.Long? = null,

)
