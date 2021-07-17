package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.collections.ArrayDeque

//큐2
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val dq = ArrayDeque<Int>()
    for(i in 0 until n){
        val order = br.readLine().toString()
        if(order.contains("push"))
            dq.addLast(order.replace("push ", "").toInt())
        else{
            when(order){
                "front" -> bw.write("${dq}")
            }
        }
    }
}