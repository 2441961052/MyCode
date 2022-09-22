package com.fenrir.mydemo.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fenrir.mydemo.databinding.ActivityMyViewpagerBinding
import com.fenrir.mydemo.fragment.*
import com.google.android.material.tabs.TabLayoutMediator

class MyViewpagerAvtivity: AppCompatActivity() {
    private lateinit var binding: ActivityMyViewpagerBinding
    private var lists:List<Fragment> = listOf(AFragment(),BFragment(),CFragment(),DFragment(),EFragment(),AFragment(),BFragment(),CFragment(),DFragment(),EFragment())
    private var tabLists:List<String> = listOf("tab1","tab2","tab3","tab4","tab5","tab1","tab2","tab3","tab4","tab5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyViewpagerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vp.adapter = MyViewPagerAdapter(lists,this)
        TabLayoutMediator(binding.tab,binding.vp){tap,position->
            tap.text = tabLists[position]
        }.attach()
    }
}