package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//균형잡힌 세상
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Char>()

    while (true) {
        val line = br.readLine().toString()
        if (line == ".") break
        line.forEach {
            when (it) {
                '(' -> stack.push('(')
                '[' -> stack.push('[')
                ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        bw.write("no\n")
                        return@forEach
                    }
                }
                ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        bw.write("no\n")
                        return@forEach
                    }
                }
            }
        }
        if (stack.isEmpty())
            bw.write("yes\n")
        else
            bw.write("no\n")
    }
    bw.close()
}