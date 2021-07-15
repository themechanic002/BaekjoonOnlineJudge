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
        val next = br.readLine().toString()
        if (arrN != 0)
            next.substring(1, arrN * 2).split(",").map { it.toInt() }.forEach { arr.add(it) }
        for (i in 0 until p.size) {
            when (p[i]) {
                'R' -> {
                    if (!arr.isEmpty()) {
                        val newArr = ArrayDeque<Int>()
                        while (arr.isNotEmpty())
                            newArr.offerLast(arr.pollLast())
                        arr = newArr
                    }
                }
                else -> {
                    if (arr.isEmpty()) {
                        isError = true
                        break
                    } else {
                        arr.pollFirst()
                    }
                }
            }
        }
        if (isError) bw.write("error\n")
        else bw.write("${arr}\n")
    }
    bw.close()
}