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
 * @param appUser
 * @param client
 * @param createdOn
 * @param id
 * @param new
 * @param question
 * @param response
 * @param survey
 * @param `value`
 */

@Serializable
data class Scorecard(

    val appUser: AppUser? = null,

    val client: Client? = null,

    @Contextual
    val createdOn: LocalDateTime? = null,

    val id: kotlin.Long? = null,

    val new: kotlin.Boolean? = null,

    val question: Question? = null,

    val response: Response? = null,

    val survey: Survey? = null,

    val value: kotlin.Int? = null,

)
