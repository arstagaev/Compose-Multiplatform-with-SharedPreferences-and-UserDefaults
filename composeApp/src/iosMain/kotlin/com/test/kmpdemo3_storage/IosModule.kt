package com.test.kmpdemo3_storage

import org.koin.dsl.module

/** Binds KMMContext to IosKMMContext */
val iosModule = module {
    single<KMMContext> { IosKMMContext() }
}