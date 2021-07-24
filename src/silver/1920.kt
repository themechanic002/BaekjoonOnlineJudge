package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//수 찾기
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    br.readLine()
    val set = HashSet<Int>()
    br.readLine().split(" ").map { it.toInt() }.forEach { set.add(it) }
    br.readLine()
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if (set.contains(it))
            bw.write("1\n")
        else
            bw.write("0\n")
    }
    bw.close()
}