package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//좌표 정렬하기
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val list = ArrayList<List<Int>>()
    for (i in 0 until n)
        list.add(br.readLine().split(" ").map { it.toInt() })
    list.sortedWith(compareBy({ it[0] }, { it[1] })).forEach {
        bw.write("${it[0]} ${it[1]}\n")
    }
    bw.close()
}