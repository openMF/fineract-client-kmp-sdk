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
 * PostLoansLoanIdChargesChargeIdRequest
 *
 * @param accountNumber
 * @param amount
 * @param bankNumber
 * @param chargeId
 * @param checkNumber
 * @param dateFormat
 * @param dueDate
 * @param externalId
 * @param installmentNumber
 * @param locale
 * @param note
 * @param paymentTypeId
 * @param receiptNumber
 * @param routingCode
 * @param transactionDate
 */

@Serializable
data class PostLoansLoanIdChargesChargeIdRequest(

    val accountNumber: kotlin.String? = null,

    val amount: kotlin.Double? = null,

    val bankNumber: kotlin.String? = null,

    val chargeId: kotlin.Long? = null,

    val checkNumber: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val dueDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val installmentNumber: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val note: kotlin.String? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

    val transactionDate: kotlin.String? = null,

)
