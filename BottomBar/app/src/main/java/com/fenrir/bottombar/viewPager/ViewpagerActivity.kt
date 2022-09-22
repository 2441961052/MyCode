package com.fenrir.bottombar.viewPager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fenrir.bottombar.databinding.ActivityViewpagerBinding

class ViewpagerActivity: AppCompatActivity() {
    private lateinit var binding:ActivityViewpagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}