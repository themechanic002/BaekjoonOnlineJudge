package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//최대공약수와 최소공배수
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    val gcdVal = gcd(arr[0], arr[1])
    bw.write("${gcdVal}\n")
    bw.write("${arr[0] * arr[1] / gcdVal}")
    bw.close()
}

fun gcd(a: Int, b: Int): Int {
    var a2 = a
    var b2 = b
    while (b2 !== 0) {
        val r: Int = a2 % b2
        a2 = b2
        b2 = r
    }
    return a2
}