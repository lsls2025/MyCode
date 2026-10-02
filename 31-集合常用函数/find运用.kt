fun main(){
    val name = listOf(1,2,3,4,5,6,7,8,9,10)
    val a = name.find { it > 2 }
    println(a)
}
//从集合从头开始遍历拿到第一个满足 true 的元素
//立刻停止遍历，返回这个元素全部遍历完都没有满足条件的 → 返回 null
//这里 1小于2 2也不大于2 到 3直接返回 true，不再继续看后面 4、5...