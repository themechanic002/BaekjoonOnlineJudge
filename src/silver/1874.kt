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
    stack.push(1)
    bw.write("+\n")
    for(i in 2..n){
        val next = Integer.parseInt(br.readLine())

    }
}