package com.fenrir.dagger2_kotlin

import android.app.Application
import com.fenrir.dagger2_kotlin.di.DaggerMainComponent
import com.fenrir.dagger2_kotlin.di.MainComponent

class MyApplication: Application() {
    companion object{
        lateinit var applicationComponent:MainComponent
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerMainComponent.create()
    }
}