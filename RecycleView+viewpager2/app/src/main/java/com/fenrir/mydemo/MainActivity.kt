package com.fenrir.mydemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fenrir.mydemo.databinding.ActivityMainBinding
import com.fenrir.mydemo.recycleview.RecycleViewActivity
import com.fenrir.mydemo.viewpager2.MyViewpagerAvtivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.btnRecycleView.setOnClickListener {
            startActivity(Intent(this,RecycleViewActivity::class.java))
        }
        binding.btnViewpager.setOnClickListener {
            startActivity(Intent(this,MyViewpagerAvtivity::class.java))
        }
    }
}