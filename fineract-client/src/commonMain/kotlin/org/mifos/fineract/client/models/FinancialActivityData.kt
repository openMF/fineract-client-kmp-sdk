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
 * @param id
 * @param mappedGLAccountType
 * @param name
 */

@Serializable
data class FinancialActivityData(

    val id: kotlin.Int? = null,

    val mappedGLAccountType: FinancialActivityData.MappedGLAccountType? = null,

    val name: kotlin.String? = null,

) {

    /**
     *
     *
     * Values: ASSET,LIABILITY,EQUITY,INCOME,EXPENSE
     */
    @Serializable
    enum class MappedGLAccountType(val value: kotlin.String) {
        @SerialName("ASSET")
        ASSET("ASSET"),

        @SerialName("LIABILITY")
        LIABILITY("LIABILITY"),

        @SerialName("EQUITY")
        EQUITY("EQUITY"),

        @SerialName("INCOME")
        INCOME("INCOME"),

        @SerialName("EXPENSE")
        EXPENSE("EXPENSE"),
    }
}
