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
    for (i in 0 until testNum) {
        val tempArr = br.readLine().toString().split(" ").map { it.toInt() }
        val m = tempArr[1]
        val queue = LinkedList<IntArray>()
        br.readLine().toString().split(" ").map { it.toInt() }
            .forEachIndexed { index, value -> queue.offer(intArrayOf(index, value)) }
        var count = 0
        while (true) {
            val point = queue.poll()
            if (queue.isEmpty() || queue.all { point[1] >= it[1] }) {
                count++
                if (point[0] == m) {
                    bw.write("$count\n")
                    break
                }
            } else queue.offer(point)
        }
    }
    bw.close()
}