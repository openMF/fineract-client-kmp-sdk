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
 * GetChargesTemplateResponse
 *
 * @param active
 * @param chargeAppliesToOptions
 * @param chargeCalculationTypeOptions
 * @param chargePaymentModeOptions
 * @param chargeTimeTypeOptions
 * @param currencyOptions
 * @param feeFrequencyOptions
 * @param loanChargeCalculationTypeOptions
 * @param loanChargeTimeTypeOptions
 * @param penalty
 * @param savingsChargeCalculationTypeOptions
 * @param savingsChargeTimeTypeOptions
 */

@Serializable
data class GetChargesTemplateResponse(

    val active: kotlin.Boolean? = null,

    val chargeAppliesToOptions: kotlin.collections.Set<GetChargesAppliesToResponse>? = null,

    val chargeCalculationTypeOptions: kotlin.collections.Set<GetChargesCalculationTypeResponse>? = null,

    val chargePaymentModeOptions: kotlin.collections.Set<GetChargesPaymentModeResponse>? = null,

    val chargeTimeTypeOptions: kotlin.collections.Set<GetChargesTimeTypeResponse>? = null,

    val currencyOptions: kotlin.collections.Set<GetChargesCurrencyResponse>? = null,

    val feeFrequencyOptions: kotlin.collections.Set<GetChargesTemplateFeeFrequencyOptions>? = null,

    val loanChargeCalculationTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeCalculationTypeOptions>? = null,

    val loanChargeTimeTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeTimeTypeOptions>? = null,

    val penalty: kotlin.Boolean? = null,

    val savingsChargeCalculationTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeCalculationTypeOptions>? = null,

    val savingsChargeTimeTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeTimeTypeOptions>? = null,

)
