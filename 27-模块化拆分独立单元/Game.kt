import kotlin.system.exitProcess

class Game {
    lateinit var hero: Player
    var yx = false

    //时间
    var days : Int = 0
    var hour: Int = 6
    var minute: Int = 0

    // 判断时间段的附属函数
    fun hm(): String {
        return when (hour) {
            in 0..4 -> "凌晨"
            in 5..8 -> "早晨"
            in 9..11 -> "上午"
            in 12..17 -> "下午"
            in 18..23 -> "晚上"
            else -> "未知时段"
        }
    }
    //用来增加时间与日期
    fun pa(addMin : Int){
        minute += addMin
        while (minute >= 60){
            minute-=60
            hour+=1
        }
        while(hour >= 24){
            hour -= 24
            days += 1
        }
    }


    fun run() {
        hero= Player()
        print("你好，请输入你的玩家名称：")
        hero.name = readln()
        print("你好${hero.name},你可以进行以下操作\n1.开始游戏\n2.退出游戏\n3.关机\n请输入序号：")
        //判断用户输入的序号
        val ks = readln().toInt()
        when(ks){
            1 -> yx = true
            2 -> exitProcess(0)
            3 -> ProcessBuilder("systemctl", "poweroff", "--no-wall").start()
        }

        if (yx){
            val R = RichLine()
            val D = DebtLine()
            val N = NormalLine()
            print("1.富二代(轻松)\n2.负二代(困难)\n3.普通人(普通)\n输入你的序号选择身份：")
            val a = readln().toInt()
            when (a) {
                1 -> {
                    R.richline()
                }
                2 -> {
                    D.debtline()
                }
                3 -> {
                    N.normalLine()
                }
            }
        }
    }

}