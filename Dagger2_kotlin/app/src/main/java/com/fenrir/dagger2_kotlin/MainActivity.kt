package com.fenrir.dagger2_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.fenrir.dagger2_kotlin.di.ApiService
import com.fenrir.dagger2_kotlin.di.DaggerMainComponent
import com.fenrir.dagger2_kotlin.di.User
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = "TAG"
    @Inject
    lateinit var user: User
    @Inject
    lateinit var user2: User
//    @Inject
//    lateinit var retrofit: Retrofit
    @Inject
    lateinit var apiService: ApiService
    @Inject
    lateinit var apiService2: ApiService



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerMainComponent.create().inject(this)
        MyApplication.applicationComponent.inject(this)

        //Log.i(TAG, "onCreate: ---->${user.show()}")
       // Log.i(TAG, "onCreate: ${retrofit}")
        Log.i(TAG, "onCreate: user---->$user----user2---->$user2")
        Log.i(TAG, "onCreate: apiService---->$apiService----apiService2---->$apiService2")
        startActivity(Intent(this,SeconedActivity::class.java))
    }
}