package com.test.kmpdemo3_storage

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import android.app.Application
import com.test.kmpdemo3_storage.di.commonModule

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)           // makes the Android Context available to get()
            modules(commonModule, androidModule) // load your shared + Android modules
        }
    }
}