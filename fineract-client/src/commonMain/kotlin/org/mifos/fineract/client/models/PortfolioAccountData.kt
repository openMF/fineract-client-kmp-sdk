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
 *
 *
 * @param accountNo
 * @param amtForTransfer
 * @param clientId
 * @param clientName
 * @param currency
 * @param currencyCode
 * @param externalId
 * @param fieldOfficerId
 * @param fieldOfficerName
 * @param groupId
 * @param groupName
 * @param id
 * @param productId
 * @param productName
 */

@Serializable
data class PortfolioAccountData(

    val accountNo: kotlin.String? = null,

    @Contextual
    val amtForTransfer: Double? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: CurrencyData? = null,

    val currencyCode: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val fieldOfficerId: kotlin.Long? = null,

    val fieldOfficerName: kotlin.String? = null,

    val groupId: kotlin.Long? = null,

    val groupName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

)
