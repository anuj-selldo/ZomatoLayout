package com.example.kotlinbasics


    enum class Day(val dayOfWeek: Int) {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7)
    }


fun main() {
    for (day in Day.entries)
        println("[${day.ordinal}] -> ${day.name} (${day.dayOfWeek}^ day of the week)")
}