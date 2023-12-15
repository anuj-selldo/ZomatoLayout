package com.example.kotlinbasics

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlinbasics.databinding.DeliverycycleBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : VPAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.deliverycycle)

        var tabLayout : TabLayout = findViewById(R.id.tablayout1)
        var viewPager2 : ViewPager2 = findViewById(R.id.ViewPager2)

        adapter = VPAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null){
                    viewPager2.currentItem = tab.position
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })













        /*val list = constants.foodlist
        adapter = MainAdapter(list)
        binding.recyclelist.setLayoutManager(LinearLayoutManager(this))
        binding.recyclelist.adapter  = adapter*/


       /* val numbers : IntArray = intArrayOf(1,2,3,4,5)
        val doublenumbers : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
        val numberss = intArrayOf(1,2,3,4,6)
        val days = arrayOf("SUN","MON","TUE","WED","THU")

        print(numbers.contentToString())

        for(element in numbers){
//         print(element)
//         print(" ${element+2} ")
        }

//     print(numbers[0])
        numbers[1] = 56

        print(doublenumbers.contentToString())

        print(days.contentToString())

        data class Fruit(val name:String,val price: Double)

        val fruits = arrayOf(Fruit("Apple",2.5),Fruit("Banana",3.2))

        println(fruits.contentToString())

        for(index in fruits.indices){
            print("${fruits[index].name} is in index $index")
        }

        val mixarray = arrayOf(1,"2.0",2.0,"SUN",Fruit("Pineapple",2.09))

        print(mixarray.contentToString())*/
    }
}