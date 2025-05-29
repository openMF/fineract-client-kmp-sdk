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
 *
 *
 * @param accountNonExpired
 * @param accountNonLocked
 * @param appUserClientMappings
 * @param authorities
 * @param bypassUser
 * @param credentialsNonExpired
 * @param deleted
 * @param displayName
 * @param email
 * @param enabled
 * @param firstname
 * @param id
 * @param lastTimePasswordUpdated
 * @param lastname
 * @param new
 * @param notEnabled
 * @param office
 * @param password
 * @param passwordNeverExpires
 * @param roles
 * @param selfServiceUser
 * @param staff
 * @param staffDisplayName
 * @param staffId
 * @param systemUser
 * @param username
 */

@Serializable
data class AppUser(

    val accountNonExpired: kotlin.Boolean? = null,

    val accountNonLocked: kotlin.Boolean? = null,

    val appUserClientMappings: kotlin.collections.Set<AppUserClientMapping>? = null,

    val authorities: kotlin.collections.List<GrantedAuthority>? = null,

    val bypassUser: kotlin.Boolean? = null,

    val credentialsNonExpired: kotlin.Boolean? = null,

    val deleted: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val email: kotlin.String? = null,

    val enabled: kotlin.Boolean? = null,

    val firstname: kotlin.String? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val lastTimePasswordUpdated: LocalDate? = null,

    val lastname: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val notEnabled: kotlin.Boolean? = null,

    val office: Office? = null,

    val password: kotlin.String? = null,

    val passwordNeverExpires: kotlin.Boolean? = null,

    val roles: kotlin.collections.Set<Role>? = null,

    val selfServiceUser: kotlin.Boolean? = null,

    val staff: Staff? = null,

    val staffDisplayName: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    val systemUser: kotlin.Boolean? = null,

    val username: kotlin.String? = null,

)
