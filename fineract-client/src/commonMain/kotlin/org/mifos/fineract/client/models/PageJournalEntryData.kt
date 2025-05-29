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
 * @param content
 * @param empty
 * @param first
 * @param last
 * @param number
 * @param numberOfElements
 * @param pageable
 * @param propertySize
 * @param sort
 * @param totalElements
 * @param totalPages
 */

@Serializable
data class PageJournalEntryData(

    val content: kotlin.collections.List<JournalEntryData>? = null,

    val empty: kotlin.Boolean? = null,

    val first: kotlin.Boolean? = null,

    val last: kotlin.Boolean? = null,

    val number: kotlin.Int? = null,

    val numberOfElements: kotlin.Int? = null,

    val pageable: Pageable? = null,

    val propertySize: kotlin.Int? = null,

    val sort: Sort? = null,

    val totalElements: kotlin.Long? = null,

    val totalPages: kotlin.Int? = null,

)
