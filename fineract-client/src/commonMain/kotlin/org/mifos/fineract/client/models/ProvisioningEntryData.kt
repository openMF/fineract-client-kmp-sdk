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
 * @param createdById
 * @param createdDate
 * @param createdUser
 * @param id
 * @param journalEntry
 * @param modifiedById
 * @param modifiedUser
 * @param provisioningEntries
 * @param reservedAmount
 */

@Serializable
data class ProvisioningEntryData(

    val createdById: kotlin.Long? = null,

    @Contextual
    val createdDate: LocalDate? = null,

    val createdUser: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val journalEntry: kotlin.Boolean? = null,

    val modifiedById: kotlin.Long? = null,

    val modifiedUser: kotlin.String? = null,

    val provisioningEntries: kotlin.collections.List<LoanProductProvisioningEntryData>? = null,

    @Contextual
    val reservedAmount: Double? = null,

)
