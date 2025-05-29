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

import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountNo
 * @param collectionMeetingCalendar
 * @param datatables
 * @param hierarchy
 * @param id
 * @param name
 * @param officeName
 * @param rowIndex
 * @param staffName
 */

@Serializable
data class CenterData(

    val accountNo: kotlin.String? = null,

    val collectionMeetingCalendar: CalendarData? = null,

    val datatables: kotlin.collections.List<DatatableData>? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val officeName: kotlin.String? = null,

    val rowIndex: kotlin.Int? = null,

    val staffName: kotlin.String? = null,

)
