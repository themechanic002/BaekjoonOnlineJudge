package gold

//피보나치 수 6
//행렬을 이용해야하지만 좀 더 고민이 필요할 거 같음.
//미완성
fun main() {
    val c = 1000000007
    val n = readLine()!!.toLong() % c.toLong()
    val fib = ArrayList<Long>()
    for (i in 0L..n) {
        if (fib.size == 0)
            fib.add(0)
        else if (fib.size == 1)
            fib.add(1)
        else {
            fib.add(((fib.last() % c) + (fib[fib.lastIndex - 1] % c)) % c)
            fib.removeFirst()
        }
    }
    print(fib.last())

}