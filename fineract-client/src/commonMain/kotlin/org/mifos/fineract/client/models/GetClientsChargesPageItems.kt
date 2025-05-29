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
 * @param amount
 * @param amountOutstanding
 * @param amountPaid
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeCalculationType
 * @param chargeId
 * @param chargeTimeType
 * @param clientId
 * @param currency
 * @param dueDate
 * @param id
 * @param isActive
 * @param isPaid
 * @param isWaived
 * @param name
 * @param penalty
 */

@Serializable
data class GetClientsChargesPageItems(

    @Contextual
    val amount: Double? = null,

    @Contextual
    val amountOutstanding: Double? = null,

    @Contextual
    val amountPaid: Double? = null,

    @Contextual
    val amountWaived: Double? = null,

    @Contextual
    val amountWrittenOff: Double? = null,

    val chargeCalculationType: GetClientChargeCalculationType? = null,

    val chargeId: kotlin.Long? = null,

    val chargeTimeType: GetClientChargeTimeType? = null,

    val clientId: kotlin.Long? = null,

    val currency: GetClientChargeCurrency? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val isPaid: kotlin.Boolean? = null,

    val isWaived: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
