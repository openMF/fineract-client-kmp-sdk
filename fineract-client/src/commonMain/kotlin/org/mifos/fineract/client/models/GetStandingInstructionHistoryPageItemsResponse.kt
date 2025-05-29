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
 *
 *
 * @param amount
 * @param errorLog
 * @param executionTime
 * @param fromAccount
 * @param fromAccountType
 * @param fromClient
 * @param fromOffice
 * @param name
 * @param standingInstructionId
 * @param status
 * @param toAccount
 * @param toAccountType
 * @param toClient
 * @param toOffice
 */

@Serializable
data class GetStandingInstructionHistoryPageItemsResponse(

    val amount: kotlin.Float? = null,

    val errorLog: kotlin.String? = null,

    @Contextual
    val executionTime: LocalDate? = null,

    val fromAccount: GetStandingInstructionHistoryFromAccount? = null,

    val fromAccountType: GetFromAccountTypeStandingInstructionSwagger? = null,

    val fromClient: GetStandingInstructionHistoryPageItemsFromClient? = null,

    val fromOffice: GetFromOfficeStandingInstructionSwagger? = null,

    val name: kotlin.String? = null,

    val standingInstructionId: kotlin.Long? = null,

    val status: kotlin.String? = null,

    val toAccount: GetStandingInstructionHistoryToAccount? = null,

    val toAccountType: GetToAccountTypeStandingInstructionSwagger? = null,

    val toClient: GetStandingInstructionHistoryToClient? = null,

    val toOffice: GetToOfficeStandingInstructionSwagger? = null,

)
