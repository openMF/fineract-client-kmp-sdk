package org.mifos

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.jetbrains.skiko.wasm.onWasmReady
import org.mifos.di.startingKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    startingKoin()

    onWasmReady {
        ComposeViewport(document.body!!) {
            App() // Render the root composable of the application.
        }
    }
}
