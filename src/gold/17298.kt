package gold

//오큰수
//시간초과에러
fun main() {
    readLine()
    var arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    arr.map { one ->
        arr.find { arr.indexOf(it) > arr.indexOf(one) && it > one } ?: -1
    }.toMutableList().forEach { print("$it ") }
}