package spices

import sun.security.provider.ConfigFile

fun main() {
    val spices = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )
    for (spice: Spice in spices.filter { it.heat < 5 }) {
        println(spice.toString())
    }

    val spiceCabinet =  listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))
    for (element in spiceCabinet) println(element)
}
