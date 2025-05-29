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
 * @param categoryId
 * @param categoryName
 * @param expenseAccount
 * @param expenseCode
 * @param expenseName
 * @param id
 * @param liabilityAccount
 * @param liabilityCode
 * @param liabilityName
 * @param maxAge
 * @param minAge
 * @param provisioningPercentage
 */

@Serializable
data class ProvisioningCriteriaDefinitionData(

    val categoryId: kotlin.Long? = null,

    val categoryName: kotlin.String? = null,

    val expenseAccount: kotlin.Long? = null,

    val expenseCode: kotlin.String? = null,

    val expenseName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val liabilityAccount: kotlin.Long? = null,

    val liabilityCode: kotlin.String? = null,

    val liabilityName: kotlin.String? = null,

    val maxAge: kotlin.Long? = null,

    val minAge: kotlin.Long? = null,

    @Contextual
    val provisioningPercentage: Double? = null,

)
