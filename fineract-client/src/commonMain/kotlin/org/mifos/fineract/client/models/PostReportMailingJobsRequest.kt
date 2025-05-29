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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PostReportMailingJobsRequest
 *
 * @param dateFormat
 * @param description
 * @param emailMessage
 * @param emailRecipients
 * @param emailSubject
 * @param isActive
 * @param locale
 * @param name
 * @param recurrence
 * @param startDateTime
 * @param stretchyReportId
 * @param stretchyReportParamMap
 */

@Serializable
data class PostReportMailingJobsRequest(

    val dateFormat: kotlin.String? = null,

    val description: kotlin.String? = null,

    val emailMessage: kotlin.String? = null,

    val emailRecipients: kotlin.String? = null,

    val emailSubject: kotlin.String? = null,

    val isActive: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val recurrence: kotlin.String? = null,

    @Contextual
    val startDateTime: LocalDateTime? = null,

    val stretchyReportId: kotlin.Long? = null,

    val stretchyReportParamMap: kotlin.String? = null,

)
