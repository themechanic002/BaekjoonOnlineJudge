package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//베르트랑 공준
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val prime: Array<Boolean> = Array(246913) { true }
    for (i in 2..246912)
        if (prime[i])
            for (j in 2 * i..246912 step i) prime[j] = false

    while (true) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0) break
        else {
            var count = 0
            for (i in next + 1..next * 2)
                if (prime[i])
                    count++
            bw.write("$count\n")
        }
    }
    bw.close()
}