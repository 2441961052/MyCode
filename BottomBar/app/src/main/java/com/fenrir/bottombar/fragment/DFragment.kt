package com.fenrir.bottombar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.bottombar.databinding.FragmentDBinding

class DFragment: Fragment() {
    private lateinit var binding: FragmentDBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDBinding.inflate(layoutInflater)
        return binding.root
    }
}