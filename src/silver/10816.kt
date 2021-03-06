package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//์ซ์ ์นด๋ 2
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    br.readLine()
    val map = HashMap<Int, Int>()
    br.readLine().toString().split(" ").map { it.toInt() }.forEach {
        if (map.containsKey(it))
            map.set(it, map.getValue(it) + 1)
        else
            map.put(it, 1)
    }
    br.readLine()
    br.readLine().toString().split(" ").map { it.toInt() }.forEach {
        if (map.containsKey(it))
            bw.write("${map.getValue(it)} ")
        else
            bw.write("0 ")
    }
    bw.close()
}