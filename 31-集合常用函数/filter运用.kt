fun main(){
    val name = listOf(1,2,3,4,5,6,7,8,9,10)
    val a = name.filter { it > 2 }
    println(a)
}
//filter：查找所有满足条件的元素，返回一个集合，会遍历全部元素