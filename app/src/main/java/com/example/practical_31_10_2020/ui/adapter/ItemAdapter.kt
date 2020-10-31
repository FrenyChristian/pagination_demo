package com.example.practical_31_10_2020.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practical_31_10_2020.R

class ItemAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgItem = itemView.findViewById<ImageView>(R.id.imgItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_images,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(holder.imgItem.context).load(list[position]).into(holder.imgItem)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}