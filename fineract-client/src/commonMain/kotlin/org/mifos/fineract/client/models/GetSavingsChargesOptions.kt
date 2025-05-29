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
 * @param chargeCalculationType
 * @param chargeTimeType
 * @param chargesAppliesTo
 * @param currency
 * @param id
 * @param name
 * @param penalty
 */

@Serializable
data class GetSavingsChargesOptions(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Float? = null,

    val chargeCalculationType: GetChargesChargeCalculationType? = null,

    val chargeTimeType: GetSavingsChargesChargeTimeType? = null,

    val chargesAppliesTo: GetChargesAppliesTo? = null,

    val currency: GetChargesCurrencyResponse? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
