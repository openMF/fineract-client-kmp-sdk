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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetReportsResponse
 *
 * @param coreReport
 * @param description
 * @param id
 * @param reportCategory
 * @param reportName
 * @param reportParameters
 * @param reportSql
 * @param reportSubType
 * @param reportType
 * @param useReport
 */

@Serializable
data class GetReportsResponse(

    val coreReport: kotlin.Boolean? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val reportCategory: kotlin.String? = null,

    val reportName: kotlin.String? = null,

    val reportParameters: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val reportSql: kotlin.String? = null,

    val reportSubType: kotlin.String? = null,

    val reportType: kotlin.String? = null,

    val useReport: kotlin.Boolean? = null,

)
