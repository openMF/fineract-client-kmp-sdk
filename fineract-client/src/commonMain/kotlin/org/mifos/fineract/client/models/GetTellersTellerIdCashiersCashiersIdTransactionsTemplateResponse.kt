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
 * GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse
 *
 * @param cashierData
 * @param cashierId
 * @param cashierName
 * @param currencyOptions
 * @param endDate
 * @param officeName
 * @param startDate
 * @param tellerId
 * @param tellerName
 */

@Serializable
data class GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse(

    val cashierData: CashierData? = null,

    val cashierId: kotlin.Long? = null,

    val cashierName: kotlin.String? = null,

    val currencyOptions: kotlin.collections.List<CurrencyData>? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null,

)
