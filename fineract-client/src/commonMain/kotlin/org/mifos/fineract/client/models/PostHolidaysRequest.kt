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
 * PostHolidaysRequest
 *
 * @param dateFormat
 * @param description
 * @param fromDate
 * @param locale
 * @param name
 * @param offices
 * @param repaymentsRescheduledTo
 * @param toDate
 */

@Serializable
data class PostHolidaysRequest(

    val dateFormat: kotlin.String? = null,

    val description: kotlin.String? = null,

    @Contextual
    val fromDate: LocalDate? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val offices: kotlin.collections.List<PostHolidaysRequestOffices>? = null,

    @Contextual
    val repaymentsRescheduledTo: LocalDate? = null,

    @Contextual
    val toDate: LocalDate? = null,

)
