package com.example.testany.second

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testany.R
import com.example.testany.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    private val list = listOf<String>("张三","李四","王五")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.btnShow.setOnClickListener {
            showPopupWindow()
        }
    }

    private fun showPopupWindow() {
        val contentView = LayoutInflater.from(this).inflate(R.layout.popup_layout,null)
        val itemPopup = contentView.findViewById<RecyclerView>(R.id.popup_item)
        itemPopup.layoutManager = LinearLayoutManager(this)
        itemPopup.adapter = PopupWindowAdapter(this ,list)
        val popupWindow = PopupWindow(contentView)
        popupWindow.width = ViewGroup.LayoutParams.MATCH_PARENT
        popupWindow.height = ViewGroup.LayoutParams.MATCH_PARENT
        val dw = ColorDrawable(0x80000000.toInt())
        popupWindow.setBackgroundDrawable(dw)

        popupWindow.setBackgroundDrawable(BitmapDrawable())
        popupWindow.isOutsideTouchable = true
        popupWindow.showAsDropDown(binding.btnShow,100,100)

    }
}