package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//제로
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val stack = Stack<Int>()
    for (i in 0 until n) {
        when (val num = Integer.parseInt(br.readLine())) {
            0 -> stack.pop()
            else -> stack.add(num)
        }
    }
    bw.write("${stack.sum()}")
    bw.close()
}