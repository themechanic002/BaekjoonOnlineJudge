package gold

import java.util.*

//가운데를 말해요
/* 우선순위 큐 두 개를 생성해서
* 한 개는 작은 수들로만 구성되어 있지만 peek()하면 제일 큰 수가 나오는 최대힙으로,
* 한  개는 큰 수들로만 구성되어 있지만 peek()하면 제일 작은 수가 나오는 최소힙으로 해서
* 중간 값을 찾아내는 방법 */

//코틀린으로만 오류남
fun main() {
    val pqLow = PriorityQueue<Int>(Collections.reverseOrder())
    val pqHigh = PriorityQueue<Int>()
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        val next = readLine()!!.toInt()

        if (pqLow.size == pqHigh.size)
            pqLow.add(next)
        else
            pqHigh.add(next)

        if (pqLow.isNotEmpty() && pqHigh.isNotEmpty()) {
            if (pqHigh.peek() < pqLow.peek()) {
                val temp = pqHigh.poll()
                pqHigh.add(pqLow.poll())
                pqLow.add(temp)
            }
        }
        println(pqLow.peek())
    }
}