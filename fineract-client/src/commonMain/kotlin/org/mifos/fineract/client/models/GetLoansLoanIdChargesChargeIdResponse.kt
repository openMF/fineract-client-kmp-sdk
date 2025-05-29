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
 * GetLoansLoanIdChargesChargeIdResponse
 *
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
 * @param dueDate
 * @param externalId
 * @param id
 * @param name
 * @param penalty
 * @param percentage
 * @param submittedOnDate
 */

@Serializable
data class GetLoansLoanIdChargesChargeIdResponse(

    val amount: kotlin.Double? = null,

    val amountOrPercentage: kotlin.Double? = null,

    val amountOutstanding: kotlin.Double? = null,

    val amountPaid: kotlin.Double? = null,

    val amountPercentageAppliedTo: kotlin.Double? = null,

    val amountWaived: kotlin.Double? = null,

    val amountWrittenOff: kotlin.Double? = null,

    val chargeCalculationType: GetLoanChargeCalculationType? = null,

    val chargeId: kotlin.Long? = null,

    val chargeTimeType: GetLoanChargeTimeType? = null,

    val currency: GetLoanChargeCurrency? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val externalId: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

    val percentage: kotlin.Double? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

)
