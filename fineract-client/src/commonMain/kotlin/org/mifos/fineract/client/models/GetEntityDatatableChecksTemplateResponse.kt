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
 * GetEntityDatatableChecksTemplateResponse
 *
 * @param datatables
 * @param entities
 * @param loanProductDatas
 * @param savingsProductDatas
 * @param statusClient
 * @param statusGroup
 * @param statusLoans
 * @param statusSavings
 */

@Serializable
data class GetEntityDatatableChecksTemplateResponse(

    val datatables: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val entities: kotlin.collections.List<kotlin.String>? = null,

    val loanProductDatas: kotlin.collections.List<LoanProductData>? = null,

    val savingsProductDatas: kotlin.collections.List<SavingsProductData>? = null,

    val statusClient: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val statusGroup: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val statusLoans: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val statusSavings: kotlin.collections.List<@Contextual kotlin.Any>? = null,

)
