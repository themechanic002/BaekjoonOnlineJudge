package silver

//한수
fun main() {
    var count = 0
    val n = readLine()!!.toInt()
    for(i in 1 .. n){
        if(isHanSu(i))
            count++
    }
    print(count)
}

fun isHanSu(n: Int): Boolean {
    if(n < 100)
        return true
    else{
        val array = n.toString().map { it.code - '0'.code }
        val gap = array[1] - array[0]
        var count = 0
        for(i in array){
            if(i != array.last() && array[array.indexOf(i) + 1] - i == gap)
                count++
        }
        return count == array.size - 1
    }
}