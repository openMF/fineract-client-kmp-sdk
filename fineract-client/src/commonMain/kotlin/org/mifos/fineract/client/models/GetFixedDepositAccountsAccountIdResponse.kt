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
 * GetFixedDepositAccountsAccountIdResponse
 *
 * @param accountChart
 * @param accountNo
 * @param clientId
 * @param clientName
 * @param currency
 * @param depositAmount
 * @param depositPeriod
 * @param depositPeriodFrequency
 * @param externalId
 * @param fieldOfficerId
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestFreePeriodApplicable
 * @param interestPostingPeriodType
 * @param maturityAmount
 * @param maturityDate
 * @param maxDepositTerm
 * @param maxDepositTermType
 * @param minDepositTerm
 * @param minDepositTermType
 * @param preClosurePenalApplicable
 * @param savingsProductId
 * @param savingsProductName
 * @param status
 * @param summary
 * @param timeline
 */

@Serializable
data class GetFixedDepositAccountsAccountIdResponse(

    val accountChart: GetFixedDepositAccountsAccountChart? = null,

    val accountNo: kotlin.Long? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: GetFixedDepositAccountsAccountIdCurrency? = null,

    val depositAmount: kotlin.Float? = null,

    val depositPeriod: kotlin.Int? = null,

    val depositPeriodFrequency: GetFixedDepositAccountsDepositPeriodFrequency? = null,

    val externalId: kotlin.String? = null,

    val fieldOfficerId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetFixedDepositAccountsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetFixedDepositAccountsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetFixedDepositAccountsInterestCompoundingPeriodType? = null,

    val interestFreePeriodApplicable: kotlin.Boolean? = null,

    val interestPostingPeriodType: GetFixedDepositAccountsInterestPostingPeriodType? = null,

    val maturityAmount: kotlin.Float? = null,

    @Contextual
    val maturityDate: LocalDate? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetFixedDepositAccountsMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetFixedDepositAccountsMinDepositTermType? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

    val status: GetFixedDepositAccountsStatus? = null,

    val summary: GetFixedDepositAccountsAccountIdSummary? = null,

    val timeline: GetFixedDepositAccountsTimeline? = null,

)
