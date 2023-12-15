package com.example.kotlinbasics

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main(){

    data class User(var name:String, val age:Int, val gender:Char)

    val userlist : ArrayList<User> = arrayListOf(User("Anuj",17,'M'),User("Anuj",52,'F'),User("Rekha",40,'F'))

    val a = userlist.get(1)
    print(a.name::class.java.typeName)
    val anuj = userlist.distinctBy { Pair(it.name, it.gender) }
    print(anuj)
    val userlist1 = mutableListOf(User("Anuj",21,'M'),User("Hardik",52,'M'),User("Rekha",40,'F'))

    var userlist2 = userlist.asSequence()
        .filter { it -> it.age > 18 }
        .sortedByDescending { it.age }
        .map { User(it.name,it.age + 2,it.gender) }
        .toList()

    val iterator = userlist2.iterator()

    userlist2 = userlist.asSequence()
        .filter { it.age::class.java.typeName.equals("java.lang.String") }
        .sortedByDescending { it.age }
        .map { User(it.name,it.age + 2,it.gender) }
        .toList()
  /*  while (iterator.hasNext()){
        print(iterator.next())
    }*/

    println(userlist2)
}