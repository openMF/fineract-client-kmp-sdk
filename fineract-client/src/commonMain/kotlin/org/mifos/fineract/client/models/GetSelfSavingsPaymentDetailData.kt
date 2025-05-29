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
 * @param accountNumber
 * @param bankNumber
 * @param checkNumber
 * @param id
 * @param paymentType
 * @param receiptNumber
 * @param routingCode
 */

@Serializable
data class GetSelfSavingsPaymentDetailData(

    val accountNumber: kotlin.Int? = null,

    val bankNumber: kotlin.Int? = null,

    val checkNumber: kotlin.Int? = null,

    val id: kotlin.Int? = null,

    val paymentType: GetSelfSavingsPaymentType? = null,

    val receiptNumber: kotlin.Int? = null,

    val routingCode: kotlin.Int? = null,

)
