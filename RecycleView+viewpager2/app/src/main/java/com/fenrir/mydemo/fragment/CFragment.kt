package com.fenrir.mydemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.mydemo.databinding.FragmentCBinding

class CFragment: Fragment() {
    private lateinit var binding: FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }
}