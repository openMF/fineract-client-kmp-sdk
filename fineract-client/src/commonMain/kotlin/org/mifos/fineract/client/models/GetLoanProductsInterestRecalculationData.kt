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
 * @param id
 * @param interestRecalculationCompoundingFrequencyType
 * @param interestRecalculationCompoundingType
 * @param isArrearsBasedOnOriginalSchedule
 * @param preClosureInterestCalculationStrategy
 * @param productId
 * @param recalculationCompoundingFrequencyInterval
 * @param recalculationCompoundingFrequencyOnDayType
 * @param recalculationRestFrequencyInterval
 * @param recalculationRestFrequencyType
 * @param rescheduleStrategyType
 */

@Serializable
data class GetLoanProductsInterestRecalculationData(

    val id: kotlin.Long? = null,

    val interestRecalculationCompoundingFrequencyType: GetLoanProductsInterestRecalculationCompoundingFrequencyType? = null,

    val interestRecalculationCompoundingType: GetLoanProductsInterestRecalculationCompoundingType? = null,

    val isArrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    val preClosureInterestCalculationStrategy: GetLoanProductsPreClosureInterestCalculationStrategy? = null,

    val productId: kotlin.Long? = null,

    val recalculationCompoundingFrequencyInterval: kotlin.Int? = null,

    val recalculationCompoundingFrequencyOnDayType: kotlin.Int? = null,

    val recalculationRestFrequencyInterval: kotlin.Int? = null,

    val recalculationRestFrequencyType: GetLoanProductsInterestRecalculationCompoundingFrequencyType? = null,

    val rescheduleStrategyType: GetLoanProductsRescheduleStrategyType? = null,

)
