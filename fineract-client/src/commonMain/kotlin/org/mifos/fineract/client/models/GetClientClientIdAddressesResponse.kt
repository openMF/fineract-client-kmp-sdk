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
 * GetClientClientIdAddressesResponse
 *
 * @param addressId
 * @param addressLine1
 * @param addressLine2
 * @param addressLine3
 * @param addressType
 * @param addressTypeId
 * @param city
 * @param clientId
 * @param countryId
 * @param countryName
 * @param countyDistrict
 * @param createdBy
 * @param isActive
 * @param postalCode
 * @param stateName
 * @param stateProvinceId
 * @param street
 * @param townVillage
 * @param updatedBy
 */

@Serializable
data class GetClientClientIdAddressesResponse(

    val addressId: kotlin.Long? = null,

    val addressLine1: kotlin.String? = null,

    val addressLine2: kotlin.String? = null,

    val addressLine3: kotlin.String? = null,

    val addressType: kotlin.String? = null,

    val addressTypeId: kotlin.Long? = null,

    val city: kotlin.String? = null,

    val clientId: kotlin.Long? = null,

    val countryId: kotlin.Long? = null,

    val countryName: kotlin.String? = null,

    val countyDistrict: kotlin.String? = null,

    val createdBy: kotlin.String? = null,

    val isActive: kotlin.Boolean? = null,

    val postalCode: kotlin.Long? = null,

    val stateName: kotlin.String? = null,

    val stateProvinceId: kotlin.Long? = null,

    val street: kotlin.String? = null,

    val townVillage: kotlin.String? = null,

    val updatedBy: kotlin.String? = null,

)
