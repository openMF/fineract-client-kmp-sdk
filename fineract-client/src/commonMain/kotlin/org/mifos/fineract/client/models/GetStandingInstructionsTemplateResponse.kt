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
 * GetStandingInstructionsTemplateResponse
 *
 * @param fromAccountType
 * @param fromAccountTypeOptions
 * @param fromClientOptions
 * @param fromOffice
 * @param fromOfficeOptions
 * @param instructionTypeOptions
 * @param priorityOptions
 * @param recurrenceFrequencyOptions
 * @param recurrenceTypeOptions
 * @param statusOptions
 * @param toAccountTypeOptions
 * @param toOfficeOptions
 * @param transferTypeOptions
 */

@Serializable
data class GetStandingInstructionsTemplateResponse(

    val fromAccountType: GetFromAccountTypeResponseStandingInstructionSwagger? = null,

    val fromAccountTypeOptions: kotlin.collections.Set<GetFromAccountTypeOptionsResponseStandingInstructionSwagger>? = null,

    val fromClientOptions: kotlin.collections.Set<GetFromClientOptionsResponseStandingInstructionSwagger>? = null,

    val fromOffice: GetFromOfficeResponseStandingInstructionSwagger? = null,

    val fromOfficeOptions: kotlin.collections.Set<GetFromOfficeOptionsResponseStandingInstructionSwagger>? = null,

    val instructionTypeOptions: kotlin.collections.Set<GetInstructionTypeOptionsResponseStandingInstructionSwagger>? = null,

    val priorityOptions: kotlin.collections.Set<GetPriorityOptionsResponseStandingInstructionSwagger>? = null,

    val recurrenceFrequencyOptions: kotlin.collections.Set<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger>? = null,

    val recurrenceTypeOptions: kotlin.collections.Set<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger>? = null,

    val statusOptions: kotlin.collections.Set<GetStatusOptionsResponseStandingInstructionSwagger>? = null,

    val toAccountTypeOptions: kotlin.collections.Set<GetToAccountTypeOptionsResponseStandingInstructionSwagger>? = null,

    val toOfficeOptions: kotlin.collections.Set<GetToOfficeOptionsResponseStandingInstructionSwagger>? = null,

    val transferTypeOptions: kotlin.collections.Set<GetTransferTypeOptionsResponseStandingInstructionSwagger>? = null,

)
