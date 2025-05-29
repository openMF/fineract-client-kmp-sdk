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
 * @param code
 * @param decimalPlaces
 * @param displayLabel
 * @param displaySymbol
 * @param inMultiplesOf
 * @param name
 * @param nameCode
 */

@Serializable
data class GetRecurringDepositProductsCurrency(

    val code: kotlin.String? = null,

    val decimalPlaces: kotlin.Int? = null,

    val displayLabel: kotlin.String? = null,

    val displaySymbol: kotlin.String? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val nameCode: kotlin.String? = null,

)
