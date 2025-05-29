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
 * PostCreateRescheduleLoansRequest
 *
 * @param adjustedDueDate
 * @param dateFormat
 * @param extraTerms
 * @param graceOnInterest
 * @param graceOnPrincipal
 * @param loanId
 * @param locale
 * @param newInterestRate
 * @param rescheduleFromDate
 * @param rescheduleReasonComment
 * @param rescheduleReasonId
 * @param submittedOnDate
 */

@Serializable
data class PostCreateRescheduleLoansRequest(

    val adjustedDueDate: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val extraTerms: kotlin.Int? = null,

    val graceOnInterest: kotlin.Int? = null,

    val graceOnPrincipal: kotlin.Int? = null,

    val loanId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    @Contextual
    val newInterestRate: Double? = null,

    val rescheduleFromDate: kotlin.String? = null,

    val rescheduleReasonComment: kotlin.String? = null,

    val rescheduleReasonId: kotlin.Long? = null,

    val submittedOnDate: kotlin.String? = null,

)
