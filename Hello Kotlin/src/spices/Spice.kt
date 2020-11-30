package spices

open class Spice(val name: String,
                 private val spiciness: String = "mild", override val color: MyColors = MyColors.GREEN): SpiceColor {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    fun makeSalt() = Spice("Salt", "none")

    override fun toString(): String {
        return "[name: $name,\nspiceness: $spiciness,\nheat: $heat]\ncolor: $color"
    }
}
