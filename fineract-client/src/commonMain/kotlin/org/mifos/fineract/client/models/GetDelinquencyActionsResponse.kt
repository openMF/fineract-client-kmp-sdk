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
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetDelinquencyActionsResponse
 *
 * @param action
 * @param createdById
 * @param createdOn
 * @param endDate
 * @param id
 * @param lastModifiedOn
 * @param startDate
 * @param updatedById
 */

@Serializable
data class GetDelinquencyActionsResponse(

    val action: kotlin.String? = null,

    val createdById: kotlin.Long? = null,

    @Contextual
    val createdOn: LocalDateTime? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val lastModifiedOn: LocalDateTime? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val updatedById: kotlin.Long? = null,

)
