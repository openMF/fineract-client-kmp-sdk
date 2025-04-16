package org.mifos

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource
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