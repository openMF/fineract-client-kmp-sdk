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
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param error
 * @param loanId
 * @param lockOwner
 * @param lockPlacedOn
 * @param lockPlacedOnCobBusinessDate
 * @param newLockOwner
 * @param stacktrace
 * @param version
 */

@Serializable
data class LoanAccountLock(

    val error: kotlin.String? = null,

    val loanId: kotlin.Long? = null,

    val lockOwner: LoanAccountLock.LockOwner? = null,

    @Contextual
    val lockPlacedOn: LocalDateTime? = null,

    @Contextual
    val lockPlacedOnCobBusinessDate: LocalDate? = null,

    val newLockOwner: LoanAccountLock.NewLockOwner? = null,

    val stacktrace: kotlin.String? = null,

    val version: kotlin.Long? = null,

) {

    /**
     *
     *
     * Values: COB_CHUNK_PROCESSING,INLINE_COB_PROCESSING
     */
    @Serializable
    enum class LockOwner(val value: kotlin.String) {
        @SerialName("LOAN_COB_CHUNK_PROCESSING")
        COB_CHUNK_PROCESSING("LOAN_COB_CHUNK_PROCESSING"),

        @SerialName("LOAN_INLINE_COB_PROCESSING")
        INLINE_COB_PROCESSING("LOAN_INLINE_COB_PROCESSING"),
    }

    /**
     *
     *
     * Values: COB_CHUNK_PROCESSING,INLINE_COB_PROCESSING
     */
    @Serializable
    enum class NewLockOwner(val value: kotlin.String) {
        @SerialName("LOAN_COB_CHUNK_PROCESSING")
        COB_CHUNK_PROCESSING("LOAN_COB_CHUNK_PROCESSING"),

        @SerialName("LOAN_INLINE_COB_PROCESSING")
        INLINE_COB_PROCESSING("LOAN_INLINE_COB_PROCESSING"),
    }
}
