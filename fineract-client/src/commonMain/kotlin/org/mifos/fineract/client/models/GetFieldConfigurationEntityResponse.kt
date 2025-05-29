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
 * GetFieldConfigurationEntityResponse
 *
 * @param entity
 * @param `field`
 * @param fieldConfigurationId
 * @param isEnabled
 * @param isMandatory
 * @param subentity
 * @param validationRegex
 */

@Serializable
data class GetFieldConfigurationEntityResponse(

    val entity: kotlin.String? = null,

    val field: kotlin.String? = null,

    val fieldConfigurationId: kotlin.Long? = null,

    val is_enabled: kotlin.String? = null,

    val is_mandatory: kotlin.String? = null,

    val subentity: kotlin.String? = null,

    val validation_regex: kotlin.String? = null,

)
