package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//수 찾기
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>()
    br.readLine().split(" ").map { it.toInt() }.forEach { arr.add(it) }
    val m = Integer.parseInt(br.readLine())
    for(i in 0 until m){

    }
}