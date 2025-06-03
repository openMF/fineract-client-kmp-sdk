package org.mifos

import androidx.compose.ui.window.ComposeUIViewController
import org.mifos.di.startingKoin


fun MainViewController() = ComposeUIViewController(
    configure = {
        startingKoin()
    }
){
    App()
}