package com.example.kotlinbasics

fun main() {

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
   /* print(anyTypes.size)
    print(months[2])*/

    months.asSequence().filter {
        it.startsWith("F")
    }
        .toList()

    val b = anyTypes.asSequence().filter {
        it.equals(true) || it.equals(false)
    }
        .toList()

    print(b)

    for (month in months) {
        println(month)
    }

    val newmonths = months.toMutableList()
    val addmonths = arrayOf("April","may","june")
    newmonths.addAll(addmonths)
    newmonths.add("july")

    for (month in newmonths) {
        println(month)
    }

    val days = mutableListOf<String>("MON","TUE","WED")
    val removeList  = listOf<String>("MON","WED")
    days.removeAll(removeList);
    print(days.toString())

}

