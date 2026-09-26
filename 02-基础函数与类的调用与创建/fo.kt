fun main () {
   val ao = Aun()
   val ai = Aun()
   val en = Aun()
   print("你的名字是什么")
   ao.name = readln()
   print("你几岁了")
   ao.nl = readln().toInt()
   print("你的身高是多少")
   ao.sg = readln().toInt()
   print("你的体重是多少")
   ao.tz = readln().toInt()
   println("名字: ${ao.name} 岁数: ${ao.nl} 身高:${ao.sg} 体重:${ao.tz}")
   var f = Aun()

}