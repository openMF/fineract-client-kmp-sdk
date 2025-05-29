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
 * GetClientsTemplateResponse
 *
 * @param activationDate
 * @param datatables
 * @param officeId
 * @param officeOptions
 * @param savingProductOptions
 * @param staffOptions
 */

@Serializable
data class GetClientsTemplateResponse(

    @Contextual
    val activationDate: LocalDate? = null,

    val datatables: kotlin.collections.Set<GetClientsDataTables>? = null,

    val officeId: kotlin.Long? = null,

    val officeOptions: kotlin.collections.Set<GetClientsOfficeOptions>? = null,

    val savingProductOptions: kotlin.collections.Set<GetClientsSavingProductOptions>? = null,

    val staffOptions: kotlin.collections.Set<GetClientsStaffOptions>? = null,

)
