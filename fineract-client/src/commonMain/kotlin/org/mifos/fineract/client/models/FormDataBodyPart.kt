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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param content
 * @param contentDisposition
 * @param entity
 * @param fileName
 * @param formDataContentDisposition
 * @param headers
 * @param mediaType
 * @param messageBodyWorkers
 * @param name
 * @param parameterizedHeaders
 * @param parent
 * @param providers
 * @param simple
 * @param `value`
 */

@Serializable
data class FormDataBodyPart(

    @Contextual
    val content: kotlin.Any? = null,

    val contentDisposition: ContentDisposition? = null,

    @Contextual
    val entity: kotlin.Any? = null,

    val fileName: kotlin.String? = null,

    val formDataContentDisposition: FormDataContentDisposition? = null,

    val headers: BodyPartHeaders? = null,

    val mediaType: MediaType? = null,

    @Contextual
    val messageBodyWorkers: kotlin.Any? = null,

    val name: kotlin.String? = null,

    val parameterizedHeaders: BodyPartParameterizedHeaders? = null,

    val parent: MultiPart? = null,

    @Contextual
    val providers: kotlin.Any? = null,

    val simple: kotlin.Boolean? = null,

    val value: kotlin.String? = null,

)
