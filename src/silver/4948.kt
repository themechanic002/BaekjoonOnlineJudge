package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//베르트랑 공준
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0)
            break
        else {
            val arr = ArrayList<Int>()
            for (i in next + 1..next * 2) {
                var prime = true
                for (j in 2..next) {
                    if (i % j == 0) {
                        prime = false
                        break
                    }
                }
                if (prime) arr.add(i)
            }
            bw.write("${arr.size}\n")
        }
    }
    bw.close()
}