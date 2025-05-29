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
 * PostProvisioningEntriesRequest
 *
 * @param createjournalentries
 * @param date
 * @param dateFormat
 * @param propertyEntries
 * @param locale
 * @param provisioningentry
 */

@Serializable
data class PostProvisioningEntriesRequest(

    val createjournalentries: kotlin.String? = null,

    val date: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val propertyEntries: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val provisioningentry: kotlin.String? = null,

)
