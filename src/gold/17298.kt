package gold

//오큰수
fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    while (arr.isNotEmpty()) {
        val target = arr.first()
        arr.removeFirst()
        for (i in 0..arr.lastIndex) {
            if (arr[i] > target) {
                print(arr[i])
                break
            } else if (i == arr.lastIndex && arr[i] <= target) {
                print("-1")
                break
            }
        }
        if (arr.isEmpty())
            print(-1)
        else
            print(" ")
    }
}