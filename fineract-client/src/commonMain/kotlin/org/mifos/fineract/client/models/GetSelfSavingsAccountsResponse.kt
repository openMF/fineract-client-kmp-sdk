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
 * GetSelfSavingsAccountsResponse
 *
 * @param accountNo
 * @param clientId
 * @param clientName
 * @param currency
 * @param fieldOfficerId
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param nominalAnnualInterestRate
 * @param savingsProductId
 * @param savingsProductName
 * @param status
 * @param summary
 * @param timeline
 */

@Serializable
data class GetSelfSavingsAccountsResponse(

    val accountNo: kotlin.Long? = null,

    val clientId: kotlin.Int? = null,

    val clientName: kotlin.String? = null,

    val currency: GetSelfSavingsCurrency? = null,

    val fieldOfficerId: kotlin.Int? = null,

    val id: kotlin.Int? = null,

    val interestCalculationDaysInYearType: GetSelfSavingsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetSelfSavingsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetSelfSavingsInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetSelfSavingsInterestPostingPeriodType? = null,

    val nominalAnnualInterestRate: kotlin.Double? = null,

    val savingsProductId: kotlin.Int? = null,

    val savingsProductName: kotlin.String? = null,

    val status: GetSelfSavingsStatus? = null,

    val summary: GetSelfSavingsSummary? = null,

    val timeline: GetSelfSavingsTimeline? = null,

)
