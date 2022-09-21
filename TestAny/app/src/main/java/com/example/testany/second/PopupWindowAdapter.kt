package com.example.testany.second

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.testany.R

class PopupWindowAdapter(private val context: Context,private val list:List<Any>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_popup,parent,false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val newHolder = holder as ItemViewHolder
        newHolder.bindData(list[position].toString())
        newHolder.itemView.setOnClickListener {
            Toast.makeText(context, "${list[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = list.size

    inner class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        var showName = view.findViewById<TextView>(R.id.tv_name)
        fun bindData(name: String){
            showName.text = name
        }
    }
}