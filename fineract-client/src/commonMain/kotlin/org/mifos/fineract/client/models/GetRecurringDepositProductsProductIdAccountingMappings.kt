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
 * @param incomeFromFeeAccount
 * @param incomeFromPenaltyAccount
 * @param interestOnSavingsAccount
 * @param savingsControlAccount
 * @param savingsReferenceAccount
 * @param transfersInSuspenseAccount
 */

@Serializable
data class GetRecurringDepositProductsProductIdAccountingMappings(

    val incomeFromFeeAccount: GetRecurringDepositProductsProductIdIncomeFromFeeAccount? = null,

    val incomeFromPenaltyAccount: GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount? = null,

    val interestOnSavingsAccount: GetRecurringDepositProductsProductIdInterestOnSavingsAccount? = null,

    val savingsControlAccount: GetRecurringDepositProductsProductIdSavingsControlAccount? = null,

    val savingsReferenceAccount: GetRecurringDepositProductsProductIdSavingsReferenceAccount? = null,

    val transfersInSuspenseAccount: GetRecurringDepositProductsProductIdTransfersInSuspenseAccount? = null,

)
