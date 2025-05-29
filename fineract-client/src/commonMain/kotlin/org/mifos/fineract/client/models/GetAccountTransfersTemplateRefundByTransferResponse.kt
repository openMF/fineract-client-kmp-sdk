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
 * GetAccountTransfersTemplateRefundByTransferResponse
 *
 * @param currency
 * @param fromAccount
 * @param fromAccountOptions
 * @param fromAccountType
 * @param fromAccountTypeOptions
 * @param fromClient
 * @param fromClientOptions
 * @param fromOffice
 * @param fromOfficeOptions
 * @param toAccount
 * @param toAccountOptions
 * @param toAccountType
 * @param toAccountTypeOptions
 * @param toClient
 * @param toClientOptions
 * @param toOffice
 * @param toOfficeOptions
 * @param transferAmount
 * @param transferDate
 */

@Serializable
data class GetAccountTransfersTemplateRefundByTransferResponse(

    val currency: GetAccountTransfersTemplateRefundByTransferCurrency? = null,

    val fromAccount: GetAccountTransfersTemplateRefundByTransferFromAccount? = null,

    val fromAccountOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferFromAccountOptions>? = null,

    val fromAccountType: GetAccountTransfersPageItemsToAccountType? = null,

    val fromAccountTypeOptions: kotlin.collections.Set<GetAccountTransfersFromAccountType>? = null,

    val fromClient: GetAccountTransfersTemplateRefundByTransferFromClient? = null,

    val fromClientOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferFromClientOptions>? = null,

    val fromOffice: GetAccountTransfersTemplateRefundByTransferFromOffice? = null,

    val fromOfficeOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions>? = null,

    val toAccount: GetAccountTransfersTemplateRefundByTransferToAccount? = null,

    val toAccountOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferToAccount>? = null,

    val toAccountType: GetAccountTransfersFromAccountType? = null,

    val toAccountTypeOptions: kotlin.collections.Set<GetAccountTransfersFromAccountType>? = null,

    val toClient: GetAccountTransfersTemplateRefundByTransferToClient? = null,

    val toClientOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferFromClientOptions>? = null,

    val toOffice: GetAccountTransfersTemplateRefundByTransferFromOffice? = null,

    val toOfficeOptions: kotlin.collections.Set<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions>? = null,

    val transferAmount: kotlin.Float? = null,

    @Contextual
    val transferDate: LocalDate? = null,

)
