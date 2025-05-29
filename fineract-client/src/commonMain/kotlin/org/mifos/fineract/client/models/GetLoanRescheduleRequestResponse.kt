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
 * GetLoanRescheduleRequestResponse
 *
 * @param clientId
 * @param clientName
 * @param id
 * @param loanAccountNumber
 * @param loanId
 * @param loanTermVariationsData
 * @param recalculateInterest
 * @param rescheduleFromDate
 * @param rescheduleFromInstallment
 * @param rescheduleReasonCodeValue
 * @param rescheduleReasonComment
 * @param statusEnum
 * @param timeline
 */

@Serializable
data class GetLoanRescheduleRequestResponse(

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val loanAccountNumber: kotlin.String? = null,

    val loanId: kotlin.Long? = null,

    val loanTermVariationsData: kotlin.collections.Set<LoanTermVariationsData>? = null,

    val recalculateInterest: kotlin.Boolean? = null,

    @Contextual
    val rescheduleFromDate: LocalDate? = null,

    val rescheduleFromInstallment: kotlin.Int? = null,

    val rescheduleReasonCodeValue: RescheduleReasonsCodeValue? = null,

    val rescheduleReasonComment: kotlin.String? = null,

    val statusEnum: GetLoanRescheduleRequestStatus? = null,

    val timeline: RescheduleReasonsTimeline? = null,

)
