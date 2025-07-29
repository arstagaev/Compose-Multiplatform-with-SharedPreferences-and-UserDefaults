package com.test.kmpdemo3_storage.di

import com.test.kmpdemo3_storage.data.KMMPreference
import org.koin.dsl.module

val commonModule = module {
    // bind your preference wrapper
    single { KMMPreference(get()) }
}