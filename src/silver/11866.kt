package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//요세푸스 문제 0
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val temp = br.readLine().toString().split(" ").map { it.toInt() }
    val n = temp[0]
    val k = temp[1]
    val dq = ArrayDeque<Int>()
    val answer = ArrayList<Int>()
    for(i in 1 .. n)
        dq.add(i)
    while(dq.isNotEmpty()){
        for(i in 1 until k)
            dq.addLast(dq.removeFirst())
        answer.add(dq.removeFirst())
    }
    bw.write("<")
    answer.forEach {
        if(it == answer.last())
            bw.write("$it")
        else
            bw.write("$it, ")
    }
    bw.write(">")
}