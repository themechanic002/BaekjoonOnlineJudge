package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.*

//터렛
fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val line = br.readLine().split(" ").map { it.toInt() }
        val xToy = sqrt(abs(line[0] - line[3]).toDouble() + abs(line[1] - line[4]))
        val r1Plusr2 = (line[2] + line[5]).toDouble()
        if (xToy > r1Plusr2)
            bw.write("0\n")
        else if (xToy < r1Plusr2)
            bw.write("2\n")
        else
            bw.write("1\n")
    }
    br.close()
    bw.close()
}