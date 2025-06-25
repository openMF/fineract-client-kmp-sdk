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

package org.mifos

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.jetbrains.skiko.wasm.onWasmReady
import org.mifos.di.startingKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    startingKoin()

    document.body?.let { body ->
        onWasmReady {
            ComposeViewport(body) {
                App()
            }
        }
    } ?: run {
        console.error("document.body is null — cannot render Compose UI.")
    }
}
