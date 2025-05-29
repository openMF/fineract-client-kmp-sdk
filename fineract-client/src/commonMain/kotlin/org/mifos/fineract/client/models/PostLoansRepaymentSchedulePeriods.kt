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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param dueDate
 * @param feeChargesDue
 * @param feeChargesOutstanding
 * @param period
 * @param principalDisbursed
 * @param principalLoanBalanceOutstanding
 * @param totalActualCostOfLoanForPeriod
 * @param totalDueForPeriod
 * @param totalOriginalDueForPeriod
 * @param totalOutstandingForPeriod
 * @param totalOverdue
 */

@Serializable
data class PostLoansRepaymentSchedulePeriods(

    @Contextual
    val dueDate: LocalDate? = null,

    val feeChargesDue: kotlin.Long? = null,

    val feeChargesOutstanding: kotlin.Long? = null,

    val period: kotlin.Int? = null,

    val principalDisbursed: kotlin.Long? = null,

    val principalLoanBalanceOutstanding: kotlin.Long? = null,

    val totalActualCostOfLoanForPeriod: kotlin.Long? = null,

    val totalDueForPeriod: kotlin.Long? = null,

    val totalOriginalDueForPeriod: kotlin.Long? = null,

    val totalOutstandingForPeriod: kotlin.Long? = null,

    val totalOverdue: kotlin.Long? = null,

)
