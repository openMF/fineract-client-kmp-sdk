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
 * PostLoansResponse
 *
 * @param clientId
 * @param currency
 * @param loanId
 * @param loanTermInDays
 * @param officeId
 * @param periods
 * @param resourceExternalId
 * @param resourceId
 * @param totalFeeChargesCharged
 * @param totalInterestCharged
 * @param totalOutstanding
 * @param totalPenaltyChargesCharged
 * @param totalPrincipalDisbursed
 * @param totalPrincipalExpected
 * @param totalPrincipalPaid
 * @param totalRepayment
 * @param totalRepaymentExpected
 * @param totalWaived
 * @param totalWrittenOff
 */

@Serializable
data class PostLoansResponse(

    val clientId: kotlin.Long? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    val loanId: kotlin.Long? = null,

    val loanTermInDays: kotlin.Int? = null,

    val officeId: kotlin.Long? = null,

    val periods: kotlin.collections.Set<PostLoansRepaymentSchedulePeriods>? = null,

    val resourceExternalId: kotlin.String? = null,

    val resourceId: kotlin.Long? = null,

    val totalFeeChargesCharged: kotlin.Long? = null,

    val totalInterestCharged: kotlin.Double? = null,

    val totalOutstanding: kotlin.Long? = null,

    val totalPenaltyChargesCharged: kotlin.Long? = null,

    val totalPrincipalDisbursed: kotlin.Long? = null,

    val totalPrincipalExpected: kotlin.Long? = null,

    val totalPrincipalPaid: kotlin.Long? = null,

    val totalRepayment: kotlin.Long? = null,

    val totalRepaymentExpected: kotlin.Double? = null,

    val totalWaived: kotlin.Long? = null,

    val totalWrittenOff: kotlin.Long? = null,

)
