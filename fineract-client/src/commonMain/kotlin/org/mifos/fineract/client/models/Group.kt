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

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountNumberRequiresAutoGeneration
 * @param activationDate
 * @param active
 * @param activeClientMembers
 * @param center
 * @param childGroup
 * @param clientMembers
 * @param closed
 * @param group
 * @param groupLevel
 * @param groupMembers
 * @param id
 * @param new
 * @param notActive
 * @param notPending
 * @param office
 * @param parent
 * @param pending
 * @param staff
 * @param submittedOnDate
 * @param transferInProgress
 * @param transferInProgressOrOnHold
 * @param transferOnHold
 */

@Serializable
data class Group(

    val accountNumberRequiresAutoGeneration: kotlin.Boolean? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    val active: kotlin.Boolean? = null,

    val activeClientMembers: kotlin.collections.Set<Client>? = null,

    val center: kotlin.Boolean? = null,

    val childGroup: kotlin.Boolean? = null,

    val clientMembers: kotlin.collections.Set<Client>? = null,

    val closed: kotlin.Boolean? = null,

    val group: kotlin.Boolean? = null,

    val groupLevel: GroupLevel? = null,

    val groupMembers: kotlin.collections.List<Group>? = null,

    val id: kotlin.Long? = null,

    val new: kotlin.Boolean? = null,

    val notActive: kotlin.Boolean? = null,

    val notPending: kotlin.Boolean? = null,

    val office: Office? = null,

    val parent: Group? = null,

    val pending: kotlin.Boolean? = null,

    val staff: Staff? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val transferInProgress: kotlin.Boolean? = null,

    val transferInProgressOrOnHold: kotlin.Boolean? = null,

    val transferOnHold: kotlin.Boolean? = null,

)
