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
 * GetStandingInstructionsStandingInstructionIdResponse
 *
 * @param accountDetailId
 * @param amount
 * @param fromAccount
 * @param fromAccountType
 * @param fromClient
 * @param fromOffice
 * @param id
 * @param instructionType
 * @param name
 * @param priority
 * @param recurrenceFrequency
 * @param recurrenceInterval
 * @param recurrenceOnMonthDay
 * @param recurrenceType
 * @param status
 * @param toAccount
 * @param toAccountType
 * @param toClient
 * @param toOffice
 * @param transferType
 * @param validFrom
 */

@Serializable
data class GetStandingInstructionsStandingInstructionIdResponse(

    val accountDetailId: kotlin.Long? = null,

    val amount: kotlin.Float? = null,

    val fromAccount: GetFromAccountStandingInstructionSwagger? = null,

    val fromAccountType: GetFromAccountTypeStandingInstructionSwagger? = null,

    val fromClient: GetFromClientStandingInstructionSwagger? = null,

    val fromOffice: GetFromOfficeStandingInstructionSwagger? = null,

    val id: kotlin.Long? = null,

    val instructionType: GetInstructionTypeStandingInstructionSwagger? = null,

    val name: kotlin.String? = null,

    val priority: GetPriorityStandingInstructionSwagger? = null,

    val recurrenceFrequency: GetRecurrenceFrequencyStandingInstructionSwagger? = null,

    val recurrenceInterval: kotlin.Int? = null,

    @Contextual
    val recurrenceOnMonthDay: LocalDate? = null,

    val recurrenceType: GetRecurrenceTypeStandingInstructionSwagger? = null,

    val status: GetStatusStandingInstructionSwagger? = null,

    val toAccount: GetToAccountStandingInstructionSwagger? = null,

    val toAccountType: GetToAccountTypeStandingInstructionSwagger? = null,

    val toClient: GetToClientStandingInstructionSwagger? = null,

    val toOffice: GetToOfficeStandingInstructionSwagger? = null,

    val transferType: GetTransferTypeStandingInstructionSwagger? = null,

    @Contextual
    val validFrom: LocalDate? = null,

)
