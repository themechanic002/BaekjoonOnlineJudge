package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//좌표 압축
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    br.readLine()
    val map = HashMap<Int, Int>()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val origArr = arr.clone()
    arr.sort()

    var count = 0
    for (i in arr) {
        if (!map.containsKey(i)) {
            map.put(i, count)
            count++
        }
    }

    for (i in origArr)
        bw.write("${map[i]} ")
    bw.close()
}