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
 * @param accountId
 * @param amount
 * @param amountOrPercentage
 * @param amountOutstanding
 * @param amountPaid
 * @param amountPercentageAppliedTo
 * @param amountWaived
 * @param amountWrittenOff
 * @param annualFee
 * @param chargeCalculationType
 * @param chargeData
 * @param chargeId
 * @param chargeOptions
 * @param chargeTimeType
 * @param currency
 * @param dueDate
 * @param feeCharge
 * @param feeInterval
 * @param feeOnMonthDay
 * @param freeWithdrawalChargeFrequency
 * @param id
 * @param inactivationDate
 * @param isActive
 * @param isFreeWithdrawal
 * @param name
 * @param penalty
 * @param percentage
 * @param restartFrequency
 * @param restartFrequencyEnum
 * @param savingsActivation
 * @param withdrawalFee
 */

@Serializable
data class SavingsAccountChargeData(

    val accountId: kotlin.Long? = null,

    @Contextual
    val amount: Double? = null,

    @Contextual
    val amountOrPercentage: Double? = null,

    @Contextual
    val amountOutstanding: Double? = null,

    @Contextual
    val amountPaid: Double? = null,

    @Contextual
    val amountPercentageAppliedTo: Double? = null,

    @Contextual
    val amountWaived: Double? = null,

    @Contextual
    val amountWrittenOff: Double? = null,

    val annualFee: kotlin.Boolean? = null,

    val chargeCalculationType: EnumOptionData? = null,

    val chargeData: ChargeData? = null,

    val chargeId: kotlin.Long? = null,

    val chargeOptions: kotlin.collections.List<ChargeData>? = null,

    val chargeTimeType: EnumOptionData? = null,

    val currency: CurrencyData? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val feeCharge: kotlin.Boolean? = null,

    val feeInterval: kotlin.Int? = null,

    val feeOnMonthDay: ChargeFeeOnMonthDay? = null,

    val freeWithdrawalChargeFrequency: kotlin.Int? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val inactivationDate: LocalDate? = null,

    val isActive: kotlin.Boolean? = null,

    val isFreeWithdrawal: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

    @Contextual
    val percentage: Double? = null,

    val restartFrequency: kotlin.Int? = null,

    val restartFrequencyEnum: kotlin.Int? = null,

    val savingsActivation: kotlin.Boolean? = null,

    val withdrawalFee: kotlin.Boolean? = null,

)
