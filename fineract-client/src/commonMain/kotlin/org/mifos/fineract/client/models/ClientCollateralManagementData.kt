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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param id
 * @param name
 * @param pctToBase
 * @param quantity
 * @param total
 * @param totalCollateral
 * @param unitPrice
 */

@Serializable
data class ClientCollateralManagementData(

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    @Contextual
    val pctToBase: Double? = null,

    @Contextual
    val quantity: Double? = null,

    @Contextual
    val total: Double? = null,

    @Contextual
    val totalCollateral: Double? = null,

    @Contextual
    val unitPrice: Double? = null,

)
