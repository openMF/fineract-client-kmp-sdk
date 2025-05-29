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
 * @param amount
 * @param comments
 * @param createdByUserId
 * @param createdByUserName
 * @param createdDate
 * @param currency
 * @param entityId
 * @param entityType
 * @param entryType
 * @param glAccountCode
 * @param glAccountId
 * @param glAccountName
 * @param glAccountType
 * @param id
 * @param manualEntry
 * @param officeId
 * @param officeName
 * @param officeRunningBalance
 * @param organizationRunningBalance
 * @param referenceNumber
 * @param reversed
 * @param runningBalanceComputed
 * @param submittedOnDate
 * @param transactionDate
 * @param transactionDetails
 * @param transactionId
 */

@Serializable
data class JournalEntryTransactionItem(

    val amount: kotlin.Double? = null,

    val comments: kotlin.String? = null,

    val createdByUserId: kotlin.Long? = null,

    val createdByUserName: kotlin.String? = null,

    @Contextual
    val createdDate: LocalDate? = null,

    val currency: CurrencyItem? = null,

    val entityId: kotlin.Long? = null,

    val entityType: EnumOptionType? = null,

    val entryType: EnumOptionType? = null,

    val glAccountCode: kotlin.String? = null,

    val glAccountId: kotlin.Long? = null,

    val glAccountName: kotlin.String? = null,

    val glAccountType: EnumOptionType? = null,

    val id: kotlin.Long? = null,

    val manualEntry: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val officeRunningBalance: Double? = null,

    @Contextual
    val organizationRunningBalance: Double? = null,

    val referenceNumber: kotlin.String? = null,

    val reversed: kotlin.Boolean? = null,

    val runningBalanceComputed: kotlin.Boolean? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    @Contextual
    val transactionDate: LocalDate? = null,

    val transactionDetails: TransactionDetails? = null,

    val transactionId: kotlin.String? = null,

)
