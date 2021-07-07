package silver

//크로아티아 알바벳
fun main() {
    var s = readLine()!!.toString()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0

    croatia.forEach {
        s = s.replace(it, "0")
    }
    count += s.length
    print(count)
}