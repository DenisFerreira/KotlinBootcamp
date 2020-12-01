package chapter6

class Game {
    var path = mutableListOf(Directions.START)
    private val north = {path.add(Directions.NORTH)}
    private val east = {path.add(Directions.EAST)}
    private val west = {path.add(Directions.WEST)}
    private val south = {path.add(Directions.SOUTH)}
    private val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    private fun move (where: () -> Boolean) {
        where()
    }

    fun makeMove(arg: String?) {
        when( arg) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    //exercise1(game)
    while (true){
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}

//private fun exercise1(game: Game) {
//    println(game.path.toString())
//    game.north()
//    game.east()
//    game.south()
//    game.west()
//    game.end()
//    println(game.path.toString())
//}