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
 *
 *
 * @param accountNo
 * @param activationDate
 * @param active
 * @param displayName
 * @param fullname
 * @param id
 * @param officeId
 * @param officeName
 * @param status
 */

@Serializable
data class GetSelfClientsPageItems(

    val accountNo: kotlin.Long? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    val active: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val fullname: kotlin.String? = null,

    val id: kotlin.Int? = null,

    val officeId: kotlin.Int? = null,

    val officeName: kotlin.String? = null,

    val status: GetSelfClientsStatus? = null,

)
