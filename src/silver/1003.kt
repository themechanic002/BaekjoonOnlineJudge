package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0)
            bw.write("1 0\n")
        else
            bw.write("${fib(next - 1)} ${fib(next)}\n")
    }
    br.close()
    bw.close()
}

fun fib(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else return fib(n - 1) + fib(n - 2)
}