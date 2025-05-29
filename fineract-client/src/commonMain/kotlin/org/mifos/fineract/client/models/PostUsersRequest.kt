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
 * PostUsersRequest
 *
 * @param clients
 * @param email
 * @param firstname
 * @param isSelfServiceUser
 * @param lastname
 * @param officeId
 * @param password
 * @param passwordNeverExpires
 * @param repeatPassword
 * @param roles
 * @param sendPasswordToEmail
 * @param staffId
 * @param username
 */

@Serializable
data class PostUsersRequest(

    val clients: kotlin.collections.List<kotlin.Long>? = null,

    val email: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val isSelfServiceUser: kotlin.Boolean? = null,

    val lastname: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val password: kotlin.String? = null,

    val passwordNeverExpires: kotlin.Boolean? = null,

    val repeatPassword: kotlin.String? = null,

    val roles: kotlin.collections.List<kotlin.Long>? = null,

    val sendPasswordToEmail: kotlin.Boolean? = null,

    val staffId: kotlin.Long? = null,

    val username: kotlin.String? = null,

)
