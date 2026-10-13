import java.io.File
fun main() {
    val f = File("/home/xinian/练习/Coroutines/src/main/kotlin/1.txt")
    f.writeText("1000")
    println(f.readText())
}
//writeText() — 覆盖写入