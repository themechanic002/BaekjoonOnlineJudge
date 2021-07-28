package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//수 정렬하기 3
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = ArrayList<Int>()
    for (i in 0 until Integer.parseInt(br.readLine()))
        arr.sort()
    arr.forEach { bw.write("$it\n") }
    bw.close()
}