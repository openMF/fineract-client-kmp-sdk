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
 *
 *
 * @param dateValue
 * @param description
 * @param enabled
 * @param id
 * @param name
 * @param stringValue
 * @param trapDoor
 * @param `value`
 */

@Serializable
data class GlobalConfigurationPropertyData(

    @Contextual
    val dateValue: LocalDate? = null,

    val description: kotlin.String? = null,

    val enabled: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val stringValue: kotlin.String? = null,

    val trapDoor: kotlin.Boolean? = null,

    val value: kotlin.Long? = null,

)
