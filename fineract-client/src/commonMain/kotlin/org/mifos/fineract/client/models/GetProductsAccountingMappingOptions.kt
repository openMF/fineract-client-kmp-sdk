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
 * @param assetAccountOptions
 * @param equityAccountOptions
 * @param incomeAccountOptions
 * @param liabilityAccountOptions
 */

@Serializable
data class GetProductsAccountingMappingOptions(

    val assetAccountOptions: kotlin.collections.Set<GetProductsAssetAccountOptions>? = null,

    val equityAccountOptions: kotlin.collections.Set<GetProductsEquityAccountOptions>? = null,

    val incomeAccountOptions: kotlin.collections.Set<GetProductsIncomeAccountOptions>? = null,

    val liabilityAccountOptions: kotlin.collections.Set<GetProductsLiabilityAccountOptions>? = null,

)
