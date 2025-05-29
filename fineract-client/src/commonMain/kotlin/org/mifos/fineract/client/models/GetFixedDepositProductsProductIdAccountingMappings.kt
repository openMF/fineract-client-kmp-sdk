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
data class GetFixedDepositProductsProductIdAccountingMappings(

    val incomeFromFeeAccount: GetFixedDepositProductsProductIdIncomeFromFeeAccount? = null,

    val incomeFromPenaltyAccount: GetFixedDepositProductsProductIdIncomeFromPenaltyAccount? = null,

    val interestOnSavingsAccount: GetFixedDepositProductsProductIdInterestOnSavingsAccount? = null,

    val savingsControlAccount: GetFixedDepositProductsProductIdSavingsControlAccount? = null,

    val savingsReferenceAccount: GetFixedDepositProductsProductIdSavingsReferenceAccount? = null,

    val transfersInSuspenseAccount: GetFixedDepositProductsProductIdTransfersInSuspenseAccount? = null,

)
