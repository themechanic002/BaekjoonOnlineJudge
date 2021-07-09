package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//수 정렬하기 2
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = ArrayList<Int>()
    for (i in 0 until n)
        arr.add(br.readLine().toInt())
    arr.sorted().forEach { bw.write("$it\n") }
    bw.close()
}