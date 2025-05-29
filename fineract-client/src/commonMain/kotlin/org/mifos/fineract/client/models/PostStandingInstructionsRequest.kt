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
 * PostStandingInstructionsRequest
 *
 * @param amount
 * @param dateFormat
 * @param fromAccountId
 * @param fromAccountType
 * @param fromClientId
 * @param fromOfficeId
 * @param instructionType
 * @param locale en
 * @param monthDayFormat
 * @param name
 * @param priority
 * @param recurrenceFrequency
 * @param recurrenceInterval
 * @param recurrenceOnMonthDay
 * @param recurrenceType
 * @param status
 * @param toAccountId
 * @param toAccountType
 * @param toClientId
 * @param toOfficeId
 * @param transferType
 * @param validFrom
 */

@Serializable
data class PostStandingInstructionsRequest(

    val amount: kotlin.Int? = null,

    val dateFormat: kotlin.String? = null,

    val fromAccountId: kotlin.Long? = null,

    val fromAccountType: kotlin.Int? = null,

    val fromClientId: kotlin.Long? = null,

    val fromOfficeId: kotlin.Long? = null,

    val instructionType: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val monthDayFormat: kotlin.String? = null,

    val name: kotlin.String? = null,

    val priority: kotlin.Int? = null,

    val recurrenceFrequency: kotlin.Int? = null,

    val recurrenceInterval: kotlin.Int? = null,

    val recurrenceOnMonthDay: kotlin.String? = null,

    val recurrenceType: kotlin.Int? = null,

    val status: kotlin.Int? = null,

    val toAccountId: kotlin.Long? = null,

    val toAccountType: kotlin.Int? = null,

    val toClientId: kotlin.Long? = null,

    val toOfficeId: kotlin.Long? = null,

    val transferType: kotlin.Int? = null,

    val validFrom: kotlin.String? = null,

)
