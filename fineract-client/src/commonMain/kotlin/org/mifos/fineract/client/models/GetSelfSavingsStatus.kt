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
 * @param approved
 * @param closed
 * @param code
 * @param description
 * @param id
 * @param rejected
 * @param submittedAndPendingApproval
 * @param withdrawnByApplicant
 */

@Serializable
data class GetSelfSavingsStatus(

    val active: kotlin.Boolean? = null,

    val approved: kotlin.Boolean? = null,

    val closed: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Int? = null,

    val rejected: kotlin.Boolean? = null,

    val submittedAndPendingApproval: kotlin.Boolean? = null,

    val withdrawnByApplicant: kotlin.Boolean? = null,

)
