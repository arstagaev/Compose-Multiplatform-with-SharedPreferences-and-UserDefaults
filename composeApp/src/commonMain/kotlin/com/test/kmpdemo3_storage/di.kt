package com.test.kmpdemo3_storage

import org.koin.core.context.startKoin
import org.koin.dsl.module

val commonModule = module {
    // bind your preference wrapper
    single { KMMPreference(get()) }
}