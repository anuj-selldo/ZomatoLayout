import com.example.kotlinbasics.Food

fun main(){
    val fruits = mutableSetOf("Orange","apple","Grape","Apple")
    fruits.add("Orange")
    val numbers = setOf("one", "two", "three")
    /*numbers union setOf("four", "five")
    numbers intersect setOf("two", "one")*/
    print(numbers subtract setOf("four", "two"))
    print(numbers)
    print(fruits.sortedBy { it.lowercase() })
    val f = setOf("Orange","apple")
    val newfruits = fruits.minus(f)
    print(newfruits)

    val numbers2 = setOf("three", "four")
    println((numbers2 - numbers))

    val users : MutableSet<Food> = mutableSetOf()
    users.add(Food("indian",1))
    users.add(Food("punjabi",2))
    users.add(Food("south indian",3))
    users.add(Food("korean",4))
    users.add(Food("chinese",4))

    print(users)
}