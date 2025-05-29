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
import kotlinx.serialization.Serializable

/**
 * GetTellersTellerIdCashiersCashiersIdTransactionsResponse
 *
 * @param cashierId
 * @param cashierName
 * @param createdDate
 * @param entityId
 * @param entityType
 * @param id
 * @param officeId
 * @param officeName
 * @param tellerId
 * @param txnAmount
 * @param txnDate
 * @param txnNote
 * @param txnType
 */

@Serializable
data class GetTellersTellerIdCashiersCashiersIdTransactionsResponse(

    val cashierId: kotlin.Long? = null,

    val cashierName: kotlin.String? = null,

    @Contextual
    val createdDate: LocalDateTime? = null,

    val entityId: kotlin.Long? = null,

    val entityType: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val tellerId: kotlin.Long? = null,

    @Contextual
    val txnAmount: Double? = null,

    @Contextual
    val txnDate: LocalDate? = null,

    val txnNote: kotlin.String? = null,

    val txnType: CashierTxnType? = null,

)
