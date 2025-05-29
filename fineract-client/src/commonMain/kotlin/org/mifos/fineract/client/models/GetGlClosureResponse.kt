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
 * GetGLClosureResponse
 *
 * @param closingDate
 * @param comments
 * @param createdByUserId
 * @param createdByUsername
 * @param createdDate
 * @param deleted
 * @param id
 * @param lastUpdatedByUserId
 * @param lastUpdatedByUsername
 * @param lastUpdatedDate
 * @param officeId
 * @param officeName
 */

@Serializable
data class GetGlClosureResponse(

    @Contextual
    val closingDate: LocalDate? = null,

    val comments: kotlin.String? = null,

    val createdByUserId: kotlin.Long? = null,

    val createdByUsername: kotlin.String? = null,

    @Contextual
    val createdDate: LocalDate? = null,

    val deleted: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val lastUpdatedByUserId: kotlin.Long? = null,

    val lastUpdatedByUsername: kotlin.String? = null,

    @Contextual
    val lastUpdatedDate: LocalDate? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

)
