package gold

//가운데를 말해요
fun main() {
    val arr = ArrayList<Int>()
    val n = readLine()!!.toInt()
    val answer = ArrayList<Int>()
    for (i in 0 until n) {
        arr.add(readLine()!!.toInt())
        arr.sort()
        if (arr.size % 2 != 0)
            answer.add(arr[arr.size / 2])
        else
            answer.add(arr[(arr.size / 2) - 1])
    }
    answer.forEach { println(it) }
}