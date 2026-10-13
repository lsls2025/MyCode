import java.io.File
fun main() {
    val f = File("/home/xinian/练习/Coroutines/src/main/kotlin/1.txt")
    println(f.readText())
}
//readText() — 把文件内容读取为字符串并返回