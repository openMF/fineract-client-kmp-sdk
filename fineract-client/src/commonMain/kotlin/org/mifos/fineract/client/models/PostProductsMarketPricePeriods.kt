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
 * @param fromDate
 * @param locale
 * @param shareValue
 */

@Serializable
data class PostProductsMarketPricePeriods(

    val dateFormat: kotlin.String? = null,

    val fromDate: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val shareValue: kotlin.Int? = null,

)
