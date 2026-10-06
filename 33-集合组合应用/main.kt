fun main(){
    val fs = listOf(50.5, 24.0, 83.0, 74.5, 57.0, 67.0, 73.0, 83.0, 96.0, 100.0)
    val s = fs.sum()
    val m = fs.maxOrNull()
    val mi = fs.minOrNull()
    val ir = mutableListOf<Any>()
    for (i in fs){
        if(i>=60){
            ir.add(i)
        }
    }
    val p = ir.size
    println("总分：$s,平均分：${s / 10}最高分：$m,最低分：$mi,一共有个${p}及格")

}