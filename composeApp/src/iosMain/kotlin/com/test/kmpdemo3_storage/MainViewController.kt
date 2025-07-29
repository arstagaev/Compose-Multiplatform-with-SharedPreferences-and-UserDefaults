package com.test.kmpdemo3_storage

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoinIos()
    }
) {
    App()
}
