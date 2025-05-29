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
 * @param accountTypeOptions
 * @param allowedAssetsTagOptions
 * @param allowedEquityTagOptions
 * @param allowedExpensesTagOptions
 * @param allowedIncomeTagOptions
 * @param allowedLiabilitiesTagOptions
 * @param assetHeaderAccountOptions
 * @param description
 * @param disabled
 * @param equityHeaderAccountOptions
 * @param expenseHeaderAccountOptions
 * @param glCode
 * @param id
 * @param incomeHeaderAccountOptions
 * @param liabilityHeaderAccountOptions
 * @param manualEntriesAllowed
 * @param name
 * @param nameDecorated
 * @param organizationRunningBalance
 * @param parentId
 * @param rowIndex
 * @param tagId
 * @param type
 * @param usage
 * @param usageOptions
 */

@Serializable
data class GLAccountData(

    val accountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val allowedAssetsTagOptions: kotlin.collections.List<CodeValueData>? = null,

    val allowedEquityTagOptions: kotlin.collections.List<CodeValueData>? = null,

    val allowedExpensesTagOptions: kotlin.collections.List<CodeValueData>? = null,

    val allowedIncomeTagOptions: kotlin.collections.List<CodeValueData>? = null,

    val allowedLiabilitiesTagOptions: kotlin.collections.List<CodeValueData>? = null,

    val assetHeaderAccountOptions: kotlin.collections.List<GLAccountData>? = null,

    val description: kotlin.String? = null,

    val disabled: kotlin.Boolean? = null,

    val equityHeaderAccountOptions: kotlin.collections.List<GLAccountData>? = null,

    val expenseHeaderAccountOptions: kotlin.collections.List<GLAccountData>? = null,

    val glCode: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val incomeHeaderAccountOptions: kotlin.collections.List<GLAccountData>? = null,

    val liabilityHeaderAccountOptions: kotlin.collections.List<GLAccountData>? = null,

    val manualEntriesAllowed: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val nameDecorated: kotlin.String? = null,

    val organizationRunningBalance: kotlin.Long? = null,

    val parentId: kotlin.Long? = null,

    val rowIndex: kotlin.Int? = null,

    val tagId: CodeValueData? = null,

    val type: EnumOptionData? = null,

    val usage: EnumOptionData? = null,

    val usageOptions: kotlin.collections.List<EnumOptionData>? = null,

)
