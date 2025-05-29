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
 * @param amount
 * @param currencyCode
 * @param defaultName
 * @param digitsAfterDecimal
 * @param displaySymbol
 * @param displaySymbolValue
 * @param greaterThanZero
 * @param inMultiplesOf
 * @param nameCode
 * @param zero
 */

@Serializable
data class GetLoansTotal(

    val amount: kotlin.Float? = null,

    val currencyCode: kotlin.String? = null,

    val defaultName: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val displaySymbol: kotlin.String? = null,

    val displaySymbolValue: kotlin.String? = null,

    val greaterThanZero: kotlin.Boolean? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val nameCode: kotlin.String? = null,

    val zero: kotlin.Boolean? = null,

)
