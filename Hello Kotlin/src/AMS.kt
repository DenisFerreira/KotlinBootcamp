fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isGoodDay(mood,weather) -> "Go for a walk"
        isColdDay(mood, weather, temperature) -> "stay in bed"
        isHotDay(temperature) -> "go swimming"
        else -> "stay home and read"
    }
}

private fun isHotDay(temperature: Int) = temperature > 35
private fun isColdDay(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
private fun isGoodDay(mood: String, weather: String) = mood == "happy" && weather == "sunny"
