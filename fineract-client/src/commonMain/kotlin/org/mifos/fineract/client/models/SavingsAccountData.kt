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
 * @param accountNo
 * @param accrualBasedAccountingEnabledOnSavingsProduct
 * @param activatedOnDate
 * @param activationLocalDate
 * @param allowOverdraft
 * @param annualFee
 * @param cashBasedAccountingEnabledOnSavingsProduct
 * @param chargeOptions
 * @param charges
 * @param clientData
 * @param clientId
 * @param clientName
 * @param currency
 * @param datatables
 * @param dateFormat
 * @param daysToDormancy
 * @param daysToEscheat
 * @param daysToInactive
 * @param depositType
 * @param depositTypeId
 * @param enforceMinRequiredBalance
 * @param existingReversedTransactionIds
 * @param existingTransactionIds
 * @param externalId
 * @param fieldOfficerId
 * @param fieldOfficerName
 * @param fieldOfficerOptions
 * @param glAccountIdForInterestOnSavings
 * @param glAccountIdForSavingsControl
 * @param groupGeneralData
 * @param groupId
 * @param groupName
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationDaysInYearTypeId
 * @param interestCalculationDaysInYearTypeOptions
 * @param interestCalculationType
 * @param interestCalculationTypeId
 * @param interestCalculationTypeOptions
 * @param interestCompoundingPeriodType
 * @param interestCompoundingPeriodTypeId
 * @param interestCompoundingPeriodTypeOptions
 * @param interestPostingPeriodType
 * @param interestPostingPeriodTypeId
 * @param interestPostingPeriodTypeOptions
 * @param isDormancyTrackingActive
 * @param lastActiveTransactionDate
 * @param lastSavingsAccountTransaction
 * @param lienAllowed
 * @param locale
 * @param lockedInUntilDate
 * @param lockinPeriodFrequency
 * @param lockinPeriodFrequencyType
 * @param lockinPeriodFrequencyTypeId
 * @param lockinPeriodFrequencyTypeOptions
 * @param maxAllowedLienLimit
 * @param minBalanceForInterestCalculation
 * @param minOverdraftForInterestCalculation
 * @param minRequiredBalance
 * @param minRequiredOpeningBalance
 * @param newSavingsAccountTransactionData
 * @param nominalAnnualInterestRate
 * @param nominalAnnualInterestRateOverdraft
 * @param officeId
 * @param onHoldFunds
 * @param overdraftLimit
 * @param productId
 * @param productOptions
 * @param reasonForBlock
 * @param rowIndex
 * @param savingsAccountSummaryData
 * @param savingsAccountTransactionData
 * @param savingsAccountTransactionSummaryWrapper
 * @param savingsAccountTransactionsWithPivotConfig
 * @param savingsAmountOnHold
 * @param savingsHelper
 * @param savingsProduct
 * @param savingsProductData
 * @param savingsProductId
 * @param savingsProductName
 * @param startInterestCalculationDate
 * @param status
 * @param subStatus
 * @param submittedOnDate
 * @param summary
 * @param taxGroup
 * @param timeline
 * @param transactions
 * @param updatedTransactions
 * @param withHoldTax
 * @param withdrawalFee
 * @param withdrawalFeeForTransfers
 * @param withdrawalFeeTypeOptions
 */

@Serializable
data class SavingsAccountData(

    val accountNo: kotlin.String? = null,

    val accrualBasedAccountingEnabledOnSavingsProduct: kotlin.Boolean? = null,

    @Contextual
    val activatedOnDate: LocalDate? = null,

    @Contextual
    val activationLocalDate: LocalDate? = null,

    val allowOverdraft: kotlin.Boolean? = null,

    val annualFee: SavingsAccountChargeData? = null,

    val cashBasedAccountingEnabledOnSavingsProduct: kotlin.Boolean? = null,

    val chargeOptions: kotlin.collections.List<ChargeData>? = null,

    val charges: kotlin.collections.List<SavingsAccountChargeData>? = null,

    val clientData: ClientData? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: CurrencyData? = null,

    val datatables: kotlin.collections.List<DatatableData>? = null,

    val dateFormat: kotlin.String? = null,

    val daysToDormancy: kotlin.Int? = null,

    val daysToEscheat: kotlin.Int? = null,

    val daysToInactive: kotlin.Int? = null,

    val depositType: EnumOptionData? = null,

    val depositTypeId: kotlin.Int? = null,

    val enforceMinRequiredBalance: kotlin.Boolean? = null,

    val existingReversedTransactionIds: kotlin.collections.Set<kotlin.Long>? = null,

    val existingTransactionIds: kotlin.collections.Set<kotlin.Long>? = null,

    val externalId: kotlin.String? = null,

    val fieldOfficerId: kotlin.Long? = null,

    val fieldOfficerName: kotlin.String? = null,

    val fieldOfficerOptions: kotlin.collections.List<StaffData>? = null,

    val glAccountIdForInterestOnSavings: kotlin.Long? = null,

    val glAccountIdForSavingsControl: kotlin.Long? = null,

    val groupGeneralData: GroupGeneralData? = null,

    val groupId: kotlin.Long? = null,

    val groupName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: EnumOptionData? = null,

    val interestCalculationDaysInYearTypeId: kotlin.Int? = null,

    val interestCalculationDaysInYearTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestCalculationType: EnumOptionData? = null,

    val interestCalculationTypeId: kotlin.Int? = null,

    val interestCalculationTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestCompoundingPeriodType: EnumOptionData? = null,

    val interestCompoundingPeriodTypeId: kotlin.Int? = null,

    val interestCompoundingPeriodTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val interestPostingPeriodType: EnumOptionData? = null,

    val interestPostingPeriodTypeId: kotlin.Int? = null,

    val interestPostingPeriodTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val isDormancyTrackingActive: kotlin.Boolean? = null,

    @Contextual
    val lastActiveTransactionDate: LocalDate? = null,

    val lastSavingsAccountTransaction: SavingsAccountTransactionData? = null,

    val lienAllowed: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    @Contextual
    val lockedInUntilDate: LocalDate? = null,

    val lockinPeriodFrequency: kotlin.Int? = null,

    val lockinPeriodFrequencyType: EnumOptionData? = null,

    val lockinPeriodFrequencyTypeId: kotlin.Int? = null,

    val lockinPeriodFrequencyTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    @Contextual
    val maxAllowedLienLimit: Double? = null,

    @Contextual
    val minBalanceForInterestCalculation: Double? = null,

    @Contextual
    val minOverdraftForInterestCalculation: Double? = null,

    @Contextual
    val minRequiredBalance: Double? = null,

    @Contextual
    val minRequiredOpeningBalance: Double? = null,

    val newSavingsAccountTransactionData: kotlin.collections.List<SavingsAccountTransactionData>? = null,

    @Contextual
    val nominalAnnualInterestRate: Double? = null,

    @Contextual
    val nominalAnnualInterestRateOverdraft: Double? = null,

    val officeId: kotlin.Long? = null,

    @Contextual
    val onHoldFunds: Double? = null,

    @Contextual
    val overdraftLimit: Double? = null,

    val productId: kotlin.Long? = null,

    val productOptions: kotlin.collections.List<SavingsProductData>? = null,

    val reasonForBlock: kotlin.String? = null,

    val rowIndex: kotlin.Int? = null,

    val savingsAccountSummaryData: SavingsAccountSummaryData? = null,

    val savingsAccountTransactionData: kotlin.collections.List<SavingsAccountTransactionData>? = null,

    @Contextual
    val savingsAccountTransactionSummaryWrapper: kotlin.Any? = null,

    val savingsAccountTransactionsWithPivotConfig: kotlin.collections.List<SavingsAccountTransactionData>? = null,

    @Contextual
    val savingsAmountOnHold: Double? = null,

    @Contextual
    val savingsHelper: kotlin.Any? = null,

    val savingsProduct: SavingsProductData? = null,

    val savingsProductData: SavingsProductData? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

    @Contextual
    val startInterestCalculationDate: LocalDate? = null,

    val status: SavingsAccountStatusEnumData? = null,

    val subStatus: SavingsAccountSubStatusEnumData? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val summary: SavingsAccountSummaryData? = null,

    val taxGroup: TaxGroupData? = null,

    val timeline: SavingsAccountApplicationTimelineData? = null,

    val transactions: kotlin.collections.List<SavingsAccountTransactionData>? = null,

    val updatedTransactions: kotlin.collections.List<SavingsAccountTransactionData>? = null,

    val withHoldTax: kotlin.Boolean? = null,

    val withdrawalFee: SavingsAccountChargeData? = null,

    val withdrawalFeeForTransfers: kotlin.Boolean? = null,

    val withdrawalFeeTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

)
