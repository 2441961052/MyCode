package com.fenrir.bottombar.apply

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fenrir.bottombar.R
import com.fenrir.bottombar.databinding.ActivityApplybottombarBinding
import com.fenrir.bottombar.fragment.AFragment
import com.fenrir.bottombar.fragment.BFragment
import com.fenrir.bottombar.fragment.CFragment
import com.fenrir.bottombar.fragment.DFragment
import com.google.android.material.navigation.NavigationBarView

class ApplyBottomBar: AppCompatActivity() {
    private lateinit var binding: ActivityApplybottombarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplybottombarBinding.inflate(layoutInflater)
        initView()
        switchFragment(fragments[0])
        setContentView(binding.root)
    }
    val fragments:List<Fragment> = listOf(AFragment(), BFragment(), CFragment(), DFragment())
    private fun initView() {
        binding.bottomBar.setOnItemSelectedListener (listener)
    }
    private val listener =  NavigationBarView.OnItemSelectedListener{
        when(it.itemId){
            R.id.optiona->switchFragment(fragments[0])
            R.id.optionb->switchFragment(fragments[1])
            R.id.optionc->switchFragment(fragments[2])
            R.id.optiond->switchFragment(fragments[3])
        }
        return@OnItemSelectedListener true
    }
    private fun switchFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container1,fragment).commit()
    }
}