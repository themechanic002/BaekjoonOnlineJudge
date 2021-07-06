package gold

import java.util.*

//오큰수
//시간초과에러
fun main() {
    readLine()
    var arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val stack = Stack<Int>()
    for (i in 0 until arr.size) {
        while (stack.isNotEmpty() && arr[stack.first()] < arr[i]) {
            arr[stack.pop()] = arr[i]
        }
        stack.push(i)
    }
    while (stack.isNotEmpty())
        arr[stack.pop()] = -1
    arr.forEach { print("$it ") }

    /*arr.map { one ->
        arr.find { arr.indexOf(it) > arr.indexOf(one) && it > one } ?: -1
    }.toMutableList().forEach { print("$it ") }*/
}