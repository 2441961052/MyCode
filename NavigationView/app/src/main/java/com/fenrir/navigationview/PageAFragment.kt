package com.fenrir.navigationview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.navigationview.databinding.FragmentPageABinding

class PageAFragment : Fragment() {
    private lateinit var binding: FragmentPageABinding

    companion object {
        fun newInstance(): Fragment {
            return PageAFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageABinding.inflate(layoutInflater)
        initView()
        return binding.root
    }

    private fun initView() {
        binding.btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.get()).commit()
        }
    }
}