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

    class en() : Wen(){
        override fun wen(){
            val a = 2
            super.wen()
            println("$a")
        }
    }
    val a : Wen = en()
    a.wen()
    println()
}
