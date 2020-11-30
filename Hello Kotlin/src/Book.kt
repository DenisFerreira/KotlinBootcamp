open class Book(title: String, author: String) {
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage += 1
    }
}

class EBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsCounted:Int = 0
    override fun readPage() {
        wordsCounted += 250
    }
}