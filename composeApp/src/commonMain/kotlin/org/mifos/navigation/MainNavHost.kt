/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.mifos.screen.HomeScreen
import org.mifos.screen.mifosFieldOfficer.MifosFieldOfficerScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MainNavHost(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavGraphRoute.HOME_SCREEN,
    ) {
        composable(
            route = NavGraphRoute.HOME_SCREEN,
        ) {
            HomeScreen(navController, modifier)
        }

        composable(
            route = NavGraphRoute.MIFOS_FIELD_OPERATION,
        ) {
            MifosFieldOfficerScreen(navController = navController)
        }
    }
}
