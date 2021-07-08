package silver

//피보나치 함수
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = ArrayList<Int>()
    for (i in 0..40) {
        if (arr.size == 0)
            arr.add(0)
        else if (arr.size == 1)
            arr.add(1)
        else
            arr.add(arr.last() + arr[arr.lastIndex - 1])
    }

    val n = Integer.parseInt(br.readLine())
    for (i in 0 until n) {
        val next = Integer.parseInt(br.readLine())
        if (next == 0)
            bw.write("1 0\n")
        else
            bw.write("${arr[next - 1]} ${arr[next]}\n")
    }
    br.close()
    bw.close()
}