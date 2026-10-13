import java.io.File
fun main() {
    val f = File("/home/xinian/练习/Coroutines/src/main/kotlin/1.txt")
    if (f.exists()){
        f.appendText("\n1000")
        println(f.readText())
    }else if(!f.exists()){
        f.createNewFile()
        println(1)
        f.appendText("\n1000")
        println(f.readText())
    }
    f.delete()
}
//delete() — 删除文件