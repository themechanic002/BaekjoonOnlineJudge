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
    for(i in 0 until n) {
        arr.add(Integer.parseInt(br.readLine()))
    }
    arr.sort()
    val avg = arr.average()
    if(avg >= avg.toInt() + 0.5)
        if(avg < 0)
            bw.write("${avg.toInt() - 1}\n")
        else
            bw.write("${avg.toInt() + 1}\n")
    else
        bw.write("${avg.toInt()}\n")

    bw.write("${arr[n / 2]}\n")
    bw.write("${arr.groupBy { it }}\n")
    bw.write("${arr.last() - arr.first()}")
    bw.close()
}