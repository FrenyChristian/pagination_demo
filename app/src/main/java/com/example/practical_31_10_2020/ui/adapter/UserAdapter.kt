package com.example.practical_31_10_2020.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practical_31_10_2020.R
import com.example.practical_31_10_2020.data.model.UserModel

class UserAdapter(var list: ArrayList<UserModel>) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgUser = itemView.findViewById<ImageView>(R.id.imgUser)
        val txtUserName = itemView.findViewById<TextView>(R.id.txtUserName)
        val rvImages = itemView.findViewById<RecyclerView>(R.id.rvImages)

        init {
            val gridLayoutManager = GridLayoutManager(itemView.context, 2)
            gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return if (list[layoutPosition].imageList.size % 2 != 0 && position == 0)
                        2
                    else 1
                }
            }
            rvImages.layoutManager = gridLayoutManager
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_user,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        Glide.with(holder.imgUser.context).load(list[position].userImage).circleCrop()
            .placeholder(R.drawable.ic_launcher_foreground).into(
                holder.imgUser
            )
        holder.txtUserName.text = list[position].userName

        holder.rvImages.adapter = ItemAdapter(list[position].imageList)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

