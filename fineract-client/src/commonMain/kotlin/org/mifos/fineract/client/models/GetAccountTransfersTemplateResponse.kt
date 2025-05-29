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
 * GetAccountTransfersTemplateResponse
 *
 * @param fromAccountType
 * @param fromAccountTypeOptions
 * @param fromClientOptions
 * @param fromOffice
 * @param fromOfficeOptions
 * @param toAccountTypeOptions
 * @param toOfficeOptions
 * @param transferAmount
 * @param transferDate
 */

@Serializable
data class GetAccountTransfersTemplateResponse(

    val fromAccountType: GetAccountTransfersFromAccountType? = null,

    val fromAccountTypeOptions: kotlin.collections.Set<GetAccountTransfersFromAccountTypeOptions>? = null,

    val fromClientOptions: kotlin.collections.Set<GetAccountTransfersFromClientOptions>? = null,

    val fromOffice: GetAccountTransfersFromOffice? = null,

    val fromOfficeOptions: kotlin.collections.Set<GetAccountTransfersFromOfficeOptions>? = null,

    val toAccountTypeOptions: kotlin.collections.Set<GetAccountTransfersToAccountTypeOptions>? = null,

    val toOfficeOptions: kotlin.collections.Set<GetAccountTransfersToOfficeOptions>? = null,

    val transferAmount: kotlin.Long? = null,

    @Contextual
    val transferDate: LocalDate? = null,

)
