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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param clientId
 * @param createdById
 * @param createdByUsername
 * @param createdOn
 * @param depositAccountId
 * @param groupId
 * @param id
 * @param loanId
 * @param loanTransactionId
 * @param note
 * @param noteType
 * @param savingAccountId
 * @param updatedById
 * @param updatedByUsername
 * @param updatedOn
 */

@Serializable
data class NoteData(

    val clientId: kotlin.Long? = null,

    val createdById: kotlin.Long? = null,

    val createdByUsername: kotlin.String? = null,

    @Contextual
    val createdOn: LocalDateTime? = null,

    val depositAccountId: kotlin.Long? = null,

    val groupId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val loanId: kotlin.Long? = null,

    val loanTransactionId: kotlin.Long? = null,

    val note: kotlin.String? = null,

    val noteType: EnumOptionData? = null,

    val savingAccountId: kotlin.Long? = null,

    val updatedById: kotlin.Long? = null,

    val updatedByUsername: kotlin.String? = null,

    @Contextual
    val updatedOn: LocalDateTime? = null,

)
