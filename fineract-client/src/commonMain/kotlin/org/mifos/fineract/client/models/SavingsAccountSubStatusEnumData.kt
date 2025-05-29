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
 * @param block
 * @param blockCredit
 * @param blockDebit
 * @param code
 * @param dormant
 * @param escheat
 * @param id
 * @param inactive
 * @param none
 * @param `value`
 */

@Serializable
data class SavingsAccountSubStatusEnumData(

    val block: kotlin.Boolean? = null,

    val blockCredit: kotlin.Boolean? = null,

    val blockDebit: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val dormant: kotlin.Boolean? = null,

    val escheat: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val inactive: kotlin.Boolean? = null,

    val none: kotlin.Boolean? = null,

    val value: kotlin.String? = null,

)
