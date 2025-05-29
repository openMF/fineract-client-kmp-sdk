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
 * @param currency
 * @param fromAccount
 * @param fromAccountType
 * @param fromClient
 * @param fromOffice
 * @param id
 * @param reversed
 * @param toAccount
 * @param toAccountType
 * @param toClient
 * @param toOffice
 * @param transferAmount
 * @param transferDate
 * @param transferDescription
 */

@Serializable
data class GetAccountTransfersPageItems(

    val currency: GetAccountTransfersPageItemsCurrency? = null,

    val fromAccount: GetAccountTransfersPageItemsFromAccount? = null,

    val fromAccountType: GetAccountTransfersFromAccountType? = null,

    val fromClient: GetAccountTransfersFromClientOptions? = null,

    val fromOffice: GetAccountTransfersPageItemsFromOffice? = null,

    val id: kotlin.Long? = null,

    val reversed: kotlin.Boolean? = null,

    val toAccount: GetAccountTransfersPageItemsFromAccount? = null,

    val toAccountType: GetAccountTransfersPageItemsToAccountType? = null,

    val toClient: GetAccountTransfersFromClientOptions? = null,

    val toOffice: GetAccountTransfersPageItemsFromOffice? = null,

    val transferAmount: kotlin.Float? = null,

    @Contextual
    val transferDate: LocalDate? = null,

    val transferDescription: kotlin.String? = null,

)
