package com.test.kmpdemo3_storage

import com.test.kmpdemo3_storage.data.KMMContext
import org.koin.dsl.module

/** Binds KMMContext to IosKMMContext */
val iosModule = module {
    single<KMMContext> { IosKMMContext() }
}