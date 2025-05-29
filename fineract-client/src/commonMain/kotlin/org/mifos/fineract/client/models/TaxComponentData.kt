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
 * @param creditAccount
 * @param creditAccountType
 * @param debitAccount
 * @param debitAccountType
 * @param glAccountOptions
 * @param glAccountTypeOptions
 * @param id
 * @param name
 * @param percentage
 * @param startDate
 * @param taxComponentHistories
 */

@Serializable
data class TaxComponentData(

    val creditAccount: GLAccountData? = null,

    val creditAccountType: EnumOptionData? = null,

    val debitAccount: GLAccountData? = null,

    val debitAccountType: EnumOptionData? = null,

    val glAccountOptions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<GLAccountData>>? = null,

    val glAccountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    @Contextual
    val percentage: Double? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val taxComponentHistories: kotlin.collections.List<TaxComponentHistoryData>? = null,

)
