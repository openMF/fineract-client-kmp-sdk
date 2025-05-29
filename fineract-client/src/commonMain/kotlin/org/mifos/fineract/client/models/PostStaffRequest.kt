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
 * PostStaffRequest
 *
 * @param dateFormat
 * @param externalId
 * @param firstname
 * @param isActive
 * @param isLoanOfficer
 * @param joiningDate
 * @param lastname
 * @param locale
 * @param mobileNo
 * @param officeId
 */

@Serializable
data class PostStaffRequest(

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val isActive: kotlin.Boolean? = null,

    val isLoanOfficer: kotlin.Boolean? = null,

    @Contextual
    val joiningDate: LocalDate? = null,

    val lastname: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val mobileNo: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

)
