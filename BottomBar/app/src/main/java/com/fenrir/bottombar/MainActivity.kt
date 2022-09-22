package com.fenrir.bottombar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fenrir.bottombar.apply.ApplyBottomBar
import com.fenrir.bottombar.custom.MyBottomBarActivity
import com.fenrir.bottombar.databinding.ActivityMainBinding
import com.fenrir.bottombar.viewPager.ViewpagerActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMyCustom.setOnClickListener {
            val intent = Intent(this,MyBottomBarActivity::class.java)
            startActivity(intent)
        }

        binding.btnApply.setOnClickListener {
            val intent = Intent(this,ApplyBottomBar::class.java)
            startActivity(intent)
        }

        binding.btnViewpager.setOnClickListener {
            val intent = Intent(this,ViewpagerActivity::class.java)
            startActivity(intent)
        }
    }
}