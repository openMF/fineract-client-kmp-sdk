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
 * @param action
 * @param actorId
 * @param content
 * @param createdAt
 * @param id
 * @param isRead
 * @param isSystemGenerated
 * @param objectId
 * @param objectType
 * @param officeId
 * @param tenantIdentifier
 * @param userIds
 */

@Serializable
data class GetNotification(

    val action: kotlin.String? = null,

    val actorId: kotlin.Long? = null,

    val content: kotlin.String? = null,

    val createdAt: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isRead: kotlin.Boolean? = null,

    val isSystemGenerated: kotlin.Boolean? = null,

    val objectId: kotlin.Long? = null,

    val objectType: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val tenantIdentifier: kotlin.String? = null,

    val userIds: kotlin.collections.List<kotlin.Long>? = null,

)
