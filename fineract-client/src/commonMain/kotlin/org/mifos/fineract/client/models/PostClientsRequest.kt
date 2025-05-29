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
 * PostClientsRequest
 *
 * @param activationDate
 * @param active
 * @param address Address requests
 * @param datatables List of PostClientsDatatable
 * @param dateFormat
 * @param dateOfBirth
 * @param emailAddress
 * @param externalId
 * @param firstname
 * @param fullname
 * @param groupId
 * @param lastname
 * @param legalFormId
 * @param locale
 * @param middlename
 * @param mobileNo
 * @param officeId
 */

@Serializable
data class PostClientsRequest(

    val activationDate: kotlin.String? = null,

    val active: kotlin.Boolean? = null,

    val address: kotlin.collections.List<PostClientsAddressRequest>? = null,

    val datatables: kotlin.collections.List<PostClientsDatatable>? = null,

    val dateFormat: kotlin.String? = null,

    @Contextual
    val dateOfBirth: LocalDate? = null,

    val emailAddress: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val fullname: kotlin.String? = null,

    val groupId: kotlin.Long? = null,

    val lastname: kotlin.String? = null,

    val legalFormId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val middlename: kotlin.String? = null,

    val mobileNo: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

)
