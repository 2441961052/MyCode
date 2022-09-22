package com.fenrir.bottombar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.bottombar.databinding.FragmentABinding

class AFragment: Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(layoutInflater)
        return binding.root
    }
}