package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//통계학
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Pair<Int, Int>>()
    var sum = 0
    for(i in 0 until n) {
        val input = Integer.parseInt(br.readLine())
        sum += input
        arr.add(Pair(input, 1))
    }
    arr.sortBy { it.first }
    bw.write("${sum / n}")
    bw.write("${arr[n/2].first}")
    val max = arr[n - 1].first
    val min = arr[0].first
    arr.sortWith(compareBy({-it.second}, { it.first }))
    bw.write("${arr[arr[0].second].first}")
    bw.write("${max - min}")
    bw.close()
}