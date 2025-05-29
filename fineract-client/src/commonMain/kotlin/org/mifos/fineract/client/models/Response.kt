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
 * @param id
 * @param new
 * @param question
 * @param sequenceNo
 * @param text
 * @param `value`
 */

@Serializable
data class Response(

    val id: kotlin.Long? = null,

    val new: kotlin.Boolean? = null,

    val question: Question? = null,

    val sequenceNo: kotlin.Int? = null,

    val text: kotlin.String? = null,

    val value: kotlin.Int? = null,

)
