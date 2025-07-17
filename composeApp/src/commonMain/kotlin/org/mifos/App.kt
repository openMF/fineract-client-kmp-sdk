/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos

import androidx.compose.runtime.Composable
import org.mifos.navigation.MainNavHost
import org.mifos.theme.AppTheme

/**
 * Main App composable using clean SOLID-principles-based architecture
 * Features authentication, client management, and demonstrates clean architecture benefits
 */
@Composable
fun App() {
    AppTheme {
        MainNavHost()
    }
}
