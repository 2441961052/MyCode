package com.fenrir.navigationview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fenrir.navigationview.databinding.ActivityNavigationViewBinding

class NavigationViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.get()).commit()
    }
}