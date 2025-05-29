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
 * @param country
 * @param displayCountry
 * @param displayLanguage
 * @param displayName
 * @param displayScript
 * @param displayVariant
 * @param extensionKeys
 * @param iso3Country
 * @param iso3Language
 * @param language
 * @param script
 * @param unicodeLocaleAttributes
 * @param unicodeLocaleKeys
 * @param variant
 */

@Serializable
data class PagedLocalRequestAdvancedQueryDataLocaleObject(

    val country: kotlin.String? = null,

    val displayCountry: kotlin.String? = null,

    val displayLanguage: kotlin.String? = null,

    val displayName: kotlin.String? = null,

    val displayScript: kotlin.String? = null,

    val displayVariant: kotlin.String? = null,

    val extensionKeys: kotlin.collections.Set<kotlin.String>? = null,

    val iso3Country: kotlin.String? = null,

    val iso3Language: kotlin.String? = null,

    val language: kotlin.String? = null,

    val script: kotlin.String? = null,

    val unicodeLocaleAttributes: kotlin.collections.Set<kotlin.String>? = null,

    val unicodeLocaleKeys: kotlin.collections.Set<kotlin.String>? = null,

    val variant: kotlin.String? = null,

)
