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
    for (i in 0 until n) {
        val order = br.readLine().toString()
        if (order.contains("push"))
            dq.addLast(order.replace("push ", "").toInt())
        else {
            when (order) {
                "front" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.first()}\n")
                }
                "back" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.last()}\n")
                }
                "empty" -> {
                    if (dq.isEmpty()) bw.write("1\n")
                    else bw.write("0\n")
                }
                "size" -> bw.write("${dq.size}\n")
                "pop" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.removeFirst()}\n")
                }
            }
        }
    }
    bw.close()
}