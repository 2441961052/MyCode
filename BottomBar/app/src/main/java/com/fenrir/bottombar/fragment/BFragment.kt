package com.fenrir.bottombar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.bottombar.databinding.FragmentBBinding

class BFragment: Fragment() {
    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(layoutInflater)
        return binding.root
    }
}