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
 *
 *
 * @param details
 * @param effectiveFrom
 * @param effectiveTo
 * @param loan
 * @param owner
 * @param purchasePriceRatio
 * @param settlementDate
 * @param status
 * @param subStatus
 * @param transferExternalId
 * @param transferId
 */

@Serializable
data class ExternalTransferData(

    val details: ExternalTransferDataDetails? = null,

    @Contextual
    val effectiveFrom: LocalDate? = null,

    @Contextual
    val effectiveTo: LocalDate? = null,

    val loan: ExternalTransferLoanData? = null,

    val owner: ExternalTransferOwnerData? = null,

    val purchasePriceRatio: kotlin.String? = null,

    @Contextual
    val settlementDate: LocalDate? = null,

    val status: ExternalTransferData.Status? = null,

    val subStatus: ExternalTransferData.SubStatus? = null,

    val transferExternalId: kotlin.String? = null,

    val transferId: kotlin.Long? = null,

) {

    /**
     *
     *
     * Values: ACTIVE,DECLINED,PENDING,BUYBACK,CANCELLED
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName("ACTIVE")
        ACTIVE("ACTIVE"),

        @SerialName("DECLINED")
        DECLINED("DECLINED"),

        @SerialName("PENDING")
        PENDING("PENDING"),

        @SerialName("BUYBACK")
        BUYBACK("BUYBACK"),

        @SerialName("CANCELLED")
        CANCELLED("CANCELLED"),
    }

    /**
     *
     *
     * Values: BALANCE_ZERO,BALANCE_NEGATIVE,SAMEDAY_TRANSFERS,USER_REQUESTED,UNSOLD
     */
    @Serializable
    enum class SubStatus(val value: kotlin.String) {
        @SerialName("BALANCE_ZERO")
        BALANCE_ZERO("BALANCE_ZERO"),

        @SerialName("BALANCE_NEGATIVE")
        BALANCE_NEGATIVE("BALANCE_NEGATIVE"),

        @SerialName("SAMEDAY_TRANSFERS")
        SAMEDAY_TRANSFERS("SAMEDAY_TRANSFERS"),

        @SerialName("USER_REQUESTED")
        USER_REQUESTED("USER_REQUESTED"),

        @SerialName("UNSOLD")
        UNSOLD("UNSOLD"),
    }
}
