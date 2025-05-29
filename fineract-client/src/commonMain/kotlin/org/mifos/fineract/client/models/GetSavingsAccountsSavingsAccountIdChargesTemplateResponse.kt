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
 * GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
 *
 * @param amountPaid
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeOptions
 * @param penalty
 */

@Serializable
data class GetSavingsAccountsSavingsAccountIdChargesTemplateResponse(

    val amountPaid: kotlin.Float? = null,

    val amountWaived: kotlin.Float? = null,

    val amountWrittenOff: kotlin.Float? = null,

    val chargeOptions: kotlin.collections.Set<GetSavingsChargesOptions>? = null,

    val penalty: kotlin.Boolean? = null,

)
