package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//좌표 압축
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val set = HashSet<Pair<Int, Int>>()
    val arr = IntArray(n)
    val tmp = br.readLine().split(" ")
    for(i in 0 until n)
        arr[i] = tmp[i].toInt()

}