package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//약수
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    val divisors = br.readLine().toString().split(" ").map { it.toInt() }.sorted()
    bw.write("${divisors.first() * divisors.last()}")
    bw.close()
}