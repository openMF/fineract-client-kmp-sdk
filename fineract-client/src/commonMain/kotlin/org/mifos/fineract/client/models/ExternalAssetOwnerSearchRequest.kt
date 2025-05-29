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
 * @param effectiveFromDate
 * @param effectiveToDate
 * @param submittedFromDate
 * @param submittedToDate
 * @param text
 */

@Serializable
data class ExternalAssetOwnerSearchRequest(

    @Contextual
    val effectiveFromDate: LocalDate? = null,

    @Contextual
    val effectiveToDate: LocalDate? = null,

    @Contextual
    val submittedFromDate: LocalDate? = null,

    @Contextual
    val submittedToDate: LocalDate? = null,

    val text: kotlin.String? = null,

)
