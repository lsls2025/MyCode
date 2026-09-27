fun main(){
    fun repeatAction(times:Int, action:()->Unit){
        repeat(3){
            println("hollo kotlin")
        }

    }
    repeatAction(times=1, action={})
}