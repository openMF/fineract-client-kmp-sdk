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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * PostSurveySurveyNameApptableIdRequest
 *
 * @param date
 * @param dateFormat
 * @param locale
 * @param ppiBusinessoccupationCdQ3Businessoccupation
 * @param ppiFloorTypeCdQ5FloorType
 * @param ppiFryingpansCdQ10Fryingpans
 * @param ppiHabitableroomsCdQ4Habitablerooms
 * @param ppiHighestschoolCdQ2Highestschool
 * @param ppiHouseholdMembersCdQ1Householdmembers
 * @param ppiIronsCdQ7Irons
 * @param ppiLightingsourceCdQ6Lightingsource
 * @param ppiMosquitonetsCdQ8Mosquitonets
 * @param ppiTowelsCdQ9Towels
 */

@Serializable
data class PostSurveySurveyNameApptableIdRequest(

    @Contextual
    val date: LocalDateTime? = null,

    @Contextual
    val dateFormat: LocalDateTime? = null,

    val locale: kotlin.String? = null,

    @SerialName("ppi_businessoccupation_cd_q3_businessoccupation")
    val ppiBusinessoccupationCdQ3Businessoccupation: kotlin.Long? = null,

    @SerialName("ppi_floortype_cd_q5_floortype")
    val ppiFloorTypeCdQ5FloorType: kotlin.Long? = null,

    @SerialName("ppi_fryingpans_cd_q10_fryingpans")
    val ppiFryingpansCdQ10Fryingpans: kotlin.Long? = null,

    @SerialName("ppi_habitablerooms_cd_q4_habitablerooms")
    val ppiHabitableroomsCdQ4Habitablerooms: kotlin.Long? = null,

    @SerialName("ppi_highestschool_cd_q2_highestschool")
    val ppiHighestschoolCdQ2Highestschool: kotlin.Long? = null,

    @SerialName("ppi_household_members_cd_q1_householdmembers")
    val ppiHouseholdMembersCdQ1Householdmembers: kotlin.Long? = null,

    @SerialName("ppi_irons_cd_q7_irons")
    val ppiIronsCdQ7Irons: kotlin.Long? = null,

    @SerialName("ppi_lightingsource_cd_q6_lightingsource")
    val ppiLightingsourceCdQ6Lightingsource: kotlin.Long? = null,

    @SerialName("ppi_mosquitonets_cd_q8_mosquitonets")
    val ppiMosquitonetsCdQ8Mosquitonets: kotlin.Long? = null,

    @SerialName("ppi_towels_cd_q9_towels")
    val ppiTowelsCdQ9Towels: kotlin.Long? = null,

)
