package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//AC
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    for(i in 0 until n){
        val p = br.readLine().toString().toCharArray()
        val arrN = Integer.parseInt(br.readLine())
        val arr = ArrayDeque<Int>()
        br.readLine().toString().substring(1, arrN * 2).split(",").map { it.toInt() }.forEach { arr.add(it) }

    }
}