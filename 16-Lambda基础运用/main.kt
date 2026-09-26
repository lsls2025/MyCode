fun main() {
    fun doWork(enn:() -> Unit,tt:() -> Unit) {
        println("开始执行")
        enn()
        tt()
        println("执行结束")
    }
    doWork(
        enn = {println("LS牛逼")},
        tt = {println("昔年牛逼")}
    )

}