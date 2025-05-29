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
 * PutDataTablesAppTableIdResponse
 *
 * @param changes
 * @param clientId
 * @param loanId
 * @param officeId
 * @param resourceId
 */

@Serializable
data class PutDataTablesAppTableIdResponse(

    val changes: kotlin.collections.Map<kotlin.String, @Contextual kotlin.Any>? = null,

    val clientId: kotlin.Long? = null,

    val loanId: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val resourceId: kotlin.Long? = null,

)
