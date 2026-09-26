fun main (){
    val countryCodes = mapOf("CN" to "中国", "US" to "美国", "JP" to "日本")
    println(countryCodes["CN"])
    println(countryCodes.get("JP"))
    val b = countryCodes["UK"]?:"未知国家"
    println(b)
}