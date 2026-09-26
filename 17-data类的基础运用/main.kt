fun main (){
    data class Book(val title: String, val author: String, val year: Int? = null)

    val book1 = Book("《1949》","George Orwell",1949)
    val book2 = Book("《动物庄园》","George Orwell",null)
    println(book1)
    println(book2)
    println(book1.title)
}

