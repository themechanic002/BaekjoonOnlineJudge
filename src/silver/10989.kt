package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//수 정렬하기 3
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = IntArray(n)
    for (i in 0 until n)
        arr[i] = Integer.parseInt(br.readLine())
    arr.sort()
    for (i in 0 until n)
        bw.write("${arr[i]}\n")
    bw.close()
}