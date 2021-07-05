package silver

//한수
fun main() {
    var count = 0
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        if (isHanSu(i)) {
            count++
        }
    }
    print(count)
}

fun isHanSu(n: Int): Boolean {
    if (n < 100)
        return true
    else {
        val array = n.toString().map { it.code - '0'.code }.toMutableList()
        val gap = array[1] - array[0]
        var count = 0
        while (array.size > 1) {
            if (array[1] - array[0] == gap)
                array.removeFirst()
            else return false
        }
        return true
    }
}