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
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountId
 * @param amount
 * @param transactionCode
 * @param transactionRole
 * @param transferCode
 * @param expiration
 * @param expirationLocalDate
 * @param extensionList
 * @param fspCommission
 * @param fspFee
 * @param geoCode
 * @param note
 * @param requestCode
 * @param transactionType
 */

@Serializable
data class InteropTransferRequestData(

    val accountId: kotlin.String,

    val amount: MoneyData,

    val transactionCode: kotlin.String,

    val transactionRole: InteropTransferRequestData.TransactionRole,

    val transferCode: kotlin.String,

    @Contextual
    val expiration: LocalDateTime? = null,

    @Contextual
    val expirationLocalDate: LocalDate? = null,

    val extensionList: kotlin.collections.List<ExtensionData>? = null,

    val fspCommission: MoneyData? = null,

    val fspFee: MoneyData? = null,

    val geoCode: GeoCodeData? = null,

    val note: kotlin.String? = null,

    val requestCode: kotlin.String? = null,

    val transactionType: InteropTransactionTypeData? = null,

) {

    /**
     *
     *
     * Values: PAYER,PAYEE
     */
    @Serializable
    enum class TransactionRole(val value: kotlin.String) {
        @SerialName("PAYER")
        PAYER("PAYER"),

        @SerialName("PAYEE")
        PAYEE("PAYEE"),
    }
}
