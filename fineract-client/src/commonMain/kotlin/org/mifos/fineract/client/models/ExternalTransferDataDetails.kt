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
 * @param detailsId
 * @param totalFeeChargesOutstanding
 * @param totalInterestOutstanding
 * @param totalOutstanding
 * @param totalOverpaid
 * @param totalPenaltyChargesOutstanding
 * @param totalPrincipalOutstanding
 */

@Serializable
data class ExternalTransferDataDetails(

    val detailsId: kotlin.Long? = null,

    @Contextual
    val totalFeeChargesOutstanding: Double? = null,

    @Contextual
    val totalInterestOutstanding: Double? = null,

    @Contextual
    val totalOutstanding: Double? = null,

    @Contextual
    val totalOverpaid: Double? = null,

    @Contextual
    val totalPenaltyChargesOutstanding: Double? = null,

    @Contextual
    val totalPrincipalOutstanding: Double? = null,

)
