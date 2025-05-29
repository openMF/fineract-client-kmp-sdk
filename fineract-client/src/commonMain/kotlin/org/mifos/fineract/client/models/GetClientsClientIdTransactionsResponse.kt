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
 * GetClientsClientIdTransactionsResponse
 *
 * @param pageItems
 * @param totalFilteredRecords
 */

@Serializable
data class GetClientsClientIdTransactionsResponse(

    val pageItems: kotlin.collections.Set<GetClientsPageItems>? = null,

    val totalFilteredRecords: kotlin.Int? = null,

)
