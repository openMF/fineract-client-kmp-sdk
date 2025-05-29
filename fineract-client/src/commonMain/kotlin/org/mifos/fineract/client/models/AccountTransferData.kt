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
 * @param fromAccountOptions
 * @param fromAccountType
 * @param fromAccountTypeOptions
 * @param fromClient
 * @param fromClientOptions
 * @param fromOffice
 * @param fromOfficeOptions
 * @param id
 * @param reversed
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
 * @param transferDescription
 */

@Serializable
data class AccountTransferData(

    val currency: CurrencyData? = null,

    val fromAccount: PortfolioAccountData? = null,

    val fromAccountOptions: kotlin.collections.List<PortfolioAccountData>? = null,

    val fromAccountType: EnumOptionData? = null,

    val fromAccountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val fromClient: ClientData? = null,

    val fromClientOptions: kotlin.collections.List<ClientData>? = null,

    val fromOffice: OfficeData? = null,

    val fromOfficeOptions: kotlin.collections.List<OfficeData>? = null,

    val id: kotlin.Long? = null,

    val reversed: kotlin.Boolean? = null,

    val toAccount: PortfolioAccountData? = null,

    val toAccountOptions: kotlin.collections.List<PortfolioAccountData>? = null,

    val toAccountType: EnumOptionData? = null,

    val toAccountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val toClient: ClientData? = null,

    val toClientOptions: kotlin.collections.List<ClientData>? = null,

    val toOffice: OfficeData? = null,

    val toOfficeOptions: kotlin.collections.List<OfficeData>? = null,

    @Contextual
    val transferAmount: Double? = null,

    @Contextual
    val transferDate: LocalDate? = null,

    val transferDescription: kotlin.String? = null,

)
