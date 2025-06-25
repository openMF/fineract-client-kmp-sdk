/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.mifos.presentation.ApiAction
import org.mifos.presentation.ApiUiState
import org.mifos.presentation.ApiViewModel

// TODO:: Enhance the UI/UX Of this Screen

/**
 * Simplified API Call Screen using the unified ApiHandler framework
 * Demonstrates clean, simple architecture without unnecessary complexity
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ApiCallScreen(
    modifier: Modifier = Modifier,
    apiViewModel: ApiViewModel = koinViewModel(),
) {
    val uiState by apiViewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(Res.string.app_name),
                    )
                },
            )
        },
        modifier = modifier,
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // API Operations Section
            item {
                ApiOperationsSection(
                    uiState = uiState,
                    onAction = apiViewModel::onAction,
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            // Response Display Section
            if (uiState.jsonResponse.isNotEmpty() || uiState.error != null) {
                item {
                    ResponseSection(
                        uiState,
                        onClearError = apiViewModel::clearError,
                        onClearResponse = apiViewModel::clearResponse,
                    )
                }
            }
        }
    }
}

/**
 * API operations section with all available operations
 */
@Composable
private fun ApiOperationsSection(
    uiState: ApiUiState,
    modifier: Modifier = Modifier,
    onAction: (ApiAction) -> Unit,
) {
    var username by remember { mutableStateOf("mifos") }
    var password by remember { mutableStateOf("password") }
    var clientId by remember { mutableStateOf("1") }
    var accountId by remember { mutableStateOf("1") }
    var loanId by remember { mutableStateOf("1") }
    var centerId by remember { mutableStateOf("1") }
    var surveyId by remember { mutableStateOf("1") }

    ElevatedCard(
        modifier = modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Fineract API Operations",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                )

                if (uiState.isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(16.dp),
                    )
                }
            }

            if (uiState.lastOperation.isNotEmpty()) {
                Text(
                    text = "Last Operation: ${uiState.lastOperation}",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.outline,
                )
            }

            // Authentication Section
            Card(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Text(
                        text = "Authentication",
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.primary,
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        OutlinedTextField(
                            value = username,
                            onValueChange = { username = it },
                            label = { Text("Username") },
                            modifier = Modifier.weight(1f),
                            enabled = !uiState.isLoading,
                        )

                        OutlinedTextField(
                            value = password,
                            onValueChange = { password = it },
                            label = { Text("Password") },
                            modifier = Modifier.weight(1f),
                            enabled = !uiState.isLoading,
                        )
                    }

                    Button(
                        onClick = { onAction(ApiAction.Authenticate(username, password)) },
                        modifier = Modifier.fillMaxWidth(),
                        enabled = !uiState.isLoading && username.isNotBlank() && password.isNotBlank(),
                    ) {
                        Text("Authenticate")
                    }
                }
            }

            // Account Operations
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                // Client Operations
                Card(
                    modifier = Modifier.weight(1f),
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Text(
                            text = "Client Operations",
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.primary,
                        )

                        OutlinedTextField(
                            value = clientId,
                            onValueChange = { clientId = it },
                            label = { Text("Client ID") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading,
                        )

                        Button(
                            onClick = {
                                clientId.toLongOrNull()?.let { id ->
                                    onAction(ApiAction.GetClient(id))
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading && clientId.isNotBlank(),
                        ) {
                            Text("Get Client")
                        }
                    }
                }

                // Savings Account
                Card(
                    modifier = Modifier.weight(1f),
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Text(
                            text = "Savings",
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.primary,
                        )

                        OutlinedTextField(
                            value = accountId,
                            onValueChange = { accountId = it },
                            label = { Text("Account ID") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading,
                        )

                        Button(
                            onClick = {
                                accountId.toLongOrNull()?.let { id ->
                                    onAction(ApiAction.GetSavingsAccount(id))
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading && accountId.isNotBlank(),
                        ) {
                            Text("Get Account")
                        }
                    }
                }

                // Loan Operations
                Card(
                    modifier = Modifier.weight(1f),
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Text(
                            text = "Loans",
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.primary,
                        )

                        OutlinedTextField(
                            value = loanId,
                            onValueChange = { loanId = it },
                            label = { Text("Loan ID") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading,
                        )

                        Button(
                            onClick = {
                                loanId.toLongOrNull()?.let { id ->
                                    onAction(ApiAction.GetLoans(id))
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isLoading && loanId.isNotBlank(),
                        ) {
                            Text("Get Loans")
                        }
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.fillMaxWidth().padding(16.dp))

            // Additional Operations
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Button(
                    onClick = {
                        centerId.toLongOrNull()?.let { id ->
                            onAction(ApiAction.GetCenter(id))
                        }
                    },
                    modifier = Modifier.weight(1f),
                    enabled = !uiState.isLoading,
                ) {
                    Text("Get Center")
                }

                Button(
                    onClick = {
                        surveyId.toLongOrNull()?.let { id ->
                            onAction(ApiAction.GetSurvey(id))
                        }
                    },
                    modifier = Modifier.weight(1f),
                    enabled = !uiState.isLoading,
                ) {
                    Text("Get Survey")
                }

                Button(
                    onClick = {
                        onAction(ApiAction.GetNote("clients", 1L, 1L))
                    },
                    modifier = Modifier.weight(1f),
                    enabled = !uiState.isLoading,
                ) {
                    Text("Get Note")
                }
            }
        }
    }
}

/**
 * Response display section
 */
@Composable
private fun ResponseSection(
    uiState: ApiUiState,
    onClearError: () -> Unit,
    onClearResponse: () -> Unit,
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "API Response",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    if (uiState.error != null) {
                        TextButton(
                            onClick = onClearError,
                        ) {
                            Text("Clear Error")
                        }
                    }

                    if (uiState.jsonResponse.isNotEmpty()) {
                        TextButton(
                            onClick = onClearResponse,
                        ) {
                            Text("Clear Response")
                        }
                    }
                }
            }

            // Error display
            uiState.error?.let { error ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.errorContainer),
                ) {
                    Text(
                        text = "❌ Error: $error",
                        fontFamily = FontFamily.Monospace,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.error,
                        modifier = Modifier.padding(12.dp),
                    )
                }
            }

            // JSON Response display
            if (uiState.jsonResponse.isNotEmpty()) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                    ) {
                        Text(
                            text = "Success Response:",
                            style = MaterialTheme.typography.titleMedium,
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        // Scrollable JSON response
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                        ) {
                            Text(
                                text = uiState.jsonResponse,
                                fontFamily = FontFamily.Monospace,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .verticalScroll(rememberScrollState()),
                            )
                        }
                    }
                }
            }
        }
    }
}
