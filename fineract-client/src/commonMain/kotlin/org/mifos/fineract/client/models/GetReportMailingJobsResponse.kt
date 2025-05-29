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
 * GetReportMailingJobsResponse
 *
 * @param description
 * @param emailAttachmentFileFormat
 * @param emailMessage
 * @param emailRecipients
 * @param emailSubject
 * @param id
 * @param isActive
 * @param name
 * @param nextRunDateTime
 * @param numberOfRuns
 * @param recurrence
 * @param runAsUserId
 * @param startDateTime
 * @param stretchyReport
 * @param stretchyReportParamMap
 * @param timeline
 */

@Serializable
data class GetReportMailingJobsResponse(

    val description: kotlin.String? = null,

    val emailAttachmentFileFormat: EnumOptionData? = null,

    val emailMessage: kotlin.String? = null,

    val emailRecipients: kotlin.String? = null,

    val emailSubject: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    @Contextual
    val nextRunDateTime: LocalDateTime? = null,

    val numberOfRuns: kotlin.Int? = null,

    val recurrence: kotlin.String? = null,

    val runAsUserId: kotlin.Long? = null,

    @Contextual
    val startDateTime: LocalDateTime? = null,

    @Contextual
    val stretchyReport: kotlin.Any? = null,

    val stretchyReportParamMap: kotlin.String? = null,

    val timeline: ReportMailingJobTimelineData? = null,

)
