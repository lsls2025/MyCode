fun main(){
    val name = listOf(1,2,3,4,5)
    val age = name.map{it * 2}.sum()
    println(age)
}
//sum在这里的作用是把集合里的所有数字累加得到一个总和