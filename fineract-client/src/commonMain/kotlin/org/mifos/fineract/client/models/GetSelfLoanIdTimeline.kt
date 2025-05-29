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
 * @param approvedByFirstname
 * @param approvedByLastname
 * @param approvedByUsername
 * @param approvedOnDate
 * @param closedOnDate
 * @param disbursedByFirstname
 * @param disbursedByLastname
 * @param disbursedByUsername
 * @param expectedDisbursementDate
 * @param expectedMaturityDate
 * @param submittedByFirstname
 * @param submittedByLastname
 * @param submittedByUsername
 * @param submittedOnDate
 */

@Serializable
data class GetSelfLoanIdTimeline(

    @Contextual
    val actualDisbursementDate: LocalDate? = null,

    val approvedByFirstname: kotlin.String? = null,

    val approvedByLastname: kotlin.String? = null,

    val approvedByUsername: kotlin.String? = null,

    @Contextual
    val approvedOnDate: LocalDate? = null,

    @Contextual
    val closedOnDate: LocalDate? = null,

    val disbursedByFirstname: kotlin.String? = null,

    val disbursedByLastname: kotlin.String? = null,

    val disbursedByUsername: kotlin.String? = null,

    @Contextual
    val expectedDisbursementDate: LocalDate? = null,

    @Contextual
    val expectedMaturityDate: LocalDate? = null,

    val submittedByFirstname: kotlin.String? = null,

    val submittedByLastname: kotlin.String? = null,

    val submittedByUsername: kotlin.String? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

)
