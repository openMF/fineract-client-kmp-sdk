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
 * GetMakerCheckersSearchTemplateResponse
 *
 * @param actionNames
 * @param appUsers
 * @param entityNames
 * @param processingResults
 */

@Serializable
data class GetMakerCheckersSearchTemplateResponse(

    val actionNames: kotlin.collections.List<kotlin.String>? = null,

    val appUsers: kotlin.collections.List<AppUserData>? = null,

    val entityNames: kotlin.collections.List<kotlin.String>? = null,

    val processingResults: kotlin.collections.List<ProcessingResultLookup>? = null,

)
