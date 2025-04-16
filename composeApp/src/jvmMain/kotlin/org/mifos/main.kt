package org.mifos

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.mifos.di.startingKoin

fun main() = application {

    startingKoin()

    Window(
        onCloseRequest = ::exitApplication,
        title = "Fineract client kmp dk",
    ) {
        App()
    }
}