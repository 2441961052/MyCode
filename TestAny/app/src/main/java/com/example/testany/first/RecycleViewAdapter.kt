package com.example.testany.first

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.testany.R

class RecycleViewAdapter(var context: Context, var list: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_view, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val newHolder = holder as ItemViewHolder
        newHolder.bindData(position, list[position])
        newHolder.detail.setOnClickListener {
            Toast.makeText(
                context,
                "you click detail ,the detail is:${list[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
        holder.itemView.setOnClickListener {
            newHolder.title.text = (position * 10).toString()
            Toast.makeText(
                context,
                "you click position:$position,the detail is:${list[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int = list.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.title)
        val detail = itemView.findViewById<TextView>(R.id.detail)
        fun bindData(position: Int, s: String) {
            title.text = position.toString()
            detail.text = s
        }
    }
}