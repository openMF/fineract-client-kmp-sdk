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

import kotlinx.serialization.Serializable

/**
 * GetGroupsTemplateResponse
 *
 * @param clientOptions
 * @param datatables
 * @param officeId
 * @param officeOptions
 * @param staffOptions
 */

@Serializable
data class GetGroupsTemplateResponse(

    val clientOptions: kotlin.collections.Set<GetGroupsTemplateClientOptions>? = null,

    val datatables: kotlin.collections.Set<GetGroupsTemplateDatatables>? = null,

    val officeId: kotlin.Long? = null,

    val officeOptions: kotlin.collections.Set<GetGroupsTemplateOfficeOptions>? = null,

    val staffOptions: kotlin.collections.Set<GetGroupsTemplateStaffOptions>? = null,

)
