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
 * GetSelfSavingsAccountsAccountIdChargesResponse
 *
 * @param accountId
 * @param amount
 * @param amountOrPercentage
 * @param amountOutstanding
 * @param amountPaid
 * @param amountPercentageAppliedTo
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeCalculationType
 * @param chargeId
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param penalty
 * @param percentage
 */

@Serializable
data class GetSelfSavingsAccountsAccountIdChargesResponse(

    val accountId: kotlin.Int? = null,

    val amount: kotlin.Int? = null,

    val amountOrPercentage: kotlin.Int? = null,

    val amountOutstanding: kotlin.Int? = null,

    val amountPaid: kotlin.Int? = null,

    val amountPercentageAppliedTo: kotlin.Double? = null,

    val amountWaived: kotlin.Int? = null,

    val amountWrittenOff: kotlin.Int? = null,

    val chargeCalculationType: GetSelfSavingsChargeCalculationType? = null,

    val chargeId: kotlin.Int? = null,

    val chargeTimeType: GetSelfSavingsChargeTimeType? = null,

    val currency: GetSelfSavingsCurrency? = null,

    val id: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

    val percentage: kotlin.Double? = null,

)
