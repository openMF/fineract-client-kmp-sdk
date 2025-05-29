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
 * GetPaymentTypesPaymentTypeIdResponse
 *
 * @param codeName
 * @param description
 * @param id
 * @param isCashPayment
 * @param isSystemDefined
 * @param name
 * @param position
 */

@Serializable
data class GetPaymentTypesPaymentTypeIdResponse(

    val codeName: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isCashPayment: kotlin.Boolean? = null,

    val isSystemDefined: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val position: kotlin.Int? = null,

)
