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
 * PostRecurringDepositAccountsRequest
 *
 * @param clientId
 * @param dateFormat
 * @param depositAmount
 * @param depositPeriod
 * @param depositPeriodFrequencyId
 * @param isCalendarInherited
 * @param locale
 * @param mandatoryRecommendedDepositAmount
 * @param productId
 * @param recurringFrequency
 * @param recurringFrequencyType
 * @param submittedOnDate
 */

@Serializable
data class PostRecurringDepositAccountsRequest(

    val clientId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val depositAmount: kotlin.Float? = null,

    val depositPeriod: kotlin.Int? = null,

    val depositPeriodFrequencyId: kotlin.Int? = null,

    val isCalendarInherited: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    val mandatoryRecommendedDepositAmount: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val recurringFrequency: kotlin.Int? = null,

    val recurringFrequencyType: kotlin.Int? = null,

    val submittedOnDate: kotlin.String? = null,

)
