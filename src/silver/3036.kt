package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.max
import java.lang.Math.min

//링
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>()
    val line = br.readLine().split(" ").map { it.toInt() }
    val standard = line[0]
    line.forEach {
        if(line.indexOf(it) > 0)
            arr.add(it)
    }
    arr.forEach {
        var a = it
        var b = standard
        var gcd = findingGCD(a, b)
        while(gcd != 1){
            a /= gcd
            b /= gcd
            gcd = findingGCD(a, b)
        }
        bw.write("$b/$a\n")
    }
    bw.close()

}

fun findingGCD(a: Int, b: Int): Int {
    var maximum = max(a, b)
    var minimum = min(a, b)

    if (minimum == 0) return max(a, b)
    else return findingGCD(minimum, maximum % minimum)
}