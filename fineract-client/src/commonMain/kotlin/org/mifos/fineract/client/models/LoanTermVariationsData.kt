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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param dateValue
 * @param decimalValue
 * @param id
 * @param isProcessed
 * @param isSpecificToInstallment
 * @param termType
 * @param termVariationApplicableFrom
 */

@Serializable
data class LoanTermVariationsData(

    @Contextual
    val dateValue: LocalDate? = null,

    @Contextual
    val decimalValue: Double? = null,

    val id: kotlin.Long? = null,

    val isProcessed: kotlin.Boolean? = null,

    val isSpecificToInstallment: kotlin.Boolean? = null,

    val termType: LoanTermTypeOptions? = null,

    @Contextual
    val termVariationApplicableFrom: LocalDate? = null,

)
