fun main(){
    val nums = listOf(3,7,2,9,4,1)
    val result = nums
    .filter { it > 3 }
    .map { it * it }
    .reduce { a, b -> a + b }
    println(result)
}