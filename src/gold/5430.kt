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
        val p = br.readLine().toString().toCharArray()
        val arrN = Integer.parseInt(br.readLine())
        var arr = ArrayDeque<Int>()
        var isError = false
        //R 나올때마다 굳이 모든 배열을 리버스할 필요 없이 Deque에서 앞에꺼를 빼냐 뒤에꺼를 빼냐만 결정하면 됨.
        //그러면 배열을 뒤집어서 맨 앞에 원소를 빼내는 것과 동일함
        var isNotReversed = true
        val next = br.readLine().toString()
        if (arrN != 0)
            next.substring(1, next.lastIndex).split(",").map { it.toInt() }.forEach { arr.add(it) }
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
            bw.write("[")
            if (isNotReversed) {
                while (arr.isNotEmpty()) {
                    bw.write("${arr.pollFirst()}")
                    if (arr.size > 0)
                        bw.write(",")
                }
            } else {
                while (arr.isNotEmpty()) {
                    bw.write("${arr.pollLast()}")
                    if (arr.size > 0)
                        bw.write(",")
                }
            }
            bw.write("]\n")
        }
    }
    bw.close()
}