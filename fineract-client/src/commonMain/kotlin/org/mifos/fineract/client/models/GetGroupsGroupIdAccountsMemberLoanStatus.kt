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
 *
 *
 * @param active
 * @param closed
 * @param closedObligationsMet
 * @param closedRescheduled
 * @param closedWrittenOff
 * @param code
 * @param description
 * @param id
 * @param overpaid
 * @param pendingApproval
 * @param waitingForDisbursal
 */

@Serializable
data class GetGroupsGroupIdAccountsMemberLoanStatus(

    val active: kotlin.Boolean? = null,

    val closed: kotlin.Boolean? = null,

    val closedObligationsMet: kotlin.Boolean? = null,

    val closedRescheduled: kotlin.Boolean? = null,

    val closedWrittenOff: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val overpaid: kotlin.Boolean? = null,

    val pendingApproval: kotlin.Boolean? = null,

    val waitingForDisbursal: kotlin.Boolean? = null,

)
