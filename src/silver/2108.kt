package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

//통계학
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>()
    for (i in 0 until n) {
        arr.add(Integer.parseInt(br.readLine()))
    }
    arr.sort()
    bw.write("${arr.average().roundToInt()}\n")
    bw.write("${arr[n / 2]}\n")
    val mode = arr.groupBy { it }.values.sortedWith(compareBy({ -it.size }, { it.first() }))
    if (mode.size == 1)
        bw.write("${mode.get(0).first()}\n")
    else
        bw.write("${mode.get(1).first()}\n")
    bw.write("${arr.last() - arr.first()}")
    bw.close()
}