package com.example.kotlinbasics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbasics.databinding.DishcardviewBinding

class Fragment1Adpater(val foodlist : List<Food>) : RecyclerView.Adapter<Fragment1Adpater.ViewHolder>() {

    class ViewHolder(val itemBinding : DishcardviewBinding) : RecyclerView.ViewHolder(itemBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(DishcardviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return foodlist.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = foodlist[position]
        holder.itemBinding.dishimage.setImageResource(item.image)
        holder.itemBinding.dishname.text = item.name
    }

}