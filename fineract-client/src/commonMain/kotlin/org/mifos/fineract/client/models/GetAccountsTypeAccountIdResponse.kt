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
 * GetAccountsTypeAccountIdResponse
 *
 * @param accountNo
 * @param allowDividendCalculationForInactiveClients
 * @param charges
 * @param clientId
 * @param clientName
 * @param currency
 * @param currentMarketPrice
 * @param dividends
 * @param id
 * @param lockPeriodTypeEnum
 * @param lockinPeriod
 * @param minimumActivePeriod
 * @param minimumActivePeriodTypeEnum
 * @param productId
 * @param productName
 * @param purchasedShares
 * @param savingsAccountId
 * @param savingsAccountNumber
 * @param status
 * @param summary
 * @param timeline
 */

@Serializable
data class GetAccountsTypeAccountIdResponse(

    val accountNo: kotlin.Long? = null,

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val charges: kotlin.collections.Set<GetAccountsCharges>? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: GetAccountsCurrency? = null,

    val currentMarketPrice: kotlin.Int? = null,

    val dividends: kotlin.collections.List<kotlin.String>? = null,

    val id: kotlin.Long? = null,

    val lockPeriodTypeEnum: GetAccountsLockPeriodTypeEnum? = null,

    val lockinPeriod: kotlin.Int? = null,

    val minimumActivePeriod: kotlin.Int? = null,

    val minimumActivePeriodTypeEnum: GetAccountsLockPeriodTypeEnum? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

    val purchasedShares: kotlin.collections.Set<GetAccountsPurchasedShares>? = null,

    val savingsAccountId: kotlin.Long? = null,

    val savingsAccountNumber: kotlin.Long? = null,

    val status: GetAccountsStatus? = null,

    val summary: GetAccountsSummary? = null,

    val timeline: GetAccountsTimeline? = null,

)
