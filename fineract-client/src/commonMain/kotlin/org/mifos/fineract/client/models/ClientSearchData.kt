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
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountNumber
 * @param activationDate
 * @param createdDate
 * @param displayName
 * @param externalId
 * @param id
 * @param mobileNo
 * @param officeId
 * @param officeName
 * @param status
 */

@Serializable
data class ClientSearchData(

    val accountNumber: kotlin.String? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    @Contextual
    val createdDate: LocalDateTime? = null,

    val displayName: kotlin.String? = null,

    val externalId: ExternalId? = null,

    val id: kotlin.Long? = null,

    val mobileNo: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val status: EnumOptionData? = null,

)
