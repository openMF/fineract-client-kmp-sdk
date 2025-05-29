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
 * @param componentKey
 * @param description
 * @param id
 * @param key
 * @param responseDatas
 * @param sequenceNo
 * @param text
 */

@Serializable
data class QuestionData(

    val componentKey: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val key: kotlin.String? = null,

    val responseDatas: kotlin.collections.List<ResponseData>? = null,

    val sequenceNo: kotlin.Int? = null,

    val text: kotlin.String? = null,

)
