import kotlin.system.exitProcess

class Game {
    lateinit var hero: player
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
        hero= player()
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

        print("工具栏：\n1.查看当前所有数值\n2.退出游戏\n3.开发者模式\n输入序号或者输入“开始”正式开始游戏：")
        if (yx){
            while (hero.hp >= 1){
                when (val a = readln().toInt()) {
                    1 -> {
                        print("昵称：${hero.name},天数:${days},时间：${hm()} ${hour}:${minute}，血量：${hero.hp},攻击力：${hero.attack},经验：${hero.xp}\n")
                        print("请输入序号：")
                        pa(10)
                    }
                    2 -> {
                        exitProcess(0)
                    }
                    3 -> {
                        print("1.名称\n2.天数\n3.时间\n4.血量\n5.攻击力\n6.经验\n请输入要修改的序号：")
                        val a = readln().toInt()
                        when (a) {
                            1 -> {
                                print("请输入要修改的数值：")
                                hero.name = readln()
                                print("修改成功\n请输入序号：")
                            }
                            2 -> {
                                print("请输入要修改的数值：")
                                days = readln().toInt()
                                print("修改成功\n请输入序号：")
                            }
                            3 -> {
                                print("请输入要修改的数值：")
                                hour = readln().toInt()
                                print("修改成功\n请输入序号：")
                            }
                            4 -> {
                                print("请输入要修改的数值：")
                                hero.hp = readln().toInt()
                                print("修改成功\n请输入序号：")
                            }
                            5 -> {
                                print("请输入要修改的数值：")
                                hero.attack = readln().toInt()
                                print("修改成功\n请输入序号：")
                            }
                            6 -> {
                                print("请输入要修改的数值：")
                                hero.xp = readln().toInt()
                                print("修改成功\n请输入序号：")
                            }
                        }


                    }else -> {
                        print("请输入正确的序号：")
                    }
                }

            }
            print("你输了")
            yx = !yx
            exitProcess(0)

        }
    }

}