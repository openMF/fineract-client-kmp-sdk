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
 * @param accountingRuleId
 * @param amount
 * @param bankNumber
 * @param checkNumber
 * @param comments
 * @param credits
 * @param currencyCode
 * @param debits
 * @param officeId
 * @param paymentTypeId
 * @param receiptNumber
 * @param referenceNumber
 * @param routingCode
 * @param transactionDate
 */

@Serializable
data class JournalEntryCommand(

    val accountNumber: kotlin.String? = null,

    val accountingRuleId: kotlin.Long? = null,

    @Contextual
    val amount: Double? = null,

    val bankNumber: kotlin.String? = null,

    val checkNumber: kotlin.String? = null,

    val comments: kotlin.String? = null,

    val credits: kotlin.collections.List<SingleDebitOrCreditEntryCommand>? = null,

    val currencyCode: kotlin.String? = null,

    val debits: kotlin.collections.List<SingleDebitOrCreditEntryCommand>? = null,

    val officeId: kotlin.Long? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val referenceNumber: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

    @Contextual
    val transactionDate: LocalDate? = null,

)
