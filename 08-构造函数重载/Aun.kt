class Aun{
    val width : Int
    val height : Int


    constructor(width: Int, height: Int){
        this. width = width
        this. height = height

    }

    constructor(size: Int){
        this. width = size
        this. height = size
    }

    fun rec(){
        repeat(height){
            repeat(width){
                print("# ")

            }
            println()
        }
    }
}
