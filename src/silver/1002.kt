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
        val line = br.readLine().split(" ").map { it.toDouble() }

        var big: Pair<Double, Double>
        var small: Pair<Double, Double>
        var bigR: Double
        var smallR: Double
        if (line[2] >= line[5]) {
            big = Pair(line[0], line[1])
            small = Pair(line[3], line[4])
            bigR = line[2]
            smallR = line[5]
        } else {
            big = Pair(line[3], line[4])
            small = Pair(line[0], line[1])
            bigR = line[5]
            smallR = line[2]
        }
        val dist = sqrt((big.first - small.first).pow(2) + (big.second - small.second).pow(2))
        val rads = bigR + smallR

        if (rads < dist)
            bw.write("0\n")
        else if (rads == dist)
            bw.write("1\n")
        else {
            if (bigR - smallR < dist)
                bw.write("2\n")
            else if (bigR - smallR > dist)
                bw.write("0\n")
            else
                bw.write("1\n")
        }
    }
    br.close()
    bw.close()
}