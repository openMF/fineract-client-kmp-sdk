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
 * Delinquent data
 *
 * @param availableDisbursementAmount
 * @param delinquencyPausePeriods List of GetLoansLoanIdDelinquencyPausePeriod
 * @param delinquentAmount
 * @param delinquentDate
 * @param delinquentDays
 * @param installmentLevelDelinquency List of GetLoansLoanIdLoanInstallmentLevelDelinquency
 * @param lastPaymentAmount
 * @param lastPaymentDate
 * @param lastRepaymentAmount
 * @param lastRepaymentDate
 * @param nextPaymentDueDate
 * @param pastDueDays
 */

@Serializable
data class GetLoansLoanIdDelinquencySummary(

    val availableDisbursementAmount: kotlin.Double? = null,

    val delinquencyPausePeriods: kotlin.collections.List<GetLoansLoanIdDelinquencyPausePeriod>? = null,

    val delinquentAmount: kotlin.Double? = null,

    @Contextual
    val delinquentDate: LocalDate? = null,

    val delinquentDays: kotlin.Int? = null,

    val installmentLevelDelinquency: kotlin.collections.List<GetLoansLoanIdLoanInstallmentLevelDelinquency>? = null,

    val lastPaymentAmount: kotlin.Double? = null,

    @Contextual
    val lastPaymentDate: LocalDate? = null,

    val lastRepaymentAmount: kotlin.Double? = null,

    @Contextual
    val lastRepaymentDate: LocalDate? = null,

    @Contextual
    val nextPaymentDueDate: LocalDate? = null,

    val pastDueDays: kotlin.Int? = null,

)
