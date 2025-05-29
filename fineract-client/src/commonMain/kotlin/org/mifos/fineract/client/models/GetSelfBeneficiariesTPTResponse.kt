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
 * GetSelfBeneficiariesTPTResponse
 *
 * @param accountNumber
 * @param accountType
 * @param clientName
 * @param id
 * @param name
 * @param officeName
 * @param transferLimit
 */

@Serializable
data class GetSelfBeneficiariesTPTResponse(

    val accountNumber: kotlin.Long? = null,

    val accountType: GetSelfBeneficiariesAccountOptions? = null,

    val clientName: kotlin.String? = null,

    val id: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val officeName: kotlin.String? = null,

    val transferLimit: kotlin.Int? = null,

)
