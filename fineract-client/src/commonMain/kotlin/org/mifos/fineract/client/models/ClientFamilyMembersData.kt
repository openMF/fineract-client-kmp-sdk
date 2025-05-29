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
 * @param age
 * @param clientId
 * @param dateOfBirth
 * @param firstName
 * @param gender
 * @param genderId
 * @param id
 * @param isDependent
 * @param lastName
 * @param maritalStatus
 * @param maritalStatusId
 * @param middleName
 * @param mobileNumber
 * @param profession
 * @param professionId
 * @param qualification
 * @param relationship
 * @param relationshipId
 */

@Serializable
data class ClientFamilyMembersData(

    val age: kotlin.Long? = null,

    val clientId: kotlin.Long? = null,

    @Contextual
    val dateOfBirth: LocalDate? = null,

    val firstName: kotlin.String? = null,

    val gender: kotlin.String? = null,

    val genderId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val isDependent: kotlin.Boolean? = null,

    val lastName: kotlin.String? = null,

    val maritalStatus: kotlin.String? = null,

    val maritalStatusId: kotlin.Long? = null,

    val middleName: kotlin.String? = null,

    val mobileNumber: kotlin.String? = null,

    val profession: kotlin.String? = null,

    val professionId: kotlin.Long? = null,

    val qualification: kotlin.String? = null,

    val relationship: kotlin.String? = null,

    val relationshipId: kotlin.Long? = null,

)
