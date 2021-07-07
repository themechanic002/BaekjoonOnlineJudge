package silver

//크로아티아 알바벳
fun main() {
    var s = readLine()!!.toString()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0

    croatia.forEach {
        while (s.contains(it)) {
            count++
            s = s.replace(it, "")
        }
    }
    s = s.replace("-", "")
    s = s.replace("=", "")
    count += s.length
    print(count)
}