package spices

import java.awt.Color

interface SpiceColor {
    val color: MyColors
}

object YellowSpiceColor : SpiceColor {
    override val color = MyColors.YELLOW
}

enum class MyColors(value: Int) {
    RED(0),
    YELLOW(1),
    GREEN(2)
}