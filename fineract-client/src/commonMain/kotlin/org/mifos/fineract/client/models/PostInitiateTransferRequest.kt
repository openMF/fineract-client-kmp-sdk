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
 * PostInitiateTransferRequest
 *
 * @param dateFormat
 * @param locale
 * @param ownerExternalId
 * @param purchasePriceRatio
 * @param settlementDate
 * @param transferExternalId
 */

@Serializable
data class PostInitiateTransferRequest(

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val ownerExternalId: kotlin.String? = null,

    val purchasePriceRatio: kotlin.String? = null,

    val settlementDate: kotlin.String? = null,

    val transferExternalId: kotlin.String? = null,

)
