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
 * @param borrowerCycleNumber
 * @param defaultValue
 * @param id
 * @param maxValue
 * @param minValue
 * @param paramType
 * @param valueConditionType
 */

@Serializable
data class GetLoanProductsPrincipalVariationsForBorrowerCycle(

    val borrowerCycleNumber: kotlin.Int? = null,

    val defaultValue: kotlin.Double? = null,

    val id: kotlin.Long? = null,

    val maxValue: kotlin.Double? = null,

    val minValue: kotlin.Double? = null,

    val paramType: GetLoanProductsParamType? = null,

    val valueConditionType: GetLoanProductsValueConditionType? = null,

)
