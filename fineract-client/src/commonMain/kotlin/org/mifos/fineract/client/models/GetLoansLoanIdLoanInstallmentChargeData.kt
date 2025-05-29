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
 * List of GetLoansLoanIdLoanInstallmentChargeData
 *
 * @param amount
 * @param amountAccrued
 * @param amountOutstanding
 * @param amountUnrecognized
 * @param amountWaived
 * @param dueDate
 * @param installmentNumber
 * @param paid
 * @param waived
 */

@Serializable
data class GetLoansLoanIdLoanInstallmentChargeData(

    val amount: kotlin.Double? = null,

    val amountAccrued: kotlin.Double? = null,

    val amountOutstanding: kotlin.Double? = null,

    val amountUnrecognized: kotlin.Double? = null,

    val amountWaived: kotlin.Double? = null,

    @Contextual
    val dueDate: LocalDate? = null,

    val installmentNumber: kotlin.Int? = null,

    val paid: kotlin.Boolean? = null,

    val waived: kotlin.Boolean? = null,

)
