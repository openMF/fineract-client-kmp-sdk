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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetLoanCollateralManagementTemplate
 *
 * @param basePrice
 * @param collateralId
 * @param name
 * @param pctToBase
 * @param quantity
 */

@Serializable
data class GetLoanCollateralManagementTemplate(

    @Contextual
    val basePrice: LocalDateTime? = null,

    val collateralId: kotlin.Long? = null,

    val name: kotlin.String? = null,

    @Contextual
    val pctToBase: LocalDateTime? = null,

    @Contextual
    val quantity: LocalDateTime? = null,

)
