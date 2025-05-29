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
data class PaymentDetailData(

    val accountNumber: kotlin.String? = null,

    val bankNumber: kotlin.String? = null,

    val checkNumber: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val paymentType: PaymentType? = null,

    val receiptNumber: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

)
