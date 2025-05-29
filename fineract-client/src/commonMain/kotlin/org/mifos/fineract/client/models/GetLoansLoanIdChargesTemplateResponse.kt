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
 * GetLoansLoanIdChargesTemplateResponse
 *
 * @param amountPaid
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeOptions
 * @param penalty
 */

@Serializable
data class GetLoansLoanIdChargesTemplateResponse(

    val amountPaid: kotlin.Double? = null,

    val amountWaived: kotlin.Double? = null,

    val amountWrittenOff: kotlin.Double? = null,

    val chargeOptions: kotlin.collections.Set<GetLoanChargeTemplateChargeOptions>? = null,

    val penalty: kotlin.Boolean? = null,

)
