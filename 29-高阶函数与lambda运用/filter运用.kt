fun main(){
    val a = listOf(33,23,48,45,55)
    val b = a.filter { it < 25 }
    println(b)
}
//filter 的核心功能就是筛选,可以进行逻辑判断
