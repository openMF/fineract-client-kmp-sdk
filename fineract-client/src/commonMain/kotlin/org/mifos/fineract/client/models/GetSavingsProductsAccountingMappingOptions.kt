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
 * @param expenseAccountOptions
 * @param incomeAccountOptions
 * @param liabilityAccountOptions
 */

@Serializable
data class GetSavingsProductsAccountingMappingOptions(

    val assetAccountOptions: kotlin.collections.Set<GetSavingsProductsAssetAccountOptions>? = null,

    val expenseAccountOptions: kotlin.collections.Set<GetSavingsProductsExpenseAccountOptions>? = null,

    val incomeAccountOptions: kotlin.collections.Set<GetSavingsProductsIncomeAccountOptions>? = null,

    val liabilityAccountOptions: kotlin.collections.Set<GetSavingsProductsLiabilityAccountOptions>? = null,

)
