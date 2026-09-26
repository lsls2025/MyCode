fun main() {
   print("请输入名字：")
   val name = readln()
   print("请输入年龄：")
   val nl = readln().toInt()
   print("请输入身高：")
   val sg = readln().toInt()
   print("请输入体重：")
   val tz = readln().toInt()
   val a = Aun()
   a.Aee(name, nl, sg, tz)
   a.print()
}
