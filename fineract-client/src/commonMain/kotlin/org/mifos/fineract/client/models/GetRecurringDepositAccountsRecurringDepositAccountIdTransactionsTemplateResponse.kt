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
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
 *
 * @param accountId
 * @param accountNo
 * @param amount
 * @param currency
 * @param date
 * @param id
 * @param paymentTypeOptions
 * @param reversed
 * @param transactionType
 */

@Serializable
data class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse(

    val accountId: kotlin.Long? = null,

    val accountNo: kotlin.String? = null,

    @Contextual
    val amount: Double? = null,

    val currency: GetRecurringCurrency? = null,

    @Contextual
    val date: LocalDate? = null,

    val id: kotlin.Long? = null,

    val paymentTypeOptions: kotlin.collections.List<kotlin.Int>? = null,

    val reversed: kotlin.Boolean? = null,

    val transactionType: GetRecurringTransactionType? = null,

)
