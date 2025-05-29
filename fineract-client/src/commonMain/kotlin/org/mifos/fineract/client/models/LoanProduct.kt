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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountingDisabled
 * @param accountingType
 * @param accrualBasedAccountingEnabled
 * @param allowApprovedDisbursedAmountsOverApplied
 * @param arrearsBasedOnOriginalSchedule
 * @param cashBasedAccountingEnabled
 * @param closeDate
 * @param currency
 * @param delinquencyBucket
 * @param disallowExpectedDisbursements
 * @param dueDaysForRepaymentEvent
 * @param enableInstallmentLevelDelinquency
 * @param equalAmortization
 * @param externalId
 * @param fixedPrincipalPercentagePerInstallment
 * @param floatingRates
 * @param holdGuaranteeFundsEnabled
 * @param id
 * @param includeInBorrowerCycle
 * @param installmentAmountInMultiplesOf
 * @param interestPeriodFrequencyType
 * @param interestRecalculationEnabled
 * @param linkedToFloatingInterestRate
 * @param loanProductCharges
 * @param loanProductConfigurableAttributes
 * @param loanProductGuaranteeDetails
 * @param loanProductRelatedDetail
 * @param loanProductTrancheDetails
 * @param maxNominalInterestRatePerPeriod
 * @param maxNumberOfRepayments
 * @param maxPrincipalAmount
 * @param minNominalInterestRatePerPeriod
 * @param minNumberOfRepayments
 * @param minPrincipalAmount
 * @param minimumDaysBetweenDisbursalAndFirstRepayment
 * @param multiDisburseLoan
 * @param new
 * @param nominalInterestRatePerPeriod
 * @param numberOfRepayments
 * @param overAppliedCalculationType
 * @param overAppliedNumber
 * @param overDueDaysForRepaymentEvent
 * @param paymentAllocationRules
 * @param periodicAccrualAccountingEnabled
 * @param principalAmount
 * @param principalThresholdForLastInstallment
 * @param productInterestRecalculationDetails
 * @param rates
 * @param repaymentStartDateType
 * @param repaymentStrategy
 * @param shortName
 * @param startDate
 * @param syncExpectedWithDisbursementDate
 * @param transactionProcessingStrategyCode
 * @param transactionProcessingStrategyName
 * @param upfrontAccrualAccountingEnabled
 */

@Serializable
data class LoanProduct(

    val accountingDisabled: kotlin.Boolean? = null,

    val accountingType: kotlin.Int? = null,

    val accrualBasedAccountingEnabled: kotlin.Boolean? = null,

    val allowApprovedDisbursedAmountsOverApplied: kotlin.Boolean? = null,

    val arrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    val cashBasedAccountingEnabled: kotlin.Boolean? = null,

    @Contextual
    val closeDate: LocalDate? = null,

    val currency: MonetaryCurrency? = null,

    val delinquencyBucket: DelinquencyBucket? = null,

    val disallowExpectedDisbursements: kotlin.Boolean? = null,

    val dueDaysForRepaymentEvent: kotlin.Int? = null,

    val enableInstallmentLevelDelinquency: kotlin.Boolean? = null,

    val equalAmortization: kotlin.Boolean? = null,

    val externalId: ExternalId? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val floatingRates: LoanProductFloatingRates? = null,

    val holdGuaranteeFundsEnabled: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val includeInBorrowerCycle: kotlin.Boolean? = null,

    val installmentAmountInMultiplesOf: kotlin.Int? = null,

    val interestPeriodFrequencyType: LoanProduct.InterestPeriodFrequencyType? = null,

    val interestRecalculationEnabled: kotlin.Boolean? = null,

    val linkedToFloatingInterestRate: kotlin.Boolean? = null,

    val loanProductCharges: kotlin.collections.List<Charge>? = null,

    val loanProductConfigurableAttributes: LoanProductConfigurableAttributes? = null,

    val loanProductGuaranteeDetails: LoanProductGuaranteeDetails? = null,

    val loanProductRelatedDetail: LoanProductRelatedDetail? = null,

    val loanProductTrancheDetails: LoanProductTrancheDetails? = null,

    @Contextual
    val maxNominalInterestRatePerPeriod: Double? = null,

    val maxNumberOfRepayments: kotlin.Int? = null,

    val maxPrincipalAmount: Money? = null,

    @Contextual
    val minNominalInterestRatePerPeriod: Double? = null,

    val minNumberOfRepayments: kotlin.Int? = null,

    val minPrincipalAmount: Money? = null,

    val minimumDaysBetweenDisbursalAndFirstRepayment: kotlin.Int? = null,

    val multiDisburseLoan: kotlin.Boolean? = null,

    val new: kotlin.Boolean? = null,

    @Contextual
    val nominalInterestRatePerPeriod: Double? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val overAppliedCalculationType: kotlin.String? = null,

    val overAppliedNumber: kotlin.Int? = null,

    val overDueDaysForRepaymentEvent: kotlin.Int? = null,

    val paymentAllocationRules: kotlin.collections.List<LoanProductPaymentAllocationRule>? = null,

    val periodicAccrualAccountingEnabled: kotlin.Boolean? = null,

    val principalAmount: Money? = null,

    @Contextual
    val principalThresholdForLastInstallment: Double? = null,

    val productInterestRecalculationDetails: LoanProductInterestRecalculationDetails? = null,

    val rates: kotlin.collections.List<Rate>? = null,

    val repaymentStartDateType: LoanProduct.RepaymentStartDateType? = null,

    val repaymentStrategy: kotlin.String? = null,

    val shortName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val syncExpectedWithDisbursementDate: kotlin.Boolean? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

    val transactionProcessingStrategyName: kotlin.String? = null,

    val upfrontAccrualAccountingEnabled: kotlin.Boolean? = null,

) {

    /**
     *
     *
     * Values: DAYS,WEEKS,MONTHS,YEARS,WHOLE_TERM,INVALID
     */
    @Serializable
    enum class InterestPeriodFrequencyType(val value: kotlin.String) {
        @SerialName("DAYS")
        DAYS("DAYS"),

        @SerialName("WEEKS")
        WEEKS("WEEKS"),

        @SerialName("MONTHS")
        MONTHS("MONTHS"),

        @SerialName("YEARS")
        YEARS("YEARS"),

        @SerialName("WHOLE_TERM")
        WHOLE_TERM("WHOLE_TERM"),

        @SerialName("INVALID")
        INVALID("INVALID"),
    }

    /**
     *
     *
     * Values: INVALID,DISBURSEMENT_DATE,SUBMITTED_ON_DATE
     */
    @Serializable
    enum class RepaymentStartDateType(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("DISBURSEMENT_DATE")
        DISBURSEMENT_DATE("DISBURSEMENT_DATE"),

        @SerialName("SUBMITTED_ON_DATE")
        SUBMITTED_ON_DATE("SUBMITTED_ON_DATE"),
    }
}
