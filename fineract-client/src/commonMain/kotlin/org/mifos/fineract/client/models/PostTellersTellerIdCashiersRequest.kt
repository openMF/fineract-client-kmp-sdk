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
 * PostTellersTellerIdCashiersRequest
 *
 * @param dateFormat
 * @param description
 * @param endDate
 * @param isFullDay
 * @param locale
 * @param staffId
 * @param startDate
 */

@Serializable
data class PostTellersTellerIdCashiersRequest(

    val dateFormat: kotlin.String? = null,

    val description: kotlin.String? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val isFullDay: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    @Contextual
    val startDate: LocalDate? = null,

)
