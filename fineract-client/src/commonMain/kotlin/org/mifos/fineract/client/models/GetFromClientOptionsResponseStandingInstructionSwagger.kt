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
 * @param displayName
 * @param id
 * @param officeId
 * @param officeName
 */

@Serializable
data class GetFromClientOptionsResponseStandingInstructionSwagger(

    val displayName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

)
