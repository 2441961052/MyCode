package com.fenrir.bottombar.custom

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fenrir.bottombar.R
import com.fenrir.bottombar.databinding.ActivityMybottombarBinding
import com.fenrir.bottombar.fragment.AFragment
import com.fenrir.bottombar.fragment.BFragment
import com.fenrir.bottombar.fragment.CFragment
import com.fenrir.bottombar.fragment.DFragment

class MyBottomBarActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMybottombarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMybottombarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomBar()
        changeIndex(0)
    }
    val fragments:List<Fragment> = listOf(AFragment(), BFragment(), CFragment(), DFragment())
    private fun initBottomBar() {
        for(i in 0 until binding.bottomBar.childCount){
            binding.bottomBar.getChildAt(i).setOnClickListener{
                changeIndex(i)
            }
        }
    }
    private fun changeIndex(index: Int) {
        for (i in 0 until binding.bottomBar.childCount){
            val child =  binding.bottomBar.getChildAt(i)
            if(i==index){
                setEnable(child,false)
            }else{
                setEnable(child,true)
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.container, fragments[index]).commit()
    }

    private fun setEnable(child: View, isEnable: Boolean) {
        child.isEnabled = isEnable
        if(child is ViewGroup){
            for(i in 0 until child.childCount){
                child.getChildAt(i).isEnabled = isEnable
            }
        }
    }
}