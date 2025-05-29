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
 * GetSelfLoansTemplateResponse
 *
 * @param clientId
 * @param clientName
 * @param clientOfficeId
 * @param productOptions
 * @param timeline
 */

@Serializable
data class GetSelfLoansTemplateResponse(

    val clientId: kotlin.Int? = null,

    val clientName: kotlin.String? = null,

    val clientOfficeId: kotlin.Int? = null,

    val productOptions: kotlin.collections.Set<GetSelfLoansProductOptions>? = null,

    val timeline: GetSelfLoansTimeline? = null,

)
