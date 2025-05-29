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
 * PostCollectionSheetRequest
 *
 * @param actualDisbursementDate
 * @param bulkDisbursementTransactions
 * @param bulkRepaymentTransactions
 * @param bulkSavingsDueTransactions
 * @param dateFormat
 * @param locale
 * @param transactionDate
 */

@Serializable
data class PostCollectionSheetRequest(

    val actualDisbursementDate: kotlin.String? = null,

    val bulkDisbursementTransactions: kotlin.collections.List<kotlin.Int>? = null,

    val bulkRepaymentTransactions: PostCollectionSheetBulkRepaymentTransactions? = null,

    val bulkSavingsDueTransactions: kotlin.collections.List<kotlin.Int>? = null,

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val transactionDate: kotlin.String? = null,

)
