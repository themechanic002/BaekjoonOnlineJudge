package silver

//셀프 넘버
fun main() {
    val list = ArrayList<Int>()
    for (i in 1..10000)
        list.add(i)
    for (i in 1..10000) {
        val nextN = nextNum(i)
        if(nextN <= 10000 && list.contains(nextN))
            list.remove(nextN)
    }
    for(i in list)
        println(i)
}

fun nextNum(n: Int) = n + n.toString().map { it.code - '0'.code }.sum()