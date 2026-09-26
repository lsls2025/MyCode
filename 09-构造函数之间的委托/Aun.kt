class Aun{
    val width : Int
    val height : Int


    constructor():this(1,1)


    constructor(width: Int, height: Int){
        this.width = width
        this.height = height
    }
    fun print(){
        print("$width $height")
    }
}
