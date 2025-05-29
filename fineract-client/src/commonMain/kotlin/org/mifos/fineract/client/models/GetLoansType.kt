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
 * @param code
 * @param contra
 * @param description
 * @param disbursement
 * @param externalId
 * @param externalLoanId
 * @param id
 * @param loanId
 * @param recoveryRepayment
 * @param repayment
 * @param repaymentAtDisbursement
 * @param waiveCharges
 * @param waiveInterest
 * @param writeOff
 */

@Serializable
data class GetLoansType(

    val code: kotlin.String? = null,

    val contra: kotlin.Boolean? = null,

    val description: kotlin.String? = null,

    val disbursement: kotlin.Boolean? = null,

    val externalId: kotlin.String? = null,

    val externalLoanId: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val loanId: kotlin.Long? = null,

    val recoveryRepayment: kotlin.Boolean? = null,

    val repayment: kotlin.Boolean? = null,

    val repaymentAtDisbursement: kotlin.Boolean? = null,

    val waiveCharges: kotlin.Boolean? = null,

    val waiveInterest: kotlin.Boolean? = null,

    val writeOff: kotlin.Boolean? = null,

)
