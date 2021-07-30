package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//링
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>()
    val line = br.readLine().split(" ").map { it.toInt() }
    val standard = line[0]
    line.forEach {
        if(line.indexOf(it) > 0)
            arr.add(it)
    }



}