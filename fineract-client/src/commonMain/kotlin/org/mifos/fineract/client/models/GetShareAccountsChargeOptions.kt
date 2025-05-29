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
 * @param active
 * @param amount
 * @param calculationType
 * @param chargeAppliesTo
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param paymentMode
 * @param penalty
 */

@Serializable
data class GetShareAccountsChargeOptions(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Int? = null,

    val calculationType: GetShareAccountsChargeCalculationType? = null,

    val chargeAppliesTo: GetShareAccountsChargeAppliesTo? = null,

    val chargeTimeType: GetShareAccountsChargeTimeType? = null,

    val currency: GetShareAccountsCurrency? = null,

    val id: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val paymentMode: GetShareAccountsChargePaymentMode? = null,

    val penalty: kotlin.Boolean? = null,

)
