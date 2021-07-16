package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//피보나치 수 6
//행렬을 이용해야하지만 좀 더 고민이 필요할 거 같음.
//미완성
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val c = 1000000007
    val n = br.readLine().toLong()
    val fib = ArrayList<Int>()
    for (i in 0L..n) {
        if (fib.size == 0)
            fib.add(0)
        else if (fib.size == 1)
            fib.add(1)
        else {
            fib.add((fib.last() + fib[fib.lastIndex - 1]) % c)
            fib.removeFirst()
        }
    }
    bw.write("${fib.last()}\n")
}