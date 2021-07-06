package gold

const val c = 1000000007

//피보나치 수 6
fun main() {
    val n = readLine()!!.toInt()
    val fib = ArrayList<Int>()
    for (i in 0..n) {
        if (fib.size == 0)
            fib.add(0)
        else if (fib.size == 1)
            fib.add(1)
        else
            fib.add(((fib.last() % c) + (fib[fib.lastIndex - 1] % c)) % c)
    }
    print(fib[n])
}
