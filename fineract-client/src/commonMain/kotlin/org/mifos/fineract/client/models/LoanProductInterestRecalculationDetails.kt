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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param arrearsBasedOnOriginalSchedule
 * @param compoundingFrequencyNthDay
 * @param compoundingFrequencyOnDay
 * @param compoundingFrequencyType
 * @param compoundingFrequencyWeekday
 * @param compoundingInterval
 * @param id
 * @param interestRecalculationCompoundingMethod
 * @param isCompoundingToBePostedAsTransaction
 * @param new
 * @param rescheduleStrategyMethod
 * @param restFrequencyNthDay
 * @param restFrequencyOnDay
 * @param restFrequencyType
 * @param restFrequencyWeekday
 * @param restInterval
 */

@Serializable
data class LoanProductInterestRecalculationDetails(

    val arrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    val compoundingFrequencyNthDay: kotlin.Int? = null,

    val compoundingFrequencyOnDay: kotlin.Int? = null,

    val compoundingFrequencyType: LoanProductInterestRecalculationDetails.CompoundingFrequencyType? = null,

    val compoundingFrequencyWeekday: kotlin.Int? = null,

    val compoundingInterval: kotlin.Int? = null,

    val id: kotlin.Long? = null,

    val interestRecalculationCompoundingMethod: kotlin.Int? = null,

    val isCompoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    val new: kotlin.Boolean? = null,

    val rescheduleStrategyMethod: kotlin.Int? = null,

    val restFrequencyNthDay: kotlin.Int? = null,

    val restFrequencyOnDay: kotlin.Int? = null,

    val restFrequencyType: LoanProductInterestRecalculationDetails.RestFrequencyType? = null,

    val restFrequencyWeekday: kotlin.Int? = null,

    val restInterval: kotlin.Int? = null,

) {

    /**
     *
     *
     * Values: INVALID,SAME_AS_REPAYMENT_PERIOD,DAILY,WEEKLY,MONTHLY
     */
    @Serializable
    enum class CompoundingFrequencyType(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("SAME_AS_REPAYMENT_PERIOD")
        SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),

        @SerialName("DAILY")
        DAILY("DAILY"),

        @SerialName("WEEKLY")
        WEEKLY("WEEKLY"),

        @SerialName("MONTHLY")
        MONTHLY("MONTHLY"),
    }

    /**
     *
     *
     * Values: INVALID,SAME_AS_REPAYMENT_PERIOD,DAILY,WEEKLY,MONTHLY
     */
    @Serializable
    enum class RestFrequencyType(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("SAME_AS_REPAYMENT_PERIOD")
        SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),

        @SerialName("DAILY")
        DAILY("DAILY"),

        @SerialName("WEEKLY")
        WEEKLY("WEEKLY"),

        @SerialName("MONTHLY")
        MONTHLY("MONTHLY"),
    }
}
