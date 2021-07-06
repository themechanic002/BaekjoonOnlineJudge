package gold

fun main() {
    val n = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    val answer = ArrayList<Int>()
    for (i in 0 until n)
        arr.add(readLine()!!.toInt())

    val sortedArr = arr.sorted()
    for (i in 2..sortedArr.last()) {
        val temp = sortedArr.first() % i
        if (sortedArr.all { it % i == temp })
            answer.add(i)
    }
    answer.forEach { print("$it ") }
}