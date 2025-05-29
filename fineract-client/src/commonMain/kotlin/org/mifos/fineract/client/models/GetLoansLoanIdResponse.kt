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
 * GetLoansLoanIdResponse
 *
 * @param accountNo
 * @param amortizationType
 * @param annualInterestRate
 * @param approvedPrincipal
 * @param chargedOff
 * @param charges Set of charges
 * @param clientExternalId
 * @param clientId
 * @param clientName
 * @param clientOfficeId
 * @param currency
 * @param delinquencyRange
 * @param delinquent
 * @param disableScheduleExtensionForDownPayment
 * @param disallowExpectedDisbursements
 * @param disbursedAmountPercentageForDownPayment
 * @param disbursementDetails Set of GetLoansLoanIdDisbursementDetails
 * @param enableAutoRepaymentForDownPayment
 * @param enableDownPayment
 * @param enableInstallmentLevelDelinquency
 * @param externalId
 * @param fixedPrincipalPercentagePerInstallment
 * @param fraud
 * @param id
 * @param inArrearsTolerance
 * @param interestCalculationPeriodType
 * @param interestRateFrequencyType
 * @param interestRatePerPeriod
 * @param interestType
 * @param isFloatingInterestRate
 * @param lastClosedBusinessDate
 * @param loanOfficerId
 * @param loanOfficerName
 * @param loanProductDescription
 * @param loanProductId
 * @param loanProductName
 * @param loanPurposeId
 * @param loanPurposeName
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param loanType
 * @param netDisbursalAmount
 * @param numberOfRepayments
 * @param overpaidOnDate
 * @param principal
 * @param proposedPrincipal
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param repaymentSchedule
 * @param status
 * @param summary
 * @param termFrequency
 * @param termPeriodFrequencyType
 * @param timeline
 * @param totalOverpaid
 * @param transactionProcessingStrategyCode
 * @param transactions Set of GetLoansLoanIdTransactions
 */

@Serializable
data class GetLoansLoanIdResponse(

    val accountNo: kotlin.String? = null,

    val amortizationType: GetLoansLoanIdAmortizationType? = null,

    val annualInterestRate: kotlin.Int? = null,

    val approvedPrincipal: kotlin.Double? = null,

    val chargedOff: kotlin.Boolean? = null,

    val charges: kotlin.collections.List<GetLoansLoanIdLoanChargeData>? = null,

    val clientExternalId: kotlin.String? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val clientOfficeId: kotlin.Long? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    val delinquencyRange: GetDelinquencyRangesResponse? = null,

    val delinquent: GetLoansLoanIdDelinquencySummary? = null,

    val disableScheduleExtensionForDownPayment: kotlin.Boolean? = null,

    val disallowExpectedDisbursements: kotlin.Boolean? = null,

    @Contextual
    val disbursedAmountPercentageForDownPayment: Double? = null,

    val disbursementDetails: kotlin.collections.Set<GetLoansLoanIdDisbursementDetails>? = null,

    val enableAutoRepaymentForDownPayment: kotlin.Boolean? = null,

    val enableDownPayment: kotlin.Boolean? = null,

    val enableInstallmentLevelDelinquency: kotlin.Boolean? = null,

    val externalId: kotlin.String? = null,

    @Contextual
    val fixedPrincipalPercentagePerInstallment: Double? = null,

    val fraud: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val inArrearsTolerance: kotlin.Int? = null,

    val interestCalculationPeriodType: GetLoansLoanIdInterestCalculationPeriodType? = null,

    val interestRateFrequencyType: GetLoansLoanIdInterestRateFrequencyType? = null,

    @Contextual
    val interestRatePerPeriod: Double? = null,

    val interestType: GetLoansLoanIdInterestType? = null,

    val isFloatingInterestRate: kotlin.Boolean? = null,

    @Contextual
    val lastClosedBusinessDate: LocalDate? = null,

    val loanOfficerId: kotlin.Long? = null,

    val loanOfficerName: kotlin.String? = null,

    val loanProductDescription: kotlin.String? = null,

    val loanProductId: kotlin.Long? = null,

    val loanProductName: kotlin.String? = null,

    val loanPurposeId: kotlin.Long? = null,

    val loanPurposeName: kotlin.String? = null,

    val loanScheduleProcessingType: EnumOptionData? = null,

    val loanScheduleType: EnumOptionData? = null,

    val loanType: GetLoansLoanIdLoanType? = null,

    val netDisbursalAmount: kotlin.Double? = null,

    val numberOfRepayments: kotlin.Int? = null,

    @Contextual
    val overpaidOnDate: LocalDate? = null,

    @Contextual
    val principal: Double? = null,

    val proposedPrincipal: kotlin.Double? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: GetLoansLoanIdRepaymentFrequencyType? = null,

    val repaymentSchedule: GetLoansLoanIdRepaymentSchedule? = null,

    val status: GetLoansLoanIdStatus? = null,

    val summary: GetLoansLoanIdSummary? = null,

    val termFrequency: kotlin.Int? = null,

    val termPeriodFrequencyType: GetLoansLoanIdTermPeriodFrequencyType? = null,

    val timeline: GetLoansLoanIdTimeline? = null,

    val totalOverpaid: kotlin.Double? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

    val transactions: kotlin.collections.List<GetLoansLoanIdTransactions>? = null,

)
