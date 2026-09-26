import kotlin.system.exitProcess

class Game {
    lateinit var hero: player
    var yx = false

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
                val a = readln().toInt()
                when (a) {
                    1 -> {
                        print("昵称：${hero.name},血量：${hero.hp},攻击力：${hero.attack},经验：${hero.xp}\n")
                        print("请输入序号：")
                    }
                    2 -> {
                        exitProcess(0)
                    }
                    3 -> {
                        hero.hp = 10000
                        println("血量已设置为10000")
                        hero.attack = 10000
                        println("攻击力已设置为10000")
                        hero.xp = 10000
                        println("经验已设置为10000")
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