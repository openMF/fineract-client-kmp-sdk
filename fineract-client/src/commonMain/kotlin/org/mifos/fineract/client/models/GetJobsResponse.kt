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
 * GetJobsResponse
 *
 * @param active
 * @param cronExpression
 * @param currentlyRunning
 * @param displayName
 * @param initializingError
 * @param jobId
 * @param lastRunHistory
 * @param nextRunTime
 */

@Serializable
data class GetJobsResponse(

    val active: kotlin.Boolean? = null,

    val cronExpression: kotlin.String? = null,

    val currentlyRunning: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val initializingError: kotlin.String? = null,

    val jobId: kotlin.Long? = null,

    val lastRunHistory: JobDetailHistoryData? = null,

    @Contextual
    val nextRunTime: LocalDateTime? = null,

)
