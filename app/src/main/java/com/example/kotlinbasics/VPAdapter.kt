package com.example.kotlinbasics

import android.telecom.Call
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.ListFragment
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class VPAdapter(fragmentManager : FragmentManager , lifecycle : Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle){

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        if(position==0){
            return Fragment1()
        }else{
            return Fragment2()
        }
    }

}