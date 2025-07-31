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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import org.mifos.presentation.ApiUiState

/**
 * Response display section
 */
@Composable
internal fun ApiResponse(
    uiState: ApiUiState,
    modifier: Modifier = Modifier,
    onClearError: () -> Unit,
    onClearResponse: () -> Unit,
) {
    Dialog(
        onDismissRequest = {},
    ) {
        ElevatedCard(
            modifier = modifier,
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(16.dp).verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Text(
                    text = "API Response : ${uiState.lastOperation}",
                    style = MaterialTheme.typography.labelLarge,
                    textAlign = TextAlign.Center,
                )

                // Error display
                uiState.error?.let { error ->
                    Card(
                        modifier = Modifier.height(300.dp),
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.errorContainer),
                    ) {
                        SelectionContainer(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(12.dp)
                                .verticalScroll(rememberScrollState()),
                        ) {
                            Text(
                                text = "❌ Error: $error",
                                fontFamily = FontFamily.Monospace,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.error,
                            )
                        }
                    }
                }

                // JSON Response display
                if (uiState.jsonResponse.isNotEmpty()) {
                    Card(
                        modifier = Modifier.height(300.dp),
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                        ) {
                            Text(
                                text = "Success Response:",
                                style = MaterialTheme.typography.labelLarge,
                            )
                            Spacer(modifier = Modifier.height(8.dp))

                            // Scrollable JSON response
                            SelectionContainer(
                                modifier = Modifier.fillMaxSize()
                                    .verticalScroll(rememberScrollState()),
                            ) {
                                Text(
                                    text = uiState.jsonResponse,
                                    fontFamily = FontFamily.Monospace,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }
                        }
                    }
                }

                TextButton(
                    modifier = Modifier.size(width = 70.dp, height = 30.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.textButtonColors(MaterialTheme.colorScheme.primary),
                    onClick = if (uiState.error != null) {
                        onClearError
                    } else {
                        onClearResponse
                    },
                ) {
                    Text(
                        text = "Clear",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
        }
    }
}
