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
 * @param accountId
 * @param accountNo
 * @param amount
 * @param chargesPaidByData
 * @param currency
 * @param date
 * @param entryType
 * @param id
 * @param interestedPostedAsOn
 * @param isManualTransaction
 * @param isReversal
 * @param lienTransaction
 * @param originalTransactionId
 * @param paymentDetailData
 * @param releaseTransactionId
 * @param reversed
 * @param runningBalance
 * @param submittedByUsername
 * @param submittedOnDate
 * @param transactionType
 */

@Serializable
data class GetSavingsAccountTransactionsPageItem(

    val accountId: kotlin.Long? = null,

    val accountNo: kotlin.String? = null,

    @Contextual
    val amount: Double? = null,

    val chargesPaidByData: kotlin.collections.Set<GetSavingsAccountChargesPaidByData>? = null,

    val currency: GetTransactionsCurrency? = null,

    @Contextual
    val date: LocalDate? = null,

    val entryType: GetSavingsAccountTransactionsPageItem.EntryType? = null,

    val id: kotlin.Long? = null,

    val interestedPostedAsOn: kotlin.Boolean? = null,

    val isManualTransaction: kotlin.Boolean? = null,

    val isReversal: kotlin.Boolean? = null,

    val lienTransaction: kotlin.Boolean? = null,

    val originalTransactionId: kotlin.Long? = null,

    val paymentDetailData: GetTransactionsPaymentDetailData? = null,

    val releaseTransactionId: kotlin.Long? = null,

    val reversed: kotlin.Boolean? = null,

    @Contextual
    val runningBalance: Double? = null,

    val submittedByUsername: kotlin.String? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val transactionType: GetTranscationEnumData? = null,

) {

    /**
     *
     *
     * Values: CREDIT,DEBIT
     */
    @Serializable
    enum class EntryType(val value: kotlin.String) {
        @SerialName("CREDIT")
        CREDIT("CREDIT"),

        @SerialName("DEBIT")
        DEBIT("DEBIT"),
    }
}
