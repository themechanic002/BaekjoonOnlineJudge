package gold

//오큰수
fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    while (arr.isNotEmpty()) {
        val target = arr.first()
        arr.removeFirst()
        if(arr.all { it <= target })
            print(-1)
        else {
            print(arr.find { it > target })
        }
        print(" ")
    }
}