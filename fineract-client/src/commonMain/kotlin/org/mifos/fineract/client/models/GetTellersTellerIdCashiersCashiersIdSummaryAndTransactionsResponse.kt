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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse
 *
 * @param cashierId
 * @param cashierName
 * @param cashierTransactions
 * @param netCash
 * @param officeName
 * @param sumCashAllocation
 * @param sumCashSettlement
 * @param sumInwardCash
 * @param sumOutwardCash
 * @param tellerId
 * @param tellerName
 */

@Serializable
data class GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse(

    val cashierId: kotlin.Long? = null,

    val cashierName: kotlin.String? = null,

    val cashierTransactions: PageCashierTransactionData? = null,

    @Contextual
    val netCash: Double? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val sumCashAllocation: Double? = null,

    @Contextual
    val sumCashSettlement: Double? = null,

    @Contextual
    val sumInwardCash: Double? = null,

    @Contextual
    val sumOutwardCash: Double? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null,

)
