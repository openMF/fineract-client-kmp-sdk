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
 * GetClientsClientIdResponse
 *
 * @param accountNo
 * @param activationDate
 * @param active
 * @param displayName
 * @param emailAddress
 * @param externalId
 * @param firstname
 * @param groups
 * @param id
 * @param lastname
 * @param officeId
 * @param officeName
 * @param savingsProductId
 * @param savingsProductName
 * @param status
 * @param timeline
 */

@Serializable
data class GetClientsClientIdResponse(

    val accountNo: kotlin.String? = null,

    val activationDate: List<Int>? = null,

    val active: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val emailAddress: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val groups: kotlin.collections.List<GetClientsGroups>? = null,

    val id: kotlin.Long? = null,

    val lastname: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

    val status: GetClientsClientIdStatus? = null,

    val timeline: GetClientsTimeline? = null,

)
