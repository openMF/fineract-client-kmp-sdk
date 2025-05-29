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
 * @param `operator`
 * @param propertyValues
 */

@Serializable
data class FilterData(

    val operator: FilterData.Operator? = null,

    val propertyValues: kotlin.collections.List<kotlin.String>? = null,

) {

    /**
     *
     *
     * Values: EQ,NEQ,GTE,LTE,GT,LT,LIKE,NLIKE,BTW,NBTW,IN,NIN,NULL,NNULL
     */
    @Serializable
    enum class Operator(val value: kotlin.String) {
        @SerialName("EQ")
        EQ("EQ"),

        @SerialName("NEQ")
        NEQ("NEQ"),

        @SerialName("GTE")
        GTE("GTE"),

        @SerialName("LTE")
        LTE("LTE"),

        @SerialName("GT")
        GT("GT"),

        @SerialName("LT")
        LT("LT"),

        @SerialName("LIKE")
        LIKE("LIKE"),

        @SerialName("NLIKE")
        NLIKE("NLIKE"),

        @SerialName("BTW")
        BTW("BTW"),

        @SerialName("NBTW")
        NBTW("NBTW"),

        @SerialName("IN")
        IN("IN"),

        @SerialName("NIN")
        NIN("NIN"),

        @SerialName("NULL")
        NULL("NULL"),

        @SerialName("NNULL")
        NNULL("NNULL"),
    }
}
