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
 *
 *
 * @param accountId
 * @param amount
 * @param amountPaid
 * @param chargeAmount
 * @param id
 * @param numberOfShares
 * @param purchasedDate
 * @param purchasedPrice
 * @param status
 * @param type
 */

@Serializable
data class GetAccountsPurchasedShares(

    val accountId: kotlin.Long? = null,

    val amount: kotlin.Double? = null,

    val amountPaid: kotlin.Double? = null,

    val chargeAmount: kotlin.Double? = null,

    val id: kotlin.Long? = null,

    val numberOfShares: kotlin.Int? = null,

    @Contextual
    val purchasedDate: LocalDate? = null,

    val purchasedPrice: kotlin.Double? = null,

    val status: GetAccountsPurchasedSharesStatus? = null,

    val type: GetAccountsPurchasedSharesType? = null,

)
