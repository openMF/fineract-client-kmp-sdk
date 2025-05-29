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
 * Set of charges
 *
 * @param amount
 * @param amountOrPercentage
 * @param amountOutstanding
 * @param amountPaid
 * @param amountPercentageAppliedTo
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeCalculationType
 * @param chargeId
 * @param chargePayable
 * @param chargePaymentMode
 * @param chargeTimeType
 * @param currency
 * @param dueDate
 * @param id
 * @param installmentChargeData List of GetLoansLoanIdLoanInstallmentChargeData
 * @param loanId
 * @param maxCap
 * @param minCap
 * @param name
 * @param paid
 * @param penalty
 * @param percentage
 * @param waived
 */

@Serializable
data class GetLoansLoanIdLoanChargeData(

    val amount: kotlin.Double? = null,

    val amountOrPercentage: kotlin.Double? = null,

    val amountOutstanding: kotlin.Double? = null,

    val amountPaid: kotlin.Double? = null,

    val amountPercentageAppliedTo: kotlin.Double? = null,

    val amountWaived: kotlin.Double? = null,

    val amountWrittenOff: kotlin.Double? = null,

    val chargeCalculationType: GetLoansLoanIdEnumOptionData? = null,

    val chargeId: kotlin.Long? = null,

    val chargePayable: kotlin.Boolean? = null,

    val chargePaymentMode: GetLoansLoanIdEnumOptionData? = null,

    val chargeTimeType: GetLoansLoanIdEnumOptionData? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val installmentChargeData: kotlin.collections.List<GetLoansLoanIdLoanInstallmentChargeData>? = null,

    val loanId: kotlin.Long? = null,

    val maxCap: kotlin.Double? = null,

    val minCap: kotlin.Double? = null,

    val name: kotlin.String? = null,

    val paid: kotlin.Boolean? = null,

    val penalty: kotlin.Boolean? = null,

    val percentage: kotlin.Double? = null,

    val waived: kotlin.Boolean? = null,

)
