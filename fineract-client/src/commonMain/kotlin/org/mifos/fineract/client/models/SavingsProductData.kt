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
 * @param accrualBasedAccountingEnabled
 * @param allowOverdraft
 * @param cashBasedAccountingEnabled
 * @param currency
 * @param depositAccountType
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param lockinPeriodFrequency
 * @param lockinPeriodFrequencyType
 * @param maxAllowedLienLimit
 * @param minRequiredBalance
 * @param minRequiredOpeningBalance
 * @param name
 * @param nominalAnnualInterestRate
 * @param overdraftLimit
 * @param periodicAccrualAccounting
 * @param upfrontAccrualAccounting
 * @param withdrawalFeeForTransfers
 */

@Serializable
data class SavingsProductData(

    val accrualBasedAccountingEnabled: kotlin.Boolean? = null,

    val allowOverdraft: kotlin.Boolean? = null,

    val cashBasedAccountingEnabled: kotlin.Boolean? = null,

    val currency: CurrencyData? = null,

    val depositAccountType: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: EnumOptionData? = null,

    val interestCalculationType: EnumOptionData? = null,

    val interestCompoundingPeriodType: EnumOptionData? = null,

    val interestPostingPeriodType: EnumOptionData? = null,

    val lockinPeriodFrequency: kotlin.Int? = null,

    val lockinPeriodFrequencyType: EnumOptionData? = null,

    @Contextual
    val maxAllowedLienLimit: Double? = null,

    @Contextual
    val minRequiredBalance: Double? = null,

    @Contextual
    val minRequiredOpeningBalance: Double? = null,

    val name: kotlin.String? = null,

    @Contextual
    val nominalAnnualInterestRate: Double? = null,

    @Contextual
    val overdraftLimit: Double? = null,

    val periodicAccrualAccounting: kotlin.Boolean? = null,

    val upfrontAccrualAccounting: kotlin.Boolean? = null,

    val withdrawalFeeForTransfers: kotlin.Boolean? = null,

)
