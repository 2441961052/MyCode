package com.fenrir.mydemo.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fenrir.mydemo.databinding.ActivityRecycleViewBinding
import com.fenrir.viewpager.RecycleViewAdapter

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecycleViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list: List<String> =
            arrayListOf("s", "c", "y", "d", "e", "w", "t", "c", "y", "d", "e", "w", "t")
        binding.container.layoutManager = LinearLayoutManager(this)
        val adapter = RecycleViewAdapter(this, list)
        binding.container.adapter = adapter
    }
}