package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var countZero = 0
var countOne = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        countZero = 0
        countOne = 0
        fib(Integer.parseInt(br.readLine()))
        bw.write("$countZero $countOne\n")
    }
    br.close()
    bw.close()
}

fun fib(n: Int): Int {
    if (n == 0) {
        countZero++
        return 0
    } else if (n == 1) {
        countOne++
        return 1
    } else return fib(n - 1) + fib(n - 2)
}