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
 * @param cacheResource
 * @param clientId
 * @param create
 * @param createDatatable
 * @param creditBureauId
 * @param currencyResource
 * @param datatableResource
 * @param delete
 * @param deleteDatatable
 * @param deleteMultiple
 * @param deleteOneToOne
 * @param deleteOperation
 * @param entityId
 * @param entityName
 * @param fullFilSurvey
 * @param groupId
 * @param href
 * @param idempotencyKey
 * @param jobName
 * @param json
 * @param loanDisburseDetailResource
 * @param loanId
 * @param noteResource
 * @param officeId
 * @param organisationCreditBureauId
 * @param passwordPreferencesResource
 * @param permissionResource
 * @param productId
 * @param registerDatatable
 * @param registerSurvey
 * @param savingsId
 * @param subentityId
 * @param surveyResource
 * @param taskPermissionName
 * @param transactionId
 * @param update
 * @param updateDatatable
 * @param updateDisbursementDate
 * @param updateMultiple
 * @param updateOneToOne
 * @param updateOperation
 * @param userResource
 * @param workingDaysResource
 */

@Serializable
data class CommandWrapper(

    val cacheResource: kotlin.Boolean? = null,

    val clientId: kotlin.Long? = null,

    val create: kotlin.Boolean? = null,

    val createDatatable: kotlin.Boolean? = null,

    val creditBureauId: kotlin.Long? = null,

    val currencyResource: kotlin.Boolean? = null,

    val datatableResource: kotlin.Boolean? = null,

    val delete: kotlin.Boolean? = null,

    val deleteDatatable: kotlin.Boolean? = null,

    val deleteMultiple: kotlin.Boolean? = null,

    val deleteOneToOne: kotlin.Boolean? = null,

    val deleteOperation: kotlin.Boolean? = null,

    val entityId: kotlin.Long? = null,

    val entityName: kotlin.String? = null,

    val fullFilSurvey: kotlin.Boolean? = null,

    val groupId: kotlin.Long? = null,

    val href: kotlin.String? = null,

    val idempotencyKey: kotlin.String? = null,

    val jobName: kotlin.String? = null,

    val json: kotlin.String? = null,

    val loanDisburseDetailResource: kotlin.Boolean? = null,

    val loanId: kotlin.Long? = null,

    val noteResource: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val organisationCreditBureauId: kotlin.Long? = null,

    val passwordPreferencesResource: kotlin.Boolean? = null,

    val permissionResource: kotlin.Boolean? = null,

    val productId: kotlin.Long? = null,

    val registerDatatable: kotlin.Boolean? = null,

    val registerSurvey: kotlin.Boolean? = null,

    val savingsId: kotlin.Long? = null,

    val subentityId: kotlin.Long? = null,

    val surveyResource: kotlin.Boolean? = null,

    val taskPermissionName: kotlin.String? = null,

    val transactionId: kotlin.String? = null,

    val update: kotlin.Boolean? = null,

    val updateDatatable: kotlin.Boolean? = null,

    val updateDisbursementDate: kotlin.Boolean? = null,

    val updateMultiple: kotlin.Boolean? = null,

    val updateOneToOne: kotlin.Boolean? = null,

    val updateOperation: kotlin.Boolean? = null,

    val userResource: kotlin.Boolean? = null,

    val workingDaysResource: kotlin.Boolean? = null,

)
