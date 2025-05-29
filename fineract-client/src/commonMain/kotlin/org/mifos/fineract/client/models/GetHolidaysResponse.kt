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
 * GetHolidaysResponse
 *
 * @param fromDate
 * @param id
 * @param name
 * @param officeId
 * @param repaymentsRescheduledTo
 * @param status
 * @param toDate
 */

@Serializable
data class GetHolidaysResponse(

    @Contextual
    val fromDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    @Contextual
    val repaymentsRescheduledTo: LocalDate? = null,

    val status: EnumOptionData? = null,

    @Contextual
    val toDate: LocalDate? = null,

)
