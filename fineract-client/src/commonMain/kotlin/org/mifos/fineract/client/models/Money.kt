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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param amount
 * @param amountDefaultedToNullIfZero
 * @param currency
 * @param currencyCode
 * @param currencyDigitsAfterDecimal
 * @param currencyInMultiplesOf
 * @param greaterThanZero
 * @param lessThanZero
 * @param zero
 */

@Serializable
data class Money(

    @Contextual
    val amount: Double? = null,

    @Contextual
    val amountDefaultedToNullIfZero: Double? = null,

    val currency: MonetaryCurrency? = null,

    val currencyCode: kotlin.String? = null,

    val currencyDigitsAfterDecimal: kotlin.Int? = null,

    val currencyInMultiplesOf: kotlin.Int? = null,

    val greaterThanZero: kotlin.Boolean? = null,

    val lessThanZero: kotlin.Boolean? = null,

    val zero: kotlin.Boolean? = null,

)
