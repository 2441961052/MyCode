package com.fenrir.navigationview

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.navigationview.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    companion object{
        private var instance:MainFragment?=null
        @Synchronized
        fun get():MainFragment{
            if(instance==null){
                instance = MainFragment()
            }
            return instance!!
        }
//        fun newInstance():Fragment{
//            return MainFragment()
//        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        initView()
        return binding.root
    }

    private fun initView() {
        binding.navigationView.setNavigationItemSelectedListener { menuitem ->
            when (menuitem.itemId) {
                R.id.pageA-> requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, PageAFragment.newInstance()).commit()
                R.id.pageB -> requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, PageBFragment.newInstance()).commit()
                R.id.pageC -> requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, PageCFragment.newInstance()).commit()
            }
            binding.drawerLayout.close()
            true
        }
    }


}