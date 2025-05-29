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
 * GetAccountNumberFormatsIdResponse
 *
 * @param accountType
 * @param id
 * @param prefixType
 */

@Serializable
data class GetAccountNumberFormatsIdResponse(

    val accountType: EnumOptionData? = null,

    val id: kotlin.Long? = null,

    val prefixType: EnumOptionData? = null,

)
