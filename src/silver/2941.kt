package silver

//크로아티아 알바벳
fun main() {
    val s = readLine()!!.toString()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0
    croatia.forEach {
        if(s.contains(it))
            count++
    }
    print(count)
}