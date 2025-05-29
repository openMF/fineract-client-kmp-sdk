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
 * @param offset
 * @param pageNumber
 * @param pageSize
 * @param paged
 * @param sort
 * @param unpaged
 */

@Serializable
data class Pageable(

    val offset: kotlin.Long? = null,

    val pageNumber: kotlin.Int? = null,

    val pageSize: kotlin.Int? = null,

    val paged: kotlin.Boolean? = null,

    val sort: Sort? = null,

    val unpaged: kotlin.Boolean? = null,

)
