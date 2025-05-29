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
 * @param dateFormat
 * @param dateTimeFormat
 * @param locale
 * @param localeObject
 * @param page
 * @param request
 * @param propertySize
 * @param sorts
 */

@Serializable
data class PagedLocalRequestAdvancedQueryRequest(

    val dateFormat: kotlin.String? = null,

    val dateTimeFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val localeObject: PagedLocalRequestAdvancedQueryDataLocaleObject? = null,

    val page: kotlin.Int? = null,

    val request: AdvancedQueryRequest? = null,

    val propertySize: kotlin.Int? = null,

    val sorts: kotlin.collections.List<SortOrder>? = null,

)
