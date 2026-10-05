fun main() {
    val name = listOf(1,2,3,4,5)
    val gte = name.groupBy {it < 3}
    println(gte)
}
//roupBy 就是按你给的规则，把一堆元素分成几组，返回一个 Map