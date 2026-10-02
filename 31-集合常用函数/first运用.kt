fun main(){
    val name = listOf(1,2,3,4,5,6,7,8,9,10)
    name.first { it > 2 }
    println(name)
}
//first{ ... }大括号里面**必须写返回布尔值（Boolean）的判断条件，用来告诉函数：满足什么条件才算找到