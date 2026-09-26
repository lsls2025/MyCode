class Aun{
    val name : String
    val nl: Int
    val sg: Int
    val tz: Int

    constructor(name : String, nl: Int, sg: Int, tz: Int){
        this.name = name
        this.nl = nl
        this.sg = sg
        this.tz = tz
    }
    fun print(){
        println("你好\${this.name}，你的信息是：\\n名字：\${name}\\n年龄：\${nl}\\n身高：\${sg}\\n体重：\${tz}\\n")
    }
}
