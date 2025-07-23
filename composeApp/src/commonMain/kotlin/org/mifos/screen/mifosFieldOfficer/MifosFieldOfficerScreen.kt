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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_name
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.mifos.model.MifosFieldOfficerApiName
import org.mifos.presentation.ApiAction
import org.mifos.presentation.ApiUiState
import org.mifos.presentation.ApiViewModel
import org.mifos.screen.ApiResponse
import org.mifos.screen.component.MifosScaffoldTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MifosFieldOfficerScreen(
    navController: NavHostController,
    modifier: Modifier,
    apiViewModel: ApiViewModel = koinViewModel(),
) {
    val uiState by apiViewModel.uiState.collectAsState()
    val mifosFieldOfficerApiNameState by apiViewModel.mifosFieldOfficerApiNameState.collectAsState()

    var expandedApi by remember { mutableStateOf<String?>(null) }

    MifosScaffoldTopBar(
        title = stringResource(Res.string.field_officer_name) + " API's",
        navigationIconShow = true,
        navController = navController,
    ) { paddingValues ->

        Box(
            modifier = modifier.fillMaxWidth()
                .padding(paddingValues),
            contentAlignment = Alignment.TopCenter,
        ) {
            LazyColumn(
                modifier = modifier.fillMaxWidth(.98f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                items(mifosFieldOfficerApiNameState) { it ->

                    val isExpanded = expandedApi == it.apiName.toString()
                    val rotationAngle by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f)

                    ElevatedCard(
                        modifier = modifier.fillMaxWidth(.99f).padding(vertical = 4.dp),
                        shape = RoundedCornerShape(8.dp),
                    ) {
                        Column(
                            modifier = modifier.fillMaxWidth()
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                modifier = modifier.fillMaxWidth().padding(start = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                            ) {
                                Text(
                                    text = stringResource(it.apiName),
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
                                        modifier = Modifier.rotate(rotationAngle),

                                    )
                                }
                            }

                            HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)

                            AnimatedVisibility(visible = isExpanded) {
                                when (it) {
                                    MifosFieldOfficerApiName.AUTHENTICATION -> AuthAPI(
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

@Composable
internal fun AuthAPI(
    uiState: ApiUiState,
    modifier: Modifier = Modifier,
    onAction: (ApiAction) -> Unit,
) {
    var username by remember { mutableStateOf("mifos") }
    var password by remember { mutableStateOf("password") }

    Card(
        modifier = modifier.fillMaxWidth(.98f).padding(5.dp),
    ) {
        Column(
            modifier = modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Authentication",
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.primary,
                )

                if (uiState.isLoading) {
                    CircularProgressIndicator(
                        strokeWidth = 2.dp,
                        modifier = modifier.size(16.dp),
                    )
                }
            }
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Username") },
                    modifier = modifier.weight(1f),
                    enabled = !uiState.isLoading,
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = modifier.weight(1f),
                    enabled = !uiState.isLoading,
                )
            }

            Button(
                onClick = { onAction(ApiAction.Authenticate(username, password)) },
                modifier = modifier.fillMaxWidth(),
                enabled = !uiState.isLoading && username.isNotBlank() && password.isNotBlank(),
            ) {
                Text(
                    "Authenticate",
                    style = MaterialTheme.typography.labelMedium,
                )
            }
        }
    }
}
