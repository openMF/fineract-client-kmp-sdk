package org.mifos

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import org.mifos.di.startingKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    startingKoin()

    CanvasBasedWindow(
        canvasElementId = "ComposeTarget",
    ) {
        App()
    }
}
