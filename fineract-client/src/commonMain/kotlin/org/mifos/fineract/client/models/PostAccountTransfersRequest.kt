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
 * PostAccountTransfersRequest
 *
 * @param dateFormat
 * @param fromAccountId
 * @param fromAccountType
 * @param fromClientId
 * @param fromOfficeId
 * @param locale
 * @param toAccountId
 * @param toAccountType
 * @param toClientId
 * @param toOfficeId
 * @param transferAmount
 * @param transferDate
 * @param transferDescription
 */

@Serializable
data class PostAccountTransfersRequest(

    val dateFormat: kotlin.String? = null,

    val fromAccountId: kotlin.Long? = null,

    val fromAccountType: kotlin.Int? = null,

    val fromClientId: kotlin.Long? = null,

    val fromOfficeId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val toAccountId: kotlin.Long? = null,

    val toAccountType: kotlin.Int? = null,

    val toClientId: kotlin.Long? = null,

    val toOfficeId: kotlin.Long? = null,

    val transferAmount: kotlin.Float? = null,

    val transferDate: kotlin.String? = null,

    val transferDescription: kotlin.String? = null,

)
