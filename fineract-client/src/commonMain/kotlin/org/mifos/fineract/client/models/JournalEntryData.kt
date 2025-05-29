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
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountNumber
 * @param amount
 * @param bankNumber
 * @param checkNumber
 * @param comments
 * @param createdByUserId
 * @param createdByUserName
 * @param createdDate
 * @param credits
 * @param currency
 * @param currencyCode
 * @param dateFormat
 * @param debits
 * @param entityId
 * @param entityType
 * @param entryType
 * @param glAccountCode
 * @param glAccountId
 * @param glAccountName
 * @param glAccountType
 * @param id
 * @param locale
 * @param manualEntry
 * @param officeId
 * @param officeName
 * @param officeRunningBalance
 * @param organizationRunningBalance
 * @param paymentTypeId
 * @param receiptNumber
 * @param referenceNumber
 * @param reversed
 * @param routingCode
 * @param rowIndex
 * @param runningBalanceComputed
 * @param savingTransactionId
 * @param submittedOnDate
 * @param transactionDate
 * @param transactionDetails
 * @param transactionId
 */

@Serializable
data class JournalEntryData(

    val accountNumber: kotlin.String? = null,

    @Contextual
    val amount: Double? = null,

    val bankNumber: kotlin.String? = null,

    val checkNumber: kotlin.String? = null,

    val comments: kotlin.String? = null,

    val createdByUserId: kotlin.Long? = null,

    val createdByUserName: kotlin.String? = null,

    @Contextual
    val createdDate: LocalDate? = null,

    val credits: kotlin.collections.List<CreditDebit>? = null,

    val currency: CurrencyData? = null,

    val currencyCode: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val debits: kotlin.collections.List<CreditDebit>? = null,

    val entityId: kotlin.Long? = null,

    val entityType: EnumOptionData? = null,

    val entryType: EnumOptionData? = null,

    val glAccountCode: kotlin.String? = null,

    val glAccountId: kotlin.Long? = null,

    val glAccountName: kotlin.String? = null,

    val glAccountType: EnumOptionData? = null,

    val id: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val manualEntry: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val officeRunningBalance: Double? = null,

    @Contextual
    val organizationRunningBalance: Double? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val referenceNumber: kotlin.String? = null,

    val reversed: kotlin.Boolean? = null,

    val routingCode: kotlin.String? = null,

    val rowIndex: kotlin.Int? = null,

    val runningBalanceComputed: kotlin.Boolean? = null,

    val savingTransactionId: kotlin.Long? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    @Contextual
    val transactionDate: LocalDate? = null,

    val transactionDetails: TransactionDetailData? = null,

    val transactionId: kotlin.String? = null,

)
