package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//수 정렬하기 3
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = PriorityQueue<Int>(Comparator.reverseOrder())
    for (i in 0 until Integer.parseInt(br.readLine()))
        arr.offer(Integer.parseInt(br.readLine()))
    while (arr.isNotEmpty())
        bw.write("${arr.poll()}")
    bw.close()
}