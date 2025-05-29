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
data class GetSavingsProductsAccountingMappings(

    val incomeFromFeeAccount: GetSavingsProductsIncomeFromFeeAccount? = null,

    val incomeFromPenaltyAccount: GetSavingsProductsIncomeFromPenaltyAccount? = null,

    val interestOnSavingsAccount: GetSavingsProductsInterestOnSavingsAccount? = null,

    val savingsControlAccount: GetSavingsProductsSavingsControlAccount? = null,

    val savingsReferenceAccount: GetSavingsProductsSavingsReferenceAccount? = null,

    val transfersInSuspenseAccount: GetSavingsProductsTransfersInSuspenseAccount? = null,

)
