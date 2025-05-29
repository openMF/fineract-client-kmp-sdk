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
 * @param accountNo
 * @param activationDate
 * @param active
 * @param address
 * @param clientClassification
 * @param clientClassificationId
 * @param clientClassificationOptions
 * @param clientCollateralManagements
 * @param clientLegalFormOptions
 * @param clientNonPersonConstitutionOptions
 * @param clientNonPersonDetails
 * @param clientNonPersonMainBusinessLineOptions
 * @param clientType
 * @param clientTypeId
 * @param clientTypeOptions
 * @param datatables
 * @param dateFormat
 * @param dateOfBirth
 * @param displayName
 * @param emailAddress
 * @param externalId
 * @param familyMemberOptions
 * @param firstname
 * @param fullname
 * @param gender
 * @param genderId
 * @param genderOptions
 * @param groups
 * @param id
 * @param imageId
 * @param imagePresent
 * @param isAddressEnabled
 * @param isStaff
 * @param lastname
 * @param legalForm
 * @param legalFormId
 * @param locale
 * @param middlename
 * @param mobileNo
 * @param narrations
 * @param officeId
 * @param officeName
 * @param officeOptions
 * @param rowIndex
 * @param savingAccountOptions
 * @param savingProductOptions
 * @param savingsAccountId
 * @param savingsProductId
 * @param savingsProductName
 * @param staffId
 * @param staffName
 * @param staffOptions
 * @param status
 * @param subStatus
 * @param submittedOnDate
 * @param timeline
 * @param transferToOfficeId
 * @param transferToOfficeName
 */

@Serializable
data class ClientData(

    val accountNo: kotlin.String? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    val active: kotlin.Boolean? = null,

    val address: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val clientClassification: CodeValueData? = null,

    val clientClassificationId: kotlin.Long? = null,

    val clientClassificationOptions: kotlin.collections.List<CodeValueData>? = null,

    val clientCollateralManagements: kotlin.collections.Set<ClientCollateralManagementData>? = null,

    val clientLegalFormOptions: kotlin.collections.List<EnumOptionData>? = null,

    val clientNonPersonConstitutionOptions: kotlin.collections.List<CodeValueData>? = null,

    @Contextual
    val clientNonPersonDetails: kotlin.Any? = null,

    val clientNonPersonMainBusinessLineOptions: kotlin.collections.List<CodeValueData>? = null,

    val clientType: CodeValueData? = null,

    val clientTypeId: kotlin.Long? = null,

    val clientTypeOptions: kotlin.collections.List<CodeValueData>? = null,

    val datatables: kotlin.collections.List<DatatableData>? = null,

    val dateFormat: kotlin.String? = null,

    @Contextual
    val dateOfBirth: LocalDate? = null,

    val displayName: kotlin.String? = null,

    val emailAddress: kotlin.String? = null,

    val externalId: ExternalId? = null,

    val familyMemberOptions: ClientFamilyMembersData? = null,

    val firstname: kotlin.String? = null,

    val fullname: kotlin.String? = null,

    val gender: CodeValueData? = null,

    val genderId: kotlin.Long? = null,

    val genderOptions: kotlin.collections.List<CodeValueData>? = null,

    val groups: kotlin.collections.List<GroupGeneralData>? = null,

    val id: kotlin.Long? = null,

    val imageId: kotlin.Long? = null,

    val imagePresent: kotlin.Boolean? = null,

    val isAddressEnabled: kotlin.Boolean? = null,

    val isStaff: kotlin.Boolean? = null,

    val lastname: kotlin.String? = null,

    val legalForm: EnumOptionData? = null,

    val legalFormId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val middlename: kotlin.String? = null,

    val mobileNo: kotlin.String? = null,

    val narrations: kotlin.collections.List<CodeValueData>? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val officeOptions: kotlin.collections.List<OfficeData>? = null,

    val rowIndex: kotlin.Int? = null,

    val savingAccountOptions: kotlin.collections.List<SavingsAccountData>? = null,

    val savingProductOptions: kotlin.collections.List<SavingsProductData>? = null,

    val savingsAccountId: kotlin.Long? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    val staffName: kotlin.String? = null,

    val staffOptions: kotlin.collections.List<StaffData>? = null,

    val status: EnumOptionData? = null,

    val subStatus: CodeValueData? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val timeline: ClientTimelineData? = null,

    val transferToOfficeId: kotlin.Long? = null,

    val transferToOfficeName: kotlin.String? = null,

)
