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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    onClearError: () -> Unit,
    onClearResponse: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Dialog(
        onDismissRequest = {},
    ) {
        ElevatedCard(
            modifier = modifier.fillMaxWidth(),
        ) {
            Column(
                modifier = modifier.fillMaxWidth().padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "API Response : ${uiState.lastOperation}",
                    style = MaterialTheme.typography.labelLarge,
                    textAlign = TextAlign.Center,
                )

                // Error display
                uiState.error?.let { error ->
                    Card(
                        modifier = modifier.fillMaxWidth().height(250.dp).padding(top = 12.dp),
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.errorContainer),
                    ) {
                        SelectionContainer {
                            Text(
                                text = "❌ Error: $error",
                                fontFamily = FontFamily.Monospace,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.error,
                                modifier = modifier.padding(12.dp)
                                    .verticalScroll(rememberScrollState()),
                            )
                        }
                    }
                }

                // JSON Response display
                if (uiState.jsonResponse.isNotEmpty()) {
                    Card(
                        modifier = modifier.fillMaxWidth().padding(top = 12.dp),
                    ) {
                        Column(
                            modifier = modifier.padding(12.dp),
                        ) {
                            Text(
                                text = "Success Response:",
                                style = MaterialTheme.typography.labelLarge,
                            )
                            Spacer(modifier = modifier.height(8.dp))

                            // Scrollable JSON response
                            Box(
                                modifier = modifier.fillMaxWidth().height(250.dp),
                            ) {
                                SelectionContainer {
                                    Text(
                                        text = uiState.jsonResponse,
                                        fontFamily = FontFamily.Monospace,
                                        style = MaterialTheme.typography.bodyMedium,
                                        modifier = modifier.fillMaxSize()
                                            .verticalScroll(rememberScrollState()),
                                    )
                                }
                            }
                        }
                    }
                }

                TextButton(
                    modifier = modifier.width(100.dp).padding(top = 5.dp),
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
