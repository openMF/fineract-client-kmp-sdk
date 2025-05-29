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
data class GetLoanProductsAccountingMappingOptions(

    val assetAccountOptions: kotlin.collections.Set<GetLoanProductsAssetAccountOptions>? = null,

    val expenseAccountOptions: kotlin.collections.Set<GetLoanProductsExpenseAccountOptions>? = null,

    val incomeAccountOptions: kotlin.collections.Set<GetLoanProductsIncomeAccountOptions>? = null,

    val liabilityAccountOptions: kotlin.collections.Set<GetLoanProductsLiabilityAccountOptions>? = null,

)
