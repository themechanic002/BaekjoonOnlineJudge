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

    while (true) {
        val stack = Stack<Char>()
        val line = br.readLine().toString()
        if (line == ".") break
        for(i in line){
            when (i) {
                '(' -> stack.push('(')
                '[' -> stack.push('[')
                ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push(')')
                        bw.write("no\n")
                        break
                    }
                    else stack.pop()
                }
                ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push(']')
                        bw.write("no\n")
                        break
                    }
                    else stack.pop()
                }
            }
        }
        if(stack.isEmpty())
            bw.write("yes\n")
    }
    bw.close()
}