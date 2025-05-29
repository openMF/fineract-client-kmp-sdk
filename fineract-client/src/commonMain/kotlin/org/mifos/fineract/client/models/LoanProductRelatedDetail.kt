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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param allowPartialPeriodInterestCalcualtion
 * @param amortizationMethod
 * @param annualNominalInterestRate
 * @param arrearsTolerance
 * @param currency
 * @param disableScheduleExtensionForDownPayment
 * @param disbursedAmountPercentageForDownPayment
 * @param enableAutoRepaymentForDownPayment
 * @param enableDownPayment
 * @param equalAmortization
 * @param graceOnArrearsAgeing
 * @param graceOnDueDate
 * @param graceOnInterestPayment
 * @param graceOnPrincipalPayment
 * @param inArrearsTolerance
 * @param interestCalculationPeriodMethod
 * @param interestMethod
 * @param interestPeriodFrequencyType
 * @param interestRecalculationEnabled
 * @param loanScheduleProcessingType
 * @param loanScheduleType
 * @param nominalInterestRatePerPeriod
 * @param numberOfRepayments
 * @param principal
 * @param repayEvery
 * @param repaymentPeriodFrequencyType
 */

@Serializable
data class LoanProductRelatedDetail(

    val allowPartialPeriodInterestCalcualtion: kotlin.Boolean? = null,

    val amortizationMethod: LoanProductRelatedDetail.AmortizationMethod? = null,

    @Contextual
    val annualNominalInterestRate: Double? = null,

    @Contextual
    val arrearsTolerance: Double? = null,

    val currency: MonetaryCurrency? = null,

    val disableScheduleExtensionForDownPayment: kotlin.Boolean? = null,

    @Contextual
    val disbursedAmountPercentageForDownPayment: Double? = null,

    val enableAutoRepaymentForDownPayment: kotlin.Boolean? = null,

    val enableDownPayment: kotlin.Boolean? = null,

    val equalAmortization: kotlin.Boolean? = null,

    val graceOnArrearsAgeing: kotlin.Int? = null,

    val graceOnDueDate: kotlin.Int? = null,

    val graceOnInterestPayment: kotlin.Int? = null,

    val graceOnPrincipalPayment: kotlin.Int? = null,

    val inArrearsTolerance: Money? = null,

    val interestCalculationPeriodMethod: LoanProductRelatedDetail.InterestCalculationPeriodMethod? = null,

    val interestMethod: LoanProductRelatedDetail.InterestMethod? = null,

    val interestPeriodFrequencyType: LoanProductRelatedDetail.InterestPeriodFrequencyType? = null,

    val interestRecalculationEnabled: kotlin.Boolean? = null,

    val loanScheduleProcessingType: LoanProductRelatedDetail.LoanScheduleProcessingType? = null,

    val loanScheduleType: LoanProductRelatedDetail.LoanScheduleType? = null,

    @Contextual
    val nominalInterestRatePerPeriod: Double? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: Money? = null,

    val repayEvery: kotlin.Int? = null,

    val repaymentPeriodFrequencyType: LoanProductRelatedDetail.RepaymentPeriodFrequencyType? = null,

) {

    /**
     *
     *
     * Values: EQUAL_PRINCIPAL,EQUAL_INSTALLMENTS,INVALID
     */
    @Serializable
    enum class AmortizationMethod(val value: kotlin.String) {
        @SerialName("EQUAL_PRINCIPAL")
        EQUAL_PRINCIPAL("EQUAL_PRINCIPAL"),

        @SerialName("EQUAL_INSTALLMENTS")
        EQUAL_INSTALLMENTS("EQUAL_INSTALLMENTS"),

        @SerialName("INVALID")
        INVALID("INVALID"),
    }

    /**
     *
     *
     * Values: DAILY,SAME_AS_REPAYMENT_PERIOD,INVALID
     */
    @Serializable
    enum class InterestCalculationPeriodMethod(val value: kotlin.String) {
        @SerialName("DAILY")
        DAILY("DAILY"),

        @SerialName("SAME_AS_REPAYMENT_PERIOD")
        SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),

        @SerialName("INVALID")
        INVALID("INVALID"),
    }

    /**
     *
     *
     * Values: DECLINING_BALANCE,FLAT,INVALID
     */
    @Serializable
    enum class InterestMethod(val value: kotlin.String) {
        @SerialName("DECLINING_BALANCE")
        DECLINING_BALANCE("DECLINING_BALANCE"),

        @SerialName("FLAT")
        FLAT("FLAT"),

        @SerialName("INVALID")
        INVALID("INVALID"),
    }

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
     * Values: HORIZONTAL,VERTICAL
     */
    @Serializable
    enum class LoanScheduleProcessingType(val value: kotlin.String) {
        @SerialName("HORIZONTAL")
        HORIZONTAL("HORIZONTAL"),

        @SerialName("VERTICAL")
        VERTICAL("VERTICAL"),
    }

    /**
     *
     *
     * Values: CUMULATIVE,PROGRESSIVE
     */
    @Serializable
    enum class LoanScheduleType(val value: kotlin.String) {
        @SerialName("CUMULATIVE")
        CUMULATIVE("CUMULATIVE"),

        @SerialName("PROGRESSIVE")
        PROGRESSIVE("PROGRESSIVE"),
    }

    /**
     *
     *
     * Values: DAYS,WEEKS,MONTHS,YEARS,WHOLE_TERM,INVALID
     */
    @Serializable
    enum class RepaymentPeriodFrequencyType(val value: kotlin.String) {
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
}
