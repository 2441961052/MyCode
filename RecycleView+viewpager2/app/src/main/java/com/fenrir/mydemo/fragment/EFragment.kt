package com.fenrir.mydemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fenrir.mydemo.databinding.FragmentEBinding

class EFragment: Fragment() {
    private lateinit var binding: FragmentEBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEBinding.inflate(layoutInflater)
        return binding.root
    }
}