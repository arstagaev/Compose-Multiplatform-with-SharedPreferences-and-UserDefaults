package com.test.kmpdemo3_storage

import com.test.kmpdemo3_storage.di.commonModule
import org.koin.core.context.startKoin

/** Call this from Swift to boot Koin */
fun initKoinIos() {
    startKoin {
        modules(commonModule, iosModule)
    }
}