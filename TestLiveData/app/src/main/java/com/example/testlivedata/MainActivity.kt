package com.example.testlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: LiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]
        binding.vm = viewModel
        initView()
        setContentView(binding.root)
    }

    private fun initView() {

        viewModel.str.observe(this, Observer { str->
            binding.btn.setOnClickListener {
                if(str.isNotEmpty()){
                    binding.tvStr.text = str
                }
            }
            binding.tvTopStr.text = str
        })
        
        


    }
}