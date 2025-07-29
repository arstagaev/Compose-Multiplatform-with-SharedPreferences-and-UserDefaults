package com.test.kmpdemo3_storage

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/** Binds KMMContext to AndroidKMMContext(get()) */
val androidModule = module {
    single<KMMContext> {
        // get() here returns the Android Context because we called androidContext() below
        AndroidKMMContext(
            prefs = androidContext()
                .getSharedPreferences("kmm_prefs", android.content.Context.MODE_PRIVATE)
        )
    }
}