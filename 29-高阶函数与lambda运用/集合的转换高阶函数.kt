fun main(){
    val a = listOf(1,2,3,4,5)
    for(i in a){
        if(i > 3){
            val b = a.map { it * 2 }
            println(b)
        }
    }

}