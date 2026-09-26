fun main () {
   print("请输入名称：")
   val name = readln()
   print("请输入品牌名：")
   val brand = readln()
   print("请输入尺码：")
   val size = readln().toInt()
   print("请输入价格：")
   val price = readln().toInt()
   val a = Ass()
   a.bri("${name}","${brand}",size,price)
}