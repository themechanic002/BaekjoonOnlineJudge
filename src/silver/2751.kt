package silver

//수 정렬하기 2
fun main() {
    val n = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    for (i in 0 until n)
        arr.add(readLine()!!.toInt())
    arr.sorted().forEach { println(it) }
}