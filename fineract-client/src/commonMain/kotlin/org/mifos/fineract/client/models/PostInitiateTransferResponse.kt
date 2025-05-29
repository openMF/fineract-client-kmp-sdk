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
 * PostInitiateTransferResponse
 *
 * @param changes
 * @param dateFormat
 * @param locale
 * @param resourceExternalId transfer external ID
 * @param resourceId transfer ID
 * @param subResourceExternalId loan external ID
 * @param subResourceId loan ID
 */

@Serializable
data class PostInitiateTransferResponse(

    val changes: ExternalAssetOwnerTransferChangesData? = null,

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val resourceExternalId: kotlin.String? = null,

    val resourceId: kotlin.Long? = null,

    val subResourceExternalId: kotlin.String? = null,

    val subResourceId: kotlin.Long? = null,

)
