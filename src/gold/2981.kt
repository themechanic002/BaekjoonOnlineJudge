package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//검문
//메모리초과
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val answer = PriorityQueue<Int>()
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>()
    for (i in 0 until n)
        arr.add(Integer.parseInt(br.readLine()))
    arr.sort()

    val min = arr.first()
    for (i in 0..min - 2) {
        val newArr = arr.map { it - i }
        if (newArr.all { it % newArr.first() == 0 }) {
            answer.offer(min - i)
        }
    }
    while (answer.isNotEmpty())
        bw.write(answer.poll().toString() + " ")
    br.close()
    bw.close()

}