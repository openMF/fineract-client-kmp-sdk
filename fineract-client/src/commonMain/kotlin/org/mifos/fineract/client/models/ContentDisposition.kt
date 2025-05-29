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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param creationDate
 * @param fileName
 * @param modificationDate
 * @param parameters
 * @param readDate
 * @param propertySize
 * @param type
 */

@Serializable
data class ContentDisposition(

    @Contextual
    val creationDate: LocalDateTime? = null,

    val fileName: kotlin.String? = null,

    @Contextual
    val modificationDate: LocalDateTime? = null,

    val parameters: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Contextual
    val readDate: LocalDateTime? = null,

    val propertySize: kotlin.Long? = null,

    val type: kotlin.String? = null,

)
