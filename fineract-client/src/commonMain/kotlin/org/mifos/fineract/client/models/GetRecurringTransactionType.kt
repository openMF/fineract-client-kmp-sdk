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
 *
 *
 * @param approveTransfer
 * @param code
 * @param deposit
 * @param description
 * @param feeDeduction
 * @param id
 * @param initiateTransfer
 * @param interestPosting
 * @param overdraftFee
 * @param overdraftInterest
 * @param rejectTransfer
 * @param withdrawTransfer
 * @param withdrawal
 * @param writtenoff
 */

@Serializable
data class GetRecurringTransactionType(

    val approveTransfer: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val deposit: kotlin.Boolean? = null,

    val description: kotlin.String? = null,

    val feeDeduction: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val initiateTransfer: kotlin.Boolean? = null,

    val interestPosting: kotlin.Boolean? = null,

    val overdraftFee: kotlin.Boolean? = null,

    val overdraftInterest: kotlin.Boolean? = null,

    val rejectTransfer: kotlin.Boolean? = null,

    val withdrawTransfer: kotlin.Boolean? = null,

    val withdrawal: kotlin.Boolean? = null,

    val writtenoff: kotlin.Boolean? = null,

)
