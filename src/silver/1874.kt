package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//스택 수열
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val stack = Stack<Int>()
    stack.push(0)
    var count = 0
    for (i in 1..n) {
        val next = Integer.parseInt(br.readLine())
        while (true) {
            if (stack.peek() < next) {
                stack.push(++count)
                bw.write("+\n")
            } else if (stack.peek() > next) {
                stack.pop()
                bw.write("-\n")
            } else {
                stack.pop()
                bw.write("-\n")
                break
            }
        }
    }
    bw.close()
}