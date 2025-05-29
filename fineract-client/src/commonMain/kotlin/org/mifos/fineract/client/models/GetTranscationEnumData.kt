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
 * @param amountHold
 * @param amountRelease
 * @param approveTransfer
 * @param code
 * @param deposit
 * @param dividendPayout
 * @param escheat
 * @param feeDeduction
 * @param id
 * @param initiateTransfer
 * @param interestPosting
 * @param overdraftFee
 * @param overdraftInterest
 * @param rejectTransfer
 * @param `value`
 * @param withdrawTransfer
 * @param withdrawal
 * @param withholdTax
 * @param writtenoff
 */

@Serializable
data class GetTranscationEnumData(

    val amountHold: kotlin.Boolean? = null,

    val amountRelease: kotlin.Boolean? = null,

    val approveTransfer: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val deposit: kotlin.Boolean? = null,

    val dividendPayout: kotlin.Boolean? = null,

    val escheat: kotlin.Boolean? = null,

    val feeDeduction: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val initiateTransfer: kotlin.Boolean? = null,

    val interestPosting: kotlin.Boolean? = null,

    val overdraftFee: kotlin.Boolean? = null,

    val overdraftInterest: kotlin.Boolean? = null,

    val rejectTransfer: kotlin.Boolean? = null,

    val value: kotlin.String? = null,

    val withdrawTransfer: kotlin.Boolean? = null,

    val withdrawal: kotlin.Boolean? = null,

    val withholdTax: kotlin.Boolean? = null,

    val writtenoff: kotlin.Boolean? = null,

)
