package com.example.kotlinbasics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbasics.databinding.DishcardviewBinding

class MainAdapter(val foodList : List<Food>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    inner class ViewHolder(val itemBinding : DishcardviewBinding) : RecyclerView.ViewHolder(itemBinding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(DishcardviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = foodList[position]
        holder.itemBinding.dishimage.setImageResource(item.image)
        holder.itemBinding.dishname.text = item.name
    }

}