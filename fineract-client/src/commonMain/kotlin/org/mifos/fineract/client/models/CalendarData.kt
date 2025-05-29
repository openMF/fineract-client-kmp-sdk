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
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param calendarInstanceId
 * @param calendarTypeOptions
 * @param centerId
 * @param createdByUserId
 * @param createdByUsername
 * @param createdDate
 * @param dateFormat
 * @param description
 * @param duration
 * @param endDate
 * @param entityId
 * @param entityType
 * @param entityTypeOptions
 * @param firstReminder
 * @param frequency
 * @param frequencyNthDayTypeOptions
 * @param frequencyOptions
 * @param humanReadable
 * @param id
 * @param interval
 * @param lastUpdatedByUserId
 * @param lastUpdatedByUsername
 * @param lastUpdatedDate
 * @param locale
 * @param location
 * @param meetingTime
 * @param nextTenRecurringDates
 * @param recentEligibleMeetingDate
 * @param recurrence
 * @param recurringDates
 * @param remindBy
 * @param remindByOptions
 * @param repeating
 * @param repeatsOnDay
 * @param repeatsOnDayOfMonth
 * @param repeatsOnDayOptions
 * @param repeatsOnNthDayOfMonth
 * @param rowIndex
 * @param secondReminder
 * @param startDate
 * @param title
 * @param type
 * @param typeId
 */

@Serializable
data class CalendarData(

    val calendarInstanceId: kotlin.Long? = null,

    val calendarTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val centerId: kotlin.String? = null,

    val createdByUserId: kotlin.Long? = null,

    val createdByUsername: kotlin.String? = null,

    @Contextual
    val createdDate: LocalDate? = null,

    val dateFormat: kotlin.String? = null,

    val description: kotlin.String? = null,

    val duration: kotlin.Int? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val entityId: kotlin.Long? = null,

    val entityType: EnumOptionData? = null,

    val entityTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val firstReminder: kotlin.Int? = null,

    val frequency: EnumOptionData? = null,

    val frequencyNthDayTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val frequencyOptions: kotlin.collections.List<EnumOptionData>? = null,

    val humanReadable: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interval: kotlin.Int? = null,

    val lastUpdatedByUserId: kotlin.Long? = null,

    val lastUpdatedByUsername: kotlin.String? = null,

    @Contextual
    val lastUpdatedDate: LocalDate? = null,

    val locale: kotlin.String? = null,

    val location: kotlin.String? = null,

    @Contextual
    val meetingTime: LocalTime? = null,

    val nextTenRecurringDates: List<@Contextual LocalDate>? = null,

    @Contextual
    val recentEligibleMeetingDate: LocalDate? = null,

    val recurrence: kotlin.String? = null,

    val recurringDates: kotlin.collections.List<@Contextual LocalDate>? = null,

    val remindBy: EnumOptionData? = null,

    val remindByOptions: kotlin.collections.List<EnumOptionData>? = null,

    val repeating: kotlin.Boolean? = null,

    val repeatsOnDay: EnumOptionData? = null,

    val repeatsOnDayOfMonth: kotlin.Int? = null,

    val repeatsOnDayOptions: kotlin.collections.List<EnumOptionData>? = null,

    val repeatsOnNthDayOfMonth: EnumOptionData? = null,

    val rowIndex: kotlin.Int? = null,

    val secondReminder: kotlin.Int? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val title: kotlin.String? = null,

    val type: EnumOptionData? = null,

    val typeId: kotlin.String? = null,

)
