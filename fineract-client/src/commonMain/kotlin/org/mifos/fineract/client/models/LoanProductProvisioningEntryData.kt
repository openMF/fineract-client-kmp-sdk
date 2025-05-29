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
 * @param amountreserved
 * @param balance
 * @param categoryId
 * @param categoryName
 * @param criteriaId
 * @param currencyCode
 * @param expenseAccount
 * @param expenseAccountCode
 * @param expenseAccountName
 * @param historyId
 * @param liabilityAccountCode
 * @param liabilityAccountName
 * @param liablityAccount
 * @param officeId
 * @param officeName
 * @param overdueInDays
 * @param percentage
 * @param productId
 * @param productName
 */

@Serializable
data class LoanProductProvisioningEntryData(

    @Contextual
    val amountreserved: Double? = null,

    @Contextual
    val balance: Double? = null,

    val categoryId: kotlin.Long? = null,

    val categoryName: kotlin.String? = null,

    val criteriaId: kotlin.Long? = null,

    val currencyCode: kotlin.String? = null,

    val expenseAccount: kotlin.Long? = null,

    val expenseAccountCode: kotlin.String? = null,

    val expenseAccountName: kotlin.String? = null,

    val historyId: kotlin.Long? = null,

    val liabilityAccountCode: kotlin.String? = null,

    val liabilityAccountName: kotlin.String? = null,

    val liablityAccount: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val overdueInDays: kotlin.Long? = null,

    @Contextual
    val percentage: Double? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

)
