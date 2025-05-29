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
 * @param actualDisbursementDate
 * @param approvedPrincipal
 * @param chargeAmount
 * @param dateFormat
 * @param expectedDisbursementDate
 * @param id
 * @param loanChargeId
 * @param locale
 * @param netDisbursalAmount
 * @param note
 * @param principal
 * @param waivedChargeAmount
 */

@Serializable
data class GetLoansLoanIdDisbursementDetails(

    @Contextual
    val actualDisbursementDate: LocalDate? = null,

    val approvedPrincipal: kotlin.Float? = null,

    val chargeAmount: kotlin.Double? = null,

    val dateFormat: kotlin.String? = null,

    @Contextual
    val expectedDisbursementDate: LocalDate? = null,

    val id: kotlin.Int? = null,

    val loanChargeId: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val netDisbursalAmount: kotlin.Double? = null,

    val note: kotlin.String? = null,

    val principal: kotlin.Double? = null,

    val waivedChargeAmount: kotlin.Double? = null,

)
