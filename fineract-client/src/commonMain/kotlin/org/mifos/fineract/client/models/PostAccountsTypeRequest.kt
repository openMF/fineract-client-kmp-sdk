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
 * PostAccountsTypeRequest
 *
 * @param allowDividendCalculationForInactiveClients
 * @param applicationDate
 * @param charges
 * @param clientId
 * @param dateFormat
 * @param externalId
 * @param locale
 * @param lockinPeriodFrequency
 * @param lockinPeriodFrequencyType
 * @param minimumActivePeriod
 * @param minimumActivePeriodFrequencyType
 * @param productId
 * @param requestedShares
 * @param savingsAccountId
 * @param submittedDate
 */

@Serializable
data class PostAccountsTypeRequest(

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val applicationDate: kotlin.String? = null,

    val charges: kotlin.collections.Set<PostAccountsCharges>? = null,

    val clientId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val lockinPeriodFrequency: kotlin.Int? = null,

    val lockinPeriodFrequencyType: kotlin.Int? = null,

    val minimumActivePeriod: kotlin.Int? = null,

    val minimumActivePeriodFrequencyType: kotlin.Int? = null,

    val productId: kotlin.Long? = null,

    val requestedShares: kotlin.Int? = null,

    val savingsAccountId: kotlin.Long? = null,

    val submittedDate: kotlin.String? = null,

)
