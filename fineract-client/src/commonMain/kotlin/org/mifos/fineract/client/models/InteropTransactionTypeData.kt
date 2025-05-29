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
 * @param initiator
 * @param initiatorType
 * @param scenario
 * @param subScenario
 */

@Serializable
data class InteropTransactionTypeData(

    val initiator: InteropTransactionTypeData.Initiator,

    val initiatorType: InteropTransactionTypeData.InitiatorType,

    val scenario: InteropTransactionTypeData.Scenario,

    val subScenario: kotlin.String? = null,

) {

    /**
     *
     *
     * Values: PAYER,PAYEE
     */
    @Serializable
    enum class Initiator(val value: kotlin.String) {
        @SerialName("PAYER")
        PAYER("PAYER"),

        @SerialName("PAYEE")
        PAYEE("PAYEE"),
    }

    /**
     *
     *
     * Values: CONSUMER,AGENT,BUSINESS,DEVICE
     */
    @Serializable
    enum class InitiatorType(val value: kotlin.String) {
        @SerialName("CONSUMER")
        CONSUMER("CONSUMER"),

        @SerialName("AGENT")
        AGENT("AGENT"),

        @SerialName("BUSINESS")
        BUSINESS("BUSINESS"),

        @SerialName("DEVICE")
        DEVICE("DEVICE"),
    }

    /**
     *
     *
     * Values: DEPOSIT,WITHDRAWAL,TRANSFER,PAYMENT,REFUND
     */
    @Serializable
    enum class Scenario(val value: kotlin.String) {
        @SerialName("DEPOSIT")
        DEPOSIT("DEPOSIT"),

        @SerialName("WITHDRAWAL")
        WITHDRAWAL("WITHDRAWAL"),

        @SerialName("TRANSFER")
        TRANSFER("TRANSFER"),

        @SerialName("PAYMENT")
        PAYMENT("PAYMENT"),

        @SerialName("REFUND")
        REFUND("REFUND"),
    }
}
