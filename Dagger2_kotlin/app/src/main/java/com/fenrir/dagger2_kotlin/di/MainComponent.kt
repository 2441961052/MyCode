package com.fenrir.dagger2_kotlin.di

import com.fenrir.dagger2_kotlin.MainActivity
import com.fenrir.dagger2_kotlin.SeconedActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(seconedActivity: SeconedActivity)
}