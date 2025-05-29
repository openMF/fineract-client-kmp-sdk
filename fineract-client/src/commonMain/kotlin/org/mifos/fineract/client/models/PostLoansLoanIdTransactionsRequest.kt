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

import kotlinx.serialization.Serializable

/**
 * PostLoansLoanIdTransactionsRequest
 *
 * @param accountNumber
 * @param bankNumber
 * @param chargeOffReasonId
 * @param checkNumber
 * @param dateFormat
 * @param dueDate
 * @param externalId
 * @param loanChargeId
 * @param locale
 * @param note
 * @param paymentTypeId
 * @param receiptNumber
 * @param reversalExternalId
 * @param routingCode
 * @param transactionAmount
 * @param transactionDate
 * @param writeoffReasonId
 */

@Serializable
data class PostLoansLoanIdTransactionsRequest(

    val accountNumber: kotlin.String? = null,

    val bankNumber: kotlin.String? = null,

    val chargeOffReasonId: kotlin.Long? = null,

    val checkNumber: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val dueDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val loanChargeId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val note: kotlin.String? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val reversalExternalId: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

    val transactionAmount: kotlin.Double? = null,

    val transactionDate: kotlin.String? = null,

    val writeoffReasonId: kotlin.Long? = null,

)
