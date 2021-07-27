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
    val arr = ArrayList<Int>()
    var sum = 0
    for(i in 0 until n) {
        arr.add(Integer.parseInt(br.readLine()))
    }
    arr.sort()
    bw.write("${arr.average()}\n")
    bw.write("${arr[n / 2]}\n")
    bw.write("${arr.groupBy { it }}")
    bw.write("${arr.last() - arr.first()}")
    bw.close()
}