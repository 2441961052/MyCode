package com.fenrir.dagger2_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.fenrir.dagger2_kotlin.di.ApiService
import com.fenrir.dagger2_kotlin.di.DaggerMainComponent
import javax.inject.Inject

class SeconedActivity: AppCompatActivity() {
    private val TAG = "TAG"
    @Inject
    lateinit var apiService3: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //DaggerMainComponent.create().inject(this)
        MyApplication.applicationComponent.inject(this)
        Log.i(TAG, "onCreate: apiservice3---->$apiService3")
    }
}