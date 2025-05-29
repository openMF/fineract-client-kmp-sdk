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
 * @param createdByFirstname
 * @param createdByLastname
 * @param createdByUsername
 * @param createdOnDate
 * @param updatedByFirstname
 * @param updatedByLastname
 * @param updatedByUsername
 * @param updatedOnDate
 */

@Serializable
data class ReportMailingJobTimelineData(

    val createdByFirstname: kotlin.String? = null,

    val createdByLastname: kotlin.String? = null,

    val createdByUsername: kotlin.String? = null,

    @Contextual
    val createdOnDate: LocalDate? = null,

    val updatedByFirstname: kotlin.String? = null,

    val updatedByLastname: kotlin.String? = null,

    val updatedByUsername: kotlin.String? = null,

    @Contextual
    val updatedOnDate: LocalDate? = null,

)
