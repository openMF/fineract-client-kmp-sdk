/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.screen.mifosFieldOfficer

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.delete
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_name
import fineract_sdk_cmp.composeapp.generated.resources.get
import fineract_sdk_cmp.composeapp.generated.resources.post
import fineract_sdk_cmp.composeapp.generated.resources.put
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.mifos.fineract.client.models.PostCentersCenterIdRequest
import org.mifos.fineract.client.models.PostCentersRequest
import org.mifos.model.MifosFieldOfficerApiName
import org.mifos.model.MifosFieldOfficerOperationName
import org.mifos.presentation.ApiAction
import org.mifos.presentation.ApiUiState
import org.mifos.presentation.ApiViewModel
import org.mifos.screen.ApiResponse
import org.mifos.screen.component.MifosCard
import org.mifos.screen.component.MifosCheckBox
import org.mifos.screen.component.MifosScaffoldTopBar
import org.mifos.screen.component.MifosTextField
import org.mifos.screen.component.MifosVerticalStaggeredGrid
import org.mifos.screen.component.TextFieldItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MifosFieldOfficerScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    apiViewModel: ApiViewModel = koinViewModel(),
) {
    val uiState by apiViewModel.uiState.collectAsState()
    val mifosFieldOfficerApiNameState by apiViewModel.mifosFieldOfficerApiNameState.collectAsState()

    var expandedApi by remember { mutableStateOf<String?>(null) }

    MifosScaffoldTopBar(
        modifier = modifier.imePadding(),
        title = stringResource(Res.string.field_officer_name) + " API's",
        navigationIconShow = true,
        navController = navController,
    ) { paddingValues ->

        Box(
            modifier = Modifier.fillMaxWidth().padding(paddingValues),
        ) {
            LazyColumn(
                contentPadding = PaddingValues(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                items(mifosFieldOfficerApiNameState) { it ->

                    val isExpanded = expandedApi == it.apiName.toString()
                    val rotationAngle by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f)

                    ElevatedCard(
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surfaceContainerLowest),
                        shape = RoundedCornerShape(8.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                            ) {
                                Text(
                                    text = stringResource(it.apiName),
                                    color = MaterialTheme.colorScheme.onSurface,
                                )

                                IconButton(
                                    onClick = {
                                        expandedApi =
                                            if (isExpanded) null else it.apiName.toString()
                                    },
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowDropDown,
                                        contentDescription = null,
                                        tint = MaterialTheme.colorScheme.onSurface,
                                        modifier = Modifier.rotate(rotationAngle),
                                    )
                                }
                            }

                            AnimatedVisibility(visible = isExpanded) {
                                HorizontalDivider(
                                    thickness = 0.5.dp,
                                    color = MaterialTheme.colorScheme.outlineVariant,
                                )
                                when (it) {
                                    MifosFieldOfficerApiName.AUTHENTICATION -> AuthAPI(
                                        uiState = uiState,
                                        onAction = apiViewModel::onAction,
                                    )

                                    MifosFieldOfficerApiName.CENTER -> CenterAPI(
                                        uiState = uiState,
                                        onAction = apiViewModel::onAction,
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    if (uiState.jsonResponse.isNotEmpty() || uiState.error != null) {
        ApiResponse(
            uiState = uiState,
            onClearError = apiViewModel::clearError,
            onClearResponse = apiViewModel::clearResponse,
        )
    }
}

/**
Authentication API
 */
@Composable
private fun AuthAPI(
    uiState: ApiUiState,
    modifier: Modifier = Modifier,
    onAction: (ApiAction) -> Unit,
) {
    var username by remember { mutableStateOf("mifos") }
    var password by remember { mutableStateOf("password") }

    MifosCard(
        modifier = modifier.padding(10.dp),
        apiRequestName = MifosFieldOfficerOperationName.AUTHENTICATION,
        requestType = "Auth",
        isLoading = uiState.isLoading == MifosFieldOfficerOperationName.AUTHENTICATION,
        enable = uiState.isLoading != MifosFieldOfficerOperationName.AUTHENTICATION && username.isNotBlank() && password.isNotBlank(),
        onClick = {
            onAction(ApiAction.Authenticate(username, password))
        },
    ) {
        MifosVerticalStaggeredGrid {
            item {
                MifosTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = "Username",
                )
            }

            item {
                MifosTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = "Password",
                )
            }
        }
    }
}

/**
Center API
 */
@Composable
private fun CenterAPI(
    modifier: Modifier = Modifier,
    uiState: ApiUiState,
    onAction: (ApiAction) -> Unit,
) {
    var centerId by remember { mutableStateOf("0") }

    var centerIdOne14 by remember { mutableStateOf("0") }
    var staffInSelectedOfficeOnlyOne14 by remember { mutableStateOf(false) }

    var officeIdAll23 by remember { mutableStateOf<Long?>(null) }
    var staffIdAll23 by remember { mutableStateOf<Long?>(null) }
    var externalIdAll23 by remember { mutableStateOf<String?>(null) }
    var nameAll23 by remember { mutableStateOf<String?>(null) }
    var underHierarchyAll23 by remember { mutableStateOf<String?>(null) }
    var pagedAll23 by remember { mutableStateOf(false) }
    var offsetAll23 by remember { mutableStateOf<Int?>(null) }
    var limitAll23 by remember { mutableStateOf<Int?>(null) }
    var orderByAll23 by remember { mutableStateOf<String?>(null) }
    var sortOrderAll23 by remember { mutableStateOf<String?>(null) }
    var meetingDateAll23 by remember { mutableStateOf<String?>(null) }
    var dateFormatAll23 by remember { mutableStateOf<String?>(null) }
    var localeAll23 by remember { mutableStateOf<String?>(null) }

    var centerIdTemplate6 by remember { mutableStateOf<Long?>(null) }
    var staffInSelectedOfficeOnlyTemplate6 by remember { mutableStateOf(false) }
    var commandTemplate6 by remember { mutableStateOf("") }

    var activeCreate7 by remember { mutableStateOf(false) }
    var nameCreate7 by remember { mutableStateOf<String?>(null) }
    var officeIdCreate7 by remember { mutableStateOf<Long?>(null) }

    var closureDateActivate2 by remember { mutableStateOf<String?>(null) }
    var closureReasonIdActivate2 by remember { mutableStateOf<Long?>(null) }
    var dateFormatActivate2 by remember { mutableStateOf<String?>(null) }
    var localeActivate2 by remember { mutableStateOf<String?>(null) }
    var centerIdActivate2 by remember { mutableStateOf("0") }
    var commandActivate2 by remember { mutableStateOf<String?>(null) }

    var centerIdUpdate12 by remember { mutableStateOf("0") }
    var nameUpdate12 by remember { mutableStateOf("") }

    var centerIdDelete11 by remember { mutableStateOf("0") }

    MifosVerticalStaggeredGrid(
        minColumns = 1,
        maxColumns = 3,
        modifier = modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalItemSpacing = 10.dp,
    ) {
        /**
         Center API : GET Retrieve Group Account
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT,
                requestType = stringResource(Res.string.get),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT,
                enable = uiState.isLoading != MifosFieldOfficerOperationName.CENTER_RETRIEVE_GROUP_ACCOUNT && centerId.isNotBlank(),
                onClick = {
                    onAction(ApiAction.GetCenterRetrieveGroupAccount(centerId.toLong()))
                },
            ) {
                MifosTextField(
                    value = centerId,
                    onValueChange = { centerId = it },
                    label = "Center Id *",
                    keyboardType = KeyboardType.Number,
                )
            }
        }

        /**
         Center API : GET Retrieve One 14
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_RETRIEVE_ONE_14,
                requestType = stringResource(Res.string.get),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_RETRIEVE_ONE_14,
                enable = centerIdOne14.isNotBlank(),
                onClick = {
                    onAction(
                        ApiAction.GetCenterRetrieveOne14(
                            centerIdOne14.toLong(),
                            staffInSelectedOfficeOnlyOne14,
                        ),
                    )
                },
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    MifosTextField(
                        value = centerIdOne14,
                        onValueChange = { centerIdOne14 = it },
                        label = "Center Id *",
                        keyboardType = KeyboardType.Number,
                    )

                    MifosCheckBox(
                        text = "Staff in Selected Office",
                        checked = staffInSelectedOfficeOnlyOne14,
                        onCheckChanged = { staffInSelectedOfficeOnlyOne14 = it },
                    )
                }
            }
        }

        /**
         Center API : GET Retrieve All23
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23,
                requestType = stringResource(Res.string.get),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23,
                enable = uiState.isLoading != MifosFieldOfficerOperationName.CENTER_RETRIEVE_ALL_23,
                onClick = {
                    onAction(
                        ApiAction.GetCenterRetrieveAll23(
                            officeIdAll23,
                            staffIdAll23,
                            externalIdAll23,
                            nameAll23,
                            underHierarchyAll23,
                            pagedAll23,
                            offsetAll23,
                            limitAll23,
                            orderByAll23,
                            sortOrderAll23,
                            meetingDateAll23,
                            dateFormatAll23,
                            localeAll23,
                        ),
                    )
                },
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    val fieldItems = listOf(
                        TextFieldItem(
                            "Office Id",
                            officeIdAll23?.toString() ?: "",
                            { officeIdAll23 = it.toLongOrNull() },
                            keyboardType = KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "Staff Id",
                            staffIdAll23?.toString() ?: "",
                            { staffIdAll23 = it.toLongOrNull() },
                            keyboardType = KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "External Id",
                            externalIdAll23 ?: "",
                            { externalIdAll23 = it },
                        ),
                        TextFieldItem(
                            "Name",
                            nameAll23 ?: "",
                            { nameAll23 = it },
                        ),
                        TextFieldItem(
                            "Under Hierarchy",
                            underHierarchyAll23 ?: "",
                            { underHierarchyAll23 = it },
                        ),
                        TextFieldItem(
                            "Offset",
                            offsetAll23?.toString() ?: "",
                            { offsetAll23 = it.toIntOrNull() },
                            KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "Limit",
                            limitAll23?.toString() ?: "",
                            { limitAll23 = it.toIntOrNull() },
                            KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "Order By",
                            orderByAll23 ?: "",
                            { orderByAll23 = it },
                        ),
                        TextFieldItem(
                            "Sort Order",
                            sortOrderAll23 ?: "",
                            { sortOrderAll23 = it },
                        ),
                        TextFieldItem(
                            "Meeting Date",
                            meetingDateAll23 ?: "",
                            { meetingDateAll23 = it },
                        ),
                        TextFieldItem(
                            "Date Format",
                            dateFormatAll23 ?: "",
                            { dateFormatAll23 = it },
                        ),
                        TextFieldItem("Locale", localeAll23 ?: "", { localeAll23 = it }),
                    )

                    MifosVerticalStaggeredGrid {
                        items(fieldItems) { it ->
                            MifosTextField(field = it)
                        }
                    }

                    MifosCheckBox(
                        text = "Paged",
                        checked = pagedAll23,
                        onCheckChanged = { pagedAll23 = it },
                    )
                }
            }
        }

        /**
         Center API : GET Retrieve Template6
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_RETRIEVE_TEMPLATE_6,
                requestType = stringResource(Res.string.get),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_RETRIEVE_TEMPLATE_6,
                onClick = {
                    onAction(
                        ApiAction.GetCenterRetrieveTemplate6(
                            centerIdTemplate6,
                            staffInSelectedOfficeOnlyTemplate6,
                            commandTemplate6,
                        ),
                    )
                },
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    MifosVerticalStaggeredGrid {
                        item {
                            MifosTextField(
                                value = centerIdTemplate6?.toString() ?: "",
                                onValueChange = { centerIdTemplate6 = it.toLongOrNull() },
                                label = "Center Id",
                            )
                        }
                        item {
                            MifosTextField(
                                value = commandTemplate6,
                                onValueChange = { commandTemplate6 = it },
                                label = "Command",
                            )
                        }
                    }

                    MifosCheckBox(
                        text = "Staff in Selected Office",
                        checked = staffInSelectedOfficeOnlyTemplate6,
                        onCheckChanged = { staffInSelectedOfficeOnlyTemplate6 = it },
                    )
                }
            }
        }

        /**
         Center API : Post Create7
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_CREATE_7,
                requestType = stringResource(Res.string.post),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_CREATE_7,
                onClick = {
                    onAction(
                        ApiAction.PostCenterCreate7(
                            PostCentersRequest(
                                activeCreate7,
                                nameCreate7,
                                officeIdCreate7,
                            ),
                        ),
                    )
                },
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    MifosVerticalStaggeredGrid {
                        item {
                            MifosTextField(
                                value = nameCreate7 ?: "",
                                onValueChange = { nameCreate7 = it },
                                label = "Name",
                            )
                        }
                        item {
                            MifosTextField(
                                value = officeIdCreate7?.toString() ?: "",
                                onValueChange = { officeIdCreate7 = it.toLongOrNull() },
                                label = "Office Id",
                            )
                        }
                    }

                    MifosCheckBox(
                        text = "Active",
                        checked = activeCreate7,
                        onCheckChanged = { activeCreate7 = it },
                    )
                }
            }
        }

        /**
         Center API : Post Activate 2
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_ACTIVATE_2,
                requestType = stringResource(Res.string.post),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_ACTIVATE_2,
                enable = centerIdActivate2.isNotBlank(),
                onClick = {
                    onAction(
                        ApiAction.PostCenterActivate2(
                            centerIdActivate2.toLong(),
                            commandActivate2,
                            PostCentersCenterIdRequest(
                                closureDateActivate2,
                                closureReasonIdActivate2,
                                dateFormatActivate2,
                                localeActivate2,
                            ),
                        ),
                    )
                },
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    val fieldItems = listOf(
                        TextFieldItem(
                            "Center Id *",
                            centerIdActivate2,
                            { centerIdActivate2 = it },
                            keyboardType = KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "Command",
                            commandActivate2 ?: "",
                            { commandActivate2 = it },
                        ),
                        TextFieldItem(
                            "Closure Date",
                            closureDateActivate2 ?: "",
                            { closureDateActivate2 = it },
                        ),
                        TextFieldItem(
                            "Closure Reason Id",
                            closureReasonIdActivate2?.toString() ?: "",
                            { closureReasonIdActivate2 = it.toLongOrNull() },
                            keyboardType = KeyboardType.Number,
                        ),
                        TextFieldItem(
                            "Date Format",
                            dateFormatActivate2 ?: "",
                            { dateFormatActivate2 = it },
                        ),
                        TextFieldItem(
                            "Locale",
                            localeActivate2 ?: "",
                            { localeActivate2 = it },
                        ),
                    )
                    MifosVerticalStaggeredGrid {
                        items(fieldItems) {
                            MifosTextField(field = it)
                        }
                    }
                }
            }
        }

        /**
         Center API : Put Update 12
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_UPDATE_12,
                requestType = stringResource(Res.string.put),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_UPDATE_12,
                enable = centerIdUpdate12.isNotBlank() && nameUpdate12.isNotBlank(),
                onClick = {
                    onAction(
                        ApiAction.PostCenterUpdate12(
                            centerIdUpdate12.toLong(),
                            nameUpdate12,
                        ),
                    )
                },
            ) {
                MifosVerticalStaggeredGrid {
                    item {
                        MifosTextField(
                            value = centerIdUpdate12,
                            onValueChange = { centerIdUpdate12 = it },
                            label = "Center Id *",
                            keyboardType = KeyboardType.Number,
                        )
                    }
                    item {
                        MifosTextField(
                            value = nameUpdate12,
                            onValueChange = { nameUpdate12 = it },
                            label = "Name *",
                        )
                    }
                }
            }
        }

        /**
         Center API : Delete 11
         */
        item {
            MifosCard(
                apiRequestName = MifosFieldOfficerOperationName.CENTER_DELETE_11,
                requestType = stringResource(Res.string.delete),
                isLoading = uiState.isLoading == MifosFieldOfficerOperationName.CENTER_DELETE_11,
                enable = centerIdDelete11.isNotBlank(),
                onClick = {
                    onAction(
                        ApiAction.PostCenterDelete11(
                            centerIdDelete11.toLong(),
                        ),
                    )
                },
            ) {
                MifosTextField(
                    value = centerIdDelete11,
                    onValueChange = { centerIdDelete11 = it },
                    label = "Center Id *",
                    keyboardType = KeyboardType.Number,
                )
            }
        }
    }
}
