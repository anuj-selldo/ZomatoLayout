fun main(){

    val numbers : IntArray = intArrayOf(1,2,3,4,4,5)
    val doublenumbers : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
    val numberss = intArrayOf(1,2,3,4,6)
    val days = arrayOf("SUN","MON","TUE","WED","THU")

    val filter = numbers.filter {
        it > 2
    }

    val num3 = numbers.drop(3) // drops first three element
    print(numbers.indices.first)
    print(numbers.random())
    print(numbers.binarySearch(3))
    numbers.copyOfRange(1,3)
    val num = numbers.dropLastWhile {
        it > 4
    }
    print(num.toString())
    val num2 = numbers.map { item->
        item + item
    }
    print(num2)
   /* print(numbers.contentToString())*/

    for(element in numbers){
//         print(element)
//         print(" ${element+2} ")
    }

//     print(numbers[0])
/*    numbers[1] = 56

    print(doublenumbers.contentToString())

    print(days.contentToString())

    data class Fruit(val name:String,val price: Double)

    val fruits = arrayOf(Fruit("Apple",2.5),Fruit("Banana",3.2))

    println(fruits.contentToString())

    for(index in fruits.indices){
        print("${fruits[index].name} is in index $index")
    }

    var inputarray = arrayOf<Any>()*/

    /*val inputnumber = readln().toInt()
    val arrayint = Array<Int>(inputnumber) { readln().toInt() }
    for(x in arrayint)
        println(x)*/



    fun <T> Array<T>.mapInPlace(transform: (T) -> T) {
        for (i in this.indices) {
            this[i] = transform(this[i])
        }
    }


}