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
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param campaignName
 * @param campaignStatus
 * @param campaignType
 * @param id
 * @param lastTriggerDate
 * @param message
 * @param nextTriggerDate
 * @param notification
 * @param paramValue
 * @param recurrence
 * @param recurrenceStartDate
 * @param reportName
 * @param runReportId
 */

@Serializable
data class SmsCampaignData(

    val campaignName: kotlin.String? = null,

    val campaignStatus: EnumOptionData? = null,

    val campaignType: EnumOptionData? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val lastTriggerDate: LocalDate? = null,

    val message: kotlin.String? = null,

    @Contextual
    val nextTriggerDate: LocalDateTime? = null,

    val notification: kotlin.Boolean? = null,

    val paramValue: kotlin.String? = null,

    val recurrence: kotlin.String? = null,

    @Contextual
    val recurrenceStartDate: LocalDateTime? = null,

    val reportName: kotlin.String? = null,

    val runReportId: kotlin.Long? = null,

)
