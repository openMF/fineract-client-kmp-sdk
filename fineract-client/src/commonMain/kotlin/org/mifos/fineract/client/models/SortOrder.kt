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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param direction
 * @param `property`
 */

@Serializable
data class SortOrder(

    val direction: SortOrder.Direction? = null,

    val property: kotlin.String? = null,

) {

    /**
     *
     *
     * Values: ASC,DESC
     */
    @Serializable
    enum class Direction(val value: kotlin.String) {
        @SerialName("ASC")
        ASC("ASC"),

        @SerialName("DESC")
        DESC("DESC"),
    }
}
