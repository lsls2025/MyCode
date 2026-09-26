class Aun{
    var w : String
    var h : Int
    

    constructor(w : String = "咖啡", h : Int = 1){
        this.w = w
        this.h = h
    }

    fun print(){
        println("你的${h}杯${w}好了")
    }
}
