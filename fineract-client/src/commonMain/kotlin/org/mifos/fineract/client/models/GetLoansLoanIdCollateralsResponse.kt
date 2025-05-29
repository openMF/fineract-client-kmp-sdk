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
 * GetLoansLoanIdCollateralsResponse
 *
 * @param currency
 * @param description
 * @param id
 * @param type
 * @param `value`
 */

@Serializable
data class GetLoansLoanIdCollateralsResponse(

    val currency: GetCollateralCurrencyResponse? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val type: GetCollateralTypeResponse? = null,

    val value: kotlin.Long? = null,

)
