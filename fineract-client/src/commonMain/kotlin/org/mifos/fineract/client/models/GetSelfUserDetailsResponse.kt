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
 * GetSelfUserDetailsResponse
 *
 * @param authenticated
 * @param base64EncodedAuthenticationKey
 * @param clients
 * @param isSelfServiceUser
 * @param officeId
 * @param officeName
 * @param organisationalRole
 * @param permissions
 * @param roles
 * @param staffDisplayName
 * @param staffId
 * @param userId
 * @param username
 */

@Serializable
data class GetSelfUserDetailsResponse(

    val authenticated: kotlin.Boolean? = null,

    val base64EncodedAuthenticationKey: kotlin.String? = null,

    val clients: kotlin.collections.List<kotlin.Int>? = null,

    val isSelfServiceUser: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val organisationalRole: GetSelfUserDetailsOrganisationalRole? = null,

    val permissions: kotlin.collections.List<kotlin.String>? = null,

    val roles: kotlin.collections.Set<GetSelfUserDetailsRoles>? = null,

    val staffDisplayName: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    val userId: kotlin.Long? = null,

    val username: kotlin.String? = null,

)
