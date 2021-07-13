package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

//절댓값 힙
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val pq = PriorityQueue<Int>(Comparator.comparing { abs(it) })
    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0) {
            if (pq.isEmpty())
                bw.write("0\n")
            else
                bw.write("${pq.poll()}\n")
        } else pq.offer(next)
    }
    bw.close()
}