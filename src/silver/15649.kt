package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//N과 M (1)
lateinit var arr: Array<Int>
lateinit var visit: Array<Boolean>
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val line = br.readLine().split(" ").map { it.toInt() }
    val n = line[0]
    val m = line[1]
    arr = Array(m) { 0 }
    visit = Array(n) { false }
    dfs(n, m, 0)
    bw.close()
}

fun dfs(n: Int, m: Int, depth: Int) {
    if (depth == m) {
        for (i in arr)
            bw.write("$i ")
        bw.write("\n")
        return
    }
    for (i in 0 until n) {
        if (!visit[i]) {
            visit[i] = true
            arr[depth] = i + 1
            dfs(n, m, depth + 1)
            visit[i] = false
        }
    }
}