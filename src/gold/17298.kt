package gold

//오큰수
fun main() {
    readLine()
    var arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    arr = arr.map { one ->
        arr.find { arr.indexOf(it) > arr.indexOf(one) && it > one } ?: -1
    }.toMutableList()

    for(i in arr) {
        print(i)
        print(" ")
    }
    /*while (arr.isNotEmpty()) {
        val target = arr.first()
        arr.removeFirst()
        val p = arr.find { it > target }
        if (p == null)
            print(-1)
        else
            print(p)
        print(" ")
    }*/
}