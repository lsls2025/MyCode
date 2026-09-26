fun main() {
    val score: Int? = 95

    score?.let {
        val level = if (score >= 60) "及格" else "不及格"
        println("分数：$score，等级：$level")
    }
}