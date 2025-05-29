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
 * @param chargeAppliesTo
 * @param chargeCalculationType
 * @param chargePaymentMode
 * @param chargeTimeType
 * @param currency
 * @param feeFrequency
 * @param feeInterval
 * @param id
 * @param name
 * @param penalty
 */

@Serializable
data class GetLoansLoanIdOverdueCharges(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Float? = null,

    val chargeAppliesTo: GetLoanChargeTemplateChargeAppliesTo? = null,

    val chargeCalculationType: GetLoansLoanIdChargeCalculationType? = null,

    val chargePaymentMode: GetLoansLoanIdChargePaymentMode? = null,

    val chargeTimeType: GetLoansLoanIdChargeTimeType? = null,

    val currency: GetLoanCurrency? = null,

    val feeFrequency: GetLoansLoanIdFeeFrequency? = null,

    val feeInterval: kotlin.Int? = null,

    val id: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
