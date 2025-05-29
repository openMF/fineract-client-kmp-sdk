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
 * @param idNumber
 * @param idType
 * @param issuerCountry
 * @param otherIdDescription
 */

@Serializable
data class IdDocument(

    val idNumber: kotlin.String? = null,

    val idType: kotlin.String? = null,

    val issuerCountry: kotlin.String? = null,

    val otherIdDescription: kotlin.String? = null,

)
