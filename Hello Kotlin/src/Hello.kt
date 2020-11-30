import java.util.*

fun main(args: Array<String>) {
    println("Your Fortune is ${getFortuneCook()}")

    //if (args[0].toInt() < 12) println("Good Morning") else println("Good Night")
    //dayOfWeek()
}

fun getFortuneCook(): String {
    val values = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday")
    val birthday = readLine()?.toIntOrNull() ?: 1
    val index = birthday.rem(values.size)
    return values[index]

}

fun dayOfWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("today is " +
            when (day) {
                1 -> "Sunday"
                2 -> "Monday"
                3 -> "Tuesday"
                4 -> "Wednesday"
                5 -> "Thursday"
                6 -> "Friday"
                else -> "Saturday"
            })
}
