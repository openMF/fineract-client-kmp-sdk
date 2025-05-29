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
 * @param amount
 * @param date
 * @param externalId
 * @param feeChargesPortion
 * @param id
 * @param interestPortion
 * @param outstandingLoanBalance
 * @param penaltyChargesPortion
 * @param principalPortion
 */

@Serializable
data class PutChargeTransactionChangesResponseChanges(

    val amount: kotlin.Double? = null,

    @Contextual
    val date: LocalDate? = null,

    val externalId: kotlin.String? = null,

    val feeChargesPortion: kotlin.Double? = null,

    val id: kotlin.Long? = null,

    val interestPortion: kotlin.Double? = null,

    val outstandingLoanBalance: kotlin.Double? = null,

    val penaltyChargesPortion: kotlin.Double? = null,

    val principalPortion: kotlin.Double? = null,

)
