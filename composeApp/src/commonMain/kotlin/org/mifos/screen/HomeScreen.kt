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
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.app_name
import fineract_sdk_cmp.composeapp.generated.resources.project_description
import fineract_sdk_cmp.composeapp.generated.resources.project_name
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource


/**
 * Simplified API Call Screen using the unified ApiHandler framework
 * Demonstrates clean, simple architecture without unnecessary complexity
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ApiCallScreen(
    modifier: Modifier = Modifier,
) {
    val projectName = stringArrayResource(Res.array.project_name)
    val projectDesc = stringArrayResource(Res.array.project_description)

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

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ElevatedCard(
                modifier = modifier.fillMaxWidth(.95f),
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
                            text = "Test Different Projects API",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary,
                        )
                    }

                    BoxWithConstraints(
                        modifier = modifier.fillMaxWidth(1f),
                        contentAlignment = Alignment.Center,
                    ) {
                        val isCompact = maxWidth < 600.dp

                        if (isCompact) {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(1),
                            ) {
                                items(projectName.size ) { it->
                                    Box(modifier, projectName[it], projectDesc[it])
                                }
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                            ) {
                                items(projectName.size) { it ->
                                    Box(modifier, projectName[it], projectDesc[it])
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Box(modifier: Modifier, projectName: String, projectDesc: String) {

    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.padding(16.dp),
    ) {
        Column(
            modifier = modifier
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = projectName,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
            )

            Text(
                modifier = modifier.padding(top = 8.dp),
                text = projectDesc,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary,
            )

            TextButton(
                modifier = modifier.fillMaxWidth()
                    .padding(top = 20.dp),
                onClick = {},
                colors = ButtonDefaults.textButtonColors(MaterialTheme.colorScheme.primary),

            ) {
                Text(
                    text = "Click Here",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.background,
                )
            }
        }
    }
}
