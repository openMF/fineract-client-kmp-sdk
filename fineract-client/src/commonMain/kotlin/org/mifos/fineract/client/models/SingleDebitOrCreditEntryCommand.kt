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
 * @param amount
 * @param comments
 * @param commentsChanged
 * @param glAccountId
 * @param glAccountIdChanged
 * @param glAmountChanged
 * @param parametersPassedInRequest
 */

@Serializable
data class SingleDebitOrCreditEntryCommand(

    @Contextual
    val amount: Double? = null,

    val comments: kotlin.String? = null,

    val commentsChanged: kotlin.Boolean? = null,

    val glAccountId: kotlin.Long? = null,

    val glAccountIdChanged: kotlin.Boolean? = null,

    val glAmountChanged: kotlin.Boolean? = null,

    val parametersPassedInRequest: kotlin.collections.Set<kotlin.String>? = null,

)
