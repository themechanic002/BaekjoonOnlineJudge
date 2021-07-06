package gold

//오큰수
fun main() {
    readLine()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    while (arr.isNotEmpty()) {
        val target = arr.first()
        arr.removeFirst()
        val p = arr.find { it > target }
        if (p == null)
            print(-1)
        else
            print(p)
        print(" ")
    }
}