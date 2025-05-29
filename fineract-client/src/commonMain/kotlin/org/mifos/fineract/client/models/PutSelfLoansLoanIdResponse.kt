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
 * PutSelfLoansLoanIdResponse
 *
 * @param changes
 * @param clientId
 * @param loanId
 * @param officeId
 * @param resourceId
 */

@Serializable
data class PutSelfLoansLoanIdResponse(

    val changes: PutSelfLoansChanges? = null,

    val clientId: kotlin.Int? = null,

    val loanId: kotlin.Int? = null,

    val officeId: kotlin.Int? = null,

    val resourceId: kotlin.Int? = null,

)
