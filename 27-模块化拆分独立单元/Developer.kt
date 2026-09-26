class Developer {
    fun Admin(game: Game, hero: Player){
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
                game.days = readln().toInt()
                print("修改成功\n请输入序号：")
            }
            3 -> {
                print("请输入要修改的数值：")
                game.hour = readln().toInt()
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
    }
}