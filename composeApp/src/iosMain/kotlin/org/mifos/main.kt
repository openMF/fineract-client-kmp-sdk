package org.mifos

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainViewController() = ComposeUIViewController { App("Hello World!") }