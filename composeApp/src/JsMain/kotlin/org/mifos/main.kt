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
