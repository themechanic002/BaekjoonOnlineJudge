package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//스택
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()
    for (i in 0 until Integer.parseInt(br.readLine())) {
        val order = br.readLine().toString()
        if (order.contains("push "))
            stack.add(order.replace("push ", "").toInt())
        else {
            when (order) {
                "pop" -> {
                    if (stack.isEmpty()) bw.write("-1\n")
                    else bw.write("${stack.pop()}\n")
                }
                "size" -> bw.write("${stack.size}\n")
                "empty" -> {
                    if (stack.isEmpty()) bw.write("1\n")
                    else bw.write("0\n")
                }
                "top" -> {
                    if (stack.isEmpty()) bw.write("-1\n")
                    else bw.write("${stack.peek()}\n")
                }
            }
        }
    }
    bw.close()
}