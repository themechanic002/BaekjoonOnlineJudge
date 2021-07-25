package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val line = br.readLine().toString().split(" ").map { it.toInt() }
    val m = line[0]
    val n = line[1]
    val arr : Array<Boolean> = Array(n + 1) {true}
    for(i in 2 .. n){
        if(arr[i])
            for(j in i * 2 .. n step i)
                arr[j] = false
    }
    
}