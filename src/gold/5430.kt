package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//AC
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    first@ for (i in 0 until n) {
        val p = br.readLine().toString().replace("RR", "").toCharArray()
        val arrN = Integer.parseInt(br.readLine())
        var arr = ArrayDeque<Int>()
        var isError = false
        var isNotReversed = true
        val next = br.readLine().toString()
        if (arrN != 0)
            next.substring(1, arrN * 2).split(",").map { it.toInt() }.forEach { arr.add(it) }
        for (element in p) {
            when (element) {
                'R' -> isNotReversed = !isNotReversed
                'D' -> {
                    if (arr.isEmpty()) {
                        isError = true
                        break
                    } else {
                        //원래 상태
                        if (isNotReversed) arr.pollFirst()
                        //뒤집어진 상태
                        else arr.pollLast()
                    }
                }
            }
        }
        if (isError) bw.write("error\n")
        else {
            if (isNotReversed) {
                bw.write("[")
                while (arr.isNotEmpty()) {
                    bw.write("${arr.pollFirst()}")
                    if (arr.size > 0)
                        bw.write(", ")
                }
                bw.write("]\n")
            } else {
                bw.write("[")
                while (arr.isNotEmpty()) {
                    bw.write("${arr.pollLast()}")
                    if (arr.size > 0)
                        bw.write(", ")
                }
                bw.write("]\n")
            }
        }
    }
    bw.close()
}