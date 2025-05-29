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
 * @param mapperkey
 * @param mapperorder
 * @param mappervalue
 * @param new
 */

@Serializable
data class TemplateMapper(

    val id: kotlin.Long? = null,

    val mapperkey: kotlin.String? = null,

    val mapperorder: kotlin.Int? = null,

    val mappervalue: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

)
