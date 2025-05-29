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
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param createdBy
 * @param createdDate
 * @param createdDateTime
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param lastModifiedDateTime
 * @param accountNumber
 * @param accountNumberRequiresAutoGeneration
 * @param activatedBy
 * @param activationDate
 * @param active
 * @param clientClassification
 * @param clientType
 * @param closed
 * @param closedBy
 * @param closureDate
 * @param closureReason
 * @param dateOfBirth
 * @param displayName
 * @param emailAddress
 * @param externalId
 * @param firstname
 * @param fullname
 * @param gender
 * @param groups
 * @param id
 * @param image
 * @param lastname
 * @param legalForm
 * @param middlename
 * @param mobileNo
 * @param new
 * @param notActive
 * @param notPending
 * @param notStaff
 * @param office
 * @param officeJoiningDate
 * @param pending
 * @param proposedTransferDate
 * @param reactivateDate
 * @param reactivatedBy
 * @param rejected
 * @param rejectedBy
 * @param rejectedDate
 * @param rejectionDate
 * @param rejectionReason
 * @param reopenedBy
 * @param reopenedDate
 * @param savingsAccountId
 * @param savingsProductId
 * @param staff
 * @param status
 * @param subStatus
 * @param submittedOnDate
 * @param transferInProgress
 * @param transferInProgressOrOnHold
 * @param transferOnHold
 * @param transferToOffice
 * @param withdrawalDate
 * @param withdrawalReason
 * @param withdrawn
 * @param withdrawnBy
 */

@Serializable
data class Client(

    val createdBy: kotlin.Long,

    @Contextual
    val createdDate: LocalDateTime,

    @Contextual
    val createdDateTime: LocalDateTime,

    val lastModifiedBy: kotlin.Long,

    @Contextual
    val lastModifiedDate: LocalDateTime,

    @Contextual
    val lastModifiedDateTime: LocalDateTime,

    val accountNumber: kotlin.String? = null,

    val accountNumberRequiresAutoGeneration: kotlin.Boolean? = null,

    val activatedBy: AppUser? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    val active: kotlin.Boolean? = null,

    val clientClassification: CodeValue? = null,

    val clientType: CodeValue? = null,

    val closed: kotlin.Boolean? = null,

    val closedBy: AppUser? = null,

    @Contextual
    val closureDate: LocalDate? = null,

    val closureReason: CodeValue? = null,

    @Contextual
    val dateOfBirth: LocalDate? = null,

    val displayName: kotlin.String? = null,

    val emailAddress: kotlin.String? = null,

    val externalId: ExternalId? = null,

    val firstname: kotlin.String? = null,

    val fullname: kotlin.String? = null,

    val gender: CodeValue? = null,

    val groups: kotlin.collections.Set<Group>? = null,

    val id: kotlin.Long? = null,

    val image: Image? = null,

    val lastname: kotlin.String? = null,

    val legalForm: kotlin.Int? = null,

    val middlename: kotlin.String? = null,

    val mobileNo: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val notActive: kotlin.Boolean? = null,

    val notPending: kotlin.Boolean? = null,

    val notStaff: kotlin.Boolean? = null,

    val office: Office? = null,

    @Contextual
    val officeJoiningDate: LocalDate? = null,

    val pending: kotlin.Boolean? = null,

    @Contextual
    val proposedTransferDate: LocalDate? = null,

    @Contextual
    val reactivateDate: LocalDate? = null,

    val reactivatedBy: AppUser? = null,

    val rejected: kotlin.Boolean? = null,

    val rejectedBy: AppUser? = null,

    @Contextual
    val rejectedDate: LocalDate? = null,

    @Contextual
    val rejectionDate: LocalDate? = null,

    val rejectionReason: CodeValue? = null,

    val reopenedBy: AppUser? = null,

    @Contextual
    val reopenedDate: LocalDate? = null,

    val savingsAccountId: kotlin.Long? = null,

    val savingsProductId: kotlin.Long? = null,

    val staff: Staff? = null,

    val status: kotlin.Int? = null,

    val subStatus: CodeValue? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val transferInProgress: kotlin.Boolean? = null,

    val transferInProgressOrOnHold: kotlin.Boolean? = null,

    val transferOnHold: kotlin.Boolean? = null,

    val transferToOffice: Office? = null,

    @Contextual
    val withdrawalDate: LocalDate? = null,

    val withdrawalReason: CodeValue? = null,

    val withdrawn: kotlin.Boolean? = null,

    val withdrawnBy: AppUser? = null,

)
