/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_desc
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_mobile_desc
import fineract_sdk_cmp.composeapp.generated.resources.mifos_mobile_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_desc
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_name
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.mifos.core.common.JsonFormatter
import org.mifos.core.common.Result
import org.mifos.core.data.network.ApiService
import org.mifos.core.data.network.AuthRequest
import org.mifos.core.data.network.CenterActivate2Request
import org.mifos.core.data.network.CenterCreate7Request
import org.mifos.core.data.network.CenterDelete11Request
import org.mifos.core.data.network.CenterRetrieveAll23Request
import org.mifos.core.data.network.CenterRetrieveGroupAccountRequest
import org.mifos.core.data.network.CenterRetrieveOne14Request
import org.mifos.core.data.network.CenterRetrieveTemplate6Request
import org.mifos.core.data.network.CenterUpdate12Request
import org.mifos.core.data.network.ChargeCreateRequest
import org.mifos.core.data.network.ChargeDeleteRequest
import org.mifos.core.data.network.ChargeRetrieveRequest
import org.mifos.core.data.network.ChargeUpdateRequest
import org.mifos.fineract.client.models.PostCentersCenterIdRequest
import org.mifos.fineract.client.models.PostCentersRequest
import org.mifos.fineract.client.models.PostChargesRequest
import org.mifos.fineract.client.models.PutChargesChargeIdRequest
import org.mifos.model.MifosFieldOfficerApiName
import org.mifos.model.MifosFieldOfficerOperationName
import org.mifos.model.ProjectDetails
import org.mifos.navigation.NavGraphRoute

/**
 * Simplified ViewModel using ApiHandler framework
 * Returns JSON strings directly without complex data mapping
 */
internal class ApiViewModel(
    private val apiService: ApiService,
) : ViewModel() {
    private val _projectDataState = MutableStateFlow(projectDetailData())
    val projectDataState = _projectDataState.asStateFlow()

    private val _mifosFieldOfficerApiNameState = MutableStateFlow(mifosFieldOfficerApiName())
    val mifosFieldOfficerApiNameState = _mifosFieldOfficerApiNameState.asStateFlow()

    private val _uiState = MutableStateFlow(ApiUiState())
    val uiState: StateFlow<ApiUiState> = _uiState.asStateFlow()

    fun onAction(action: ApiAction) {
        when (action) {
            is ApiAction.Authenticate -> authenticate(action.username, action.password)
            is ApiAction.GetCenterRetrieveGroupAccount -> getCenterRetrieveGroupAccount(action.centerId)
            is ApiAction.ClearError -> clearError()
            is ApiAction.ClearResponse -> clearResponse()
            is ApiAction.GetCenterRetrieveOne14 -> getCenterRetrieveOne14(
                action.one14CenterId,
                action.staffInSelectedOfficeOnly,
            )
            is ApiAction.GetCenterRetrieveTemplate6 -> getCenterRetrieveTemplate6(
                action.template6OfficeID,
                action.staffInSelectedOfficeOnly,
                action.command,
            )
            is ApiAction.GetCenterRetrieveAll23 -> getCenterRetrieveAll23(
                action.officeId,
                action.staffId,
                action.externalId,
                action.name,
                action.underHierarchy,
                action.paged,
                action.offset,
                action.limit,
                action.orderBy,
                action.sortOrder,
                action.meetingDate,
                action.dateFormat,
                action.locale,
            )
            is ApiAction.PostCenterCreate7 -> postCenterCreate7(
                action.postCentersRequest,
            )
            is ApiAction.PostCenterActivate2 -> postCenterActivate2(
                action.centerId,
                action.command,
                action.postCentersCenterIdRequest,
            )
            is ApiAction.PutCenterUpdate12 -> postCenterUpdate12(action.centerId, action.name)
            is ApiAction.CenterDelete11 -> postCenterDelete11(action.centerId)
            is ApiAction.GetChargeRetrieve -> getChargeRetrieve(action.chargeId)
            is ApiAction.GetChargeRetrieveAll -> getChargeRetrieveAll()
            is ApiAction.GetChargeRetrieveTemplate -> getChargeRetrieveTemplate()
            is ApiAction.PostChargeCreate -> postChargeCreate(action.postChargesRequest)
            is ApiAction.PutChargeUpdate -> putChargeUpdate(action.chargeId, action.putChargesChargeIdRequest)
            is ApiAction.ChargeDelete -> chargeDelete(action.chargeId)
        }
    }

    /**
     * Authenticate user
     */
    fun authenticate(username: String, password: String) {
        executeApiCall(
            MifosFieldOfficerOperationName.AUTHENTICATION,
            AuthRequest(username, password),
        )
    }

    /**
     * Center API : GET Retrieve Group Account
     */
    fun getCenterRetrieveGroupAccount(centerId: Long) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT,
            CenterRetrieveGroupAccountRequest(centerId),
        )
    }

    /**
     * Center API : GET Retrieve One 14
     */
    fun getCenterRetrieveOne14(one14CenterId: Long, staffInSelectedOfficeOnly: Boolean) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_RETRIEVE_ONE_14,
            CenterRetrieveOne14Request(one14CenterId, staffInSelectedOfficeOnly),
        )
    }

    /**
     * Center API : GET Retrieve One 14
     */
    fun getCenterRetrieveAll23(
        officeId: Long?,
        staffId: Long?,
        externalId: String?,
        name: String?,
        underHierarchy: String?,
        paged: Boolean?,
        offset: Int?,
        limit: Int?,
        orderBy: String?,
        sortOrder: String?,
        meetingDate: String?,
        dateFormat: String?,
        locale: String?,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23,
            CenterRetrieveAll23Request(
                officeId,
                staffId,
                externalId,
                name,
                underHierarchy,
                paged,
                offset,
                limit,
                orderBy,
                sortOrder,
                meetingDate,
                dateFormat,
                locale,
            ),
        )
    }

    /**
     * Center API : GET Retrieve Template6
     */
    fun getCenterRetrieveTemplate6(
        template6OfficeID: Long?,
        staffInSelectedOfficeOnly: Boolean,
        command: String,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_RETRIEVE_TEMPLATE_6,
            CenterRetrieveTemplate6Request(template6OfficeID, staffInSelectedOfficeOnly, command),
        )
    }

    /**
     * Center API : POST Create 7
     */
    fun postCenterCreate7(
        postCentersRequest: PostCentersRequest,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_CREATE_7,
            CenterCreate7Request(postCentersRequest),
        )
    }

    /**
     * Center API : POST Activate 2
     */
    fun postCenterActivate2(
        centerId: Long,
        command: String? = null,
        postCentersCenterIdRequest: PostCentersCenterIdRequest,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_ACTIVATE_2,
            CenterActivate2Request(centerId, command, postCentersCenterIdRequest),
        )
    }

    /**
     * Center API : PUT Update 12
     */
    fun postCenterUpdate12(
        centerId: Long,
        name: String,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_UPDATE_12,
            CenterUpdate12Request(centerId, name),
        )
    }

    /**
     * Center API : DELETE Delete 11
     */
    private fun postCenterDelete11(centerId: Long) {
        executeApiCall(
            MifosFieldOfficerOperationName.CENTER_DELETE_11,
            CenterDelete11Request(centerId),
        )
    }

    /**
     * Charge API : GET Retrieve Charge
     */
    private fun getChargeRetrieve(chargeId: Long) {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_CHARGES,
            ChargeRetrieveRequest(chargeId),
        )
    }

    /**
     * Charge API : GET Retrieve All
     */
    private fun getChargeRetrieveAll() {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_ALL,
            null,
        )
    }

    /**
     * Charge API : GET Retrieve Template
     */
    private fun getChargeRetrieveTemplate() {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_RETRIEVE_TEMPLATE,
            null,
        )
    }

    /**
     * Charge API : POST Create
     */
    private fun postChargeCreate(postChargesRequest: PostChargesRequest) {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_CREATE,
            ChargeCreateRequest(postChargesRequest),
        )
    }

    /**
     * Charge API : PUT Update
     */
    private fun putChargeUpdate(
        chargeId: Long,
        putChargesChargeIdRequest: PutChargesChargeIdRequest,
    ) {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_UPDATE,
            ChargeUpdateRequest(chargeId, putChargesChargeIdRequest),
        )
    }

    /**
     * Charge API : DELETE Charge
     */
    private fun chargeDelete(chargeId: Long) {
        executeApiCall(
            MifosFieldOfficerOperationName.CHARGE_DELETE,
            ChargeDeleteRequest(chargeId),
        )
    }

    /**
     * Generic method to execute API calls using the handler framework
     */
    private fun <T> executeApiCall(handlerTypeAndOperationName: String, request: T) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = handlerTypeAndOperationName,
                error = null,
                lastOperation = handlerTypeAndOperationName,
            )

            when (val result = apiService.execute(handlerTypeAndOperationName, request)) {
                is Result.Success -> {
                    _uiState.value = _uiState.value.copy(
                        isLoading = null,
                        jsonResponse = JsonFormatter.format(result.data),
                        error = null,
                    )
                }

                is Result.Error -> {
                    _uiState.value = _uiState.value.copy(
                        isLoading = null,
                        error = result.exception.message ?: "Unknown error occurred",
                    )
                }

                is Result.Loading -> {
                    // Keep loading state
                }
            }
        }
    }

    /**
     * Clear any error messages
     */
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    /**
     * Clear the response
     */
    fun clearResponse() {
        _uiState.value = _uiState.value.copy(
            jsonResponse = "",
            lastOperation = "",
        )
    }
}

/**
 * UI State for API operations - simple and focused
 */
internal data class ApiUiState(
    val isLoading: String? = null,
    val jsonResponse: String = "",
    val error: String? = null,
    val lastOperation: String = "",
)

internal sealed interface ApiAction {
    data class Authenticate(val username: String, val password: String) : ApiAction
    data class GetCenterRetrieveGroupAccount(val centerId: Long) : ApiAction
    data class GetCenterRetrieveOne14(
        val one14CenterId: Long,
        val staffInSelectedOfficeOnly: Boolean,
    ) : ApiAction

    data class GetCenterRetrieveAll23(
        val officeId: Long?,
        val staffId: Long?,
        val externalId: String?,
        val name: String?,
        val underHierarchy: String?,
        val paged: Boolean?,
        val offset: Int?,
        val limit: Int?,
        val orderBy: String?,
        val sortOrder: String?,
        val meetingDate: String?,
        val dateFormat: String?,
        val locale: String?,
    ) : ApiAction

    data class GetCenterRetrieveTemplate6(
        val template6OfficeID: Long?,
        val staffInSelectedOfficeOnly: Boolean,
        val command: String,
    ) : ApiAction

    data class PostCenterCreate7(
        val postCentersRequest: PostCentersRequest,
    ) : ApiAction

    data class PostCenterActivate2(
        val centerId: Long,
        val command: String? = null,
        val postCentersCenterIdRequest: PostCentersCenterIdRequest,
    ) : ApiAction

    data class PutCenterUpdate12(
        val centerId: Long,
        val name: String,
    ) : ApiAction

    data class CenterDelete11(
        val centerId: Long,
    ) : ApiAction

    data class GetChargeRetrieve(
        val chargeId: Long,
    ) : ApiAction

    data object GetChargeRetrieveAll : ApiAction

    data object GetChargeRetrieveTemplate : ApiAction

    data class PostChargeCreate(
        val postChargesRequest: PostChargesRequest,
    ) : ApiAction

    data class PutChargeUpdate(
        val chargeId: Long,
        val putChargesChargeIdRequest: PutChargesChargeIdRequest,
    ) : ApiAction

    data class ChargeDelete(
        val chargeId: Long,
    ) : ApiAction

    data object ClearError : ApiAction
    data object ClearResponse : ApiAction
}

private fun projectDetailData(): List<ProjectDetails> {
    return listOf(
        ProjectDetails(
            Res.string.field_officer_name,
            Res.string.field_officer_desc,
            NavGraphRoute.MIFOS_FIELD_OPERATION,
        ),
        ProjectDetails(
            Res.string.mifos_mobile_name,
            Res.string.mifos_mobile_desc,
            NavGraphRoute.MIFOS_MOBILE,
        ),
        ProjectDetails(
            Res.string.mifos_pay_name,
            Res.string.mifos_pay_desc,
            NavGraphRoute.MIFOS_PAY,
        ),
    )
}

private fun mifosFieldOfficerApiName(): List<MifosFieldOfficerApiName> {
    return listOf(
        MifosFieldOfficerApiName.AUTHENTICATION,
        MifosFieldOfficerApiName.CENTER,
        MifosFieldOfficerApiName.CHARGE,
    )
}
