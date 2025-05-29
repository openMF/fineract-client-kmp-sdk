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
 * GetSelfLoansLoanIdResponse
 *
 * @param accountNo
 * @param amortizationType
 * @param annualInterestRate
 * @param clientId
 * @param clientName
 * @param clientOfficeId
 * @param currency
 * @param id
 * @param interestCalculationPeriodType
 * @param interestRateFrequencyType
 * @param interestRatePerPeriod
 * @param interestType
 * @param loanOfficerId
 * @param loanOfficerName
 * @param loanProductDescription
 * @param loanProductId
 * @param loanProductName
 * @param loanPurposeId
 * @param loanPurposeName
 * @param loanType
 * @param numberOfRepayments
 * @param principal
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param status
 * @param summary
 * @param termFrequency
 * @param termPeriodFrequencyType
 * @param timeline
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class GetSelfLoansLoanIdResponse(

    val accountNo: kotlin.Long? = null,

    val amortizationType: GetLoansLoanIdAmortizationType? = null,

    val annualInterestRate: kotlin.Int? = null,

    val clientId: kotlin.Int? = null,

    val clientName: kotlin.String? = null,

    val clientOfficeId: kotlin.Int? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    val id: kotlin.Long? = null,

    val interestCalculationPeriodType: GetLoansLoanIdInterestCalculationPeriodType? = null,

    val interestRateFrequencyType: GetLoansLoanIdInterestRateFrequencyType? = null,

    val interestRatePerPeriod: kotlin.Int? = null,

    val interestType: GetLoansLoanIdInterestType? = null,

    val loanOfficerId: kotlin.Int? = null,

    val loanOfficerName: kotlin.String? = null,

    val loanProductDescription: kotlin.String? = null,

    val loanProductId: kotlin.Int? = null,

    val loanProductName: kotlin.String? = null,

    val loanPurposeId: kotlin.Int? = null,

    val loanPurposeName: kotlin.String? = null,

    val loanType: GetLoansLoanIdLoanType? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Long? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: GetLoansLoanIdRepaymentFrequencyType? = null,

    val status: GetLoansLoanIdStatus? = null,

    val summary: GetSelfLoanIdSummary? = null,

    val termFrequency: kotlin.Int? = null,

    val termPeriodFrequencyType: GetLoansLoanIdTermPeriodFrequencyType? = null,

    val timeline: GetSelfLoanIdTimeline? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null,

)
