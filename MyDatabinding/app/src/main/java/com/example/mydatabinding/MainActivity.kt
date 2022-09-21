package com.example.mydatabinding

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mydatabinding.databinding.ActivityMainBinding
import kotlin.math.log
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private var loginInfoIsOk = true
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)

        viewModel.name.observe(this, Observer {
            if(it.isNullOrEmpty()){
                binding.titleName.setTextColor(Color.RED)
            }else{
                binding.titleName.setTextColor(Color.BLACK)
            }
        })
        viewModel.password.observe(this, Observer {
            if(it.isNullOrEmpty()){
                binding.titlePassword.setTextColor(Color.RED)
                loginInfoIsOk = false
            }else{
                binding.titlePassword.setTextColor(Color.BLACK)
                loginInfoIsOk = true
            }
        })

        binding.login.setOnClickListener {
            
            val loginInfoList = viewModel.login()
            if(loginInfoList.isEmpty()){
                Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show()
            }else{
                showErrorInfo(loginInfoList)
            }

        }
    }

    private fun showErrorInfo(loginInfoList: List<String>) {
        if(loginInfoList.contains("name")){
            binding.titleName.setTextColor(Color.RED)
        }
        if(loginInfoList.contains("password")){
            binding.titlePassword.setTextColor(Color.RED)
        }
    }


}