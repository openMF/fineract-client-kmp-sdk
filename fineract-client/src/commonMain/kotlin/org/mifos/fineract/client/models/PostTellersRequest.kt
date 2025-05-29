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
 * PostTellersRequest
 *
 * @param dateFormat
 * @param description
 * @param locale
 * @param name
 * @param officeId
 * @param startDate
 * @param status
 */

@Serializable
data class PostTellersRequest(

    val dateFormat: kotlin.String? = null,

    val description: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val status: PostTellersRequest.Status? = null,

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
