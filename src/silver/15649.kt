package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//N과 M (1)
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = br.readLine().split(" ").map { it.toInt() }
    val n = arr[0]
    val m = arr[1]
    val set = HashSet<Pair<Int, Int>>()
    for (i in 1..n) {
        for (j in 1..n) {

        }
    }
}