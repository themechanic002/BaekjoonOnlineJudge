package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//오큰수
//시간초과에러
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    val arr = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    //var arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val stack = Stack<Int>()
    for (i in 0 until arr.size) {
        while (stack.isNotEmpty() && arr[stack.peek()] < arr[i]) {
            arr[stack.pop()] = arr[i]
        }
        stack.push(i)
    }
    while (stack.isNotEmpty())
        arr[stack.pop()] = -1
    arr.forEach { bw.write("$it ") }
    bw.close()

    /*arr.map { one ->
        arr.find { arr.indexOf(it) > arr.indexOf(one) && it > one } ?: -1
    }.toMutableList().forEach { print("$it ") }*/
}