package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

//절댓값 힙
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val pqPlus = PriorityQueue<Int>()
    val pqMinus = PriorityQueue<Int>(Comparator.reverseOrder())

    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0) {
            if (pqPlus.isEmpty() && pqMinus.isEmpty())
                bw.write("0\n")
            else {
                if (pqPlus.isEmpty())
                    bw.write("${pqMinus.poll()}\n")
                else if (pqMinus.isEmpty())
                    bw.write("${pqPlus.poll()}\n")
                else {
                    if (abs(pqPlus.peek()) < abs(pqMinus.peek()))
                        bw.write("${pqPlus.poll()}\n")
                    else
                        bw.write("${pqMinus.poll()}\n")
                }
            }
        }
        else if (next > 0)
            pqPlus.offer(next)
        else
            pqMinus.offer(next)
    }
    bw.close()
}