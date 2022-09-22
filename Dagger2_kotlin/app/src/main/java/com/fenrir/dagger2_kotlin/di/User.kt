package com.fenrir.dagger2_kotlin.di

import javax.inject.Inject

class User @Inject constructor() {
    fun show():String{
        return "this is User Class"
    }
}