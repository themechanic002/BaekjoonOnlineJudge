package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//프린터 큐
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val testNum = Integer.parseInt(br.readLine())
    for(i in 0 until testNum){
        val tempArr = br.readLine().toString().split(" ").map { it.toInt() }
        val n = tempArr[0]
        val m = tempArr[1]
        val queue = LinkedList<Int>()
        br.readLine().toString().split(" ").map { it.toInt() }.forEach { queue.offer(it) }




    }
}