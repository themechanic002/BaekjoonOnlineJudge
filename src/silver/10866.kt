package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//덱
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val dq = ArrayDeque<Int>()
    for (i in 0 until n) {
        val order = br.readLine().toString()
        if (order.contains("push_back "))
            dq.addLast(order.replace("push_back ", "").toInt())
        else if (order.contains("push_front "))
            dq.addFirst(order.replace("push_front ", "").toInt())
        else
            when (order) {
                "pop_front" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.removeFirst()}\n")
                }
                "pop_back" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.removeLast()}\n")
                }
                "size" -> {
                    bw.write("${dq.size}\n")
                }
                "empty" -> {
                    if (dq.isEmpty()) bw.write("1\n")
                    else bw.write("0\n")
                }
                "front" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.first()}\n")
                }
                "back" -> {
                    if (dq.isEmpty()) bw.write("-1\n")
                    else bw.write("${dq.last()}\n")
                }
            }
    }
    bw.close()
}