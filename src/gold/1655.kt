package gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//가운데를 말해요
/* 우선순위 큐 두 개를 생성해서
* 한 개는 작은 수들로만 구성되어 있지만 peek()하면 제일 큰 수가 나오는 최대힙으로,
* 한  개는 큰 수들로만 구성되어 있지만 peek()하면 제일 작은 수가 나오는 최소힙으로 해서
* 중간 값을 찾아내는 방법 */

//입출력을 readLine과 println으로 하면 안 됨. 시간을 줄이기 위해 BufferedReader와 BufferedWriter를 사용해야함.

fun main() {
    val pqLow = PriorityQueue<Int>(Collections.reverseOrder())
    val pqHigh = PriorityQueue<Int>()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())

    for (i in 0 until n) {
        val next = Integer.parseInt(br.readLine())

        if (pqLow.size == pqHigh.size)
            pqLow.offer(next)
        else
            pqHigh.offer(next)

        if (pqLow.isNotEmpty() && pqHigh.isNotEmpty()) {
            if (pqHigh.peek() < pqLow.peek()) {
                val temp = pqHigh.poll()
                pqHigh.offer(pqLow.poll())
                pqLow.offer(temp)
            }
        }
        bw.write("${pqLow.peek()}\n")
    }
    br.close()
    bw.close()
}