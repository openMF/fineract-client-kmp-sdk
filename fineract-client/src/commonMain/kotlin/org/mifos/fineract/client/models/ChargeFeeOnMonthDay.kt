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
 * @param dayOfMonth
 * @param month
 * @param monthValue
 */

@Serializable
data class ChargeFeeOnMonthDay(

    val dayOfMonth: kotlin.Int? = null,

    val month: ChargeFeeOnMonthDay.Month? = null,

    val monthValue: kotlin.Int? = null,

) {

    /**
     *
     *
     * Values: JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
     */
    @Serializable
    enum class Month(val value: kotlin.String) {
        @SerialName("JANUARY")
        JANUARY("JANUARY"),

        @SerialName("FEBRUARY")
        FEBRUARY("FEBRUARY"),

        @SerialName("MARCH")
        MARCH("MARCH"),

        @SerialName("APRIL")
        APRIL("APRIL"),

        @SerialName("MAY")
        MAY("MAY"),

        @SerialName("JUNE")
        JUNE("JUNE"),

        @SerialName("JULY")
        JULY("JULY"),

        @SerialName("AUGUST")
        AUGUST("AUGUST"),

        @SerialName("SEPTEMBER")
        SEPTEMBER("SEPTEMBER"),

        @SerialName("OCTOBER")
        OCTOBER("OCTOBER"),

        @SerialName("NOVEMBER")
        NOVEMBER("NOVEMBER"),

        @SerialName("DECEMBER")
        DECEMBER("DECEMBER"),
    }
}
