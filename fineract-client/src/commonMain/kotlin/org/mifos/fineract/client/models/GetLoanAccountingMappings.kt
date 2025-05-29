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
 * @param fundSourceAccount
 * @param goodwillCreditAccount
 * @param incomeFromFeeAccount
 * @param incomeFromPenaltyAccount
 * @param incomeFromRecoveryAccount
 * @param interestOnLoanAccount
 * @param loanPortfolioAccount
 * @param overpaymentLiabilityAccount
 * @param receivableInterestAccount
 * @param receivablePenaltyAccount
 * @param transfersInSuspenseAccount
 * @param writeOffAccount
 */

@Serializable
data class GetLoanAccountingMappings(

    val fundSourceAccount: GetGlAccountMapping? = null,

    val goodwillCreditAccount: GetGlAccountMapping? = null,

    val incomeFromFeeAccount: GetGlAccountMapping? = null,

    val incomeFromPenaltyAccount: GetGlAccountMapping? = null,

    val incomeFromRecoveryAccount: GetGlAccountMapping? = null,

    val interestOnLoanAccount: GetGlAccountMapping? = null,

    val loanPortfolioAccount: GetGlAccountMapping? = null,

    val overpaymentLiabilityAccount: GetGlAccountMapping? = null,

    val receivableInterestAccount: GetGlAccountMapping? = null,

    val receivablePenaltyAccount: GetGlAccountMapping? = null,

    val transfersInSuspenseAccount: GetGlAccountMapping? = null,

    val writeOffAccount: GetGlAccountMapping? = null,

)
