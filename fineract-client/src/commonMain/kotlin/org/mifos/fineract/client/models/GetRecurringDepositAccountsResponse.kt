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
 * GetRecurringDepositAccountsResponse
 *
 * @param accountNo
 * @param clientId
 * @param clientName
 * @param currency
 * @param depositAmount
 * @param depositPeriod
 * @param depositPeriodFrequency
 * @param fieldOfficerId
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param maturityAmount
 * @param maturityDate
 * @param maxDepositTerm
 * @param maxDepositTermType
 * @param minDepositTerm
 * @param minDepositTermType
 * @param preClosurePenalApplicable
 * @param recurringDepositAmount
 * @param recurringDepositFrequency
 * @param recurringDepositFrequencyType
 * @param savingsProductId
 * @param savingsProductName
 * @param status
 * @param summary
 * @param timeline
 */

@Serializable
data class GetRecurringDepositAccountsResponse(

    val accountNo: kotlin.Long? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: GetRecurringDepositAccountsCurrency? = null,

    val depositAmount: kotlin.Float? = null,

    val depositPeriod: kotlin.Int? = null,

    val depositPeriodFrequency: GetRecurringDepositAccountsDepositPeriodFrequency? = null,

    val fieldOfficerId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetRecurringDepositAccountsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetRecurringDepositAccountsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetRecurringDepositAccountsInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetRecurringDepositAccountsInterestPostingPeriodType? = null,

    val maturityAmount: kotlin.Float? = null,

    @Contextual
    val maturityDate: LocalDate? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetRecurringDepositAccountsMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetRecurringDepositAccountsMinDepositTermType? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val recurringDepositAmount: kotlin.Int? = null,

    val recurringDepositFrequency: kotlin.Int? = null,

    val recurringDepositFrequencyType: GetRecurringDepositAccountsRecurringDepositFrequencyType? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

    val status: GetRecurringDepositAccountsStatus? = null,

    val summary: GetRecurringDepositAccountsSummary? = null,

    val timeline: GetRecurringDepositAccountsTimeline? = null,

)
