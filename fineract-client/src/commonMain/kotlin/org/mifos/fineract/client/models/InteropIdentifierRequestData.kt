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
 * @param accountId
 * @param idType
 * @param idValue
 * @param subIdOrType
 */

@Serializable
data class InteropIdentifierRequestData(

    val accountId: kotlin.String,

    val idType: InteropIdentifierRequestData.IdType,

    val idValue: kotlin.String,

    val subIdOrType: kotlin.String? = null,

) {

    /**
     *
     *
     * Values: MSISDN,EMAIL,PERSONAL_ID,BUSINESS,DEVICE,ACCOUNT_ID,IBAN,ALIAS
     */
    @Serializable
    enum class IdType(val value: kotlin.String) {
        @SerialName("MSISDN")
        MSISDN("MSISDN"),

        @SerialName("EMAIL")
        EMAIL("EMAIL"),

        @SerialName("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @SerialName("BUSINESS")
        BUSINESS("BUSINESS"),

        @SerialName("DEVICE")
        DEVICE("DEVICE"),

        @SerialName("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @SerialName("IBAN")
        IBAN("IBAN"),

        @SerialName("ALIAS")
        ALIAS("ALIAS"),
    }
}
