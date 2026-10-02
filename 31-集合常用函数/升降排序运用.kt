fun main(){
    val name = listOf(12,6,4,9,4,7,3,3,0)
    val a = name.sortedBy { it } //升序（从小到大）：sortedBy
    val b = name.sortedByDescending { it } //降序（从大到小）：sortedByDescending
    println(a)
    println(b)
}