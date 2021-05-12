package com.mg.cleanarchitectureplaygraoun

import android.app.Application
import com.mg.cleanarchitectureplaygraoun.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        configureDi()
    }

    private fun configureDi() = startKoin {
        androidLogger()
        androidContext(this@App)
        modules(appModules)
    }
}