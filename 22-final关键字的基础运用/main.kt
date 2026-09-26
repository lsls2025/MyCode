fun main() {
    open class Wen(){
        open fun wen(){
            val a = 1
            val b = 2
            val c = 3
            val d = 4
            println("$a $b $c $d")
        }
    }

    open class en() : Wen(){
        final override fun wen(){  //final：此函数是已上锁状态，去掉此关键字将可被后代子类重写
            val a = 2
            super.wen()
            println("$a")
        }
    }
    class r() : en(){
        override fun wen(){

        }
    }
    val a : Wen = en()
    a.wen()
    println()
}
