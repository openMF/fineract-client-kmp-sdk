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
 *
 *
 * @param endDateTime
 * @param errorLog
 * @param errorMessage
 * @param id
 * @param reportMailingJobId
 * @param startDateTime
 * @param status
 */

@Serializable
data class ReportMailingJobRunHistoryData(

    @Contextual
    val endDateTime: LocalDateTime? = null,

    val errorLog: kotlin.String? = null,

    val errorMessage: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val reportMailingJobId: kotlin.Long? = null,

    @Contextual
    val startDateTime: LocalDateTime? = null,

    val status: kotlin.String? = null,

)
