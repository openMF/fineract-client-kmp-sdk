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
 *
 *
 * @param accountNo
 * @param clientId
 * @param clientName
 * @param currency
 * @param id
 * @param productId
 * @param productName
 * @param purchasedShares
 * @param status
 * @param summary
 * @param timeline
 */

@Serializable
data class GetAccountsPageItems(

    val accountNo: kotlin.Long? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: GetAccountsChargesCurrency? = null,

    val id: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

    val purchasedShares: kotlin.collections.Set<GetAccountsTypePurchasedShares>? = null,

    val status: GetAccountsTypeStatus? = null,

    val summary: GetAccountsTypeSummary? = null,

    val timeline: GetAccountsTypeTimeline? = null,

)
