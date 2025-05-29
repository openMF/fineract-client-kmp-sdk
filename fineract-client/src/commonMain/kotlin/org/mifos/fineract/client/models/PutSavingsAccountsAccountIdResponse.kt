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
 * PutSavingsAccountsAccountIdResponse
 *
 * @param changes
 * @param clientId
 * @param officeId
 * @param resourceId
 * @param savingsId
 */

@Serializable
data class PutSavingsAccountsAccountIdResponse(

    val changes: PutSavingsAccountsChanges? = null,

    val clientId: kotlin.Int? = null,

    val officeId: kotlin.Int? = null,

    val resourceId: kotlin.Int? = null,

    val savingsId: kotlin.Int? = null,

)
