package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//단어 정렬
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val set = HashSet<String>()
    for (i in 0 until n)
        set.add(br.readLine().toString())
    val list = set.toList().sortedWith(compareBy({ it.length }, { it }))
    list.forEach { bw.write("$it\n") }
    bw.close()
}