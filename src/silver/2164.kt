package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//카드2
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val dq = ArrayDeque<Int>()
    for(i in 1 .. n)
        dq.addLast(i)
    while(dq.size != 1){
        dq.removeFirst()
        dq.addLast(dq.removeFirst())
    }
}