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
 * @param isActive
 * @param name
 * @param percentage
 */

@Serializable
data class GetAccountsCharges(

    val accountId: kotlin.Long? = null,

    val amount: kotlin.Float? = null,

    val amountOrPercentage: kotlin.Float? = null,

    val amountOutstanding: kotlin.Float? = null,

    val amountPaid: kotlin.Float? = null,

    val amountPercentageAppliedTo: kotlin.Double? = null,

    val amountWaived: kotlin.Float? = null,

    val amountWrittenOff: kotlin.Float? = null,

    val chargeCalculationType: GetAccountsChargeCalculationType? = null,

    val chargeId: kotlin.Long? = null,

    val chargeTimeType: GetAccountsChargeTimeType? = null,

    val currency: GetAccountsChargesCurrency? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val percentage: kotlin.Double? = null,

)
