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
 * GetTellersTellerIdCashiersCashierIdResponse
 *
 * @param description
 * @param endDate
 * @param endTime
 * @param id
 * @param isFullDay
 * @param staffId
 * @param staffName
 * @param startDate
 * @param startTime
 * @param tellerId
 * @param tellerName
 */

@Serializable
data class GetTellersTellerIdCashiersCashierIdResponse(

    val description: kotlin.String? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val endTime: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isFullDay: kotlin.Boolean? = null,

    val staffId: kotlin.Long? = null,

    val staffName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val startTime: kotlin.String? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null,

)
