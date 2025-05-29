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
 * @param activatedByFirstname
 * @param activatedByLastname
 * @param activatedByUsername
 * @param activatedOnDate
 * @param approvedByFirstname
 * @param approvedByLastname
 * @param approvedByUsername
 * @param approvedOnDate
 * @param closedByFirstname
 * @param closedByLastname
 * @param closedByUsername
 * @param closedOnDate
 * @param rejectedByFirstname
 * @param rejectedByLastname
 * @param rejectedByUsername
 * @param rejectedOnDate
 * @param submittedByFirstname
 * @param submittedByLastname
 * @param submittedByUsername
 * @param submittedOnDate
 * @param withdrawnByFirstname
 * @param withdrawnByLastname
 * @param withdrawnByUsername
 * @param withdrawnOnDate
 */

@Serializable
data class SavingsAccountApplicationTimelineData(

    val activatedByFirstname: kotlin.String? = null,

    val activatedByLastname: kotlin.String? = null,

    val activatedByUsername: kotlin.String? = null,

    @Contextual
    val activatedOnDate: LocalDate? = null,

    val approvedByFirstname: kotlin.String? = null,

    val approvedByLastname: kotlin.String? = null,

    val approvedByUsername: kotlin.String? = null,

    @Contextual
    val approvedOnDate: LocalDate? = null,

    val closedByFirstname: kotlin.String? = null,

    val closedByLastname: kotlin.String? = null,

    val closedByUsername: kotlin.String? = null,

    @Contextual
    val closedOnDate: LocalDate? = null,

    val rejectedByFirstname: kotlin.String? = null,

    val rejectedByLastname: kotlin.String? = null,

    val rejectedByUsername: kotlin.String? = null,

    @Contextual
    val rejectedOnDate: LocalDate? = null,

    val submittedByFirstname: kotlin.String? = null,

    val submittedByLastname: kotlin.String? = null,

    val submittedByUsername: kotlin.String? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val withdrawnByFirstname: kotlin.String? = null,

    val withdrawnByLastname: kotlin.String? = null,

    val withdrawnByUsername: kotlin.String? = null,

    @Contextual
    val withdrawnOnDate: LocalDate? = null,

)
