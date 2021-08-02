package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//나이순 정렬
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val list = ArrayList<List<String>>()
    for (i in 0 until n)
        list.add(br.readLine().split(" "))
    list.sortedBy { it[0].toInt() }.forEach { bw.write("${it[0]} ${it[1]}\n") }
    bw.close()
}