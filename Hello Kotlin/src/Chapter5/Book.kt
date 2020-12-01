package Chapter5


class Book(var title: String, var author: String, var year: Int, var pages: Int = 1) {
    companion object {
        const val totalOfBooks = 5
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun getTitleAndAuthor(): Pair<String, String> = Pair(title, author)
    fun getTitleAuthorAndYear(): Triple<String, String, Int> = Triple(title, author, year)
    fun canBorrow() = totalOfBooks > 0
    fun printURL() {
        println("$BASE_URL$title.html")
    }
}
// Extension function
fun Book.getWeight() = this.pages*1.5

fun main() {
    val book = Book("harry potter", "JK Rolling", 2000)
    println("Here is ${book.title} from ${book.author} written in ${book.year}")

    val author = "author1"
    val allBooks = listOf(
            Book("livro1", author, 2000, 200),
            Book("livro2", author, 2000, 300 ),
            Book("livro3", author, 2000, 1000))
    val library = mapOf(Pair(author, allBooks))
    println("Livro2 está na biblioteca: ${allBooks.any { it.title.contains("livro2") }}")

    for( element in allBooks) println("The book ${element.title} weights ${element.getWeight()} grams")
}