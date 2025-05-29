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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PostLoansLoanIdRequest
 *
 * @param actualDisbursementDate
 * @param approvedLoanAmount
 * @param approvedOnDate
 * @param assignmentDate
 * @param dateFormat
 * @param disbursementData List of PostLoansLoanIdDisbursementData
 * @param expectedDisbursementDate
 * @param externalId
 * @param fromLoanOfficerId
 * @param locale
 * @param note
 * @param paymentTypeId
 * @param rejectedOnDate
 * @param toLoanOfficerId
 * @param transactionAmount
 * @param unassignedDate
 * @param withdrawnOnDate
 */

@Serializable
data class PostLoansLoanIdRequest(

    val actualDisbursementDate: kotlin.String? = null,

    @Contextual
    val approvedLoanAmount: Double? = null,

    val approvedOnDate: kotlin.String? = null,

    val assignmentDate: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val disbursementData: kotlin.collections.List<PostLoansLoanIdDisbursementData>? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val fromLoanOfficerId: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val note: kotlin.String? = null,

    val paymentTypeId: kotlin.Int? = null,

    val rejectedOnDate: kotlin.String? = null,

    val toLoanOfficerId: kotlin.Int? = null,

    @Contextual
    val transactionAmount: Double? = null,

    val unassignedDate: kotlin.String? = null,

    val withdrawnOnDate: kotlin.String? = null,

)
