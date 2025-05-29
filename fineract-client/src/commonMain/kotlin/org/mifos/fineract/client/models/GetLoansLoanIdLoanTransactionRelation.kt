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
 * List of GetLoansLoanIdLoanTransactionRelationData
 *
 * @param amount
 * @param fromLoanTransaction
 * @param paymentType
 * @param relationType
 * @param toLoanCharge
 * @param toLoanTransaction
 */

@Serializable
data class GetLoansLoanIdLoanTransactionRelation(

    val amount: kotlin.Double? = null,

    val fromLoanTransaction: kotlin.Long? = null,

    val paymentType: kotlin.String? = null,

    val relationType: kotlin.String? = null,

    val toLoanCharge: kotlin.Long? = null,

    val toLoanTransaction: kotlin.Long? = null,

)
