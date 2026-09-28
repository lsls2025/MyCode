fun main(){
    val name = listOf("1","w")
    val age = name.map{it.toIntOrNull()}
    println(age)
}
//toIntOrNull在此处的作用是转不了就返回 null不会崩