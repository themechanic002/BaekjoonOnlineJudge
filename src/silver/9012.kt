package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//괄호
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val line = br.readLine()
        if (isRight(line))
            bw.write("YES\n")
        else bw.write("NO\n")
    }
    bw.close()
}

fun isRight(s: String): Boolean {
    val stack = Stack<Char>()
    for (i in s) {
        when (i) {
            '(' -> stack.push('(')
            ')' -> {
                if (stack.isEmpty())
                    return false
                else
                    stack.pop()
            }
        }
    }
    return stack.isEmpty()
}