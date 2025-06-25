/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
@file:Suppress("ktlint:standard:filename", "ktlint:standard:function-naming")

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource
import org.mifos.App
import org.mifos.di.startingKoin

fun main() = application {
    startingKoin()

    Window(
        onCloseRequest = ::exitApplication,
        title = stringResource(Res.string.app_name),
    ) {
        App()
    }
}
