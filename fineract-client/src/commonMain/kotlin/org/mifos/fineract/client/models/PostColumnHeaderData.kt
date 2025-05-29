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
 * @param name
 * @param type Any of them: Boolean | Date | DateTime | Decimal | Dropdown | Number | String | Text
 * @param code Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.
 * @param indexed Defaults to false
 * @param length Length of the text field. Mandatory if type String is used, otherwise an error is returned.
 * @param mandatory Defaults to false
 * @param unique Defaults to false
 */

@Serializable
data class PostColumnHeaderData(

    val name: kotlin.String,

    val type: kotlin.String,

    val code: kotlin.String? = null,

    val indexed: kotlin.Boolean? = null,

    val length: kotlin.Long? = null,

    val mandatory: kotlin.Boolean? = null,

    val unique: kotlin.Boolean? = null,

)
