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
 * @param clientId
 * @param id
 * @param scorecardValues
 * @param surveyId
 * @param surveyName
 * @param userId
 * @param username
 */

@Serializable
data class ScorecardData(

    val clientId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val scorecardValues: kotlin.collections.List<ScorecardValue>? = null,

    val surveyId: kotlin.Long? = null,

    val surveyName: kotlin.String? = null,

    val userId: kotlin.Long? = null,

    val username: kotlin.String? = null,

)
