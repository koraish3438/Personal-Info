package com.example.personalinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val data: List<SampleModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<CircleImageView>(R.id.profile_image)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val number = itemView.findViewById<TextView>(R.id.number)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myItem = LayoutInflater.from(parent.context).inflate(R.layout.sample_item, parent, false)
        return MyViewHolder(myItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = data[position]
        holder.userName.text = currentItem.userName
        holder.number.text = currentItem.number
        Glide.with(holder.profile.context).load(currentItem.image).placeholder(R.drawable.loading_profile).error(R.drawable.loading_profile).into(holder.profile)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}