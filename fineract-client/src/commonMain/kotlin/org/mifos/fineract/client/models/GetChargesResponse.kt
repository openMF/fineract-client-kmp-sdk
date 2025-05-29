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
 * GetChargesResponse
 *
 * @param active
 * @param amount
 * @param chargeAppliesTo
 * @param chargeCalculationType
 * @param chargePaymentMode
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param penalty
 */

@Serializable
data class GetChargesResponse(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Double? = null,

    val chargeAppliesTo: GetChargesAppliesToResponse? = null,

    val chargeCalculationType: GetChargesCalculationTypeResponse? = null,

    val chargePaymentMode: GetChargesPaymentModeResponse? = null,

    val chargeTimeType: GetChargesTimeTypeResponse? = null,

    val currency: GetChargesCurrencyResponse? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
