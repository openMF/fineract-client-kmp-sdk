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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PostTellersTellerIdCashiersCashierIdAllocateRequest
 *
 * @param currencyCode
 * @param dateFormat
 * @param locale
 * @param txnAmount
 * @param txnDate
 * @param txnNote
 */

@Serializable
data class PostTellersTellerIdCashiersCashierIdAllocateRequest(

    val currencyCode: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    @Contextual
    val txnAmount: Double? = null,

    @Contextual
    val txnDate: LocalDate? = null,

    val txnNote: kotlin.String? = null,

)
