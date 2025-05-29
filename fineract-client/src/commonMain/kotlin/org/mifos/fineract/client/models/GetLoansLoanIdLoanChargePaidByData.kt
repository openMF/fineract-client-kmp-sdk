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
 * List of GetLoansLoanIdLoanChargePaidByData
 *
 * @param amount
 * @param chargeId
 * @param id
 * @param installmentNumber
 * @param name
 * @param transactionId
 */

@Serializable
data class GetLoansLoanIdLoanChargePaidByData(

    val amount: kotlin.Double? = null,

    val chargeId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val installmentNumber: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val transactionId: kotlin.Long? = null,

)
