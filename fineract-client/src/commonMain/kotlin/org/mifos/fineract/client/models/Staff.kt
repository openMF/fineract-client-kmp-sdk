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
 * @param active
 * @param displayName
 * @param emailAddress
 * @param externalId
 * @param firstname
 * @param id
 * @param image
 * @param joiningDate
 * @param lastname
 * @param loanOfficer
 * @param mobileNo
 * @param new
 * @param notActive
 * @param notLoanOfficer
 * @param office
 * @param organisationalRoleParentStaff
 * @param organisationalRoleType
 */

@Serializable
data class Staff(

    val active: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val emailAddress: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val image: Image? = null,

    @Contextual
    val joiningDate: LocalDate? = null,

    val lastname: kotlin.String? = null,

    val loanOfficer: kotlin.Boolean? = null,

    val mobileNo: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val notActive: kotlin.Boolean? = null,

    val notLoanOfficer: kotlin.Boolean? = null,

    val office: Office? = null,

    val organisationalRoleParentStaff: Staff? = null,

    val organisationalRoleType: kotlin.Int? = null,

)
