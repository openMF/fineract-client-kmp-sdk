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
 * @param defaultDifferentialLendingRate
 * @param floatingInterestRateCalculationAllowed
 * @param floatingRate
 * @param id
 * @param interestRateDifferential
 * @param loanProduct
 * @param maxDifferentialLendingRate
 * @param minDifferentialLendingRate
 * @param new
 */

@Serializable
data class LoanProductFloatingRates(

    @Contextual
    val defaultDifferentialLendingRate: Double? = null,

    val floatingInterestRateCalculationAllowed: kotlin.Boolean? = null,

    val floatingRate: FloatingRate? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val interestRateDifferential: Double? = null,

    val loanProduct: LoanProduct? = null,

    @Contextual
    val maxDifferentialLendingRate: Double? = null,

    @Contextual
    val minDifferentialLendingRate: Double? = null,

    val new: kotlin.Boolean? = null,

)
