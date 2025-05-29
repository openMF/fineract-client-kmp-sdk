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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * GetTellersResponse
 *
 * @param creditAccountId
 * @param debitAccountId
 * @param id
 * @param name
 * @param officeId
 * @param officeName
 * @param startDate
 * @param status
 */

@Serializable
data class GetTellersResponse(

    val creditAccountId: kotlin.Long? = null,

    val debitAccountId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val status: GetTellersResponse.Status? = null,

) {

    /**
     *
     *
     * Values: INVALID,PENDING,ACTIVE,INACTIVE,CLOSED
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("PENDING")
        PENDING("PENDING"),

        @SerialName("ACTIVE")
        ACTIVE("ACTIVE"),

        @SerialName("INACTIVE")
        INACTIVE("INACTIVE"),

        @SerialName("CLOSED")
        CLOSED("CLOSED"),
    }
}
