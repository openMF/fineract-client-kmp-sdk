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
 * PostAdhocQuerySearchRequest
 *
 * @param dateFormat
 * @param includeOutStandingAmountPercentage
 * @param includeOutstandingAmount
 * @param loanDateOption
 * @param loanFromDate
 * @param loanToDate
 * @param locale
 * @param maxOutstandingAmount
 * @param minOutstandingAmount
 * @param outStandingAmountPercentage
 * @param outStandingAmountPercentageCondition
 * @param outstandingAmountCondition
 */

@Serializable
data class PostAdhocQuerySearchRequest(

    val dateFormat: kotlin.String? = null,

    val includeOutStandingAmountPercentage: kotlin.Boolean? = null,

    val includeOutstandingAmount: kotlin.Boolean? = null,

    val loanDateOption: kotlin.String? = null,

    @Contextual
    val loanFromDate: LocalDate? = null,

    @Contextual
    val loanToDate: LocalDate? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingAmount: kotlin.Long? = null,

    val minOutstandingAmount: kotlin.Long? = null,

    val outStandingAmountPercentage: kotlin.Long? = null,

    val outStandingAmountPercentageCondition: kotlin.String? = null,

    val outstandingAmountCondition: kotlin.String? = null,

)
