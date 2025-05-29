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
 * @param borrowerCycleNumber
 * @param defaultValue
 * @param id
 * @param loanProductParamType
 * @param loanProductValueConditionType
 * @param maxValue
 * @param minValue
 * @param paramType
 * @param valueConditionType
 */

@Serializable
data class LoanProductBorrowerCycleVariationData(

    val borrowerCycleNumber: kotlin.Int? = null,

    @Contextual
    val defaultValue: Double? = null,

    val id: kotlin.Long? = null,

    val loanProductParamType: LoanProductBorrowerCycleVariationData.LoanProductParamType? = null,

    val loanProductValueConditionType: LoanProductBorrowerCycleVariationData.LoanProductValueConditionType? = null,

    @Contextual
    val maxValue: Double? = null,

    @Contextual
    val minValue: Double? = null,

    val paramType: EnumOptionData? = null,

    val valueConditionType: EnumOptionData? = null,

) {

    /**
     *
     *
     * Values: INVALID,PRINCIPAL,INTERESTRATE,REPAYMENT
     */
    @Serializable
    enum class LoanProductParamType(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("PRINCIPAL")
        PRINCIPAL("PRINCIPAL"),

        @SerialName("INTERESTRATE")
        INTERESTRATE("INTERESTRATE"),

        @SerialName("REPAYMENT")
        REPAYMENT("REPAYMENT"),
    }

    /**
     *
     *
     * Values: INVALID,EQUAL,GREATERTHAN
     */
    @Serializable
    enum class LoanProductValueConditionType(val value: kotlin.String) {
        @SerialName("INVALID")
        INVALID("INVALID"),

        @SerialName("EQUAL")
        EQUAL("EQUAL"),

        @SerialName("GREATERTHAN")
        GREATERTHAN("GREATERTHAN"),
    }
}
