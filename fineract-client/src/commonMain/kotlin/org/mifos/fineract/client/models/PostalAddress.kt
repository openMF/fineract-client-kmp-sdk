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
 * @param addressLine1
 * @param addressLine2
 * @param city
 * @param country
 * @param postalCode
 * @param stateProvince
 */

@Serializable
data class PostalAddress(

    val addressLine1: kotlin.String? = null,

    val addressLine2: kotlin.String? = null,

    val city: kotlin.String? = null,

    val country: kotlin.String? = null,

    val postalCode: kotlin.String? = null,

    val stateProvince: kotlin.String? = null,

)
