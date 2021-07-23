package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//베르트랑 공준
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val prime: Array<Boolean> = Array(123456) { true }
    prime[0] = false
    prime[1] = false
    for (i in 2..123456) {
        if (prime[i])
            for (j in 2 * i..1000 step i) prime[i] = false
    }

    while (true) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0)
            break
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