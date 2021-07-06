package gold

//검문
//에러
fun main() {
    val n = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    val answer = ArrayList<Int>()
    for (i in 0 until n)
        arr.add(i, readLine()!!.toInt())

    val sortedArr = arr.sorted().toIntArray()
    for (i in 0..sortedArr.first()) {
        var newArr = sortedArr.copyOf()
        newArr = newArr.map { if(it - i <= 0) 1 else it - i }.toIntArray()
        newArr.forEach { print("$it ") }
        println()
        if(newArr.all { newArr.last() % it == 0 })
            answer.add(i)
    }
    answer.forEach { print("$it ") }
}