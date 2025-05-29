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
 * Address requests
 *
 * @param addressLine1
 * @param addressLine2
 * @param addressLine3
 * @param addressTypeId
 * @param city
 * @param countryId
 * @param isActive
 * @param postalCode
 * @param stateProvinceId
 * @param street
 */

@Serializable
data class PostClientsAddressRequest(

    val addressLine1: kotlin.String? = null,

    val addressLine2: kotlin.String? = null,

    val addressLine3: kotlin.String? = null,

    val addressTypeId: kotlin.Long? = null,

    val city: kotlin.String? = null,

    val countryId: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val postalCode: kotlin.Long? = null,

    val stateProvinceId: kotlin.Long? = null,

    val street: kotlin.String? = null,

)
