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
 * GetAccountsLinkedToPocketResponse
 *
 * @param loanAccounts
 * @param savingAccounts
 * @param shareAccounts
 */

@Serializable
data class GetAccountsLinkedToPocketResponse(

    val loanAccounts: kotlin.collections.Set<GetPocketLoanAccounts>? = null,

    val savingAccounts: kotlin.collections.Set<GetPocketSavingAccounts>? = null,

    val shareAccounts: kotlin.collections.Set<@Contextual kotlin.Any>? = null,

)
