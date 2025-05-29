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
 * @param id
 * @param name
 * @param new
 * @param systemDefined
 * @param propertyValues
 */

@Serializable
data class Code(

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val systemDefined: kotlin.Boolean? = null,

    val propertyValues: kotlin.collections.Set<CodeValue>? = null,

)
